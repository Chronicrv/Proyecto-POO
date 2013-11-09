import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class nivel1 extends JPanel {
	
	int numero;
	int numero2;
	int im;
	Random ran=new Random();
	Random ims=new Random();
	ImageIcon tipo;
	
	panelrespuestas respuestas;
	
	public nivel1(){
		super();
		this.setPreferredSize(new Dimension(750,700));
		this.setLayout(new BorderLayout());
		numero=ran.nextInt(5)+1;
		numero2=ran.nextInt(5)+1;
		im=ims.nextInt(5);
		respuestas=new panelrespuestas(this);
		add(respuestas,BorderLayout.SOUTH);
		
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		if(im==0){
			tipo=new ImageIcon(getClass().getResource("mm.png"));
		}else if(im==1){
			tipo=new ImageIcon(getClass().getResource("fresa.png"));
		}else if(im==2){
			tipo=new ImageIcon(getClass().getResource("naranja.png"));
		}else if(im==3){
			tipo=new ImageIcon(getClass().getResource("pera.png"));
		}else if(im==4){
			tipo=new ImageIcon(getClass().getResource("kiwi.png"));
		}
		
		g.drawLine((getWidth()/2), 0,(getWidth()/2), 300);
		g.drawLine(0, 300, getWidth(), 300);
		for(int i=0,b=0;i<numero;i++,b+=65){
			int y=0;
			if(i==5){
				y=y+80;
				b=0;
			}
			g.drawImage(tipo.getImage(), b, y,100,100, null);
		}
		
		for(int a=0,c=0;a<numero2;a++,c+=65){
			int y2=0;
			if(a==5){
				y2=y2+80;
				c=0;
			}
			g.drawImage(tipo.getImage(), (getWidth()/2+5)+c, y2, 100, 100, null);
		}
	}
	
	public int getSuma(){
		return numero+numero2;
	}
	
	public int getNumero(){
		return numero;
	}
	
	public int getNumero2(){
		return numero2;
	}
	
	public int getNnumero(int num){
		return numero=num;
	}
	
	public int getNnumero2(int num){
		return numero2=num;
	}
	
	public int getIm(int num){
		return im=num;
	}
}
