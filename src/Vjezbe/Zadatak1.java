package Vjezbe;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Zadatak1 {

	static JTextField enterNum;
	static JTextArea nums;

	public static void main(String[] args) {

		JFrame myFrame = new JFrame();
		myFrame.setLayout(new BorderLayout());
		myFrame.setSize(400, 300);
		myFrame.setTitle("Parni brojevi");

		enterNum = new JTextField();
		enterNum.setSize(10, 10);
		JButton button = new JButton("Click");

		nums = new JTextArea();
		

		Display display = new Display();
		
		// display.setSize(200, 120);
    	display.setLayout(new BorderLayout());
		display.add(button, BorderLayout.EAST);
		display.add(enterNum, BorderLayout.CENTER);
		display.add(nums, BorderLayout.SOUTH);
		nums.setPreferredSize(new Dimension(400, 150));
		nums.setLineWrap(true);
		

		ButtonHandler listener = new ButtonHandler();
		button.addActionListener(listener);
		
//		nums.addActionListener(listener);

		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setContentPane(display);
		myFrame.setVisible(true);

	}

	public static class Display extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawString("Enter number", 20, 30);
		}

	}

	public static class ButtonHandler implements ActionListener {
		String str = "";
		@Override
		public void actionPerformed(ActionEvent e) {
			int num = Integer.parseInt(enterNum.getText());
	
			for ( int i=1; i<=num; i++){
				if(i % 2 == 0)
					str +=  i + ",";
			}
			nums.setText(str);
			
			
		}
	}
	
}
