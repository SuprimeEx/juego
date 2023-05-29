import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class somnifero extends JPanel {

	/**
	 * Create the panel.
	 */
	public somnifero() {
		setLayout(null);
		Timer pepa = new Timer();
		////////////////////////////////////////////////////////////////

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 499, 476);
		add(panel);
		panel.setLayout(null);
		
		////////////////////////////////////////////////////////////////
		
		JButton des1 = new JButton("<html>[Irse del laboratorio sin matar al Proyecto Abigail]");
		des1.setVerticalAlignment(SwingConstants.TOP);
		des1.setToolTipText(" ");
		des1.setBounds(10, 414, 235, 51);
		des1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		des1.setBackground(Color.WHITE);
		panel.add(des1);

		JButton des2 = new JButton("<html>[Matar al Proyecto Abigail antes de irse]");
		des2.setVerticalAlignment(SwingConstants.TOP);
		des2.setBounds(255, 414, 235, 51);
		des2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		des2.setBackground(Color.WHITE);
		panel.add(des2);
		
		JButton Siguiente = new JButton("SIGUIENTE");
		Siguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		Siguiente.setBounds(170, 417, 110, 29);
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
		dialogo3.setBounds(10, 70, 480, 21);
		dialogo3.setForeground(Color.BLACK);
		dialogo3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel.add(dialogo3);
		
		JLabel dialogo4 = new JLabel("");
		dialogo4.setBounds(10, 102, 480, 42);
		dialogo4.setForeground(Color.BLACK);
		dialogo4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel.add(dialogo4);
		
		//Primeros textos
		////////////////////////////////////////////////////////////////

		
		TimerTask pepo = new TimerTask() {
			public void run() {
				dialogo1.setText("[James]: Gran tiro hermano, justo a la cara.");
			}
		};
		pepa.schedule(pepo,1000);
		
		TimerTask papo = new TimerTask() {
			public void run() {
				dialogo2.setText("[Tom]: Miren parece que si esta haciendo efecto.");
			}
		};
		pepa.schedule(papo,2000);
		
		
		TimerTask pipo = new TimerTask() {
			public void run() {
				dialogo3.setText("[Carl]: Amigos el suero quee encontre es un veneno.");
			}
		};
		pepa.schedule(pipo,3000);
		
		TimerTask pupo = new TimerTask() {
			public void run() {
				dialogo4.setText("[James]: Genial, Matemos esta cosa de una vez por todas.");
				des1.setVisible(true);
				des2.setVisible(true);
			}
		};
		pepa.schedule(pupo,4000);
		
		////////////////////////////////////////////////////////////////
		
		
		JLabel dialogo5 = new JLabel("");
		dialogo5.setFont(new Font("Tahoma", Font.PLAIN, 17));
		dialogo5.setBounds(10, 155, 480, 42);
		dialogo5.setForeground(Color.BLACK);
		panel.add(dialogo5);
		
		JLabel dialogo6 = new JLabel("");
		dialogo6.setFont(new Font("Tahoma", Font.PLAIN, 17));
		dialogo6.setBounds(10, 208, 480, 42);
		dialogo6.setForeground(Color.BLACK);
		panel.add(dialogo6);
		
		JLabel dialogo7 = new JLabel("");
		dialogo7.setFont(new Font("Tahoma", Font.PLAIN, 17));
		dialogo7.setBounds(10, 261, 480, 42);
		dialogo7.setForeground(Color.BLACK);
		panel.add(dialogo7);
		
		JLabel dialogo8 = new JLabel("");
		dialogo8.setFont(new Font("Tahoma", Font.PLAIN, 17));
		dialogo8.setBounds(10, 314, 480, 42);
		dialogo8.setForeground(Color.BLACK);
		panel.add(dialogo8);
		
		JLabel dialogo9 = new JLabel("");
		dialogo9.setForeground(Color.BLACK);
		dialogo9.setFont(new Font("Tahoma", Font.PLAIN, 17));
		dialogo9.setBounds(10, 367, 480, 21);
		panel.add(dialogo9);
		
		JLabel dialogo10 = new JLabel("");
		dialogo10.setForeground(Color.BLACK);
		dialogo10.setFont(new Font("Tahoma", Font.PLAIN, 17));
		dialogo10.setBounds(142, 367, 86, 21);
		panel.add(dialogo10);
		
		JLabel dialogo11 = new JLabel("");
		dialogo11.setForeground(Color.BLACK);
		dialogo11.setFont(new Font("Tahoma", Font.PLAIN, 17));
		dialogo11.setBounds(222, 367, 107, 21);
		panel.add(dialogo11);
		
		JLabel dialogo12 = new JLabel("");
		dialogo12.setForeground(Color.BLACK);
		dialogo12.setFont(new Font("Tahoma", Font.PLAIN, 17));
		dialogo12.setBounds(361, 367, 46, 21);
		panel.add(dialogo12);
		
	
		
		////////////////////////////////////////////////////////////////

		
		
		 //Accion del boton 1
		
		des1.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				
				des1.setVisible(false);
				des2.setVisible(false);
				dialogo5.setText("<html>[Retro]: Salgan de ahí rapido no sabemos cuando despierte.");	
			
				TimerTask pupo = new TimerTask() {
					public void run() {
						dialogo6.setText("[Tom]: ¿Estás seguro Retro?...  si tu lo dices.");
					}
					};
					pepa.schedule(pupo,1000);
					
				TimerTask papo = new TimerTask() {
					public void run() {
						dialogo7.setText("<html>[James]: Es enserio nos quiso matar y lo vamos a dejar ahí.");
					}
					};
					pepa.schedule(papo,2000);	
					
				TimerTask papa= new TimerTask() {
					public void run() {
						dialogo8.setText("[Carl]: Yo digo que hay que acabar con esto de una vez por todas.");		
					}
					};
					pepa.schedule(papa,3000);	
					
				TimerTask papu= new TimerTask() {
					public void run() {
						dialogo9.setText("[Tom]: Por favor amigos, vamonos antes que sea tarde.");					
					}
					};
					pepa.schedule(papu,4000);
										
					
				TimerTask papp= new TimerTask() {
					public void run() {		
						Siguiente.setVisible(true);
					}
				  	};
				  	pepa.schedule(papp,8000);
											
					Siguiente.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							     	somnifero2 p1 = new somnifero2();
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
				dialogo5.setText("<html>[Retro]: Acaben con eso de uan vez por todas.");	
				
				TimerTask pupo = new TimerTask() {
					public void run() {
						dialogo6.setText("[James]: Esto es por Trix.");
					}
					};
					pepa.schedule(pupo,1000);
					
				TimerTask papo = new TimerTask() {
					public void run() {
						dialogo7.setText("[Carl]: Acaemos con esto.");
					}
					};
					pepa.schedule(papo,2000);	
					
				TimerTask papa= new TimerTask() {
					public void run() {
						dialogo8.setText("[Proyecto Abigailo]: *Despertando*");
								
					}
					};
				pepa.schedule(papa,3000);	
				
				TimerTask papu= new TimerTask() {
					public void run() {
						dialogo9.setText("[Tom]: *Carga*");					
					}
					};
					pepa.schedule(papu,4000);
					
				TimerTask papl= new TimerTask() {
					public void run() {
						dialogo10.setText("*Apunta*");					
					}
					};
					pepa.schedule(papl,5000);
					
				TimerTask pam= new TimerTask() {
					public void run() {
						dialogo11.setText("*Dispara*");					
					}
					};
					pepa.schedule(pam,6000);
										
				 TimerTask papv= new TimerTask() {
					public void run() {
						Siguiente.setVisible(true);			
					}
					};
					pepa.schedule(papv,8000);
					
			
					Siguiente.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {									
									somnifero3 p1 = new somnifero3();
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
