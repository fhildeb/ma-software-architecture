package command_memento;

public class UndoCommand extends Command{

	@Override
	public void execute() {
		
		ExampleShape currentShape = (ExampleShape) ProgramMain.frameMain.getListShapes().getSelectedValue();
		currentShape.setMemento(ProgramMain.frameMain.getUndoMemento());
		
	}

}
