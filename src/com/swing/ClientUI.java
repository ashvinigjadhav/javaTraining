package com.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ClientUI extends JFrame implements ActionListener {

	JPanel main, addpanel, delpanel, searchpanel, failpanel;
	JButton add, del, search, fail, addData;
	JTextField rollNo;

	public ClientUI() {
		// Frame setting
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);

		main = new JPanel();
		main.setBounds(0, 0, 400, 300);
		main.setLayout(null);

		add = new JButton("Add");
		add.setBounds(20, 20, 100, 30);
		add.addActionListener(this);
		main.add(add);

		del = new JButton("Delete");
		del.setBounds(170, 20, 100, 30);
		del.addActionListener(this);
		main.add(del);

		search = new JButton("Search");
		search.setBounds(20, 100, 100, 30);
		search.addActionListener(this);
		main.add(search);

		fail = new JButton("Failed");
		fail.setBounds(170, 100, 100, 30);
		fail.addActionListener(this);
		main.add(fail);

		main.setVisible(true);
		add(main);

		addpanel = new JPanel();
		addpanel.setBounds(0, 0, 400, 300);
		addpanel.setLayout(null);

		rollNo = new JTextField();
		rollNo.setBounds(20, 20, 100, 30);
		rollNo.addActionListener(this);
		addpanel.add(rollNo);

		addData = new JButton("Add");
		addData.setBounds(20, 100, 100, 30);
		addData.addActionListener(this);
		addpanel.add(addData);

		addpanel.setVisible(false);
		this.add(addpanel);

		delpanel = new JPanel();
		failpanel = new JPanel();

		// visibility of frame
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new ClientUI();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource() == add) {
			System.out.println("Clicked on Add Students.");
			addpanel.setVisible(true);
			main.setVisible(false);

		} else if (e.getSource() == del) {
			System.out.println("Clicked on Delete Students.");
		} else if (e.getSource() == search) {
			System.out.println("Clicked on Search Students.");
		} else if (e.getSource() == fail) {
			System.out.println("Clicked on Failed Students.");
		} else if (e.getSource() == addData) {
			int rn = Integer.parseInt(rollNo.getText());
			System.out.println("Clicked on Failed Students." + rn);
		}

	}

}
