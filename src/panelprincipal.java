import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JPanel;


@SuppressWarnings("serial")
public class panelprincipal extends JPanel{
	
	public panelprincipal(){
		super();
		this.setPreferredSize(new Dimension(900,700));
		this.setLayout(new BorderLayout());
		this.setVisible(true);
	}

}