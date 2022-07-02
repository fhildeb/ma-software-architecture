package command_memento;

public class DeleteShapeCommand extends Command{

	@Override
	public void execute() {
		ExampleShape currentShape = (ExampleShape) ProgramMain.frameMain.getListShapes().getSelectedValue();
		
		if(currentShape != null) {
			ProgramMain.frameMain.getShapeCollection().removeElement(currentShape);
			ProgramMain.frameMain.getListShapes().repaint();
			ProgramMain.frameMain.getPanelDrawingArea().remove(currentShape);
			ProgramMain.frameMain.getPanelDrawingArea().repaint();
		}
		
	}

}
