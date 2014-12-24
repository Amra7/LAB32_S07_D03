package ColorPicker;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ColorPicker extends JPanel {

	private static Color[] palette = new Color[] {
		Color.WHITE,
		Color.BLACK,
		Color.RED,
		Color.BLUE,
		Color.GREEN,
		Color.CYAN,
		Color.MAGENTA,
		new Color(133, 7, 42),
	};
	
	public Color currentColor;
		
	public ColorPicker(){
		super();
		currentColor = Color.BLACK;
		for ( int i = 0; i < palette.length; i++){
			JButton d = new JButton("Color");
			d.setBackground(palette[i]);
			d.setOpaque(true);
			d.setBorderPainted(false);
			d.setForeground(palette[i]);
			
			d.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					JButton clicked =(JButton)(e.getSource());
					currentColor = clicked.getBackground();
					
				}
				
				
			});
			add(d);
		}
	}
}
