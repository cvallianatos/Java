class AuthorInformation {
  public int headerLevel;
  public String EmailAddress() {
    String message = "<h" + headerLevel +
                     ">peter@myhost.com</h" + headerLevel + ">";
    return message;
  }
}