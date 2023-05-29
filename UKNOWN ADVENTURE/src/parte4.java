import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class parte4 extends JPanel {

	/**
	 * Create the panel.
	 */
	Timer eo = new Timer();
	public parte4() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 499, 476);
		add(panel);
		panel.setLayout(null);
		
		JLabel tiempo = new JLabel("Unos minutos luego..");
		tiempo.setBounds(190, 11, 118, 27);
		panel.add(tiempo);
		
		JLabel texto = new JLabel("<html> [JAMES] Retro ¿cómo nos ves?<p>"
				+ "<p> [RETRO] No los veo ¿recuerdas?, solo los leo, aunque tengo el radio por si el transcriptor falla.<p>"
				+ "<p> [JAMES] ¿el que cosa de qué?<p>"
				+ "<p> [CARL] ¿Qué tal nos puedes leer retro?<p>"
				+ "");
		texto.setBounds(10, 39, 479, 126);
		panel.add(texto);
		
		JLabel texto2 = new JLabel("");
		texto2.setBounds(10, 178, 479, 146);
		panel.add(texto2);
		
		JLabel foto = new JLabel("Procesando foto...");
		foto.setBounds(196, 451, 107, 14);
		panel.add(foto);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setOrientation(SwingConstants.VERTICAL);
		progressBar.setToolTipText("C");
		progressBar.setBounds(95, 335, 19, 105);
		panel.add(progressBar);
		
		JLabel foti = new JLabel("");
		foti.setIcon(new ImageIcon(parte4.class.getResource("/ima/televisor-dañado.gif")));
		foti.setBounds(124, 335, 250, 105);
		panel.add(foti);
		progressBar.setVisible(false);
		foti.setVisible(false);
		foto.setVisible(false);

		JButton bot = new JButton("Continuar");
		bot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				parte5 p1 = new parte5();
				p1.setSize(499, 476);
				p1.setLocation(0, 0);
				panel.removeAll();
				panel.add(p1, BorderLayout.CENTER);
				panel.revalidate();
				panel.repaint();	
			}
		});
		bot.setBounds(410, 453, 89, 23);
		panel.add(bot);
		bot.setVisible(false);
		
		
		
		
		TimerTask peei=new TimerTask() {
			public void run() {
				texto2.setText("<html><p> [RETRO] ¡Perfecto!, parece que estoy mensajeando con ustedes, aunque de una forma extraña, me gustaría que tomaran una captura para ver si se guarda junto al informe<p>"
						+ "<p> [TRIX] Por la mirada que tiene creo que James quiere hacerlo<p>"
						+ "<p> [CARL] Adelante cachorro.<p>"
						+ "<p> [JAMES] Sii, por eso los quiero. Mira esta flor tan extraña retro, te va encantar<p>");
				}
		};
		eo.schedule(peei, 3600);
		
		/////////////////////////////FOTO////////////////////////////////////////
		TimerTask tie = new TimerTask() {
			public void run(){
				progressBar.setVisible(true);
				foti.setVisible(true);
				foto.setVisible(true);
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
		}//Run
			};//Task
		eo.schedule(tie, 9900);
		TimerTask fot = new TimerTask() {
			public void run() {
				progressBar.setVisible(false);
				foto.setVisible(false);
				foti.setIcon(new ImageIcon(parte4.class.getResource("/ima/flor desierto.jpg")));
			}
		};
		eo.schedule(fot,11700);
		
		TimerTask boton = new TimerTask() {
			public void run() {
				bot.setVisible(true);
			}
		};
		eo.schedule(boton, 15300);
	}
}
