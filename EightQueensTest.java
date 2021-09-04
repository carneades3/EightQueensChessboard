/*  
 * control test of tracking while solving eight queens problem on virtual chessboard by
                                    eliminate positions by
                                    heuristic algorithm

 */
 
public class EightQueensTest {
   
   public static void main(String[] args) {
      
      System.out.printf("******** %s %n", EightQueensControl.START_INFO);
      System.out.printf("*** %s %n%s%n", EightQueensControl.QUIT_INFO, EightQueensControl.EOT_INFO);
      
      EightQueensControl eightQueensControl = new EightQueensControl();
      
      do {
         eightQueensControl.printMenu();
      } while (true == StandardInput.getCommand(eightQueensControl));
      
   } 
   
} 
