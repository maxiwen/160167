import java.io.*;

public class ShowByteImage{
	public static void main(String[] args) {
		FileInputStream inFile = null;

		try{

			inFile = new FileInputStream("2.jpg");

			int data;
			
			while((data = inFile.read())!= -1){
				
				System.out.println(data);
			}

			inFile.close();

			

		}catch(IOException e){
			System.err.println("エラーです");
			System.exit(1);
		}
	}
}