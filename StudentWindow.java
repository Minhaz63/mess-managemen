package messmanagement;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class StudentWindow implements ActionListener{

	// declare all the components
	JFrame frame;
	JLabel idL;
	JLabel nameL;
	JLabel departmentL;
	JTextField id;
	JTextField name;
	JComboBox department;
	JButton submit;
	JButton cancel;
	
	public StudentWindow(){
		// initialize the components
		frame = new JFrame();
		
		idL = new JLabel("ID");
		nameL = new JLabel("Name");
		departmentL = new JLabel("Department");
		
		id = new JTextField();
		name = new JTextField();
		
		
		String [] choices = {"ECE", "BBA", "ECO"};
		department = new JComboBox(choices);
		
		submit = new JButton("Submit");
		submit.addActionListener(this);
		cancel = new JButton("Cancel");
		cancel.addActionListener(this);
		
		// initialize layout
		GridLayout g = new GridLayout(4, 2);
		frame.setLayout(g);
		
		
		// add the component into the frame
		
		frame.add(idL);
		frame.add(id);
		frame.add(nameL);
		frame.add(name);
		frame.add(departmentL);
		frame.add(department);
		frame.add(submit);
		frame.add(cancel);
		
		// now display the frame
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 350);
		frame.setTitle("Student Form");
		
	}
	

	
	public void actionPerformed(ActionEvent e){
		// button actions goes in here
		if(e.getSource() == submit){ // submit button is clicked
			// retrieve values from window
			String i = id.getText();
			String n = name.getText();
			String d = department.getSelectedItem().toString();
			System.out.println(i + n + d);
			//Student temp = new Student(i, n, d);
		}
		
		if(e.getSource() == cancel){
			id.setText("");
			name.setText("");
			department.setSelectedIndex(0);
			frame.setVisible(false);
			//System.exit(0);
		}
	}
	
//	public static void main(String[] args) {
//		StudentWindow s = new StudentWindow();
//	}
	
	
	
	
	
}