package org.date;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;

public class DateChooser extends JFrame{

//	private static void createWindow(){
//
//		//create & set up the window
//		JFrame frame = new JFrame("Date Range Setter");
//		
//		
//		//labels
//		JLabel infoLabel=new JLabel("Date Range Controller", SwingConstants.CENTER);
//		infoLabel.setPreferredSize(new Dimension(300, 100));
//		frame.getContentPane().add(infoLabel, BorderLayout.CENTER);
//		
//		//diaplay window
//		frame.setLocationRelativeTo(null);
//		frame.pack();
//		frame.setVisible(true);
//		
//		//close window
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		
//	}
	
	public DateChooser() {
        super();
        this.setTitle("Date Range Controller");
        //create container
        Container cont = getContentPane();
        //close absolute layout
        this.setLayout(null);
        //create component
        JTextField jf1=new JTextField();
        JTextField jf2=new JTextField();
        JButton jb1 = new JButton("start date");
        JButton jb2 = new JButton("end date");
        JTextField date = new JTextField();
        //set functions for start
        jb1.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
            	DialogDatePicker datePicker=new DialogDatePicker(true, date, 0, 0);
            	jf1.setText(date.getText());
            	datePicker.dispose();
            	
            	System.out.println(date.getText());
            	//datePicker.setVisible(true);
            }
        });
        //set functions for end
        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	DialogDatePicker datePicker=new DialogDatePicker(true, date, 0, 0);
            	jf2.setText(date.getText());
            	datePicker.dispose();
            	//datePicker.setVisible(true);
            }
        });    
        //add component to container
        cont.add(jf1);
        cont.add(jf2);
        cont.add(jb1);
        cont.add(jb2);
        //position & size of container
        jf1.setBounds(300, 100, 120, 40);
        jf2.setBounds(300, 150, 120, 40);
        jb1.setBounds(110,230,120,40);
        jb2.setBounds(500,230,120,40);
        //position & size of window
        this.setBounds(500, 260, 720, 320);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //display
        this.setResizable(false);
        this.setVisible(true);
    }

	
	public static void main(String[] args){
		
		new DateChooser().setVisible(true);
		
	}
	
}
