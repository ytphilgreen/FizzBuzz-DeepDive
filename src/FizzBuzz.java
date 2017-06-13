

public class FizzBuzz {
  /** Default upper limit for counting */
  public static final int DEFAULT_UPPER_LIMIT = 100;


  public static void main(String[] args) {
    int UpperLimit = (args.length > 0) ? Integer.parseInt(args[0]) : DEFAULT_UPPER_LIMIT;
    emitFizzBuzz(UpperLimit);

  }

  /**
   * *Emit the proper Fizz Buzz response for each int value from 1 to limit, inclusive.
   * 
   * @param limit upper limit of count.
   */
  private static void emitFizzBuzz(int limit) {
    for (int i = 1; i <= limit; i++) {
      String response = "";
      if (i % 3 == 0) {
        response += "Fizz";
      }
      if (i % 5 == 0) {
        response += "Buzz";

      }
      if (response.length() == 0) { // Is response still empty?
        response = String.format("%d", i);
      }
      System.out.println(response);
    }
  }

}
