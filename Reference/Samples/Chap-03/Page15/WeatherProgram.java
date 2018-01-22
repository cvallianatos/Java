class WeatherProgram {
  public static void main(String[] args) {
    int hot = 80;
    int currentTemp = 88;
    if (currentTemp > hot) {
      System.out.println(currentTemp + " degrees. It's hot.");
    } else {
      System.out.println(currentTemp + " degrees. It's not that hot.");
    }
  }
}

