public class App {
	
    
	public static void main2(String[] arg) {
		SpacedLogger logger = new SpacedLogger();
		logger.log("Hello");
		logger.error("Hello World");

	
	}  

     // won't execute main2 as there can be only 1 main method
	// by switching 2 to first main we can execute another main method
     public static void main(String[] arg) {
    	 AsteriskLogger logger = new AsteriskLogger();
 		logger.log("Hello");
 		logger.error("Hello World");
        
 		
     }
     
} 
