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

public class decision_3 extends JPanel {

	/**
	 * Create the panel.
	 */
	public decision_3() {
		setLayout(null);
		Timer pepa = new Timer();
		////////////////////////////////////////////////////////////////

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 499, 476);
		add(panel);
		panel.setLayout(null);
		
		////////////////////////////////////////////////////////////////
		
		JButton des1 = new JButton("[Disparar el arma]");
		des1.setToolTipText("");
		des1.setBounds(10, 414, 235, 51);
		des1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		des1.setBackground(Color.WHITE);
		panel.add(des1);

		JButton des2 = new JButton("[usar las llaves]");
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
				dialogo1.setText("[Carl]: Buscare mas por donde encontramos la otra.");
			}
		};
		pepa.schedule(pepo,1000);
		
		TimerTask papo = new TimerTask() {
			public void run() {
				dialogo2.setText("[Trix]: No intentes abrir esa nevera otra vez.");
			}
		};
		pepa.schedule(papo,2000);
		
		
		TimerTask pipo = new TimerTask() {
			public void run() {
				dialogo3.setText("[Carl]: Tranquila Trix no voy a abrirla de nuevo.");
			}
		};
		pepa.schedule(pipo,3000);
		
		TimerTask pupo = new TimerTask() {
			public void run() {
				dialogo4.setText("<html>[James]: Miren amigos, no encontre mas sueros pero encontre unas llaves, estaban al lado de la nevera.");
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
		
		JLabel dialogo10 = new JLabel(" ");
		dialogo10.setForeground(Color.BLACK);
		dialogo10.setFont(new Font("Tahoma", Font.PLAIN, 17));
		dialogo10.setBounds(275, 367, 33, 21);
		panel.add(dialogo10);
		
		JLabel dialogo11 = new JLabel("");
		dialogo11.setForeground(Color.BLACK);
		dialogo11.setFont(new Font("Tahoma", Font.PLAIN, 17));
		dialogo11.setBounds(318, 367, 33, 21);
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
				dialogo5.setText("[Retro]: Derriben la puerta con el arma.");	
			
				TimerTask pupo = new TimerTask() {
					public void run() {
						dialogo6.setText("[Tom]: Temo que eso es muy peligroso.");
					}
					};
					pepa.schedule(pupo,1000);
					
					
				TimerTask papo = new TimerTask() {
					public void run() {
						dialogo7.setText("<html>[Trix]: Yo creo que es mejor utilizar las llaves.");
					}
					};
					pepa.schedule(papo,2000);	
					
				TimerTask papa= new TimerTask() {
					public void run() {
						dialogo8.setText("<html>[Carl]:Estoy deacuerdo, yo abro la puerta, Tom tu toma el arma, Trix y James atras con las linternas.");
					
								
					}
					};
					pepa.schedule(papa,3000);	
					
					
					TimerTask papu= new TimerTask() {
						public void run() {
							dialogo9.setText("[Carl]: A la cuenta de 3... ");
							Siguiente.setVisible(true);
						}
						};
						pepa.schedule(papu,4000);
											
					////////////////////////////////////////////////////////////////
					Siguiente.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							TimerTask papb= new TimerTask() {
								public void run() {
									dialogo10.setText("1 ...");
								}
								};
							    pepa.schedule(papb,1000);
						
						  	TimerTask papv= new TimerTask() {
									public void run() {
										dialogo11.setText("2...");
										Siguiente.setVisible(true);			
									}
									};
									pepa.schedule(papv,2000);								
											
							TimerTask papp= new TimerTask() {
								public void run() {
									dialogo12.setText("Y 3...");
									
									A1_2 p1 = new A1_2();
									p1.setSize(499, 476);
									p1.setLocation(0, 0);
									panel.removeAll();
									panel.add(p1, BorderLayout.CENTER);
									panel.revalidate();
									panel.repaint();
									
													
								}
								};
								pepa.schedule(papp,5000);
						
				
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
				dialogo5.setText("<html>[Retro]: Porqué no pasan a la habitacion de al lado, pero tengan cuidado.");	
				
				TimerTask pupo = new TimerTask() {
					public void run() {
						dialogo6.setText("<html>[Tom]: Ok Retro, iremos con cuidado.");
					}
					};
					pepa.schedule(pupo,1000);
					
					
				TimerTask papo = new TimerTask() {
					public void run() {
						dialogo7.setText("<html>[Carl]: Yo abro la puerta, Tom, tu toma el arma, Trix y James, atras con las linternas.");
					}
					};
					pepa.schedule(papo,2000);	
					
				TimerTask papa= new TimerTask() {
					public void run() {
						dialogo8.setText("<html>[Tom]: Ok, vamos.");
					
								
					}
					};
					pepa.schedule(papa,3000);	
					
					TimerTask papu= new TimerTask() {
						public void run() {
							dialogo9.setText("[Carl]: A la cuenta de 3... ");
							Siguiente.setVisible(true);		
						}
						};
						pepa.schedule(papu,4000);
					
				
					
					
					////////////////////////////////////////////////////////////////
					Siguiente.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							
							TimerTask papb= new TimerTask() {
								public void run() {
									dialogo10.setText("1 ...");
								}
								};
							    pepa.schedule(papb,1000);
						
						  	TimerTask papv= new TimerTask() {
									public void run() {
										dialogo11.setText("2...");
										Siguiente.setVisible(true);			
									}
									};
									pepa.schedule(papv,2000);								
											
							TimerTask papp= new TimerTask() {
								public void run() {
									dialogo12.setText("Y 3...");
									
									A1_2 p1 = new A1_2();
									p1.setSize(499, 476);
									p1.setLocation(0, 0);
									panel.removeAll();
									panel.add(p1, BorderLayout.CENTER);
									panel.revalidate();
									panel.repaint();				
								}
								};
								pepa.schedule(papp,5000);
						}
					});
							
					
			}
		});
		
		
		////////////////////////////////////////////////////////////////
	}
}
