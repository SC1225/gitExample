package ch17;

import java.applet.AudioClip;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;

public class MyEventSound extends JApplet implements ActionListener {
	private AudioClip audio;
	private JButton play,stop,loop;
	
	@Override
	public void init() {
		setLayout(new FlowLayout());
		audio=getAudioClip(getClass().getResource("33.wav"));
		play=new JButton("시작");
		stop=new JButton("일시정지");
		loop=new JButton("반복재생");
		add(play);
		add(stop);
		add(loop);
		
		play.addActionListener(this);
		stop.addActionListener(this);
		loop.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn=(JButton)e.getSource();
		System.out.println(e.getSource());
		if(btn == play) {
			audio.play();
		}else if(btn == stop){
			audio.stop();
		}else if(btn == loop){
			audio.loop();
		}
		
	}

}
