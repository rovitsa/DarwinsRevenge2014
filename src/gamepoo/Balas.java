package gamepoo;

import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

public class Balas {
	
	private int x,y;
	private Image img;
	private int po=4;
	private int altura,largura;
	public boolean isVisible;
	
	public Balas(int x, int y, Darwin a){
		this.x=x;
		this.y=y;
		isVisible=true;
		if (a.getDr()==0){
			ImageIcon i=new ImageIcon ("imagens\\Balas.png");
			img=i.getImage();
		}
		if (a.getDr()==1){
			ImageIcon i=new ImageIcon ("imagens\\Balas1.png");
			img=i.getImage();
		}	
		if (a.getDr()==2){
			ImageIcon i=new ImageIcon ("imagens\\Balas2.png");
			img=i.getImage();
		}	
		if (a.getDr()==3){
			ImageIcon i=new ImageIcon ("imagens\\Balas3.png");
			img=i.getImage();
		}	
		altura=img.getHeight(null);
		largura=img.getWidth(null);	
	}
	
	public boolean isVisible(){
		return isVisible;
	}
	
	public void setVisible(boolean isVisible){
		this.isVisible=isVisible;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public Image getImage(){
		return img;
	}
	
	public void mover(Darwin a){
		if (po==0){
			y=y-4;
			if (y<0){
				isVisible=false;
				po=4;
			}
		}
		if (po==1){
			x=x-4;
			if (x<0){
				isVisible=false;
				po=4;
			}
		}
		if (po==2){
			x=x+4;
			if (x>790){
				isVisible=false;
				po=4;
			}
		}
		if (po==3){
			y=y+4;
			if (y>590){
				isVisible=false;
				po=4;
			}
		}
	}
	
	public void direcionar(Darwin a){
		if (a.getDr()==0 && po==4){
			po=0;
		}
		if (a.getDr()==1 && po==4){
			po=1;
		}
		if (a.getDr()==2 && po==4){
			po=2;
		}
		if (a.getDr()==3 && po==4){
			po=3;
		}
		mover(a);
	}
	
	public Rectangle getBounds(){
		return new Rectangle(x,y,altura,largura);
	}

}



