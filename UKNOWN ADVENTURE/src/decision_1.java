import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class decision_1 extends JPanel {
	/**
	 * Create the panel.
	 */
	public decision_1() {
		setLayout(null);
		Timer pepa = new Timer();
		////////////////////////////////////////////////////////////////

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 499, 476);
		add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(10, 190, 480, 182);
		panel.add(panel_1);
		panel_1.setLayout(null);
		panel_1.setVisible(false);
		////////////////////////////////////////////////////////////////
		
		JButton des1 = new JButton("[Explorar el laboratorio]  ");
		des1.setBounds(10, 414, 235, 51);
		des1.setHorizontalAlignment(SwingConstants.TRAILING);
		des1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		des1.setBackground(Color.WHITE);
		panel.add(des1);

		JButton des2 = new JButton("[ir al cuarto del lado]");
		des2.setBounds(255, 414, 235, 51);
		des2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		des2.setBackground(Color.WHITE);
		panel.add(des2);
		
		JButton Siguiente = new JButton("SIGUIENTE");
		
		Siguiente.setBounds(190, 417, 110, 29);
		panel.add(Siguiente);

		des1.setVisible(false);
		des2.setVisible(false);
		Siguiente.setVisible(false);

        ////////////////////////////////////////////////////////////////

		
		JLabel dialogo1 = new JLabel("");
		dialogo1.setBounds(10, 5, 480, 21);
		dialogo1.setForeground(Color.BLACK);
		dialogo1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel.add(dialogo1);
		
		JLabel dialogo2 = new JLabel("");
		dialogo2.setBounds(10, 38, 480, 21);
		dialogo2.setForeground(Color.BLACK);
		dialogo2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel.add(dialogo2);
		
		JLabel dialogo3 = new JLabel("");
		dialogo3.setBounds(10, 70, 480, 42);
		dialogo3.setForeground(Color.BLACK);
		dialogo3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel.add(dialogo3);
		
		JLabel dialogo4 = new JLabel("");
		dialogo4.setBounds(10, 123, 480, 21);
		dialogo4.setForeground(Color.BLACK);
		dialogo4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel.add(dialogo4);
		
		JLabel Foto_Laboratorio = new JLabel("");
		Foto_Laboratorio.setBounds(15, 11, 450, 150);
		Foto_Laboratorio.setIcon(new ImageIcon(decision_1.class.getResource("/ima/Laboratorio (7).jpeg")));
		panel_1.add(Foto_Laboratorio);
		
		////////////////////////////////////////////////////////////////

		
		TimerTask pepo = new TimerTask() {
			public void run() {
				dialogo1.setText("[Tom]: UFF... Despues de todo fue una larga bajada.");
			}
		};
		pepa.schedule(pepo,0);
		
		TimerTask papo = new TimerTask() {
			public void run() {
				dialogo2.setText("<html>[Carl]: Mira Retro parece que caimos a un laboratorio.");
				panel_1.setVisible(true);
			}
		};
		pepa.schedule(papo,3000);
		
		
		TimerTask pipo = new TimerTask() {
			public void run() {
				dialogo3.setText("[Trix]: O mas bien lo que quedo del laboratorio.");
			}
		};
		pepa.schedule(pipo,6000);
		
		TimerTask pupo = new TimerTask() {
			public void run() {
				dialogo4.setText("[Tom]: Bien Retro, ¿Qué sugieres que hagamos?  ");
				des1.setVisible(true);
				des2.setVisible(true);
			}
		};
		pepa.schedule(pupo,9000);
		
		////////////////////////////////////////////////////////////////
		
		
		JLabel dialogo5 = new JLabel("");
		dialogo5.setFont(new Font("Tahoma", Font.PLAIN, 17));
		dialogo5.setBounds(10, 150, 480, 42);
		dialogo5.setForeground(Color.BLACK);
		panel.add(dialogo5);
		
		JLabel dialogo6 = new JLabel("");
		dialogo6.setFont(new Font("Tahoma", Font.PLAIN, 17));
		dialogo6.setBounds(10, 203, 480, 42);
		dialogo6.setForeground(Color.BLACK);
		panel.add(dialogo6);
		
		JLabel dialogo7 = new JLabel("");
		dialogo7.setFont(new Font("Tahoma", Font.PLAIN, 17));
		dialogo7.setBounds(10, 256, 480, 42);
		dialogo7.setForeground(Color.BLACK);
		panel.add(dialogo7);
		
		JLabel dialogo8 = new JLabel("");
		dialogo8.setFont(new Font("Tahoma", Font.PLAIN, 17));
		dialogo8.setBounds(10, 309, 480, 42);
		dialogo8.setForeground(Color.BLACK);
		panel.add(dialogo8);
		
		JLabel dialogo9 = new JLabel("");
		dialogo9.setForeground(Color.BLACK);
		dialogo9.setFont(new Font("Tahoma", Font.PLAIN, 17));
		dialogo9.setBounds(10, 362, 480, 42);
		panel.add(dialogo9);
		


		
	
		
		////////////////////////////////////////////////////////////////

		
		
		 //Accion delboton 1
		
		des1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				des1.setVisible(false);
				des2.setVisible(false);
				panel_1.setVisible(false);

				dialogo5.setText("<html>[Retro]: Les sugiero que exploren el laboratorio, pueden encontrar cosas interesantes ahí.");	
				
				TimerTask pupo = new TimerTask() {
					public void run() {
						dialogo6.setText("<html>[Trix]: Entendido Retro, la verdad creo que es lo mas seguro.");
					}
					};
					pepa.schedule(pupo,5000);
					
					
				TimerTask papo = new TimerTask() {
					public void run() {
						dialogo7.setText("[James]: Bien pensado Retro.");
					}
					};
					pepa.schedule(papo,8000);	
					
				TimerTask papa= new TimerTask() {
					public void run() {
						dialogo8.setText("<html>[Tom]: Ok, a investigar y tal ves podamos ir a otros lugares.");					
					}
					};
					pepa.schedule(papa,9500);	
					
					TimerTask papu= new TimerTask() {
						public void run() {
							dialogo9.setText("[Carl]: Gracias Retro!");
							Siguiente.setVisible(true);
						
									
						}
						};
						pepa.schedule(papu,11500);
					
			////////////////////////////////////////////////////////////////
						Siguiente.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
						
								A1 p1 = new A1();
								p1.setSize(499, 476);
								p1.setLocation(0, 0);
								panel.removeAll();
								panel.add(p1, BorderLayout.CENTER);
								panel.revalidate();
								panel.repaint();
								}
								});
							
					
			}
		});
		
		////////////////////////////////////////////////////////////////
		
		
		//accion del boton 2

		des2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				des1.setVisible(false);
				des2.setVisible(false);
				panel_1.setVisible(false);

				dialogo5.setText("[Retro]: Vi una puerta a su derecha pueden entrar a investigar.");	
				
				TimerTask pupo = new TimerTask() {
					public void run() {
						dialogo6.setText("[Tom]: pues dice que es el cuarto de experimentos.");
					}
					};
					pepa.schedule(pupo,4000);
					
					
				TimerTask papo = new TimerTask() {
					public void run() {
						dialogo7.setText("<html>[Trix]: Creo que no es lo mas recomendable puede ser peligroso investiguemos aca un poco  ");
					}
					};
					pepa.schedule(papo,6000);	
					
				TimerTask papa= new TimerTask() {
					public void run() {
						dialogo8.setText("[Carl]: Si, mas tarde iremos exploremos aca un poco");			
					}
					};
					pepa.schedule(papa,9000);	
					
					TimerTask papu= new TimerTask() {
						public void run() {
							dialogo9.setText("[James]: Que paso ahi Retro vamos mas despacio.");
							Siguiente.setVisible(true);							
						}
						};
						pepa.schedule(papu,11000);
					
					////////////////////////////////////////////////////////////////
					Siguiente.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							A1 p1 = new A1();
							p1.setSize(499, 476);
							p1.setLocation(0, 0);
							panel.removeAll();
							panel.add(p1, BorderLayout.CENTER);
							panel.revalidate();
							panel.repaint();
							
					
						}
					});
							
					
			}
		});
		
		
		////////////////////////////////////////////////////////////////

		

		
		
	}
}
