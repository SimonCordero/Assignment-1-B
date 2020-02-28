import java.io.IOException;
import java.io.StringReader;
import java.util.Scanner;
/**
* Author: Simon Cordero.
* Last updated: 2020/02/28.
*/
 

public class Maxrun {
  static int maxcount = 0;
  
  /**
  * User string input.
  */
  
  
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("String: ");
    String string = scanner.next();
    
    if (string != null) {
      String strout = maxrun(string);
      System.out.println("------------");
      System.out.println("Max run: " + maxcount);
    
    } else {
      System.out.println("No string inputted");
    }
    scanner.close();
  }
  
  
  /**
  * Calculate Maxrun.
  */
  
  public static String maxrun(String string) {
    int pos = 0;
    int maxpos = string.length();
    char thiselem;
    char lastelem;
    String strout = "";
    int count = 1;
    
    lastelem = string.charAt(pos);
    for (pos = 1; pos < maxpos; pos++) {
      thiselem = string.charAt(pos);
      if (lastelem == thiselem) {
        count++; 
        
      } else {
        if (count > maxcount) {
          maxcount = count;
        }
        count = 1;
      }
      lastelem = thiselem;
    }
    if (count > maxcount) {
      maxcount = count;
    }
    String test = "";
    return test;
  }
}