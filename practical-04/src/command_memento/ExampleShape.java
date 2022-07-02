package command_memento;

import java.awt.Color;
import java.awt.Rectangle;

import javax.swing.JTextField;

public class ExampleShape extends JTextField {

	/**
	 * Generated Serial ID
	 */
	private static final long serialVersionUID = 3530768312196187038L;
	
	public String toString() {
		return "Rechteck";
	}
	
	public Memento getMemento() {
		ShapeState state = new ShapeState();
		
		Color background = this.getBackground();
		state.setBackColor(background.getRed(), background.getGreen(), background.getBlue());

		state.setLeft(this.getX());
		state.setTop(this.getY());

		return new Memento(state);
	}
	
	public void setMemento(Memento memento) {
		ShapeState state = memento.getShapeState();
		this.setBackground(state.getBackColor());

		Rectangle bounds = this.getBounds();
		bounds.x = state.getLeft();
		bounds.y = state.getTop();
		this.setBounds(bounds);
	}

}
