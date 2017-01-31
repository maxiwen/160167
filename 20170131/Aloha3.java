import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Aloha3{
	public static void main(String[] args) {
		String[] data = new String[100];
		
		Alohaman man = new Alohaman();


	}
}

class Alohaman implements ActionListener{
	JFrame frame;
	JTextField msg;
	JPanel buttonpanel;
	JButton button;

	public Alohaman(){
		frame = new JFrame("Aloha3");
		frame.setLocation(400,400);
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		msg = new JTextField("",10);
		msgPanel = new JPanel();
		msgPanel.add(msg);

		button = new JButton("OK");
		button.addActionListener(this);
		buttonpanel = new JPanel();

		buttonpanel.add(button);
		Container con = frame.getContentPane();
		con.setLayout(new GridLayout(2,1));
		con.add(buttonpanel);

		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent ae){
		System.out.println("Aloha");

		FileWriter fw = null;
		PrintWriter pw = null;

		try{
			fw = new FileWriter("data.txt",true);
			pw = new PrintWriter(fw);

			System.out.println(msg);

		}catch(IOException e){
			System.out.println("IO Error");
		}
	}

}