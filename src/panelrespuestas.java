import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class panelrespuestas  extends JPanel implements ActionListener{
	
	JButton op,op1,op2,op3;
	nivel1 nive;
	Random ran=new Random();
	ImageIcon bien;
	ImageIcon mal;
	int a,b;
	int intentos;
	public panelrespuestas(nivel1 nivel1){
		super();
		this.setLayout(new GridLayout(2,2));
		this.setPreferredSize(new Dimension(750,260));
		this.setVisible(true);
		
		nive=nivel1;
		op=new JButton(nivel1.getNumero()+"");
		op1=new JButton(nivel1.getNumero2()+"");
		op2=new JButton(nivel1.getSuma()+"");
		op3=new JButton((nivel1.getSuma()+1)+"");
		
		op.setFont(new Font("Arial",Font.PLAIN,150));
		op1.setFont(new Font("Arial",Font.PLAIN,150));
		op2.setFont(new Font("Arial",Font.PLAIN,150));
		op3.setFont(new Font("Arial",Font.PLAIN,150));
		
		op.setMargin(new Insets(0,0,0,0));
		op1.setMargin(new Insets(0,0,0,0));
		op2.setMargin(new Insets(0,0,0,0));
		op3.setMargin(new Insets(0,0,0,0));
		
		this.op.addActionListener(this);
		this.op1.addActionListener(this);
		this.op2.addActionListener(this);
		this.op3.addActionListener(this);
		
		bien=new ImageIcon(getClass().getResource("bien.png"));
		mal=new ImageIcon(getClass().getResource("mal.png"));
	
		
		add(op);
		add(op1);
		add(op2);
		add(op3);
		
		this.repaint();
	}
	
	public void acbo(){
		nive.getNnumero(ran.nextInt(5)+1);
		nive.getNnumero2(ran.nextInt(5)+1);
		a=nive.getNnumero(ran.nextInt(5)+1);
		b=nive.getNnumero2(ran.nextInt(5)+1);
		Random acb=new Random();
		int d=acb.nextInt(9)+1;
		if(d==1){
			op.setText(Integer.toString(a));
			op1.setText(Integer.toString(b));
			op2.setText(Integer.toString((a+b)));
			op3.setText(Integer.toString(ran.nextInt(10)));
		}else if(d==2){
			op.setText(Integer.toString(a+b));
			op1.setText(Integer.toString(a+b+1));
			op2.setText(Integer.toString((a+b+2)));
			op3.setText(Integer.toString((a+b+3)));
		}else if(d==3){
			op.setText(Integer.toString(a+b-3));
			op1.setText(Integer.toString(a+b-2));
			op2.setText(Integer.toString(a+b-1));
			op3.setText(Integer.toString(a+b));
		}else if(d==4){
			op.setText(Integer.toString(a+b-1));
			op1.setText(Integer.toString(a+b));
			op2.setText(Integer.toString(a+b+2));
			op3.setText(Integer.toString(a+b+3));
		}else if(d==5){
			op.setText(Integer.toString(a+b-2));
			op1.setText(Integer.toString(a+b-1));
			op2.setText(Integer.toString(a+b));
			op3.setText(Integer.toString(a+b+1));
		}else if(d==6){
			op.setText(Integer.toString(a+b));
			op1.setText(Integer.toString(ran.nextInt(10)));
			op2.setText(Integer.toString(ran.nextInt(10)));
			op3.setText(Integer.toString(ran.nextInt(10)));
		}else if(d==7){
			op.setText(Integer.toString(ran.nextInt(10)));
			op1.setText(Integer.toString(a+b));
			op2.setText(Integer.toString(ran.nextInt(10)));
			op3.setText(Integer.toString(ran.nextInt(10)));
		}else if(d==8){
			op.setText(Integer.toString(ran.nextInt(10)));
			op1.setText(Integer.toString(ran.nextInt(10)));
			op2.setText(Integer.toString(a+b));
			op3.setText(Integer.toString(ran.nextInt(10)));
		}else if(d==9){
			op.setText(Integer.toString(ran.nextInt(10)));
			op1.setText(Integer.toString(ran.nextInt(10)));
			op2.setText(Integer.toString(ran.nextInt(10)));
			op3.setText(Integer.toString(a+b));
		}
		
	}
	
	public void actualiza(JButton op){
		if(Integer.parseInt(op.getText())==this.nive.getSuma()){
			JOptionPane.showMessageDialog(null,"Correcto!!","Mensaje", JOptionPane.PLAIN_MESSAGE, bien);
			acbo();
			nive.getIm(ran.nextInt(5));
			intentos=intentos+1;
			nive.repaint();
		}else{
			intentos=intentos+1;
			JOptionPane.showMessageDialog(null,"Incorrecto!!","Mensaje", JOptionPane.PLAIN_MESSAGE, mal);
		}
	}
	
	
	public void actionPerformed(ActionEvent e) {
		if(intentos<10){
			if(e.getSource()==op){
				actualiza(op);
			}else if(e.getSource()==op1){
				actualiza(op1);
			}else if(e.getSource()==op2){
				actualiza(op2);
			}else if(e.getSource()==op3){
				actualiza(op3);
			}	
		}else{
			JOptionPane.showMessageDialog(null,"Finalizado");
		}
		
	}
	
	
	
}
