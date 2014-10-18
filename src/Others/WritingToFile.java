package Others;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WritingToFile {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		File file = new File("C:/Users/Antoan/Desktop/file.doc");

		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("File " + file.toString()
						+ "can't be created!");
			}
		} else {

			try {
				System.out.println("You can now write to your file!");
				System.out
						.println("If you want to stop writing and save the file, press \"EXIT\"!");
				BufferedWriter bw = new BufferedWriter(new FileWriter(file));

				boolean condition = true;
				StringBuilder builder = new StringBuilder("");
				while (condition) {
					String enter = scan.nextLine();
					if (enter.equals("EXIT")) {
						bw.write(builder.toString());
						bw.close();
						condition = false;
					} else {
						builder.append(enter + " \n");
					}
				}
				System.out.println("Done!");
			}

			catch (IOException e) {
				System.out.println("Unable to read file: " + file.toString());

			}

		}

	}
}
