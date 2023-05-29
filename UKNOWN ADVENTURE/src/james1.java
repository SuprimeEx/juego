import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;

import java.awt.BorderLayout;
import java.awt.Component;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class james1 extends JPanel {

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
	
	
	public james1() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 499, 476);
		add(panel);
		panel.setLayout(null);
		
		JLabel respu = new JLabel("[RETRO] James, ¿puedes mostrarme el candado?");
		respu.setBounds(10, 11, 479, 19);
		panel.add(respu);
		
		JLabel dial = new JLabel("[JAMES] Claro");
		dial.setBounds(10, 41, 479, 19);
		panel.add(dial);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setOrientation(SwingConstants.VERTICAL);
		progressBar.setToolTipText("C");
		progressBar.setBounds(95, 71, 19, 105);
		panel.add(progressBar);
		
		JLabel foti = new JLabel("");
		foti.setIcon(new ImageIcon(parte4.class.getResource("/ima/televisor-dañado.gif")));
		foti.setBounds(124, 71, 250, 105);
		panel.add(foti);
		
		JLabel pro = new JLabel("Procesando foto...");
		pro.setBounds(183, 183, 132, 14);
		panel.add(pro);
		
		JLabel foto = new JLabel("");
		foto.setBounds(124, 71, 250, 105);
		panel.add(foto);
		
		JProgressBar progressBar1 = new JProgressBar();
		progressBar1.setOrientation(SwingConstants.VERTICAL);
		progressBar1.setToolTipText("C");
		progressBar1.setBounds(95, 370, 19, 95);
		panel.add(progressBar1);
		
		JLabel foti1 = new JLabel("");
		foti1.setIcon(new ImageIcon(parte4.class.getResource("/ima/televisor-dañado.gif")));
		foti1.setBounds(124, 370, 250, 95);
		panel.add(foti1);
		
		JLabel pro1 = new JLabel("Procesando foto...");
		pro1.setBounds(183, 482, 132, -17);
		panel.add(pro1);
		
		JLabel foto1 = new JLabel("");
		foto1.setBounds(124, 370, 250, 95);
		panel.add(foto1);
		
		JButton tiempo = new JButton("<html>No perder el tiempo");
		tiempo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				carl1 p1 = new carl1();
				p1.setSize(499, 476);
				p1.setLocation(0, 0);
				panel.removeAll();
				panel.add(p1, BorderLayout.CENTER);
				panel.revalidate();
				panel.repaint();
			}
		});
		tiempo.setBounds(362, 195, 127, 42);
		panel.add(tiempo);
		
		JButton intentar = new JButton("Intentar clave");
		intentar.setBounds(222, 195, 127, 42);
		panel.add(intentar);
		
		
		JLabel respu2 = new JLabel("");
		respu2.setBounds(10, 209, 479, 30);
		panel.add(respu2);
		
		JLabel dial2 = new JLabel("[JAMES] Ejecutanto");
		dial2.setBounds(10, 237, 479, 30);
		panel.add(dial2);
		JLabel contra = new JLabel("");
		contra.setBounds(10, 265, 479, 30);
		panel.add(contra);
		
		JLabel dial3 = new JLabel("<html>[TOM] Aho… Ahora si podemos irnos<p>"
				+ "<p>[CARL] Esta mierda es una cárcel, mira Retro.<p>");
		dial3.setBounds(10, 299, 479, 60);
		panel.add(dial3);
		
		JButton conti = new JButton("Continuar");
		conti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				james2 p1 = new james2();
				p1.setSize(499, 476);
				p1.setLocation(0, 0);
				panel.removeAll();
				panel.add(p1, BorderLayout.CENTER);
				panel.revalidate();
				panel.repaint();	
			}
		});
		conti.setBounds(400, 442, 89, 23);
		panel.add(conti);
		
		pro.setVisible(false);
		foti.setVisible(false);
		progressBar.setVisible(false);
		pro1.setVisible(false);
		foti1.setVisible(false);
		progressBar1.setVisible(false);
		dial.setVisible(false);
		tiempo.setVisible(false);
		intentar.setVisible(false);
		dial2.setVisible(false);
		dial3.setVisible(false);
		conti.setVisible(false);
		///////////////////////////////TIEMPO////////////////////
		aparecer(dial, 1800);
		apabot(tiempo, 6500);
		apabot(intentar, 6500);
		
		
		
	
		
		
		
		
		
		///////////////////////////BOTONES////////////////////////////
		intentar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				intentar.setVisible(false);
				tiempo.setVisible(false);
				int clave, intentos=0;	
				while(intentos<=3) {
					clave=Integer.parseInt(JOptionPane.showInputDialog("¿Que clave tendra esta cosa?"));
					contra.setVisible(false);
					respu2.setText("[RETRO] Pueba con "+clave);
					aparecer(dial2,1800);
					if(clave!=9810) {
						JOptionPane.showMessageDialog(null, "[TRIX] No funciona");
						intentos+=1;
					}
					else if(clave==9810) {
						intentos+=5;
						contra.setText("[TRIX] ¡OH! Si es esa, supongo que esos numero en la foto significaban algo");
						aparecer(contra, 3600);
						aparecer(dial3,6400);
					///////////////////////////////////////FOTO 2///////////////////////////////////////
						TimerTask carga1=new TimerTask() {
							public void run() {
								pro1.setVisible(true);
								foti1.setVisible(true);
								progressBar1.setVisible(true);
								Thread carga1 = new Thread() {
									public void run(){//Run es un metodo
										progressBar1.setMaximum(60000000);
										for(int i=0;i<60000000;i++) {
											progressBar1.setValue(i);
													}
										progressBar1.setValue(0);
														}//Fin del run
										};//Fin de la clase thread sirve para hacer procesos dentro de procesos
									carga1.start();
						}
						};
						eo.schedule(carga1, 8700);
						/////////////////////////////////////////////////////////////////
						TimerTask fo1 = new TimerTask() {
							public void run() {
								pro1.setVisible(false);
								foti1.setVisible(false);
								progressBar1.setVisible(false);
								foto1.setIcon(new ImageIcon(izqui2.class.getResource("/ima/abi.jpeg")));
								apabot(conti,1800);
							}
						};
						eo.schedule(fo1, 10800);
					}//FIn else
				}///Fin ciclo
			}
		});
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		////////////////////////////////////////////////////////////////
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
		/////////////////////////////////////////////////////////////////
		TimerTask fo = new TimerTask() {
			public void run() {
				pro.setVisible(false);
				foti.setVisible(false);
				progressBar.setVisible(false);
				foto.setIcon(new ImageIcon(izqui2.class.getResource("/ima/candado.jpg")));
			}
		};
		eo.schedule(fo, 5400);
		
	}
}
