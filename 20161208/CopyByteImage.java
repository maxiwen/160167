import java.io.*;

public class CopyByteImage{
	public static void main(String[] args) {
		
		FileInputStream outFile = null;

		try{

			outFile = new FileOutputStream("2.jpg");

			int data;
			
			
			
			outFile.close();

			

		}catch(IOException e){
			System.err.println("エラーです");
			System.exit(1);
		}
	}
}