import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.Window.Type;
import javax.swing.JProgressBar;
import java.awt.Panel;
import javax.swing.SwingConstants;

public class contenedor_principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					contenedor_principal frame = new contenedor_principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	Timer oe = new Timer();
	public contenedor_principal() {
		setForeground(Color.WHITE);
		setTitle("UNKNOWN ADVENTURE");
		setFont(new Font("Arial", Font.PLAIN, 14));
		setBackground(Color.WHITE);
		setIconImage(Toolkit.getDefaultToolkit().getImage(contenedor_principal.class.getResource("/ima/icono.jpeg")));
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 515, 515);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			// Cuadro vacio que me muestra el otro contenido
			JPanel panel = new JPanel();
			panel.setBounds(0, 0, 499, 476);
			contentPane.add(panel);
			panel.setLayout(null);
			
			JLabel cars = new JLabel("Cargando...");
			cars.setBounds(237, 364, 76, 14);
			panel.add(cars);
			
			JLabel gii = new JLabel("");
			gii.setIcon(new ImageIcon(contenedor_principal.class.getResource("/ima/Fianll.gif")));
			gii.setBounds(77, 125, 344, 203);
			panel.add(gii);
			
			JProgressBar progressBar = new JProgressBar();
			progressBar.setBounds(91, 364, 352, 14);
			panel.add(progressBar);
			
			JLabel fond = new JLabel("");
			fond.setIcon(new ImageIcon(contenedor_principal.class.getResource("/ima/fondii.jpeg")));
			fond.setBounds(0, 0, 489, 476);
			panel.add(fond);
			
			////////////////////////////////////////////////PANTALLA DE CARGA////////////////////////////////	
			Thread carga = new Thread() {
			public void run(){//Run es un metodo
				progressBar.setMaximum(300000000);
				for(int i=0;i<300000000;i++) {
					progressBar.setValue(i);
							}
				progressBar.setValue(0);
								}//Fin del run
				};//Fin de la clase thread sirve para hacer procesos dentro de procesos
			carga.start();
			TimerTask tarea= new TimerTask() {
			public void run() {
				parte1 p1 = new parte1();
				p1.setSize(499, 476);
				p1.setLocation(0, 0);
				panel.removeAll();
				panel.add(p1, BorderLayout.CENTER);
				panel.revalidate();
				panel.repaint();							}
					};//Fin del timertask
						//El tiempo esta dado en milisegundos
				oe.schedule(tarea, 7500);
			
			/////////////////////////////////////////////////////////////////////////////////////
			this.setLocationRelativeTo(null);
					
			
		}//Fin del princiopal
}


