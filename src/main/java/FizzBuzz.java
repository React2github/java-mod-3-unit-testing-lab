public class FizzBuzz {
  public static String fizzBuzzString(String str) {
      if (str.isEmpty()) return null;
      if (str.equalsIgnoreCase("f")) return "Fizz";
      if (str.equalsIgnoreCase("b")) return "Buzz";
      if (str.startsWith("f") && str.endsWith("b")) return "FizzBuzz";

      return str;
  }
}