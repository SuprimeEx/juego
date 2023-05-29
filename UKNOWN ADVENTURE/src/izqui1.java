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

public class izqui1 extends JPanel {

	/**
	 * Create the panel.
	 */
	Timer eo=new Timer();
	public izqui1() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 499, 476);
		add(panel);
		panel.setLayout(null);
		
		JButton prisa = new JButton("Apresurar");
		prisa.setBounds(281, 287, 112, 23);
		panel.add(prisa);
		
		JButton calma = new JButton("Calma");
		calma.setBounds(400, 287, 89, 23);
		panel.add(calma);
		
		JLabel dial = new JLabel("<html>[RETRO] El izquierdo parece curioso<p>"
				+ "<p>[TRIX] Igual cuando acabemos de explorar ¿podemos ver el otro no?<P>"
				+ "<p>[CARL] Claro, pero primero veamos este al completo<p>"
				+ "<p>[JAMES] Ojalá sea rápido, el derecho parecía tener un tobogán, este parece con escaleras al infierno mira.<p>");
		dial.setBounds(10, 11, 479, 138);
		panel.add(dial);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setOrientation(SwingConstants.VERTICAL);
		progressBar.setToolTipText("C");
		progressBar.setBounds(95, 160, 19, 105);
		panel.add(progressBar);
		
		JLabel foti = new JLabel("");
		foti.setIcon(new ImageIcon(parte4.class.getResource("/ima/televisor-dañado.gif")));
		foti.setBounds(124, 160, 250, 105);
		panel.add(foti);
		
		JLabel pro = new JLabel("Procesando foto...");
		pro.setBounds(183, 272, 132, 14);
		panel.add(pro);
		
		JLabel foto = new JLabel("");
		foto.setIcon(new ImageIcon(izqui1.class.getResource("")));
		foto.setBounds(124, 160, 250, 105);
		panel.add(foto);
		
		JLabel text1 = new JLabel("");
		text1.setBounds(10, 282, 479, 33);
		panel.add(text1);
		
		JLabel respu = new JLabel("");
		respu.setBounds(10, 310, 479, 64);
		panel.add(respu);
		
		JLabel fin = new JLabel("[CARL] Bien Retro te contactaremos cuando bajemos");
		fin.setBounds(10, 373, 479, 33);
		panel.add(fin);
		
		
		JButton sigue = new JButton("Continuar");
		sigue.setBounds(400, 442, 89, 23);
		panel.add(sigue);
		
		pro.setVisible(false);
		foti.setVisible(false);
		progressBar.setVisible(false);
		fin.setVisible(false);
		calma.setVisible(false);
		prisa.setVisible(false);
		sigue.setVisible(false);
		
		
		
		//////////////////////////////OPCIONES///////////////////
		prisa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text1.setText("[RETRO] Con prisa porfavor, este lugar me da escalofrios");
				
				TimerTask tie = new TimerTask() {
					public void run() {
						respu.setText("<html>[JAMES] Calmate, no es la primera vez que invado una propiedad privada del estado<p>"
								+ "<p>[TOM] Retro tiene razon James, es mejor no tentar la suerte en este sitio");
					}
				};
				eo.schedule(tie, 1800);
							
				TimerTask tip = new TimerTask() {
					public void run() {
						fin.setVisible(true);
					}
				};
				eo.schedule(tip, 4600);
				prisa.setVisible(false);
				calma.setVisible(false);
				
				TimerTask conti = new TimerTask() {
					public void run() {
						sigue.setVisible(true);
					}
				};
				eo.schedule(conti, 6600);
			}
		});
		
		
		calma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text1.setText("[RETRO] Vayan con cuidado ¿si? no quiero heridos");
				
				TimerTask tie = new TimerTask() {
					public void run() {
						respu.setText("<html>[TRIX] Gracias por preocuparte Retro<p>"
								+ "<p>[TOM] Lo haremos Retro");
					}
				};
				eo.schedule(tie, 1800);
	
				TimerTask tip = new TimerTask() {
					public void run() {
						fin.setVisible(true);
					}
				};
				eo.schedule(tip, 4600);
				
				TimerTask conti = new TimerTask() {
					public void run() {
						sigue.setVisible(true);
					}
				};
				eo.schedule(conti, 6600);
				
				prisa.setVisible(false);
				calma.setVisible(false);
			}
		});
		
		sigue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				izqui2 p1 = new izqui2();
				p1.setSize(499, 476);
				p1.setLocation(0, 0);
				panel.removeAll();
				panel.add(p1, BorderLayout.CENTER);
				panel.revalidate();
				panel.repaint();
			}
		});
		
		
		
		
		
		
		
		/////////////////////////////////////////TIEMPO//////////////////////////////
		
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
				foto.setIcon(new ImageIcon(parte4.class.getResource("/ima/escaleras.jpg")));
			}
		};
		eo.schedule(fot, 5500);
		
		TimerTask botone = new TimerTask() {
			public void run() {
				calma.setVisible(true);
				prisa.setVisible(true);
			}
		};
		eo.schedule(botone, 7300);
		

	}

}
