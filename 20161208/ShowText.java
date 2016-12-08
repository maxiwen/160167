import java.io.*;

public class ShowText{
	public static void main(String[] args) {
		
		
		

		try{
			FileReader inF = new FileReader("ShowByteText.txt");
			BufferedReader inFile = new BufferedReader(inF);

			String data;
			
			while((data = inFile.readLine())!=null){
				
			System.out.println(data);
			
			
			}
			inFile.close();
			

		}catch(IOException e){
			System.err.println("エラーです");
			System.exit(1);
		}
	}
}