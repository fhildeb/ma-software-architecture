package command_memento;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;

public class FrameMain extends JFrame {
	
	/**
	 * Generated Serial ID
	 */
	private static final long serialVersionUID = 8468071226217048431L;
	
	private Memento undoMemento = null;
	
	private JPanel contentPanel = new JPanel();
	private JPanel panelDrawingArea = new JPanel();
	private JButton buttonNew = new JButton("Neu");
	private JButton buttonModify = new JButton("Bearbeiten");
	private JButton buttonDelete = new JButton("Löschen");
	private JButton buttonUndo = new JButton("Zurück");

	private JList<JTextField> listShapes = new JList<>();
	private JPopupMenu menuPopup;

	private DefaultListModel<JTextField> shapeCollection = new DefaultListModel<>();
	
	private JMenuItem menuNew = new JMenuItem("Neu");
	private JMenuItem menuModify = new JMenuItem("Bearbeiten");
	private JMenuItem menuDelete = new JMenuItem("Löschen");
	private JMenuItem menuUndo = new JMenuItem("Zurück");

	public FrameMain() {
		
		initialize();
		initalizeMenu();

	}
	
	private void initialize() {
		
		this.setTitle("Praktikum Command Memento Pattern");
		this.setBounds(200, 150, 1000, 750);
		
		panelDrawingArea.setLayout(null);
		panelDrawingArea.setBackground(new Color(255, 255, 204));
		listShapes.setBackground(new Color(255, 255, 255));
		listShapes.setPreferredSize(new Dimension(200,400));
		
		listShapes.setModel(shapeCollection);
		
		contentPanel.add(buttonNew);
		contentPanel.add(buttonModify);
		contentPanel.add(buttonDelete);
		contentPanel.add(buttonUndo);
		
		this.add(contentPanel, BorderLayout.NORTH);
		this.add(panelDrawingArea, BorderLayout.CENTER);
		this.add(listShapes, BorderLayout.WEST);
		
		buttonNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NewShapeCommand cmd = new NewShapeCommand();
				cmd.execute();
			}
		});
		
		buttonModify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ModifyShapeCommand cmd = new ModifyShapeCommand();
				cmd.execute();
			}
		});
		
		buttonDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeleteShapeCommand cmd = new DeleteShapeCommand();
				cmd.execute();
			}
		});
		
		buttonUndo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UndoCommand cmd = new UndoCommand();
				cmd.execute();
			}
		});
	}
	
	private void initalizeMenu() {
		menuNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NewShapeCommand cmd = new NewShapeCommand();
				cmd.execute();
			}
		});
		
		menuModify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ModifyShapeCommand cmd = new ModifyShapeCommand();
				cmd.execute();
			}
		});
		
		menuDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeleteShapeCommand cmd = new DeleteShapeCommand();
				cmd.execute();
			}
		});
		
		menuUndo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UndoCommand cmd = new UndoCommand();
				cmd.execute();
			}
		});
		
		menuPopup = new JPopupMenu("Befehle");
		
		menuPopup.add(menuNew);
		menuPopup.add(menuModify);
		menuPopup.add(menuDelete);
		menuPopup.add(menuUndo);
		
        listShapes.addMouseListener(new PopupListener());
	}

	public JPanel getContentPanel() {
		return contentPanel;
	}

	public JPanel getPanelDrawingArea() {
		return panelDrawingArea;
	}

	public JButton getButtonNew() {
		return buttonNew;
	}

	public JButton getButtonModify() {
		return buttonModify;
	}

	public JButton getButtonDelete() {
		return buttonDelete;
	}

	public JButton getButtonUndo() {
		return buttonUndo;
	}

	public JList<JTextField> getListShapes() {
		return listShapes;
	}

	public DefaultListModel<JTextField> getShapeCollection() {
		return shapeCollection;
	}

	public void setUndoMemento(Memento undoMemento) {
		this.undoMemento = undoMemento;
	}

	public Memento getUndoMemento() {
		return this.undoMemento;
	}
	
	private class PopupListener extends MouseAdapter {
	    @Override
	    public void mousePressed(MouseEvent e) {
	        ShowPopup(e);
	    }

	    @Override
	    public void mouseReleased(MouseEvent e) {
	        ShowPopup(e);
	    }

	    private void ShowPopup(MouseEvent e) {
	        if (e.isPopupTrigger()) {
	            menuPopup.show(e.getComponent(), e.getX(), e.getY());
	        }
	    }
	}
}


