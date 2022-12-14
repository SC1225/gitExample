package ch17;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelExam extends JFrame {
	public PanelExam() {
		JPanel p = new JPanel();
		p.setBackground(Color.red);
		JButton button1 = new JButton("버튼1");
		JButton button2 = new JButton("버튼2");
		JButton button3 = new JButton("버튼3");
		JButton button4 = new JButton("버튼4");
		JButton button5 = new JButton("버튼5");
		JButton button6 = new JButton("버튼6");
		
		p.add(button1);
	    p.add(button6);
	    
	    add(p, BorderLayout.NORTH);
	    add(button2);
	    add(button3, "south");
	    add(button4, "West");
	    add(button5, "East");
	    
	    setSize(300, 300);
	    setVisible(true);
	    
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		new PanelExam();
	}

}
