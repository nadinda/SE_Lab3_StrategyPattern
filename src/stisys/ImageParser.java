package stisys;

public class ImageParser implements Parser {
    public void read() {
        System.out.println("Reading Image file...");
    }

    public void parse() {
        System.out.println("Parsing Image data...");
    }

    public void validate() {
        System.out.println("Validating Image data...");
    }

    public String getData() {
        System.out.println("Retrieving Image data...");
        return "Image data";
    }
}
