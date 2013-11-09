import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


@SuppressWarnings("serial")
public class panelbotones extends JPanel implements ActionListener {
	
	JRadioButton nivel1,nivel2,nivel3,nivel4;
	JTextField texto;
	JLabel tex;
	JPanel boton;
	JButton regresar;
	ImageIcon regresa;
	panelprincipal principa;
	
	public panelbotones(panelprincipal principal){
		super();
		principa=principal;
		this.setPreferredSize(new Dimension(150,700));
		this.setBackground(Color.blue);
		this.regresa=new ImageIcon(getClass().getResource("re.png"));
		
		this.nivel1=new JRadioButton("Nivel 1");
		this.nivel2=new JRadioButton("Nivel 2");
		this.nivel3=new JRadioButton("Nivel 3");
		this.nivel4=new JRadioButton("Nivel 4");
		this.regresar=new JButton();
		this.texto=new JTextField(10);
		this.tex=new JLabel("Tu Nombre:");
		tex.setPreferredSize(new Dimension(100,30));
		tex.setFont(new Font("Serif", Font.BOLD, 18));
		tex.setForeground(Color.white);
		this.regresar.setIcon(regresa);
		
		this.nivel1.setPreferredSize(new Dimension(80,25));
		this.nivel2.setPreferredSize(new Dimension(80,25));
		this.nivel3.setPreferredSize(new Dimension(80,25));
		this.nivel4.setPreferredSize(new Dimension(80,25));
		this.regresar.setPreferredSize(new Dimension(120,60));
		
		
		ButtonGroup grupo=new ButtonGroup();
		grupo.add(nivel1);
		grupo.add(nivel2);
		grupo.add(nivel3);
		grupo.add(nivel4);
		
		this.regresar.addActionListener(this);
		this.nivel1.addActionListener(this);
		this.nivel2.addActionListener(this);
		this.nivel3.addActionListener(this);
		this.nivel4.addActionListener(this);
		
		add(tex);
		add(texto);
		add(nivel1);
		add(nivel2);
		add(nivel3);
		add(nivel4);
		add(regresar);
		
		this.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		nivel1 nivel1=new nivel1();
		paneinicio inicio=new paneinicio(principa);
		if(e.getSource()==this.nivel1){
			principa.add(nivel1);
			principa.repaint();
			principa.validate();
		}else if(e.getSource()==this.regresar){
			principa.removeAll();
			principa.add(inicio);
			principa.repaint();
			principa.validate();
			
		}
	}

}
