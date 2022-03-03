package gamepoo;

import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;

public class Darwin {
	
	private int x,y;
	private int vx,vy;
	private int dr;
	private String nome;
	private Image img;
	private int altura, largura;
	public boolean isVisible;
	private ArrayList<Balas>bls;
	
	public Darwin(String nome, int dr){
		this.nome=nome;
		this.dr=dr;
		bls=new ArrayList<Balas>();
		x=390;
		y=530;
		ImageIcon i=new ImageIcon ("imagens\\Darwin.png");
		img=i.getImage();
		altura=img.getHeight(null);
		largura=img.getWidth(null);
	}
	public void checarColisoes(Vulcao v, Floresta f, Mecanica m) {
		Rectangle formaDarwin = getBounds();
		if (m.getFase()==1){
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
			
			if ((formaDarwin.intersects(formaObstaculoA) || formaDarwin.intersects(formaObstaculoB) ||
					formaDarwin.intersects(formaObstaculoC) || formaDarwin.intersects(formaObstaculoD)) && y<25 && y>15){
				y=20;
			}else if ((formaDarwin.intersects(formaObstaculoA) || formaDarwin.intersects(formaObstaculoB) ||
					formaDarwin.intersects(formaObstaculoC) || formaDarwin.intersects(formaObstaculoD)) && y>125 && y<133){
				y=131;
			}else if ((formaDarwin.intersects(formaObstaculoA) || formaDarwin.intersects(formaObstaculoE) ||
					formaDarwin.intersects(formaObstaculoI)) && x<16 && x>8){
				x=10;
			}else if ((formaDarwin.intersects(formaObstaculoA) || formaDarwin.intersects(formaObstaculoE) ||
					formaDarwin.intersects(formaObstaculoI)) && x>158 && x<170){
				x=166;
			}else if ((formaDarwin.intersects(formaObstaculoE) || formaDarwin.intersects(formaObstaculoF) ||
					formaDarwin.intersects(formaObstaculoG) || formaDarwin.intersects(formaObstaculoH)) && y<185 && y>175){
				y=180;
			}else if ((formaDarwin.intersects(formaObstaculoE) || formaDarwin.intersects(formaObstaculoF) ||
					formaDarwin.intersects(formaObstaculoG) || formaDarwin.intersects(formaObstaculoH)) && y>280 && y<294){
				y=292;
			}else if ((formaDarwin.intersects(formaObstaculoI) || formaDarwin.intersects(formaObstaculoJ) ||
					formaDarwin.intersects(formaObstaculoK) || formaDarwin.intersects(formaObstaculoL)) && y>335 && y<345){
				y=340;
			}else if ((formaDarwin.intersects(formaObstaculoI) || formaDarwin.intersects(formaObstaculoJ) ||
					formaDarwin.intersects(formaObstaculoK) || formaDarwin.intersects(formaObstaculoL)) && y>448 && y<458){
				y=454;
			}else if ((formaDarwin.intersects(formaObstaculoB) || formaDarwin.intersects(formaObstaculoF) ||
					formaDarwin.intersects(formaObstaculoJ)) && x>200 && x<212){
				x=208;
			}else if ((formaDarwin.intersects(formaObstaculoB) || formaDarwin.intersects(formaObstaculoF) ||
					formaDarwin.intersects(formaObstaculoJ)) && x>355 && x<362){
				x=360;
			}else if ((formaDarwin.intersects(formaObstaculoC) || formaDarwin.intersects(formaObstaculoG) ||
					formaDarwin.intersects(formaObstaculoK)) && x>398 && x<410){
				x=404;
			}else if ((formaDarwin.intersects(formaObstaculoC) || formaDarwin.intersects(formaObstaculoG) ||
					formaDarwin.intersects(formaObstaculoK)) && x>556 && x<564){
				x=560;
			}else if ((formaDarwin.intersects(formaObstaculoD) || formaDarwin.intersects(formaObstaculoH) ||
					formaDarwin.intersects(formaObstaculoL)) && x>596 && x<606){
				x=602;
			}else if ((formaDarwin.intersects(formaObstaculoD) || formaDarwin.intersects(formaObstaculoH) ||
					formaDarwin.intersects(formaObstaculoL)) && x>752 && x<762){
				x=758;
			}
		}if (m.getFase()==2){
			Rectangle formaObstaculoA = f.getBoundsA();
			Rectangle formaObstaculoB = f.getBoundsB();
			Rectangle formaObstaculoC = f.getBoundsC();
			Rectangle formaObstaculoD = f.getBoundsD();
			Rectangle formaObstaculoE = f.getBoundsE();
			Rectangle formaObstaculoF = f.getBoundsF();
			Rectangle formaObstaculoG = f.getBoundsG();
			Rectangle formaObstaculoH = f.getBoundsH();
			Rectangle formaObstaculoI = f.getBoundsI();
			Rectangle formaObstaculoJ = f.getBoundsJ();
			Rectangle formaObstaculoK = f.getBoundsK();
			Rectangle formaObstaculoL = f.getBoundsL();
			
			if ((formaDarwin.intersects(formaObstaculoA) || formaDarwin.intersects(formaObstaculoB) ||
				formaDarwin.intersects(formaObstaculoC) || formaDarwin.intersects(formaObstaculoD)) && y<120 && y>114){
				y=116;
			}else if ((formaDarwin.intersects(formaObstaculoA) || formaDarwin.intersects(formaObstaculoB) ||
				formaDarwin.intersects(formaObstaculoC) || formaDarwin.intersects(formaObstaculoD)) && y<152 && y>145){
				y=150;
			}else if ((formaDarwin.intersects(formaObstaculoA) || formaDarwin.intersects(formaObstaculoE) ||
				formaDarwin.intersects(formaObstaculoI))&& x>24 && x<40){
				x=34;
			}else if ((formaDarwin.intersects(formaObstaculoA) || formaDarwin.intersects(formaObstaculoE) ||
				formaDarwin.intersects(formaObstaculoI)) && x>165 && x<175){
				x=170;
			}else if ((formaDarwin.intersects(formaObstaculoE) || formaDarwin.intersects(formaObstaculoF) ||
				formaDarwin.intersects(formaObstaculoG) || formaDarwin.intersects(formaObstaculoH)) && y<265 && y>258){
				y=260;
			}else if ((formaDarwin.intersects(formaObstaculoE) || formaDarwin.intersects(formaObstaculoF) ||
				formaDarwin.intersects(formaObstaculoG) || formaDarwin.intersects(formaObstaculoH)) && y<296 && y>290){
				y=294;
			}else if ((formaDarwin.intersects(formaObstaculoI) || formaDarwin.intersects(formaObstaculoJ) ||
				formaDarwin.intersects(formaObstaculoK) || formaDarwin.intersects(formaObstaculoL)) && y>414 && y<420){
				y=416;
			}else if ((formaDarwin.intersects(formaObstaculoI) || formaDarwin.intersects(formaObstaculoJ) ||
				formaDarwin.intersects(formaObstaculoK) || formaDarwin.intersects(formaObstaculoL)) && y>450 && y<456){
				y=454;
			}else if ((formaDarwin.intersects(formaObstaculoB) || formaDarwin.intersects(formaObstaculoF) ||
				formaDarwin.intersects(formaObstaculoJ)) && x>226 && x<234){
				x=230;
			}else if ((formaDarwin.intersects(formaObstaculoB) || formaDarwin.intersects(formaObstaculoF) ||
				formaDarwin.intersects(formaObstaculoJ)) && x>360 && x<366){
				x=364;
			}else if ((formaDarwin.intersects(formaObstaculoC) || formaDarwin.intersects(formaObstaculoG) ||
					formaDarwin.intersects(formaObstaculoK)) && x>422 && x<430){
				x=426;
			}else if ((formaDarwin.intersects(formaObstaculoC) || formaDarwin.intersects(formaObstaculoG) ||
					formaDarwin.intersects(formaObstaculoK)) && x>556 && x<562){
				x=560;
			}else if ((formaDarwin.intersects(formaObstaculoD) || formaDarwin.intersects(formaObstaculoH) ||
					formaDarwin.intersects(formaObstaculoL)) && x>612 && x<616){
				x=614;
			}else if ((formaDarwin.intersects(formaObstaculoD) || formaDarwin.intersects(formaObstaculoH) ||
					formaDarwin.intersects(formaObstaculoL)) && x>744 && x<750){
				x=748;
			}
		}
	}
	
	public void mover(Vulcao v, Floresta f, Mecanica m){
		x=x+vx;
		y=y+vy;
		checarColisoes(v,f,m);
		if (x>765){
			x=765;
		}
		if (x<0){
			x=0;
		}
		if (y<0){
			y=0;
		}
		if (y>530){
			y=530;
		}	
	}

	public String getNome(){
		return nome;
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
	
	public ArrayList<Balas>getBls(){
		return bls;
	}
	
	public void atirar(){
		if (dr==0){
			bls.add(new Balas(x+16,y+2,this));
		}
		if (dr==1){
			bls.add(new Balas(x-1,y+altura/2,this));
		}
		if (dr==2){
			bls.add(new Balas(x+22,y+altura/2,this));
		}
		if (dr==3){
			bls.add(new Balas(x+9,y+28,this));
		}
	}
	
	public Rectangle getBounds(){
		return new Rectangle(x,y,largura,altura);
	}
	
	public int getDr(){
		return dr;
	}
	
	public void KeyPressed(KeyEvent e){
		int k=e.getKeyCode();
		if (k==KeyEvent.VK_SPACE){
			atirar();
		}if(k==KeyEvent.VK_LEFT){
			vx=-2;
			vy=0;
			dr=1;
			ImageIcon i=new ImageIcon("imagens\\Darwin1.png");
			img=i.getImage();	

		}else if (k==KeyEvent.VK_RIGHT){
			vx=2;
			vy=0;
			dr=2;
			ImageIcon i=new ImageIcon("imagens\\Darwin2.png");
			img=i.getImage();
		}else if (k==KeyEvent.VK_UP){
			vy=-2;
			vx=0;
			dr=0;
			ImageIcon i=new ImageIcon("imagens\\Darwin.png");
			img=i.getImage();
		}else if (k==KeyEvent.VK_DOWN){
			vy=2;
			vx=0;
			dr=3;
			ImageIcon i=new ImageIcon("imagens\\Darwin3.png");
			img=i.getImage();
		}
	}
	
	public void KeyReleased (KeyEvent e){
		int k=e.getKeyCode();
		if (k==KeyEvent.VK_LEFT){
			vx=0;
		}
		if (k==KeyEvent.VK_RIGHT){
			vx=0;
		}
		if (k==KeyEvent.VK_DOWN){
			vy=0;
		}
		if (k==KeyEvent.VK_UP){
			vy=0;
		}
	}
}

