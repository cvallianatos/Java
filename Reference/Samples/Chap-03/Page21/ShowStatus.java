class ShowStatus {
  public static void main(String[] args) {
    int priority = 2;
    switch (priority) {
    case 1:
      System.out.println("<status>Urgent</status>");
      break;
    case 2:
      System.out.println("<status>Very Important</status>");
      break;
    case 3:
      System.out.println("<status>Not Important</status>");
    }
  }
}
