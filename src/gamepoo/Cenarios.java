package gamepoo;

import java.awt.Image;

public abstract class Cenarios {
	protected Image img;
	protected Image fundo;
	protected Image obstaculo;
	protected int altura, largura;
	protected int x,y,xa,ya,xb,yb,xc,yc,xd,yd,xe,ye,xf,yf,xg,yg,xh,yh,xi,yi,xj,yj,xk,yk,xl,yl;
	
	public Cenarios(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	public abstract void posicionarObstaculos();
	
	public Image getFundo(){
		return fundo;
	}
	
	public Image getObstaculo(){
		return obstaculo;
	}
	
	public int getXa() {
		return xa;
	}

	public int getYa() {
		return ya;
	}

	public int getXb() {
		return xb;
	}

	public int getYb() {
		return yb;
	}

	public int getXc() {
		return xc;
	}

	public int getYc() {
		return yc;
	}

	public int getXd() {
		return xd;
	}

	public int getYd() {
		return yd;
	}
	public int getXe() {
		return xe;
	}

	public int getYe() {
		return ye;
	}

	public int getXf() {
		return xf;
	}

	public int getYf() {
		return yf;
	}
	
	public int getXg() {
		return xg;
	}

	public int getYg() {
		return yg;
	}

	public int getXh() {
		return xh;
	}

	public int getYh() {
		return yh;
	}
	public int getXi() {
		return xi;
	}

	public int getYi() {
		return yi;
	}

	public int getXj() {
		return xj;
	}

	public int getYj() {
		return yj;
	}
	public int getXk() {
		return xk;
	}

	public int getYk() {
		return yk;
	}
	public int getXl() {
		return xl;
	}

	public int getYl() {
		return yl;
	}
	
}
