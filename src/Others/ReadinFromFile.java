package Others;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadinFromFile {

	public static void main(String[] args) throws FileNotFoundException {

		try {
			String pathFile = "C:/Users/Antoan/Desktop/file.doc";

			File textFile = new File(pathFile);

			Scanner in = new Scanner(textFile);

			while (in.hasNextLine()) {
				String line = in.nextLine();
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File doesn't exist or the path file is not correct!");
		}
	}

}
