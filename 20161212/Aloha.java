import java.io.*;
import java.util.*;

public class Aloha{
	public static void main(String[] args) {

		String fileName = args[0];
		FileReader inFile;
		int data;
		int n = 0;

	try{
		inFile = new FileReader(fileName);

		while((data = inFile.read())!= -1){
			System.out.print((char)data);
			n++;

		}
		inFile.close();

		System.out.println(n+"回繰り返しました。");

	}catch(IOException e){
		System.err.println("エラーです。");
		System.exit(1);
	}
	}
}