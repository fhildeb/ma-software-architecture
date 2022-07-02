package command_memento;

public class Memento {
	
	private ShapeState shapeState;
	
	Memento(ShapeState shapeState){
		
		this.shapeState = shapeState;
	}
	
	public ShapeState getShapeState() {
		
		return this.shapeState;
	}
}
