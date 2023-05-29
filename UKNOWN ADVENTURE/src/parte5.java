import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;

import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;

public class parte5 extends JPanel {

	/**
	 * Create the panel.
	 */
	Timer eo = new Timer();
	public parte5() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 499, 476);
		add(panel);
		panel.setLayout(null);
		
		JLabel texto1 = new JLabel("<html>[RETRO] Se ve bien y se guarda en el registro, bien chicos y chica todo está listo pueden comenzar.<p>"
				+ "<p> [TOM] A la carga"
				+ "");
		texto1.setBounds(10, 11, 479, 73);
		panel.add(texto1);
		
		JLabel una = new JLabel("");
		una.setBounds(196, 79, 131, 26);
		panel.add(una);
		
		JLabel tom1 = new JLabel("");
		tom1.setBounds(10, 109, 479, 84);
		panel.add(tom1);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setOrientation(SwingConstants.VERTICAL);
		progressBar.setToolTipText("C");
		progressBar.setBounds(95, 290, 19, 105);
		panel.add(progressBar);
		
		JLabel foti = new JLabel("");
		foti.setIcon(new ImageIcon(parte4.class.getResource("/ima/televisor-dañado.gif")));
		foti.setBounds(124, 290, 250, 105);
		panel.add(foti);
		
		JLabel fil = new JLabel("");
		fil.setBounds(10, 416, 479, 26);
		panel.add(fil);
		
		JLabel foto = new JLabel("");
		foto.setBounds(124, 290, 250, 105);
		panel.add(foto);
		
		JLabel dip = new JLabel("");
		dip.setBounds(179, 204, 141, 14);
		panel.add(dip);
		
		JLabel label = new JLabel("");
		label.setBounds(10, 229, 465, 46);
		panel.add(label);
		
		JButton bot = new JButton("Continuar");
		bot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				parte6 p1 = new parte6();
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
		
		JLabel pro = new JLabel("Procesando foto...");
		pro.setBounds(189, 406, 121, 14);
		panel.add(pro);
	
		pro.setVisible(false);
		foto.setVisible(false);
		progressBar.setVisible(false);
		foti.setVisible(false);
		bot.setVisible(false);
		
		
		
		
		
		
		
		//////////////////////////////////////////TIEMPO///////////////////////////////////////////
		TimerTask un=new TimerTask() {
			public void run() {
				una.setText("Una hora despues");
			}
		};
		eo.schedule(un, 1800);
		
		TimerTask dial=new TimerTask() {
			public void run() {
				tom1.setText("<html>[TOM] Bueno... creo que ya vimos suficiente aquí afuera.<p>"
						+ "<p>[JAMES] ¡Sii!<p>"
						+ "<p>[TOM] Cálmate james, es solo una base abandonada<p>");
			}
		};
		eo.schedule(dial, 3600);
		
		TimerTask minu = new TimerTask() {
			public void run(){
				dip.setText("Unos minutos despues");
			}
		};
		eo.schedule(minu, 6400);
			
		TimerTask dial1=new TimerTask() {
			public void run() {
				label.setText("<html>[CARL] Dios que oscuro.<p>"
				+ "<p>[JAMES] foto<p>"
				+ "");
			}
		};
		eo.schedule(dial1, 8200);
			
		
		
		TimerTask tie = new TimerTask() {
			public void run(){
				progressBar.setVisible(true);
				foti.setVisible(true);
				foto.setVisible(true);
				pro.setVisible(true);
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
				pro.setVisible(false);
				foti.setIcon(new ImageIcon(parte4.class.getResource("/ima/bunker 1.jpg")));
			}
		};
		eo.schedule(fot,11700);
		
		TimerTask io = new TimerTask() {
			public void run() {
				fil.setText("[RETRO] En las cámaras no se ve demasiado, ¿tienen alguna linterna?");
			}
		};
		eo.schedule(io, 13000);
		
		TimerTask boton = new TimerTask() {
			public void run() {
				bot.setVisible(true);
			}
		};
		eo.schedule(boton, 14000);

	}
}
