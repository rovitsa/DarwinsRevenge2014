package gamepoo;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Rhyhorn extends Inimigos {
	
	public Rhyhorn(int x, int y) {
		super(-20,150);
		ImageIcon i=new ImageIcon ("imagens\\onix.png");
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
				ImageIcon i=new ImageIcon ("imagens\\onix.png");
				img=i.getImage();
			}else if (passo==1){
				vx=-2;
				vy=0;
				ImageIcon i=new ImageIcon ("imagens\\onix1.png");
				img=i.getImage();	
			}else if (passo==2){
				vx=2;
				vy=0;
				ImageIcon i=new ImageIcon ("imagens\\onix2.png");
				img=i.getImage();
			}else if (passo==3){
				vy=-2;
				vx=0;
				ImageIcon i=new ImageIcon ("imagens\\onix3.png");
				img=i.getImage();
			}
		}else{
			ImageIcon i=new ImageIcon ("imagens\\onix4.png");
			img=i.getImage();
			ac=1;
		}
	}

	public Image getImage() {
		return img;
	}
}