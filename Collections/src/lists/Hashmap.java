package lists;

import java.util.HashMap;

public class Hashmap {
  public static void main(String[] args) {
    
    HashMap<String, Integer> numbers = new HashMap<String, Integer>();

    // Add keys and values (Country, City)
    numbers.put("One", 1);
    numbers.put("Two", 2);
    numbers.put("Three",3);
    numbers.put("Four",4);
    System.out.println(numbers);
  }
}