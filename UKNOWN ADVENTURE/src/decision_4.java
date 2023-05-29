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

public class decision_4 extends JPanel {

	/**
	 * Create the panel.
	 */
	public decision_4() {
		setLayout(null);
		Timer pepa = new Timer();
		////////////////////////////////////////////////////////////////

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 499, 476);
		add(panel);
		panel.setLayout(null);
		
		////////////////////////////////////////////////////////////////
		
		JButton des1 = new JButton("<html>[Dispararle al mounstro para aturdirlo y escabullirse]");
		des1.setVerticalAlignment(SwingConstants.TOP);
		des1.setToolTipText(" ");
		des1.setBounds(10, 414, 235, 51);
		des1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		des1.setBackground(Color.WHITE);
		panel.add(des1);

		JButton des2 = new JButton("<html>[Correr a esconderse en la sala neveras hciendo mucho ruido]");
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
				dialogo1.setText("[Carl]: Que rayos es esa cosa.");
			}
		};
		pepa.schedule(pepo,1000);
		
		TimerTask papo = new TimerTask() {
			public void run() {
				dialogo2.setText("[James]: atac...  Ataco a Trix!!.");
			}
		};
		pepa.schedule(papo,2000);
		
		
		TimerTask pipo = new TimerTask() {
			public void run() {
				dialogo3.setText("[Carl]: Relajate James, o quieres que nos maten.");
			}
		};
		pepa.schedule(pipo,3000);
		
		TimerTask pupo = new TimerTask() {
			public void run() {
				dialogo4.setText("[Tom]: Retro estas ahi, necesitamos una salida, creo que nos esta rastreando.");
				des1.setVisible(true);
				des2.setVisible(true);
			}
		};
		pepa.schedule(pupo,4000);
		
		
		
		
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
		dialogo10.setBounds(154, 261, 86, 42);
		panel.add(dialogo10);
		
		JLabel dialogo11 = new JLabel("");
		dialogo11.setForeground(Color.BLACK);
		dialogo11.setFont(new Font("Tahoma", Font.PLAIN, 17));
		dialogo11.setBounds(382, 355, 107, 42);
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
				dialogo5.setText("<html>[Retro]: Disparenle a la cabeza, luego vayan hacia la otra habitacion .");	
			
				TimerTask pupo = new TimerTask() {
					public void run() {
						dialogo6.setText("[Tom]: Entendido retro.");
					}
					};
					pepa.schedule(pupo,1000);
					
					
				TimerTask papo = new TimerTask() {
					public void run() {
						dialogo7.setText("[Tom]: *Apunta*");
					}
					};
					pepa.schedule(papo,2000);	
					
				TimerTask papb= new TimerTask() {
					public void run() {
						dialogo10.setText("*Dispara*");
					}
					};
					   pepa.schedule(papb,3000);	
					
				TimerTask papa= new TimerTask() {
					public void run() {
						dialogo8.setText("[Carl]:Vamos rapido, no tenemos mucho tiempo.");
					
								
					}
					};
					pepa.schedule(papa,4000);	
					
					TimerTask papu= new TimerTask() {
						public void run() {
							dialogo9.setText("[Todos]: *Pasan a la otra habitacion*");
							
						}
						};
						pepa.schedule(papu,4000);
						
					TimerTask papp= new TimerTask() {
						public void run() {		
							Siguiente.setVisible(true);
						}
					  	};
					  	pepa.schedule(papp,6000);
											
					////////////////////////////////////////////////////////////////
					Siguiente.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
									A1_3 p1 = new A1_3();
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
				dialogo5.setText("<html>[Retro]: Por Dios, mato a Trix CORRAN!!.");	
				
				TimerTask pupo = new TimerTask() {
					public void run() {
						dialogo6.setText("[James]: *Corre a la salida*");
					}
					};
					pepa.schedule(pupo,1000);
					
					
				TimerTask papo = new TimerTask() {
					public void run() {
						dialogo7.setText("[Tom]:James, esperaaaa!");
					}
					};
					pepa.schedule(papo,2000);	
					
				TimerTask papa= new TimerTask() {
					public void run() {
						dialogo8.setText("[Proyecto Abigail]: *Ataca a James*");
					
								
					}
					};
					pepa.schedule(papa,3000);	
					
					TimerTask papu= new TimerTask() {
						public void run() {
							dialogo9.setText("[Carl]: Rapido Tom vamos tenemos poco tiempo");
							Siguiente.setVisible(true);		
						}
						};
						pepa.schedule(papu,4000);
						
					 TimerTask papv= new TimerTask() {
						public void run() {
							dialogo11.setText("*Corren a la sala de sueros*");
							Siguiente.setVisible(true);			
						}
						};
						pepa.schedule(papv,6000);
					
				
					
					
					////////////////////////////////////////////////////////////////
					Siguiente.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {									
							        A2_3 p1 = new A2_3();
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
		
	}

}
