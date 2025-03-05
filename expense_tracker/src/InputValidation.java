
public class InputValidation {

  public static boolean amountInputValidation(double amount) {
    if (amount < 1000 && amount > 0) {
      return true;
    }
    return false;
  }

  public static boolean categoryInputValidation(String category) {
    String[] validCategories = { "food", "travel", "bills", "entertainment", "other" };

    for (String validCategory : validCategories) {
      if (validCategory.equals(category)) {
        return true;
      }
    }
    return false;
  }
}
