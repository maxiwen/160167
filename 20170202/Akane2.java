import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.event.*;

public class Akane2{
	public static void main(String[] args) {
		FrameMan fm = new FrameMan();

	}
}

class FrameMan implements ActionListener {
	JFrame frame;
	JPanel panel;
	JLabel label;
	JButton button;

	FileInputStream fis;
	InputStreamReader isr;
	BufferedReader br;

	JTextField answer;



	public FrameMan(){
		frame = new JFrame("Akake2");
		frame.setLocation(0, 0);		
		frame.setSize(800, 1000);			
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		fis = new FileInputStream("mondai.txt");
		isr = new InputStreamReader(fis, "UTF-8");
		br = new BufferedReader(isr);

		String data = br.readLine();
			
			label = new JLabel(mondai[0]);
			panel = new JPanel();

			button= new JButton("次へ");
			button.addActionListener(this);
			button.setActionCommand("open");

			
		Container con = frame.getContentPane();
		
		panel.add(label);
		panel.add(button);
		con.add(panel);
		
		
		frame.setVisible(true);
			
	}

	public void actionPerformed(ActionEvent ae){
		String kotae = answer.getText();

		if(kotae.equals(mondai[1])){
			
				}

			
	}
}
