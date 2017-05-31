package spring.boot.Autowiring;

public class Logger {

	private ConsoleWrite consoleWrite;
	private FileWriter fileWriter;

	public ConsoleWrite getConsoleWrite() {
		return consoleWrite;
	}

	public void setConsoleWrite(ConsoleWrite consoleWrite) {
		this.consoleWrite = consoleWrite;
	}

	public FileWriter getFileWriter() {
		return fileWriter;
	}

	public void setFileWriter(FileWriter fileWriter) {
		this.fileWriter = fileWriter;
	}

	public void FileWriter(String text) {
		fileWriter.write(text);
		
	}

	public void writeConsole(String text) {
	consoleWrite.write(text);
		
	}

}
