
import java.util.Scanner;

public class StandardInput {
   private static final Scanner input                  = new Scanner(System.in);
   
   static Scanner getScanner() {
      return input;
   }
   
   static boolean getCommand(EightQueensControl eightQueensControl) {
      if (false == input.hasNextLine()) {
         return false;   // return if End-of-transmission character was detected
      }
      else {  
      
         if (true == input.hasNextInt()) {
            eightQueensControl.control(input.nextInt());
            input.nextLine();   // to clear input data - nextInt() leaves whitespaces in input
            
            if (true == eightQueensControl.isQuit()) {
               return false;
            }
         }
         else if (true == input.hasNextDouble()) {
            System.err.printf("%n???????? ERROR: Value of %f entered by User is type double. ", input.nextDouble());
            System.err.printf("This is incorrect. Double values are not using in application.%n");
            input.nextLine();   // to clear input data - NextDouble() leaves whitespaces in input
         }
         else {
            System.err.printf("%n???????? ERROR: Value of \'%s\' entered by User is not using in this program.",
                              input.nextLine());
         }
         
         return true;
      }
   }
   
}
