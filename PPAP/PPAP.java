import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PPAP{
	public static void main(String[] args) {
		PPAPMan man = new PPAPMan();
	}
}

class PPAPman implements ActionListener{
	JFrame frame;

	JButton buttonSave;
	JButton buttonNext;
	JPanel buttonPanel;

	JLabel word1;	
	JLabel word2;
	JPanel wordPanel;

	JTextArea memo;
	JScrollPane memoPane;




	public PPAPMan(){
		frame = new JFrame("PPAP");
		frame.setLocation(400,400);
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		buttonSave = new JButton("Save");
		buttonSave.addActionListener(this);
		buttonNext = new JButton("Next");
		buttonNext.addActionListener(this);


		word1 = new JLabel("ALOHA");
		word2 = new JLabel("ALOHA");

		memo = new JTextArea(5, 20);


		Container con = frame.getContentPane();
		con.setLayout(new GridLayout(3, 1));	
		buttonPanel = new JPanel();				
		wordPanel = new JPanel();				
		memoPane = new JScrollPane(memo);		

		buttonPanel.add(buttonSave);
		buttonPanel.add(buttonNext);
		wordPanel.add(word1);
		wordPanel.add(word2);

		con.add(buttonPanel);
		con.add(wordPanel);
		con.add(memoPane);

		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent ae){

		String cmd = ae.getActionCommand();

		buttonSave = new JButton("Save");
		buttonSave.addActionListener(this);
		buttonSave.setActionCommand("save");

		buttonNext= new JButton("Next");
		buttonNext.addActionListener(this);
		buttonNext.setActionCommand("next");


		if(cmd.equals("save")){
			BufferedReader br = null;

		try {
			br = new BufferedReader(new InputStreamReader(new FileInputStream("words.txt"),"UTF-8"));

			String data;
			int i = 0;
			while((data = br.readLine()) != null) {
				words[i] = data;					
				i++;
			}

			int rmd1 = (int)(Math.random()*23);
			int rmd2 = (int)(Math.random()*23);

			word1.setText(words[rmd1]);
			word2.setText(words[rmd2]);

		} catch(IOException e) {
			System.out.println("IO Error.");
		}
		
		}
	}
	
}
