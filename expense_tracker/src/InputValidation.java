
public class InputValidation {

  public static boolean amountInputValidation(double amount) {
    System.out.println("Testing");
    if (amount < 1000 && amount > 0) {
      return true;
    }
    return false;
  }

  public static boolean categoryInputValidation(String category) {
    System.out.println("Testing");
    String[] validCategories = {"food", "travel", "bills", "entertainment", "other"};
    
    for (String validCategory : validCategories) {
      if (validCategory.equals(category)) {
        return true; 
      }
    }
    return false; 
  }
}
