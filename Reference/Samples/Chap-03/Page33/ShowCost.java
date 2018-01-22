public class ShowScope {
  static int x = 10;
  public static void main(String[] args) {
    firstMethod();
    secondMethod();
  }
  private static void firstMethod() {
    int x = 55;
    System.out.println("This is the value of the local variable x:" + x);
  }
  private static void secondMethod() {
    System.out.println("This is the value of the member variable x:"+ x);
  }
}
