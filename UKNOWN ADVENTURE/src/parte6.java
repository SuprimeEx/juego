import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;

import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;

public class parte6 extends JPanel {

	/**
	 * Create the panel.
	 */
	Timer eo = new Timer();
	public parte6() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 499, 476);
		add(panel);
		panel.setLayout(null);
		
		JLabel dial = new JLabel("<html>[TRIX] Claro que si<p>"
				+ "<p>[JAMES] Aa, mucho mejor, pero ahora, ¿a dónde vamos?<p>"
				+ "<p>[TOM] Retro hay 2 caminos, el derecho tiene musgo y huele mal.<p>"
				+ "<p>[JAMES] Y el izquierdo huele mal y tiene musgo.<p>"
				+ "<p>[CARL] ¿Alguna vez serás serio James?<p>"
				+ "<p>[JAMES] Jamás bro jaja.<p>");
		dial.setBounds(10, 11, 479, 178);
		panel.add(dial);
		
		JLabel elecion = new JLabel("[TOM] Bien Retro, ¿Cuál sugieres?");
		elecion.setBounds(10, 200, 468, 28);
		panel.add(elecion);
		
		JButton dere = new JButton("DERECHO");
		dere.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caida p1 = new caida();
				p1.setSize(499, 476);
				p1.setLocation(0, 0);
				panel.removeAll();
				panel.add(p1, BorderLayout.CENTER);
				panel.revalidate();
				panel.repaint();			
			}
		});
		dere.setBounds(320, 369, 169, 96);
		panel.add(dere);
		
		JButton izqui = new JButton("IZQUIERDO");
		izqui.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				izqui1 p1 = new izqui1();
				p1.setSize(499, 476);
				p1.setLocation(0, 0);
				panel.removeAll();
				panel.add(p1, BorderLayout.CENTER);
				panel.revalidate();
				panel.repaint();
			}
		});
		izqui.setBounds(10, 369, 169, 96);
		panel.add(izqui);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setOrientation(SwingConstants.VERTICAL);
		progressBar.setToolTipText("C");
		progressBar.setBounds(104, 243, 19, 115);
		panel.add(progressBar);
		
		JLabel foti = new JLabel("");
		foti.setIcon(new ImageIcon(parte4.class.getResource("/ima/televisor-dañado.gif")));
		foti.setBounds(133, 243, 250, 115);
		panel.add(foti);
		
		JLabel pro = new JLabel("Procesando foto...");
		pro.setBounds(192, 355, 132, 3);
		panel.add(pro);
		
		JLabel foto = new JLabel("");
		foto.setIcon(new ImageIcon(izqui1.class.getResource("")));
		foto.setBounds(133, 243, 250, 115);
		panel.add(foto);
		
		elecion.setVisible(false);
		dere.setVisible(false);
		izqui.setVisible(false);
		pro.setVisible(false);
		foti.setVisible(false);
		progressBar.setVisible(false);
		
		
		/////////////////////////////////TIEMPO///////////////////////
		TimerTask eleccion= new TimerTask() {
			public void run() {
				elecion.setVisible(true);
				dere.setVisible(true);
				izqui.setVisible(true);
			}
		};
		eo.schedule(eleccion, 3600);
		
		
		
		
		TimerTask tip = new TimerTask() {
			public void run() {
				progressBar.setVisible(true);
				pro.setVisible(true);
				foti.setVisible(true);
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
		eo.schedule(tip, 3800);
		
		TimerTask fot = new TimerTask() {
			public void run() {
				progressBar.setVisible(false);
				pro.setVisible(false);
				foti.setVisible(false);
				foto.setIcon(new ImageIcon(parte4.class.getResource("/ima/bunko.jpg")));
			}
		};
		eo.schedule(fot, 5500);

	}
}
