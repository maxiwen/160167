import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TextViewer {
	public static void main(String[] args) {
		TextViewerMan man = new TextViewerMan();
	}
}


class TextViewerMan implements ActionListener{
	
	JFrame frame;
	JButton button1;
	JButton button2;
	JTextField fileName;
	JPanel fieldPanel;
	JTextArea textArea;
	JScrollPane scrollPane;

	
	public TextViewerMan() {
		
		frame = new JFrame("TestScroll");
		frame.setLocation(400, 400);
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		button1 = new JButton("開く");
		button1.addActionListener(this);
		button1.setActionCommand("btn1");

		button2 = new JButton("保存する");
		button2.addActionListener(this);
		button2.setActionCommand("btn2");

		fileName = new JTextField("ALOHA", 20);	
		fieldPanel = new JPanel();				
		textArea = new JTextArea(10, 30);		
		scrollPane = new JScrollPane(textArea);

	
		fieldPanel.add(fileName);	
		fieldPanel.add(button1);	
		fieldPanel.add(button2);

		Container con = frame.getContentPane();
		con.setLayout(new GridLayout(2, 1));
		con.add(fieldPanel);	
		con.add(scrollPane);	

		
		frame.setVisible(true);
	}

	
	public void actionPerformed(ActionEvent ae) {
		
		String btn = ae.getActionCommand();

		
		if(btn.equals("btn1")) {
			
			String file = fileName.getText();
			textArea.setText(file);

		}
	}
}