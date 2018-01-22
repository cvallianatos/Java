class PersonalInformation {
  public static void main(String[] args) {
    System.out.println("My Personal Information");
    System.out.println(DisplayMyName("Andrew"));
  }
  public static String DisplayMyName(String name) {
    String myInfo;
    myInfo = "My name is: " + name;
    return myInfo;
  }
}