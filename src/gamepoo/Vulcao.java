package gamepoo;

import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class Vulcao extends Cenarios{

	public Vulcao(int x, int y) {
		super(x, y);
		ImageIcon img = new ImageIcon("imagens\\buraco.png");
		obstaculo = img.getImage();	
		altura=obstaculo.getHeight(null);
		largura=obstaculo.getWidth(null);
		xa=34;
		ya=60;
		xb=232;
		yb=60;
		xc=428;
		yc=60;
		xd=626;
		yd=60;
		xe=34;
		ye=220;
		xf=232;
		yf=220;
		xg=428;
		yg=220;
		xh=626;
		yh=220;
		xi=34;
		yi=380;
		xj=232;
		yj=380;
		xk=428;
		yk=380;
		xl=626;
		yl=380;
		ImageIcon i=new ImageIcon("imagens\\fundo2.png");
		fundo=i.getImage();
	}

	@Override
	public void posicionarObstaculos() {
		new Vulcao(xa, ya);
		new Vulcao(xb, yb);
		new Vulcao(xc, yc);
		new Vulcao(xd, yd);
		new Vulcao(xe, ye);
		new Vulcao(xf, yf);	
		new Vulcao(xg, yg);
		new Vulcao(xh, yh);	
		new Vulcao(xi, yi);
		new Vulcao(xj, yj);	
		new Vulcao(xk, yk);
		new Vulcao(xl, yl);	
	}
	
	public Rectangle getBoundsA(){
		return new Rectangle(xa+5,ya,largura-2,altura);
	}
	public Rectangle getBoundsB(){
		return new Rectangle(xb+5,yb,largura-2,altura);
	}
	public Rectangle getBoundsC(){
		return new Rectangle(xc+5,yc,largura-2,altura);
	}
	public Rectangle getBoundsD(){
		return new Rectangle(xd+5,yd,largura-2,altura);
	}
	public Rectangle getBoundsE(){
		return new Rectangle(xe+5,ye,largura-2,altura);
	}
	public Rectangle getBoundsF(){
		return new Rectangle(xf+5,yf,largura-2,altura);
	}
	public Rectangle getBoundsG(){
		return new Rectangle(xg+5,yg,largura-2,altura);
	}
	public Rectangle getBoundsH(){
		return new Rectangle(xh+5,yh,largura-2,altura);
	}
	public Rectangle getBoundsI(){
		return new Rectangle(xi+5,yi,largura-2,altura);
	}
	public Rectangle getBoundsJ(){
		return new Rectangle(xj+5,yj,largura-2,altura);
	}
	public Rectangle getBoundsK(){
		return new Rectangle(xk+5,yk,largura-2,altura);
	}
	public Rectangle getBoundsL(){
		return new Rectangle(xl+5,yl,largura-2,altura);
	}

}

