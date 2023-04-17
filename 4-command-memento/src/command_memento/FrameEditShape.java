package command_memento;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FrameEditShape extends JDialog {

	/**
	 * Generated Serial IDs
	 */
	private static final long serialVersionUID = -7019076614287266339L;
	public boolean abort = false;
	
	private JPanel contentPanel = new JPanel();

	private JButton buttonOk = new JButton("OK");
	private JButton buttonCancel = new JButton("Abbrechen");
	
	private JTextField textFieldColorRed = new JTextField("");
	private JTextField textFieldColorBlue = new JTextField("");
	private JTextField textFieldColorGreen = new JTextField("");
	private JTextField textFieldLeft = new JTextField("");
	private JTextField textFieldTop = new JTextField("");
	
	private JLabel labelRed = new JLabel("Rot");
	private JLabel labelBlue = new JLabel("Blau");
	private JLabel labelGreen = new JLabel("Grün");
	private JLabel labelLeft = new JLabel("Pixel von Links");
	private JLabel labelTop = new JLabel("Pixel von Oben");

	public FrameEditShape(ExampleShape shape) {
		initModifyShape();
		initialize(shape);
	}
	
	public boolean isNumeric(String str) { 
		  try {  
		    Double.parseDouble(str);
		    return true;
		  } catch(NumberFormatException e){  
		    return false;  
		  }  
		}
	
	private void initialize(ExampleShape shape) {
		
		buttonOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int positionLeft = 100 * ProgramMain.frameMain.getShapeCollection().size();
				int positionTop = 100 * ProgramMain.frameMain.getShapeCollection().size();
				
				if(textFieldLeft.getText().length() > 0)
					positionLeft = Integer.parseInt(textFieldLeft.getText());
				if(textFieldTop.getText().length() > 0)
					positionTop = Integer.parseInt(textFieldTop.getText());
				
				Rectangle bounds = shape.getBounds();
				bounds.x = positionLeft;
				bounds.y = positionTop;
				shape.setBounds(bounds);

				int red = 0;
				int green = 0;
				int blue = 0;
				
				if(textFieldColorRed.getText().length() > 0)
					red = Integer.parseInt(textFieldColorRed.getText());
				
				if(textFieldColorGreen.getText().length() > 0)
					green = Integer.parseInt(textFieldColorGreen.getText());
				
				if(textFieldColorBlue.getText().length() > 0)
					blue = Integer.parseInt(textFieldColorBlue.getText());

				shape.setBackground(new Color(red, green, blue));
				abort = false;
				dispose();
			}
		});
		
		this.add(contentPanel);
		
		buttonCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abort = true;
				dispose();
			}
		});
	}
	
	private void initModifyShape() {
		this.setTitle("Bearbeitungsfenster");
		this.setBounds(940, 700, 250, 190);
		
		labelLeft.setPreferredSize(new Dimension(100, 20));
		labelTop.setPreferredSize(new Dimension(100, 20));
		labelRed.setPreferredSize(new Dimension(100, 20));
		labelBlue.setPreferredSize(new Dimension(100, 20));
		labelGreen.setPreferredSize(new Dimension(100, 20));
		
		textFieldLeft.setPreferredSize(new Dimension(100, 20));
		textFieldTop.setPreferredSize(new Dimension(100, 20));
		textFieldColorRed.setPreferredSize(new Dimension(100, 20));
		textFieldColorBlue.setPreferredSize(new Dimension(100, 20));
		textFieldColorGreen.setPreferredSize(new Dimension(100, 20));
		
		buttonOk.setPreferredSize(new Dimension(100, 20));
		buttonCancel.setPreferredSize(new Dimension(100, 20));
		
		contentPanel.add(labelLeft);
		contentPanel.add(textFieldLeft);
		
		contentPanel.add(labelTop);
		contentPanel.add(textFieldTop);
		
		contentPanel.add(labelRed);
		contentPanel.add(textFieldColorRed);
		
		contentPanel.add(labelBlue);
		contentPanel.add(textFieldColorBlue);
		
		contentPanel.add(labelGreen);
		contentPanel.add(textFieldColorGreen);
		
		contentPanel.add(buttonOk);
		contentPanel.add(buttonCancel);
	}

	public JPanel getContentPanel() {
		return contentPanel;
	}

	public JButton getButtonOk() {
		return buttonOk;
	}

	public JButton getButtonCancel() {
		return buttonCancel;
	}

	public JTextField getTextFieldColorRed() {
		return textFieldColorRed;
	}

	public JTextField getTextFieldColorBlue() {
		return textFieldColorBlue;
	}

	public JTextField getTextFieldColorGreen() {
		return textFieldColorGreen;
	}

	public JTextField getTextFieldLeft() {
		return textFieldLeft;
	}

	public JTextField getTextFieldTop() {
		return textFieldTop;
	}
}
