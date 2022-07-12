public class FizzBuzz {
  public static String fizzBuzzString(String str) {
      if (str == "f") return "Fizz";
      
      if (str == "b") return "Buzz";

      if (str.startsWith("f") && str.endsWith("b")) return "FizzBuzz";

      return str;
  }
}