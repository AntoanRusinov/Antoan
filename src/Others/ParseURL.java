package Others;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class ParseURL {
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter URL address: ");
			URL url = new URL(scan.nextLine());
			System.out.println("URL is: " + url.toString());
			System.out.println("protocol is: " + url.getProtocol());
			System.out.println("authority is: " + url.getAuthority());
			System.out.println("file name is: " + url.getFile());
			System.out.println("host is: " + url.getHost());
			System.out.println("path is: " + url.getPath());
			System.out.println("port is: " + url.getPort());
			System.out.println("default port is: " + url.getDefaultPort());
			System.out.println("query is: " + url.getQuery());
			System.out.println("ref is: " + url.getRef());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}