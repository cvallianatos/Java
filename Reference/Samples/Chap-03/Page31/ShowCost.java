public class ShowCost {
  public static void main(String[] args) {
    int itemGrossCost = 945;
    int itemQuantity = 0;
    try {
      int itemCost = itemGrossCost / itemQuantity;
      System.out.print("Each item costs " + itemCost);
    } catch (ArithmeticException e) {
      System.out.print("An error has been detected ");
      System.out.println("while performing a calculation");
    }
  }
}

