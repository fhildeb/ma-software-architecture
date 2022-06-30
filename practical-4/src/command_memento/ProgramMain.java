package command_memento;

import javax.swing.JFrame;

public class ProgramMain {

	public static FrameMain frameMain;

	public static void main(String[] args){
		
		frameMain = new FrameMain();
		frameMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameMain.setVisible(true);
	}
}
