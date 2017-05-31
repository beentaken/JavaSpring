package spring.boot.Autowiring;

public class ConsoleWrite implements LogWriter {

	@Override
	public void write(String text) {
	
		
		System.out.println(text);
	}

}
