package trickyQuiz;

import java.awt.Color;
import java.awt.Font;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Quiz_main extends JFrame implements ActionListener{

	JLabel qno,question;
	JRadioButton opt1,opt2,opt3,opt4;
	ButtonGroup options;
	JButton next,lifeline,submit;
	
	public static int ans_given = 0;
	public static int timer = 15;
	public static int cnt = 1;
	public static int score =0;
	String q[][] = new String[10][5];
	String qa[][] = new String[10][2];
	String pa[][] = new String[10][1];
	
	String username;
	Quiz_main(String name)
	{
		username = name;
		setBounds(330,70,838,750);
		setVisible(true);
		setLayout(null);
		getContentPane().setBackground(Color.white);
		
		ImageIcon image= new ImageIcon("D:\\myjava\\quiz project\\src\\trickyQuiz\\images\\images (2).jpeg");
		JLabel l1 = new JLabel(image);
		add(l1);
		l1.setVisible(true);
		l1.setBounds(-350,-17,1500,400);
		
		qno = new JLabel("");
        qno.setFont(new Font("Tahoma",Font.PLAIN,16));
        qno.setBounds(50, 400, 50, 30);
        add(qno);
        
        question = new JLabel("");
        question.setFont(new Font("Tahoma",Font.PLAIN, 16));
        question.setBounds(80, 400, 900, 30);
        add(question);
        
        q[0][0] = "Which is used to find and fix bugs in the Java programs.?";
        q[0][1] = "JVM";
        q[0][2] = "JDB";
        q[0][3] = "JDK";
        q[0][4] = "JRE";

        q[1][0] = "What is the return type of the hashCode() method in the Object class?";
        q[1][1] = "int";
        q[1][2] = "Object";
        q[1][3] = "long";
        q[1][4] = "void";

        q[2][0] = "Which package contains the Random class?";
        q[2][1] = "java.util package";
        q[2][2] = "java.lang package";
        q[2][3] = "java.awt package";
        q[2][4] = "java.io package";

        q[3][0] = "An interface with no fields or methods is known as?";
        q[3][1] = "Runnable Interface";
        q[3][2] = "Abstract Interface";
        q[3][3] = "Marker Interface";
        q[3][4] = "CharSequence Interface";

        q[4][0] = "In which memory a String is stored, when we create a string using new operator?";
        q[4][1] = "Stack";
        q[4][2] = "String memory";
        q[4][3] = "Random storage space";
        q[4][4] = "Heap memory";

        q[5][0] = "Which of the following is a marker interface?";
        q[5][1] = "Runnable interface";
        q[5][2] = "Remote interface";
        q[5][3] = "Readable interface";
        q[5][4] = "Result interface";

        q[6][0] = "Which keyword is used for accessing the features of a package?";
        q[6][1] = "import";
        q[6][2] = "package";
        q[6][3] = "extends";
        q[6][4] = "export";

        q[7][0] = "In java, jar stands for?";
        q[7][1] = "Java Archive Runner";
        q[7][2] = "Java Archive";
        q[7][3] = "Java Application Resource";
        q[7][4] = "Java Application Runner";

        q[8][0] = "Which of the following is a mutable class in java?";
        q[8][1] = "java.lang.StringBuilder";
        q[8][2] = "java.lang.Short";
        q[8][3] = "java.lang.Byte";
        q[8][4] = "java.lang.String";

        q[9][0] = "Which of the following option leads to the portability and security of Java?";
        q[9][1] = "Bytecode is executed by JVM";
        q[9][2] = "The applet makes the Java code secure and portable";
        q[9][3] = "Use of exception handling";
        q[9][4] = "Dynamic binding between objects";
        
        qa[0][1] = "JDB";
        qa[1][1] = "int";
        qa[2][1] = "java.util package";
        qa[3][1] = "Marker Interface";
        qa[4][1] = "Heap memory";
        qa[5][1] = "Remote interface";
        qa[6][1] = "import";
        qa[7][1] = "Java Archive";
        qa[8][1] = "java.lang.StringBuilder";
        qa[9][1] = "Bytecode is executed by JVM";
        
        
        //JRadiobutton for options in questions

        opt1 = new JRadioButton("");
        opt1.setBounds(100, 440, 700, 30);
        opt1.setFont(new Font("Dialog", Font.PLAIN, 17));
        opt1.setBackground(Color.WHITE);
        add(opt1);
        
        opt2 = new JRadioButton("");
        opt2.setBounds(100, 480, 700, 30);
        opt2.setFont(new Font("Dialog", Font.PLAIN, 17));
        opt2.setBackground(Color.WHITE);
        add(opt2);
        
        opt3 = new JRadioButton("");
        opt3.setBounds(100, 520, 700, 30);
        opt3.setFont(new Font("Dialog", Font.PLAIN, 17));
        opt3.setBackground(Color.WHITE);
        opt2.getLocation(null);
        add(opt3);
        
        opt4 = new JRadioButton("");
        opt4.setBounds(100, 560, 700, 30);
        opt4.setFont(new Font("Dialog", Font.PLAIN, 17));
        opt4.setBackground(Color.WHITE);
        add(opt4);
        
        options = new ButtonGroup();
        options.add(opt1);
        options.add(opt2);
        options.add(opt3);
        options.add(opt4);
        
        //buttons
        
        next = new JButton("Next");
        next.setFont(new Font("Tahoma", Font.PLAIN, 17));
        next.setBackground(Color.orange);
        next.setForeground(Color.black);
        next.addActionListener(this);
        next.setBounds(100,630, 170, 30);
        add(next);
        
        lifeline = new JButton("50-50 Lifeline");
        lifeline.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lifeline.setBackground(Color.orange);
        lifeline.setForeground(Color.black);
        lifeline.setBounds(300,630, 170, 30);
        lifeline.addActionListener(this);
        add(lifeline);
        
        submit = new JButton("Submit");
        submit.setFont(new Font("Tahoma", Font.PLAIN, 17));
        submit.setEnabled(false);
        submit.setBackground(Color.orange);
        submit.setForeground(Color.BLACK);
        submit.addActionListener(this);
        submit.setBounds(500, 630, 170, 30);
        add(submit);
        
        start(1);
	}
	

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == next) {
			repaint();
			opt1.setEnabled(true);
			opt2.setEnabled(true);
			opt3.setEnabled(true);
			opt4.setEnabled(true);
			ans_given = 1;
			if(options.getSelection() == null) {
				pa[cnt-1][0] = "";
			}else {
				System.out.println(cnt);
				pa[cnt-1][0] = options.getSelection().getActionCommand();
			}
			if(cnt == 9) {
				next.setEnabled(false);
				submit.setEnabled(true);
			}
			cnt++;
			start(cnt);
		}else if(e.getSource() == submit) {
			if(options.getSelection() == null) {
				pa[cnt-1][0] = "";
			}else {
				System.out.println(cnt);
				pa[cnt-1][0] = options.getSelection().getActionCommand();
			}
			
			for(int i=0;i<pa.length;i++) {
				if(pa[i][0].equals(qa[i][1])) {
					score += 10;
				}
			}
			this.setVisible(false);
			new Score(username,score).setVisible(true);
		}else if(e.getSource() == lifeline) {
			if(cnt == 3 || cnt == 5 || cnt == 7 || cnt == 9 || cnt == 10) {
				opt2.setEnabled(false);
				opt3.setEnabled(false);
			}else {
				opt1.setEnabled(false);
				opt4.setEnabled(false);
			}
			lifeline.setEnabled(false);
		}	
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		String time = "Time Left - " + timer + " seconds";
		g.setColor(Color.RED);
		g.setFont(new Font("Sans-serif",Font.BOLD,16));
		
		if(timer > 0) {
			g.drawString(time, 630,450);
		}else {
			g.drawString("Times up!",630,450);
		}
		
		timer--;
		try {
		    Thread.sleep(1000);
			repaint();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		if(ans_given == 1) {
			ans_given = 0;
			timer = 15;
		}else if(timer < 0) {
			timer = 15;
			opt1.setEnabled(true);
			opt2.setEnabled(true);
			opt3.setEnabled(true);
			opt4.setEnabled(true);
			if(cnt == 10) {
				if(options.getSelection() == null) {
					pa[cnt-1][0] = "";
				}else {
					System.out.println(cnt);
					pa[cnt-1][0] = options.getSelection().getActionCommand();
				}
				
				for(int i=0;i<pa.length;i++) {
					if(pa[i][0].equals(qa[i][1])) {
						score += 10;
					}
				}
				this.setVisible(false);
				//new score().setVisible();
			}else {
				if(options.getSelection() == null) {
					pa[cnt-1][0] = "";
				}else {
					System.out.println(cnt);
					pa[cnt-1][0] = options.getSelection().getActionCommand();
				}
				cnt++;
				start(cnt);
			}
		}
	}
	
	public void start(int cnt) {
		qno.setText(""+cnt+". ");
		question.setText(q[cnt-1][0]);
		opt1.setText(q[cnt-1][1]);
		opt1.setActionCommand(q[cnt-1][1]);
		opt2.setText(q[cnt-1][2]);
		opt2.setActionCommand(q[cnt-1][2]);
		opt3.setText(q[cnt-1][3]);
		opt3.setActionCommand(q[cnt-1][3]);
		opt4.setText(q[cnt-1][4]);
		opt4.setActionCommand(q[cnt-1][4]);
		options.clearSelection();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new Quiz_main("");
	}

}
