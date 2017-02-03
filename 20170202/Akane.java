import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.event.*;

public class Akane{
	public static void main(String[] args) {
		FrameMan fm = new FrameMan();

	}
}

class FrameMan implements ActionListener {
	JFrame frame;
	JPanel panel;
	JLabel label;
	JButton button;

	ImageIcon img1;
	ImageIcon img2;
	
	
	

	public FrameMan(){
		frame = new JFrame("Akake");
		frame.setLocation(0, 0);		
		frame.setSize(800, 1000);			
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		img1 = new ImageIcon("1.jpg");
		img2 = new ImageIcon("2.jpg");
		

			
			label = new JLabel(img1);
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
		String cmd = ae.getActionCommand();

		if(cmd.equals("open")){

			label.setIcon(img1);
			label.setIcon(img2);

		}

			
	}
}