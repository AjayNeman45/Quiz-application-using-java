package trickyQuiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class rules extends  JFrame implements ActionListener {
	
	JButton back,start;
	
	public String username="";
	rules(String name)
	{
	    username = name;
		setBounds(400,100,800,650);
		setVisible(true);
		setLayout(null);
		getContentPane().setBackground(Color.white);
		
		JLabel welcome = new JLabel("Welcome "+ username + " to Tricky Quiz");
		welcome.setBounds(150,20,700,30);
		welcome.setFont(new Font("Berlin Sans FB",Font.BOLD,30));
		welcome.setForeground(Color.orange);
		add(welcome);
		
		JLabel l1 = new JLabel("");
		l1.setBounds(50,130,600,350);
		l1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		l1.setText(
				 "<html>"+ 
			                "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
			                "2. Do not unnecessarily smile at the person sitting next to you, they may also not know the answer" + "<br><br>" +
			                "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
			                "4. Crying is allowed but please do so quietly." + "<br><br>" +
			                "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
			                "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
			                "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
			                "8. May you know more than what John Snow knows, Good Luck" + "<br><br>" +
			    "<html>"	
		
		);
		add(l1);
		
		back = new JButton("Back");
		back.setBounds(250, 500, 80, 30);
		back.setBackground(Color.orange);
		back.addActionListener(this);
		add(back);
		
		start = new JButton("Start");
		start.setBounds(400, 500, 80, 30);
		start.addActionListener(this);
		start.setBackground(Color.orange);
		add(start);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == start) {
			this.setVisible(false);
			new Quiz_main(username).setVisible(true);
		}else if(e.getSource() == back) {
			this.setVisible(false);
			new Tricky_quiz().setVisible(true);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new rules("");
	}

}
