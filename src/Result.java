class Result {
  int x;
  int y;

  Result(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public void provideResults() {
    System.out.println("First match was found at index " + x);
    System.out.println("Last match was found at index " + y);
  }
}