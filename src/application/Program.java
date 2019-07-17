package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {

		String[] lines = new String[] { "Good Morning", "Good Afternoon", "Good night" };

		String path = "c:\\ws\\out.txt";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) { // (path, true) indica para não recriar o arquivo
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
