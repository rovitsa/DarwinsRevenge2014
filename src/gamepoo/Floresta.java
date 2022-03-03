package gamepoo;

import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class Floresta extends Cenarios{

	public Floresta(int x, int y) {
		super(x, y);
		ImageIcon img = new ImageIcon("imagens\\arvore.png");
		obstaculo = img.getImage();	
		altura=obstaculo.getHeight(null);
		largura=obstaculo.getWidth(null);
		xa=44;
		ya=30;
		xb=240;
		yb=30;
		xc=436;
		yc=30;
		xd=621;
		yd=30;
		xe=44;
		ye=180;
		xf=240;
		yf=180;
		xg=436;
		yg=180;
		xh=621;
		yh=180;
		xi=44;
		yi=330;
		xj=240;
		yj=330;
		xk=436;
		yk=330;
		xl=621;
		yl=330;
		ImageIcon i=new ImageIcon("imagens\\fundo1.jpg");
		fundo=i.getImage();	
	}

	@Override
	public void posicionarObstaculos() {
		new Floresta(xa, ya);
		new Floresta(xb, yb);
		new Floresta(xc, yc);
		new Floresta(xd, yd);
		new Floresta(xe, ye);
		new Floresta(xf, yf);	
		new Floresta(xg, yg);
		new Floresta(xh, yh);	
		new Floresta(xi, yi);
		new Floresta(xj, yj);	
		new Floresta(xk, yk);
		new Floresta(xl, yl);	
	}
	
	public Rectangle getBoundsA(){
		return new Rectangle(62,150,largura,6);
	}
	public Rectangle getBoundsB(){
		return new Rectangle(256,150,largura,6);
	}
	public Rectangle getBoundsC(){
		return new Rectangle(452,150,largura,6);
	}
	public Rectangle getBoundsD(){
		return new Rectangle(642,150,largura,6);
	}
	public Rectangle getBoundsE(){
		return new Rectangle(62,300,largura,6);
	}
	public Rectangle getBoundsF(){
		return new Rectangle(256,300,largura,6);
	}
	public Rectangle getBoundsG(){
		return new Rectangle(452,300,largura,6);
	}
	public Rectangle getBoundsH(){
		return new Rectangle(642,300,largura,6);
	}
	public Rectangle getBoundsI(){
		return new Rectangle(62,450,largura,7);
	}
	public Rectangle getBoundsJ(){
		return new Rectangle(256,450,largura,7);
	}
	public Rectangle getBoundsK(){
		return new Rectangle(452,450,largura,7);
	}
	public Rectangle getBoundsL(){
		return new Rectangle(642,450,largura,7);
	}
}

