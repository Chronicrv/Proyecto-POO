import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;


@SuppressWarnings("serial")
public class paneinicio extends JPanel implements ActionListener {

	ImageIcon fondo;
	JButton aprende,juega;
	panelprincipal principa;
	
	public paneinicio(panelprincipal principal){
		super();
		principa=principal;
		this.setPreferredSize(new Dimension(900,700));
		this.setLayout(new BorderLayout());
		this.setVisible(true);
		fondo=new ImageIcon(getClass().getResource("nnn.jpg"));
		
		this.aprende=new JButton();
		this.juega=new JButton();
		this.aprende.setPreferredSize(new Dimension(300,115));
		this.juega.setPreferredSize(new Dimension(300,115));
		
		this.juega.setFont(new Font("Arial",Font.PLAIN,80));
		this.juega.setText("Juega");
		this.aprende.setFont(new Font("Arial",Font.PLAIN,70));
		this.aprende.setText("Aprende");
		
		this.aprende.addActionListener(this);
		this.juega.addActionListener(this);
		
		JPanel botones=new JPanel();
		botones.setPreferredSize(new Dimension(800,250));
		botones.add(this.aprende);
		botones.add(this.juega);
		botones.setOpaque(false);
		
		add(botones,BorderLayout.SOUTH);
	}
	
	public void paintComponent (Graphics g){
		super.paintComponents(g);
		Dimension tamanio = getSize();
		g.drawImage(fondo.getImage(),0,0,tamanio.width, tamanio.height,null);

	}

	public void actionPerformed(ActionEvent e) {
		panelbotones botones=new panelbotones(principa);
		PanelAprende aprende=new PanelAprende();
		PanelBotonap boton= new PanelBotonap(principa);
		
		if(e.getSource()==this.juega){
			principa.removeAll();
			principa.add(botones,BorderLayout.WEST);
			principa.repaint();
			principa.validate();
		}
		
		if(e.getSource()==this.aprende){
			principa.removeAll();
			principa.add(boton,BorderLayout.WEST);
			principa.add(aprende);
			principa.repaint();
			principa.validate();
		}
	}
	

	
}