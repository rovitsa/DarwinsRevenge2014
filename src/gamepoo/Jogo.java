package gamepoo;

import javax.swing.JFrame;

public class Jogo extends JFrame{
	
	public Jogo(){
		add(new Mecanica());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("A vingan�a de Darwin");
		setSize(800,600);
		setVisible(true);
		setResizable(false);
		setLocationRelativeTo(null);
	}	
}