package gamepoo;

import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class Menus {
	
	private int y,x;
	private Image inicial;
	private Image gameover;
	private Image selecao;
	private Image parabens;
	
	public Menus() {
		ImageIcon i1=new ImageIcon ("imagens\\telainicial.png");
		inicial=i1.getImage();
		ImageIcon i2=new ImageIcon ("imagens\\Gameover.png");
		gameover=i2.getImage();
		ImageIcon i3=new ImageIcon ("imagens\\selecao.png");
		selecao=i3.getImage();
		ImageIcon i4=new ImageIcon ("imagens\\parabens.jpg");
		parabens=i4.getImage();
		y=415;
	}
	
	public Image getInicial() {
		return inicial;
	}
	
	public Image getGameOver(){
		return gameover;
	}
	
	public Image getParabens(){
		return parabens;
	}
	
	public Image getSelecao(){
		return selecao;
	}
	
	public int getY(){
		return y;
	}
	
	public int getX(){
		return x;
	}
	
	public void KeyPressed(KeyEvent e){
		int k=e.getKeyCode();
		if (k==KeyEvent.VK_ENTER && y==415){
			x=1;
		}
	}
}
