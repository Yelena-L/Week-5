public class SpacedLogger  implements Logger {
	public  String spacedWord(String word)  {
		char[] spaced = new char[word.length() * 2];
		for (int i=0; i < word.length(); i++) {
			spaced[2*i] = word.charAt(i);
			spaced[2*i +1] = ' ';
		}
		String s = new String (spaced);
		System.out.println(s);
		return s.trim();
	}
	
	
	

	@Override
	public void error(String error) {
		System.out.println("ERROR: " + spacedWord(error));
	
		
	}

	@Override
	public void log(String word) {
		System.out.println(spacedWord(word));
		// TODO Auto-generated method stub
		
	}
		
	
}
