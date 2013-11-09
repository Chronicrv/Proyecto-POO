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
public class PanelBotonap extends JPanel implements ActionListener {
	
	JRadioButton Leccion1, Leccion2, Leccion3 ,Leccion4;
	JTextField texto;
	JLabel tex;
	JPanel boton;
	JButton regresar;
	ImageIcon regresa;
	panelprincipal principa;
	
	public PanelBotonap(panelprincipal principal){
		super();
		principa=principal;
		this.setPreferredSize(new Dimension(150,700));
		this.setBackground(Color.blue);
		this.regresa=new ImageIcon(getClass().getResource("re.png"));
		
		this.Leccion1=new JRadioButton("Lección 1");
		this.Leccion2=new JRadioButton("Lección 2");
		this.Leccion3=new JRadioButton("Lección 3");
		this.Leccion4=new JRadioButton("Lección 4");
		this.regresar=new JButton();
		this.texto=new JTextField(10);
		this.tex=new JLabel("Tu Nombre:");
		tex.setPreferredSize(new Dimension(100,30));
		tex.setFont(new Font("Serif", Font.BOLD, 18));
		tex.setForeground(Color.white);
		this.regresar.setIcon(regresa);
		
		this.Leccion1.setPreferredSize(new Dimension(80,25));
		this.Leccion2.setPreferredSize(new Dimension(80,25));
		this.Leccion3.setPreferredSize(new Dimension(80,25));
		this.Leccion4.setPreferredSize(new Dimension(80,25));
		this.regresar.setPreferredSize(new Dimension(120,60));
		
		
		ButtonGroup grupo=new ButtonGroup();
		grupo.add(Leccion1);
		grupo.add(Leccion2);
		grupo.add(Leccion3);
		grupo.add(Leccion4);
		
		this.regresar.addActionListener(this);
		this.Leccion1.addActionListener(this);
		this.Leccion2.addActionListener(this);
		this.Leccion3.addActionListener(this);
		this.Leccion4.addActionListener(this);
		
		add(tex);
		add(texto);
		add(Leccion1);
		add(Leccion2);
		add(Leccion3);
		add(Leccion4);
		add(regresar);
		
		this.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		nivel1 nivel1=new nivel1();
		paneinicio inicio=new paneinicio(principa);
		if(e.getSource()==this.Leccion1){
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
