import java.io.*;

public class ShowByteImage{
	public static void main(String[] args) {
		FileInputStream inFile = null;

		try{

			inFile = new FileInputStream("2.jpg");

			int data;
			int n =0;
			while((data = inFile.read())!= -1){
				
				System.out.println(data);
				n++;
			}
			System.out.println("繰り返し：" +n+ "回");
			inFile.close();

			

		}catch(IOException e){
			System.err.println("エラーです");
			System.exit(1);
		}
	}
}