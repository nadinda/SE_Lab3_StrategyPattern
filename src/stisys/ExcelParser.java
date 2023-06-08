package stisys;

public class ExcelParser implements Parser {
	public void read() {
        System.out.println("Reading Excel file...");
    }

    public void parse() {
        System.out.println("Parsing Excel data...");
    }

    public void validate() {
        System.out.println("Validating Excel data...");
    }

    public String getData() {
        System.out.println("Retrieving Excel data...");
        return "Excel data";
    }
}
