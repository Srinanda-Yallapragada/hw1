import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

/**
 * The ExpenseTrackerApp class allows users to add/remove daily transactions.
 */
public class ExpenseTrackerApp {

  public static void main(String[] args) {

    // Create MVC components
    DefaultTableModel tableModel = new DefaultTableModel();
    tableModel.addColumn("Serial");
    tableModel.addColumn("Amount");
    tableModel.addColumn("Category");
    tableModel.addColumn("Date");

    ExpenseTrackerView view = new ExpenseTrackerView(tableModel);

    // Initialize view
    view.setVisible(true);

    // Handle add transaction button clicks
    view.getAddTransactionBtn().addActionListener(e -> {

      // Get transaction data from view
      double amount = view.getAmountField();
      String category = view.getCategoryField();

      if (!InputValidation.amountInputValidation(amount)) {
        JOptionPane.showMessageDialog(new JFrame(),
            "Amount needs to be between 0 and 1000");
        return;
      }

      if (!InputValidation.categoryInputValidation(category)) {
        JOptionPane.showMessageDialog(new JFrame(),
            "Category needs to be in food, travel, bills, entertainment or other.");
        return;
      }

      // Create transaction object
      Transaction t = new Transaction(amount, category);

      // Call controller to add transaction
      view.addTransaction(t);
    });

  }

}
