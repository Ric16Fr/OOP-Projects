package app;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Julius Kiekbusch (kiekbjul@b-tu.de)
 * @category Programmierpraktikum
 */
public class FileAPI {
	
	public final static String filename = "src/content.csv";

	public static void setArticles(List<Article> articles) {
		try(PrintWriter contentWriter = new PrintWriter(filename)) {
			
			for(Article article : articles) {
				contentWriter.println(article.toString());
			}
			contentWriter.flush();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	public static List<Article> getArticles() {
		LinkedList<Article> list = new LinkedList<Article>();
		try(Scanner scanner = new Scanner(new File(filename))) {
			while(scanner.hasNextLine()) {
				list.add(new Article(scanner.nextLine()));
			}
		} catch (FileNotFoundException e) {
		}
		return list;
	}
	
}
