
public class InputValidation {

  public static boolean amountInputValidation(double amount) {
    System.out.println("Testing");
    if (amount < 1000 && amount > 0) {
      return true;
    }
    return false;
  }

  public static boolean categoryInputValidation(double amount) {
    System.out.println("Testing");
    return true;
  }
}
