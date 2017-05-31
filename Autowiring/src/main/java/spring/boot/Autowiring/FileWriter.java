package spring.boot.Autowiring;

public class FileWriter implements LogWriter {

	@Override
	public void write(String text) {
	System.out.println("Log to file: "+text);

	}

}
