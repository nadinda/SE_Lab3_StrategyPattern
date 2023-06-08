package stisys;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		// Create instances of parsers
		Parser excelParser = new ExcelParser();
		Parser imageParser = new ImageParser();

		// Create an instance of FileUploader
		FileUploader fileUploader = new FileUploader();

		String continueChoice = "";
		do {
			System.out.print("Please select a file to upload:" + "\n" + "1 - Excel file" + "\n" + "2 - Image file"
					+ "\n" + "Choice: ");
			int choice = Integer.parseInt(reader.readLine());

			if (choice == 1) {
				fileUploader.setParser(excelParser);
			} else if (choice == 2) {
				fileUploader.setParser(imageParser);
			} else {
				System.out.println("Invalid choice. Please try again.");
				continue;
			}

			// Simulate file upload
			fileUploader.upload();

			System.out.print("Do you wish to continue uploading files? (Y/N): ");
			continueChoice = reader.readLine();
		} while (continueChoice.equalsIgnoreCase("Y"));

		System.out.println("Thank you. Goodbye!");
	}
}