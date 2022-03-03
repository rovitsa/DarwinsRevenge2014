package gamepoo;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Mecanica extends JPanel implements ActionListener {
	
	private int i;
	private Menus m;
	private Darwin d;
	private Pikachu pi;
	private Bulbasauro bu;
	private Charmander ch;
	private Wartortle wa;
	private Beedrill be;
	private Pidgeot pd;
	private Cubone cb;
	private Ratata ra;
	private Magmar ma;
	private Rhyhorn rh;
	private Jigglypuff ji;
	private Vulcao v;
	private Floresta f;
	private int fase=0;
	private Timer timer;
	protected Image fundo;
	private boolean jogar=true;
	
	public Mecanica() {
		setDoubleBuffered(true);
		setFocusable(true);
		addKeyListener(new TecAdapter());
		v = new Vulcao(0,0);
		f = new Floresta(0,0);
		ra = new Ratata(10,10);
		cb = new Cubone(10,10);
		pi = new Pikachu(10,10);
		pd = new Pidgeot(10,10);
		bu = new Bulbasauro(10,10);
		ch = new Charmander(10,10);
		wa = new Wartortle(10,10);
		be = new Beedrill(10,10);
		ma = new Magmar(10,10);
		rh = new Rhyhorn(10,10);
		ji = new Jigglypuff(10,10);
		m = new Menus();
		d = new Darwin("Darwin", 0);
		timer = new Timer(15, this);
		timer.start();	
	}
	
	public int getFase() {
		return fase;
	}
	
	
	public void paint(Graphics g) {
		Graphics2D gr = (Graphics2D) g;
		if (jogar) {
			if (fase==0){
				gr.drawImage(m.getInicial(),0 ,0, null);
				gr.drawImage(m.getSelecao(),293,m.getY(), null);
				if (m.getX()==1){
					fase=1;
				}
			}
			if (fase==1){
				gr.drawImage(v.getFundo(), 0, 0, null);
				gr.drawImage(d.getImage(), d.getX(), d.getY(), this);
				gr.drawImage(v.getObstaculo(), v.getXa(), v.getYa(), null);
				gr.drawImage(v.getObstaculo(), v.getXb(), v.getYb(), null);
				gr.drawImage(v.getObstaculo(), v.getXc(), v.getYc(), null);
				gr.drawImage(v.getObstaculo(), v.getXd(), v.getYd(), null);
				gr.drawImage(v.getObstaculo(), v.getXe(), v.getYe(), null);
				gr.drawImage(v.getObstaculo(), v.getXf(), v.getYf(), null);
				gr.drawImage(v.getObstaculo(), v.getXg(), v.getYg(), null);
				gr.drawImage(v.getObstaculo(), v.getXh(), v.getYh(), null);
				gr.drawImage(v.getObstaculo(), v.getXi(), v.getYi(), null);
				gr.drawImage(v.getObstaculo(), v.getXj(), v.getYj(), null);
				gr.drawImage(v.getObstaculo(), v.getXk(), v.getYk(), null);
				gr.drawImage(v.getObstaculo(), v.getXl(), v.getYl(), null);
				gr.drawImage(ch.getImage(), ch.getX(), ch.getY(), this);
				gr.drawImage(cb.getImage(), cb.getX(), cb.getY(), this);
				gr.drawImage(ma.getImage(), ma.getX(), ma.getY(), this);
				gr.drawImage(rh.getImage(), rh.getX(), rh.getY(), this);
				if (ch.getZ()==1 || cb.getZ()==1 || ma.getZ()==1 || rh.getZ()==1){
					fase=3;
				}
				if (ch.getAc()==1 && cb.getAc()==1 && ma.getAc()==1 && rh.getAc()==1){
					fase=2;
				}
			}
			if (fase==2){
				gr.drawImage(f.getFundo(), 0, 0, null);
				gr.drawImage(d.getImage(), d.getX(), d.getY(), this);
				gr.drawImage(bu.getImage(), bu.getX(), bu.getY(), this);
				gr.drawImage(pd.getImage(), pd.getX(), pd.getY(), this);
				gr.drawImage(pi.getImage(), pi.getX(), pi.getY(), this);
				gr.drawImage(ra.getImage(), ra.getX(), ra.getY(), this);
				gr.drawImage(wa.getImage(), wa.getX(), wa.getY(), this);
				gr.drawImage(be.getImage(), be.getX(), be.getY(), this);
				gr.drawImage(ji.getImage(), ji.getX(), ji.getY(), this);
				gr.drawImage(f.getObstaculo(), f.getXa(), f.getYa(), null);
				gr.drawImage(f.getObstaculo(), f.getXb(), f.getYb(), null);
				gr.drawImage(f.getObstaculo(), f.getXc(), f.getYc(), null);
				gr.drawImage(f.getObstaculo(), f.getXd(), f.getYd(), null);
				gr.drawImage(f.getObstaculo(), f.getXe(), f.getYe(), null);
				gr.drawImage(f.getObstaculo(), f.getXf(), f.getYf(), null);
				gr.drawImage(f.getObstaculo(), f.getXg(), f.getYg(), null);
				gr.drawImage(f.getObstaculo(), f.getXh(), f.getYh(), null);
				gr.drawImage(f.getObstaculo(), f.getXi(), f.getYi(), null);
				gr.drawImage(f.getObstaculo(), f.getXj(), f.getYj(), null);
				gr.drawImage(f.getObstaculo(), f.getXk(), f.getYk(), null);
				gr.drawImage(f.getObstaculo(), f.getXl(), f.getYl(), null);
				if (bu.getZ()==1 || pd.getZ()==1 || cb.getZ()==1 || pi.getZ()==1 ||
						ra.getZ()==1 || wa.getZ()==1 || be.getZ()==1 || ji.getZ()==1){
					fase=3;
				}
				if (ch.getAc()==1 && bu.getAc()==1 && pd.getAc()==1 && pi.getAc()==1 &&
						ra.getAc()==1 && wa.getAc()==1 && be.getAc()==1 && ji.getAc()==1){
					fase=4;
				}
			}
			if (fase==3){
				gr.drawImage(m.getGameOver(),0 ,0, null);
			}
			if (fase==4){
				gr.drawImage(m.getParabens(),0 ,0, null);
			}
			List<Balas> bls = d.getBls();
			for (i = 0; i < bls.size(); i++) {
				Balas b = (Balas) bls.get(i);
				gr.drawImage(b.getImage(), b.getX(), b.getY(), this);
			}				
		}
		g.dispose();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		List<Balas> bls = d.getBls();
		for (i = 0; i < bls.size(); i++) {
			Balas b = (Balas) bls.get(i);
			if (b.isVisible()) {
				b.direcionar(d);
			} else {
				bls.remove(i);
			}
		}
		d.mover(v,f,this);

		if (fase==1){
			ch.perseguirJogador(d,v);
			cb.perseguirJogador(d,v);
			ma.perseguirJogador(d,v);
			rh.perseguirJogador(d,v);
		}
		if(fase==2){
			bu.perseguirJogador(d,v);
			pd.perseguirJogador(d,v);
			pi.perseguirJogador(d,v);
			ra.perseguirJogador(d,v);
			wa.perseguirJogador(d,v);
			be.perseguirJogador(d,v);
			ji.perseguirJogador(d,v);
		}
		repaint();
	}

	private class TecAdapter extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			d.KeyPressed(e);
			m.KeyPressed(e);
		}

		@Override
		public void keyReleased(KeyEvent e) {
			d.KeyReleased(e);
		}
	}
}


