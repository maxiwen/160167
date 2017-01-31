import java.io.*;

public class Aloha2{
	public static void main(String[] args) {
		String[] data = new String[100];
		Dataman dataman = new Dataman();
		Fileman fileman = new Fileman();

		dataman.inputData();
		dataman.saveData(data);

		fileman.writeFile(data);
	}
}

class Dataman{
	String[] data;
	int numData;

	public Dataman(){
		data = new String[100];
	}
	public void inputData(){
		System.out.print("何人のデータ？＞");
		this.numData = Integer.parseInt(new java.util.Scanner(System.in).nextLine());
		numData=this.numData;
		for (int i=0;i<numData ;i++ ) {
			data[i]= new java.util.Scanner(System.in).nextLine();
			
		}
	}
	public void saveData(String[] data){
		System.out.println("データを保存します");
	}
}

class Fileman{
	public Fileman(){
		System.out.println("Fileman!");
	}
	public void writeFile(String[] strdata){
		System.out.println("writeFile()!");
	}
}