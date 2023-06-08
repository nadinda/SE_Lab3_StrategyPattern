package stisys;

public class FileUploader {
	private Parser parser;

    public void upload() {
        System.out.println("Uploading file...");
        parser.read();
        parser.parse();
        parser.validate();
        String data = parser.getData();
        System.out.println(data + " is available");
    }

    public void setParser(Parser parser) {
        this.parser = parser;
    }
}
