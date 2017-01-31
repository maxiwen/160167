import java.io.*;

public class Aloha{
	public static void main(String[] args) {
		String msg;
		FileWriter fw;
		PrintWriter pw;

		System.out.println("input msg>");
		msg = new java.util.Scanner(System.in).nextLine();
		System.out.println(msg);

		FileWriter fw = null;
		PrintWriter pw = null;

		try{
			fw = new FileWriter("data.txt",true);
			pw = new PrintWriter(fw);

			pw.println(msg);

		}catch(IOException e){

			System.out.println("IO Error");

		}finally{

			fw.close();
			pw.close();

		}catch(IOException e){
				System.out.println("IO Error.");
		}
	}
}