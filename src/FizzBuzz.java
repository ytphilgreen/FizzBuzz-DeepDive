

public class FizzBuzz {
  /** Default upper limit for counting */
  public static final int DEFAULT_UPPER_LIMIT = 100;
  public static final String USAGE = "Usage:%n"
      + "\tjava [options] edu.cnm.deepdive.fizzbuzz.FizzBuzz [limit]%n" + "%n" + "Where%n"
      + "\toptions = VM options%n" + "\tlimit = upper counting limit (default = 100 %n";


  public static void main(String[] args) {
    try {
      int upperLimit = (args.length > 0) ? Integer.parseInt(args[0]) : DEFAULT_UPPER_LIMIT;
      if (upperLimit <= 0) {
        emitFizzBuzz(upperLimit);
      }
    } catch (NumberFormatException ex) {
      emitUsage();
    }
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

  private static void emitUsage() {
    System.out.printf(USAGE);
  }
}
