import java.io.*;

public class ShowText{
	public static void main(String[] args) {
		FileInputStream inFile = null;

		try{

			inFile = new FileInputStream("data.txt");

			int data;
			
			while((data = inFile.read())!= -1){
				
				System.out.println((char)data);
			
			}
			
			inFile.close();

		}catch(IOException e){
			System.err.println("エラーです");
			System.exit(1);
		}
	}
}