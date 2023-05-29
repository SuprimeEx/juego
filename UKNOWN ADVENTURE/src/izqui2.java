import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;

public class izqui2 extends JPanel {

	/**
	 * Create the panel.
	 */
	Timer eo = new Timer();
	public izqui2() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 499, 476);
		add(panel);
		panel.setLayout(null);
		
		JLabel later = new JLabel("Unos minutos despues");
		later.setBounds(178, 11, 143, 23);
		panel.add(later);
		
		JLabel lblNewLabel = new JLabel("<html>[TRIX] Woa, un laboratorio de biogenética, parece el de la facultad.<p>"
				+ "<p>[JAMES] Tienes razón, ¿Crees que haya sapos para diseccionar?<p>"
				+ "<p>[TOM] Sa...Sa..sapos no, pero… creo que humanos sí.<p>"
				+ "<p>[CARL] ¡OH! Mierda retro observa esto.<p>"
				+ "");
		lblNewLabel.setBounds(10, 42, 479, 131);
		panel.add(lblNewLabel);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setOrientation(SwingConstants.VERTICAL);
		progressBar.setToolTipText("C");
		progressBar.setBounds(101, 185, 19, 105);
		panel.add(progressBar);
		
		JLabel foti = new JLabel("");
		foti.setIcon(new ImageIcon(parte4.class.getResource("/ima/televisor-dañado.gif")));
		foti.setBounds(130, 185, 250, 105);
		panel.add(foti);
		
		JLabel pro = new JLabel("Procesando foto...");
		pro.setBounds(189, 297, 132, 14);
		panel.add(pro);
		
		JLabel foto = new JLabel("");
		foto.setBounds(130, 185, 250, 105);
		panel.add(foto);
		
		JButton prueba = new JButton("Tomar muestras");
		prueba.setBounds(241, 301, 151, 23);
		panel.add(prueba);
		
		JButton seguir = new JButton("Avanzar");
		seguir.setBounds(400, 301, 89, 23);
		panel.add(seguir);
		
		JLabel respu = new JLabel("");
		respu.setBounds(10, 310, 479, 29);
		panel.add(respu);
		
		JLabel dial = new JLabel("");
		dial.setBounds(10, 343, 479, 55);
		panel.add(dial);
		
		JLabel tex1 = new JLabel("");
		tex1.setBounds(10, 397, 479, 38);
		panel.add(tex1);
		
		JButton continua = new JButton("Continuar");
		continua.setBounds(400, 442, 89, 23);
		panel.add(continua);

		pro.setVisible(false);
		foti.setVisible(false);
		progressBar.setVisible(false);
		prueba.setVisible(false);
		seguir.setVisible(false);
		continua.setVisible(false);
		
		//////////////////////////////OPCIONES////////////////////////////////////
		prueba.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seguir.setVisible(false);
				prueba.setVisible(false);
				respu.setText("[RETRO] Bueno... creo que les serviria tomar muestras de eso");
				TimerTask bot = new TimerTask() {
					public void run() {
						dial.setText("<html>[TRIX] Claro, como tu no te ensucias.<p>"
								+ "<p>[CARL] Tranquila, con esto podemos poner en testigo la crueldad de la guerra<p>");
					}
				};
				eo.schedule(bot, 1800);
				TimerTask sig  = new TimerTask() {
					public void run() {
						tex1.setText("[TOM] James, ¿con que juegas?");
						continua.setVisible(true);
					}
				};
				eo.schedule(sig, 3600);
			}
		});
		
		
		seguir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seguir.setVisible(false);
				prueba.setVisible(false);
				respu.setText("[RETRO] Es mejor que no vean eso..puaj.. deberian seguir");
				TimerTask bot = new TimerTask() {
					public void run() {
						dial.setText("<html>[JAMES] No es la primera vez que tenemos que ver fetos ¿sabes? .<p>"
								+ "<p>[TRIX] Coincido con Retro, esta mi3rda es inhumana<p>");
					}
				};
				eo.schedule(bot, 1800);
				
				TimerTask sig  = new TimerTask() {
					public void run() {
						tex1.setText("[TOM] Carl, ¿que estas viendo?");
						continua.setVisible(true);
					}
				};
				eo.schedule(sig, 3600);
			}
		});
		
		
		
	/////////////////////////////////////////////YIEMPO/////////////////////////////////////
	TimerTask carga=new TimerTask() {
		public void run() {
			pro.setVisible(true);
			foti.setVisible(true);
			progressBar.setVisible(true);
			Thread carga = new Thread() {
				public void run(){//Run es un metodo
					progressBar.setMaximum(60000000);
					for(int i=0;i<60000000;i++) {
						progressBar.setValue(i);
								}
					progressBar.setValue(0);
									}//Fin del run
					};//Fin de la clase thread sirve para hacer procesos dentro de procesos
				carga.start();
	}
	};
	eo.schedule(carga, 3600);
	
	TimerTask fo = new TimerTask() {
		public void run() {
			pro.setVisible(false);
			foti.setVisible(false);
			progressBar.setVisible(false);
			foto.setIcon(new ImageIcon(izqui2.class.getResource("/ima/fetos.jpg")));
		}
	};
	eo.schedule(fo, 5400);
	
	TimerTask bto = new TimerTask() {
		public void run() {
			prueba.setVisible(true);
			seguir.setVisible(true);
		}
	};
	eo.schedule(bto, 6300);	
	
	
	continua.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			izqui3 p1 = new izqui3();
			p1.setSize(499, 476);
			p1.setLocation(0, 0);
			panel.removeAll();
			panel.add(p1, BorderLayout.CENTER);
			panel.revalidate();
			panel.repaint();
		}
	});
		
		
		
		
		
		
		
		
	}

}
