package gamepoo;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Beedrill extends Inimigos {
		
	public Beedrill(int x, int y) {
		super(260,-425);
		ImageIcon i=new ImageIcon ("imagens\\beedrill.png");
		img=i.getImage();
		altura=img.getHeight(null);
		largura=img.getWidth(null);
	}
	
	public void mover(Darwin a, Vulcao b){
		if (n==0){
			x = x + vx; 
			y = y + vy;
			checarColisoes(a,b);
			if (passo==0){
				vy=2;
				vx=0;
				ImageIcon i=new ImageIcon ("imagens\\beedrill.png");
				img=i.getImage();
			}else if (passo==1){
				vx=-2;
				vy=0;
				ImageIcon i=new ImageIcon ("imagens\\beedrill1.png");
				img=i.getImage();	
			}else if (passo==2){
				vx=2;
				vy=0;
				ImageIcon i=new ImageIcon ("imagens\\beedrill2.png");
				img=i.getImage();
			}else if (passo==3){
				vy=-2;
				vx=0;
				ImageIcon i=new ImageIcon ("imagens\\beedrill3.png");
				img=i.getImage();
			}
		}else{
			ImageIcon i=new ImageIcon ("imagens\\beedrill4.png");
			img=i.getImage();
			ac=1;
		}
	}

	public Image getImage(){
		return img;
	}
}



