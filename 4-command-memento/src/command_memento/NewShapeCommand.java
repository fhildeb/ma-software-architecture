package command_memento;

import java.awt.Color;

public class NewShapeCommand extends Command {

	@Override
	public void execute() {
		
		ExampleShape shape = new ExampleShape();
		shape.setBounds(100 * ProgramMain.frameMain.getShapeCollection().size(), 100 * ProgramMain.frameMain.getShapeCollection().size(), 200, 100);
		shape.setBackground(new Color(0,0,0));
		
		FrameEditShape frameEditShape = new FrameEditShape(shape);
		frameEditShape.setModal(true);
		frameEditShape.setVisible(true);

		if(frameEditShape.abort == false) {
			ProgramMain.frameMain.getShapeCollection().addElement(shape);
			ProgramMain.frameMain.getPanelDrawingArea().add(shape, null);
			ProgramMain.frameMain.getPanelDrawingArea().repaint();
			ProgramMain.frameMain.getListShapes().setSelectedValue(shape, true);
		}
	}	
}
