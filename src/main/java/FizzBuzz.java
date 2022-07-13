public class FizzBuzz {
  public static String fizzBuzzString(String str) {
      if (str.isEmpty()) return null;
      if (str.startsWith("f") && (!str.endsWith("b"))) return "Fizz";
      if (str.endsWith("b") && (!str.startsWith("f"))) return "Buzz";
      if (str.startsWith("f") && str.endsWith("b")) return "FizzBuzz";

      return str;
  }
}