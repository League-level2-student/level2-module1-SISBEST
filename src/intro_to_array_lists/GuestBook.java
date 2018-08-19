package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.swing.*;

public class GuestBook implements ActionListener {
	ArrayList<String> book = new ArrayList<String>();
	JButton sign = new JButton("Sign The Guestbook!");
	JButton view = new JButton("View Signatures!");

	public static void main(String[] args) {
		GuestBook gb = new GuestBook();
		gb.start();
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
	void start() {
		JFrame f = new JFrame("S House Guestbook!");
		JPanel p = new JPanel();
		p.add(view);
		p.add(sign);
		f.add(p);
		f.pack();
		f.setVisible(true);
		view.addActionListener(this);
		sign.addActionListener(this);
	}

	String getdt() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		return (dtf.format(now));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton bp = (JButton) e.getSource();
		if (bp == sign) {
			String name = JOptionPane.showInputDialog(null, "Name?");
			book.add(getdt() + ": " + name + " signed!");
		}
		else if(bp == view) {
			JOptionPane.showMessageDialog(null, getbook());
		}
	}
	String getbook() {
		for(int i = 0; i<book.size(); i++) {
			
		}
	}
}
