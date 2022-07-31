import java.util.Scanner;
public class AsteriskLogger  implements Logger {
	
       
		public static void wordLog()  {
	       Scanner scanner = new Scanner(System.in);
			String word = scanner.nextLine();
			String wordLog = "***" + word + "***";
	      System.out.println(wordLog);
		}
     
	   @Override
		public void log(String word) {
	    	System.out.println( "***" + word + "***");
	    	
	    }
		@Override
		public void error(String err) {
			String str = "***Error:" + err + "***";
			char[] ast = new char[str.length()];
			for(int i = 0; i < str.length(); i++) {
			ast[i] = '*';
			}
			System.out.println(ast);
			System.out.println(str);
			System.out.println(ast);
			}
       public static void main(String [] args) {
    	   AsteriskLogger w = new AsteriskLogger();
    	   w.error("Hello!");
    	   w.log("Hello! ");
    	  }
       }
		