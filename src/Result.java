class Result {
  public int x;
  public int y;

  Result(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public void provideResults() {
    if (x == -1 && y == -1) {
      System.out.println("No match found!");
    } else {
      System.out.println("First match was found at index " + x);
      System.out.println("Last match was found at index " + y);
    }
   
  }
}