import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;

import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class james2 extends JPanel {

	/**
	 * Create the panel.
	 */
	Timer eo = new Timer();
	public void aparecer(JLabel p, int h) {
		TimerTask text = new TimerTask() {
			public void run() {
				p.setVisible(true);
			}
		};
		eo.schedule(text, h);
	}
	
	public void apabot(JButton p, int h) {
		TimerTask text = new TimerTask() {
			public void run() {
				p.setVisible(true);
			}
		};
		eo.schedule(text, h);
	}
	
	
	public james2() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 499, 476);
		add(panel);
		panel.setLayout(null);
		
		JLabel carl = new JLabel("[CARL] Puaj... Que es ese olor. ");
		carl.setBounds(10, 11, 479, 25);
		panel.add(carl);
		
		JLabel james = new JLabel("[JAMES] Miren... hay algo en el suelo");
		james.setBounds(10, 39, 479, 25);
		panel.add(james);
		
		JLabel tec1 = new JLabel("<html>[CARL] Oigan, esto me da mala espina.<p>"
				+ "<p>[TOM] YA.. Ya somos 2<p>"
				+ "<p>[TRIX] OH mierda jameeeees.");
		tec1.setBounds(10, 73, 479, 79);
		panel.add(tec1);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setOrientation(SwingConstants.VERTICAL);
		progressBar.setToolTipText("C");
		progressBar.setBounds(95, 163, 19, 105);
		panel.add(progressBar);
		
		JLabel foti = new JLabel("");
		foti.setIcon(new ImageIcon(parte4.class.getResource("/ima/televisor-dañado.gif")));
		foti.setBounds(124, 163, 250, 105);
		panel.add(foti);
		
		JLabel pro = new JLabel("Procesando foto...");
		pro.setBounds(183, 275, 132, 14);
		panel.add(pro);
		
		JLabel foto = new JLabel("");
		foto.setBounds(124, 163, 250, 105);
		panel.add(foto);
		
		JLabel muertos = new JLabel("<html>[JAMES] AAAAAAAAAAAAAAAAA<p>"
				+ "<p>[TRIX]............<p>"
				+ "<p>[CARL] ........................<p>"
				+ "<p>[TOM] ...................");
		muertos.setBounds(10, 298, 479, 123);
		panel.add(muertos);

		JButton fin = new JButton("FIN?");
		fin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Lastimosamente mataste a todos con tus elecciones");
			}
		});
		fin.setBounds(205, 430, 89, 23);
		panel.add(fin);
		
		james.setVisible(false);
		tec1.setVisible(false);
		pro.setVisible(false);
		foti.setVisible(false);
		progressBar.setVisible(false);
		muertos.setVisible(false);
		fin.setVisible(false);
		
	/////////////////////////////////////////////////////////////////////////////////////////
		aparecer(james,1800);
		aparecer(tec1,3600);
		aparecer(muertos,10200);
		apabot(fin,12000);
		
		
		
		
		
		
		//////////////////////////////////////////////////////////////////////////7
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
		eo.schedule(carga, 5700);
		////////////////////////////////////////////////////////////////////////////////////7
		TimerTask fo = new TimerTask() {
			public void run() {
				pro.setVisible(false);
				foti.setVisible(false);
				progressBar.setVisible(false);
				foto.setIcon(new ImageIcon(izqui2.class.getResource("/ima/abii.jpg")));
	
			}
		};
		eo.schedule(fo, 7600);
	}
}
