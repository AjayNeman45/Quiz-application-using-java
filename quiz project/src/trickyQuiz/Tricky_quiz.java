package trickyQuiz;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.Event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.io.IOException;
public class Tricky_quiz extends JFrame implements ActionListener {
	
	JButton rules,exit;
	JTextField getName;
	
	Tricky_quiz()
	{
		setBounds(200,100,1200,600);
		setVisible(true);
		setLayout(null);
		
		getContentPane().setBackground(Color.WHITE);
		ImageIcon image= new ImageIcon("D:\\myjava\\quiz project\\src\\trickyQuiz\\images\\images.jpeg");
		JLabel l1 = new JLabel(image);
		add(l1);
		l1.setVisible(true);
		l1.setBounds(0,0,550,550);
		
		JLabel brandName = new JLabel("Tricky Quiz");
		brandName.setBounds(790,30,300,100);
		brandName.setFont(new Font("Eras Demi ITC",Font.BOLD,40));
		brandName.setForeground(Color.ORANGE);
		add(brandName);
		
		JLabel name = new JLabel("Enter Your Good Name Below");
		name.setBounds(750, 140, 400, 100);
		name.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		name.setForeground(Color.gray);
		add(name);
		
		getName = new JTextField();
		getName.setBounds(750, 230, 300, 30);
		getName.setFont(new Font("Century Gothic",Font.PLAIN,15));
		add(getName);
		
		//buttons
	    rules = new JButton("Rules");
		rules.setBounds(770,300,90,30);
		rules.setForeground(Color.DARK_GRAY);
		rules.setBackground(Color.orange);
		rules.addActionListener(this);
		add(rules);
		
		exit = new JButton("Exit");
		exit.setBounds(930,300,90,30);
		exit.setForeground(Color.DARK_GRAY);
		exit.setBackground(Color.orange);
		exit.addActionListener(this);
		add(exit);
		
		//action listener
		
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == rules) {
            String name = getName.getText();
            if(name.isEmpty()) {
            	System.out.println("in");
            	JOptionPane.showMessageDialog(this, "Plz enter your name first");
            	
            }else {
            	 this.setVisible(false);
     			 new rules(name);
            }
           
		}else {
			System.exit(0);
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        new Tricky_quiz();
	}

}
