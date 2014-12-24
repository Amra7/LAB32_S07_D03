package Vjezbe;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Zadatak2 {
	static JButton b1;
	static JButton b2;
public static void main(String[] args) {
	
	JFrame frame = new JFrame();
	frame.setSize(400, 250);
	JPanel panel = new JPanel();
	 b1 = new JButton("Jedno");
	 b2 = new JButton("Drugo");
	
	panel.add(b1);
	panel.add(b2);
	
	ButtonHandler  listener = new ButtonHandler();
	b1.addActionListener(listener);
	b2.addActionListener(listener);
	
	
	frame.add(panel);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
}

public static class ButtonHandler implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton source = (JButton)e.getSource();
		 if ( source.getText().equals("Jedno")){
			 b1.setText("Clicked");
			 b2.setText("Drugo");
		 } else if ( source.getText().equals("Drugo")){
			 b1.setText("Jedno");
			 b2.setText("Clicked");
		 }
	}
	
}
}
