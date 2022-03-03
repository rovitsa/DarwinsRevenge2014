package gamepoo;

import java.awt.Image;
import java.awt.Rectangle;
import java.util.ArrayList;

 abstract public class Inimigos {
	 
	protected int i;
	protected int z;
	protected int atk;
	protected int hp;
	protected int tipo;
	protected int x,y;
	protected int passo;
	protected String nome;
	protected Image img;
	protected int ac;
	protected int n;
	protected int altura, largura;
	protected int vx,vy;
	protected int xa,ya,xb,yb,xc,yc,xd,yd;
	protected ArrayList<Inimigos>inimigos;
	
	public Inimigos(int x, int y){
		this.x=x;
		this.y=y;
		inimigos = new ArrayList<Inimigos>();
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public int getZ() {
		return z;
	}
	
	public int getAc() {
		return ac;
	}

	public Rectangle getBounds(){
		return new Rectangle(x,y,largura,altura);
	}
	
	public abstract void mover(Darwin a, Vulcao b);
	public abstract Image getImage();
	
	public void perseguirJogador(Darwin a, Vulcao b) {
		mover(a,b);
		if (x<10){
			passo=2;
		}else if (x>780){
			passo=1;
		}else if (y<10){
			passo=0;
		}else if (y>590){
			passo=3;
		}else if ((a.getX()+3) < x && Math.abs(a.getY()+8 - y) < Math.abs(a.getX()+3 - x)){
			passo=1;
		}else if (a.getX()+3 > x && Math.abs(a.getY()+8 - y) < Math.abs(a.getX()+3 - x)){
			passo=2;
		}else if ((a.getY()+8 > y || a.getX()+3 > x) && Math.abs(a.getY()+8 - y) == Math.abs(a.getX()+3 - x)){	
			passo=0;
		}else if ((a.getY()+8 < y || a.getX()+3 < x) && Math.abs(a.getY()+8 - y) == Math.abs(a.getX()+3 - x)){	
			passo=3;
		}else if (a.getY()+8 > y && Math.abs(a.getX()+3 - x) < Math.abs(a.getY()+8 - y)){
			passo=0;
		}else if (a.getY()+8 < y && Math.abs(a.getX()+3 - x) < Math.abs(a.getY()+8 - y)){
			passo=3;
		}
	}

	public void checarColisoes(Darwin d, Vulcao v) {
		Rectangle formaDarwin = d.getBounds();
		Rectangle formaInimigo = getBounds();
		Rectangle formaBalas;
		ArrayList<Balas>bls = d.getBls();
		for (int i=0; i<bls.size(); i++){
			Balas tempBalas = bls.get(i);
			formaBalas = tempBalas.getBounds();
			if (formaBalas.intersects(formaInimigo)){
				n=1;
			}
		}
		Rectangle formaObstaculoA = v.getBoundsA();
		Rectangle formaObstaculoB = v.getBoundsB();
		Rectangle formaObstaculoC = v.getBoundsC();
		Rectangle formaObstaculoD = v.getBoundsD();
		Rectangle formaObstaculoE = v.getBoundsE();
		Rectangle formaObstaculoF = v.getBoundsF();
		Rectangle formaObstaculoG = v.getBoundsG();
		Rectangle formaObstaculoH = v.getBoundsH();
		Rectangle formaObstaculoI = v.getBoundsI();
		Rectangle formaObstaculoJ = v.getBoundsJ();
		Rectangle formaObstaculoK = v.getBoundsK();
		Rectangle formaObstaculoL = v.getBoundsL();
		
		if ((formaInimigo.intersects(formaObstaculoA) || formaInimigo.intersects(formaObstaculoB) ||
			formaInimigo.intersects(formaObstaculoC) || formaInimigo.intersects(formaObstaculoD) || 
			formaInimigo.intersects(formaObstaculoE) || formaInimigo.intersects(formaObstaculoF) ||
			formaInimigo.intersects(formaObstaculoG) || formaInimigo.intersects(formaObstaculoH) ||
			formaInimigo.intersects(formaObstaculoI) || formaInimigo.intersects(formaObstaculoJ) ||
			formaInimigo.intersects(formaObstaculoK) || formaInimigo.intersects(formaObstaculoL))
			&& passo==1 || passo==2 && d.getY()<y && (d.getX()<=x || d.getX()>x)){
			passo=0;
		}else if ((formaInimigo.intersects(formaObstaculoA) || formaInimigo.intersects(formaObstaculoB) ||
				formaInimigo.intersects(formaObstaculoC) || formaInimigo.intersects(formaObstaculoD) || 
				formaInimigo.intersects(formaObstaculoE) || formaInimigo.intersects(formaObstaculoF) ||
				formaInimigo.intersects(formaObstaculoG) || formaInimigo.intersects(formaObstaculoH) ||
				formaInimigo.intersects(formaObstaculoI) || formaInimigo.intersects(formaObstaculoJ) ||
				formaInimigo.intersects(formaObstaculoK) || formaInimigo.intersects(formaObstaculoL)) 
				&& passo==0 && d.getX()<x){
				passo=1;
		}else if ((formaInimigo.intersects(formaObstaculoA) || formaInimigo.intersects(formaObstaculoB) ||
				formaInimigo.intersects(formaObstaculoC) || formaInimigo.intersects(formaObstaculoD) || 
				formaInimigo.intersects(formaObstaculoE) || formaInimigo.intersects(formaObstaculoF) ||
				formaInimigo.intersects(formaObstaculoG) || formaInimigo.intersects(formaObstaculoH) ||
				formaInimigo.intersects(formaObstaculoI) || formaInimigo.intersects(formaObstaculoJ) ||
				formaInimigo.intersects(formaObstaculoK) || formaInimigo.intersects(formaObstaculoL))
				&& passo==0 && d.getX()>=x){
				passo=2;
		}else if ((formaInimigo.intersects(formaObstaculoA) || formaInimigo.intersects(formaObstaculoB) ||
				formaInimigo.intersects(formaObstaculoC) || formaInimigo.intersects(formaObstaculoD) || 
				formaInimigo.intersects(formaObstaculoE) || formaInimigo.intersects(formaObstaculoF) ||
				formaInimigo.intersects(formaObstaculoG) || formaInimigo.intersects(formaObstaculoH) ||
				formaInimigo.intersects(formaObstaculoI) || formaInimigo.intersects(formaObstaculoJ) ||
				formaInimigo.intersects(formaObstaculoK) || formaInimigo.intersects(formaObstaculoL))
				&& passo==3 && d.getX()>=x){
				passo=2;
		}else if ((formaInimigo.intersects(formaObstaculoA) || formaInimigo.intersects(formaObstaculoB) ||
				formaInimigo.intersects(formaObstaculoC) || formaInimigo.intersects(formaObstaculoD) || 
				formaInimigo.intersects(formaObstaculoE) || formaInimigo.intersects(formaObstaculoF) ||
				formaInimigo.intersects(formaObstaculoG) || formaInimigo.intersects(formaObstaculoH) ||
				formaInimigo.intersects(formaObstaculoI) || formaInimigo.intersects(formaObstaculoJ) ||
				formaInimigo.intersects(formaObstaculoK) || formaInimigo.intersects(formaObstaculoL))
				&& passo==3 && d.getX()<x){
				passo=1;
		}else if ((formaInimigo.intersects(formaObstaculoA) || formaInimigo.intersects(formaObstaculoB) ||
				formaInimigo.intersects(formaObstaculoC) || formaInimigo.intersects(formaObstaculoD) || 
				formaInimigo.intersects(formaObstaculoE) || formaInimigo.intersects(formaObstaculoF) ||
				formaInimigo.intersects(formaObstaculoG) || formaInimigo.intersects(formaObstaculoH) ||
				formaInimigo.intersects(formaObstaculoI) || formaInimigo.intersects(formaObstaculoJ) ||
				formaInimigo.intersects(formaObstaculoK) || formaInimigo.intersects(formaObstaculoL))
				&& passo==1 && d.getY()<=y){
				passo=3;
		}else if ((formaInimigo.intersects(formaObstaculoA) || formaInimigo.intersects(formaObstaculoB) ||
				formaInimigo.intersects(formaObstaculoC) || formaInimigo.intersects(formaObstaculoD) || 
				formaInimigo.intersects(formaObstaculoE) || formaInimigo.intersects(formaObstaculoF) ||
				formaInimigo.intersects(formaObstaculoG) || formaInimigo.intersects(formaObstaculoH) ||
				formaInimigo.intersects(formaObstaculoI) || formaInimigo.intersects(formaObstaculoJ) ||
				formaInimigo.intersects(formaObstaculoK) || formaInimigo.intersects(formaObstaculoL))
				&& passo==1 && d.getY()>y){
				passo=0;
		}else if ((formaInimigo.intersects(formaObstaculoA) || formaInimigo.intersects(formaObstaculoB) ||
				formaInimigo.intersects(formaObstaculoC) || formaInimigo.intersects(formaObstaculoD) || 
				formaInimigo.intersects(formaObstaculoE) || formaInimigo.intersects(formaObstaculoF) ||
				formaInimigo.intersects(formaObstaculoG) || formaInimigo.intersects(formaObstaculoH) ||
				formaInimigo.intersects(formaObstaculoI) || formaInimigo.intersects(formaObstaculoJ) ||
				formaInimigo.intersects(formaObstaculoK) || formaInimigo.intersects(formaObstaculoL))
				&& passo==2 && d.getY()<=y){
				passo=3;
		}else if ((formaInimigo.intersects(formaObstaculoA) || formaInimigo.intersects(formaObstaculoB) ||
				formaInimigo.intersects(formaObstaculoC) || formaInimigo.intersects(formaObstaculoD) || 
				formaInimigo.intersects(formaObstaculoE) || formaInimigo.intersects(formaObstaculoF) ||
				formaInimigo.intersects(formaObstaculoG) || formaInimigo.intersects(formaObstaculoH) ||
				formaInimigo.intersects(formaObstaculoI) || formaInimigo.intersects(formaObstaculoJ) ||
				formaInimigo.intersects(formaObstaculoK) || formaInimigo.intersects(formaObstaculoL))
				&& passo==2 && d.getY()>y){
				passo=0;
		}if (formaInimigo.intersects(formaDarwin)) {
			   z=1;
		}
	}
}



