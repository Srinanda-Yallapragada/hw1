
/**
* Models a financial transaction from ExpenseTracker.
*/

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Transaction {

  private double amount;
  private String category;
  private String timestamp;

  /**
   * Creates new transaction with the amount and category values passed in.
   *
   * @param amount   The transaction amount.
   * @param category The category of the transaction.
   */
  public Transaction(double amount, String category) {
    this.amount = amount;
    this.category = category;
    this.timestamp = generateTimestamp();
  }

  /**
   * Returns the amount of the transaction.
   *
   * @return The transaction amount.
   */
  public double getAmount() {
    return amount;
  }

  /**
   * Sets the amount of the transaction.
   *
   * @return void.
   */
  public void setAmount(double amount) {
    this.amount = amount;
  }

  /**
   * Sets timestamp for trasaction 
   * @return void
   **/
  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }
  /**
  * Gets category of transaction
  * @return String 
  */
  public String getCategory() {
    return category;
  }

  /**
   * Sets the category of the transaction.
   *
   * @return void.
   */
  public void setCategory(String category) {
    this.category = category;
  }

  public String getTimestamp() {
    return timestamp;
  }

  private String generateTimestamp() {
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm");
    return sdf.format(new Date());
  }

}
