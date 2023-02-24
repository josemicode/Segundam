package dibujingo;

import java.awt.Canvas;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class majora extends Canvas {

	//private JPanel contentPane;
	public void paint(Graphics g){
		super.paint(g);
		Toolkit t=Toolkit.getDefaultToolkit();
		Image i = t.getImage("./src/mask.png");
		int ancho=(int)(t.getScreenSize().getWidth());
		int alt=(int)(t.getScreenSize().getHeight());
		g.drawImage(i, 0, 0, ancho, alt, this);
		}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		majora mj = new majora();
		JFrame jf = new JFrame();
		
		Toolkit t=Toolkit.getDefaultToolkit();
		int ancho=(int)(t.getScreenSize().getWidth());
		int alto=(int)(t.getScreenSize().getHeight());
		
		jf.setSize(ancho, alto);
		jf.add(mj);
		jf.setVisible(true);
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					majora frame = new majora();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
	}

	/**
	 * Create the frame.
	 */
//	public majora() {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 450, 300);
//		contentPane = new JPanel();
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//
//		setContentPane(contentPane);
//		contentPane.setLayout(null);
//		
//		//paint(new Graphics());
//	}
	
	

}
