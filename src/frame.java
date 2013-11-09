import java.awt.Dimension;
import javax.swing.JFrame;


@SuppressWarnings("serial")
public class frame extends JFrame{

	public frame(){
		super();
		panelprincipal principal=new panelprincipal();
		paneinicio inicio=new paneinicio(principal);
		this.setPreferredSize(new Dimension(900,700));
		this.setTitle("Proyecto");
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
		
		principal.add(inicio);
		add(principal);
		
		this.setContentPane(principal);
	}
	
	public static void main(String[] args) {
		frame frame=new frame();
		frame.validate();
		
	}
}
