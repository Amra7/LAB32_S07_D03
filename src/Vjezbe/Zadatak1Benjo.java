package Vjezbe;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Zadatak1Benjo {

	
public static void main(String[] args) {
	
	JFrame frame = new JFrame("Parni brojevi");
	JPanel panel  =new JPanel();
	JButton button = new JButton ("Submit");
	final JTextField enter = new JTextField(10);
	final JTextArea out = new JTextArea(10,10);
	out.setEditable(false);
	out.setLineWrap(true);
	
	panel.setLayout(new FlowLayout ());
	panel.add(enter);
	panel.add(button);
	panel.add(out);
	
	button.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e) {
			int num = Integer.parseInt(enter.getText());
			String str="";
			for ( int i = 1; i< num; i++){
				str += i + " ";
			}
			
			out.setText(str);
		}
	});
		
	frame.add(panel);
	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.pack();
	frame.setVisible(true);
}


	
}

