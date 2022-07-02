package command_memento;

public class ModifyShapeCommand extends Command{

	@Override
	public void execute() {
		ExampleShape currentShape = (ExampleShape) ProgramMain.frameMain.getListShapes().getSelectedValue();
		
		if (currentShape != null) {
			ProgramMain.frameMain.setUndoMemento(currentShape.getMemento());
			FrameEditShape frameEditShape = new FrameEditShape(currentShape);
			frameEditShape.setModal(true);
			frameEditShape.setVisible(true);
		}
	}
}
