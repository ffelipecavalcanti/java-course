package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();

		File path = new File(strPath);

		File[] folders = path.listFiles(File::isDirectory); // predicado que deve listar apenas diret�rio ou pasta
		System.out.println("FOLDERS: ");
		for (File folder : folders) {
			System.out.println(folder);
		}

		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES: ");
		for (File file : files) {
			System.out.println(file);
		}
		
		boolean sucess = new File(strPath + "\\aula").mkdir();
		System.out.println("Diret�rio criado com sucesso " + sucess);
		sc.close();
	}
}
