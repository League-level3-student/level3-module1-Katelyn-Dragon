package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_GuestBook implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton buttonOne = new JButton("Add Name");
	JButton buttonTwo = new JButton("View Names");
	ArrayList<String> names;
	String guests;
	public static void main(String[] args) {
		new _02_GuestBook().create();
	}
	void create() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(350, 75);
		frame.add(panel);
		panel.add(buttonOne);
		panel.add(buttonTwo);
		frame.setVisible(true);
		guests = new String("Guest #");
		names = new ArrayList<String>();
		buttonOne.addActionListener(this);
		buttonTwo.addActionListener(this);
	}
	public void addNames() {
		String newName = JOptionPane.showInputDialog("Insert a new name");
		names.add(newName);
	}
	public void viewNames() {
		String list="";
		for (int i = 0; i < names.size(); i++) {
			list=list+ "guests #"+ (i+1) +":" + names.get(i)+"\n";
		}
		JOptionPane.showMessageDialog(null,list);
	}
	// Create a GUI with two buttons. One button reads "Add Name" and the other
	// button reads "View Names".
	// When the add name button is clicked, display an input dialog that asks the
	// user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a
	// message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == buttonOne) {
			addNames();
		} else if (e.getSource() == buttonTwo) {
			viewNames();
		}
	}

}
