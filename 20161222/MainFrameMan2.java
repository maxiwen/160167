import java.awt.*;
import javax.swing.*;

public class MainFrameMan2{
	public static void main(String[] args) {
		FrameMan fm = new FrameMan();

	}
}

class FrameMan{
	JFrame frame;
	JPanel panel;
	JLabel label;
	ImageIcon icon;

	public FrameMan(){
		System.out.println("Aloha2");

		openWindow();
	}

		private void openWindow(){
			frame = new JFrame();
			frame.setLocation(200,200);
			frame.setSize(300,300);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setTitle("WINDOW");

			icon = new ImageIcon("badges_java_basics_Stage1.png");

			panel = new JPanel();
			label = new JLabel(icon);
			panel.add(label);
			frame.add(panel);

			frame.setVisible(true);
		}
	}
