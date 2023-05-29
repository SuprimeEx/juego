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

public class decision_2 extends JPanel {

	/**
	 * Create the panel.
	 */
	public decision_2() {
		setLayout(null);
		Timer pepa = new Timer();
		////////////////////////////////////////////////////////////////

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 499, 476);
		add(panel);
		panel.setLayout(null);
		
		////////////////////////////////////////////////////////////////
		
		JButton des1 = new JButton("<html>[Creo que eso les servira de nada]");
		des1.setBounds(10, 414, 235, 51);
		des1.setVerticalAlignment(SwingConstants.TOP);
		des1.setHorizontalAlignment(SwingConstants.TRAILING);
		des1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		des1.setBackground(Color.WHITE);
		panel.add(des1);

		JButton des2 = new JButton("<html>[Porque no investigan  como utilizarla]");
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
		
		Siguiente.setBounds(190, 417, 110, 29);
		panel.add(Siguiente);

		des1.setVisible(false);
		des2.setVisible(false);
		Siguiente.setVisible(false);

        ////////////////////////////////////////////////////////////////

		
		JLabel dialogo1 = new JLabel("");
		dialogo1.setBounds(10, 11, 480, 21);
		dialogo1.setForeground(Color.BLACK);
		dialogo1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel.add(dialogo1);
		
		JLabel dialogo2 = new JLabel("");
		dialogo2.setBounds(10, 43, 480, 21);
		dialogo2.setForeground(Color.BLACK);
		dialogo2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel.add(dialogo2);
		
		JLabel dialogo3 = new JLabel("");
		dialogo3.setBounds(10, 75, 480, 21);
		dialogo3.setForeground(Color.BLACK);
		dialogo3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel.add(dialogo3);
		
		JLabel dialogo4 = new JLabel("");
		dialogo4.setBounds(10, 107, 480, 21);
		dialogo4.setForeground(Color.BLACK);
		dialogo4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel.add(dialogo4);
		
		////////////////////////////////////////////////////////////////

		
		TimerTask pepo = new TimerTask() {
			public void run() {
				dialogo1.setText("[James]: Miren esta cosa, parece un arma.");
			}
		};
		pepa.schedule(pepo,1000);
		
		TimerTask papo = new TimerTask() {
			public void run() {
				dialogo2.setText("[Tom]: ¿Dónde la encontraste?");
			}
		};
		pepa.schedule(papo,5000);
		
		
		TimerTask pipo = new TimerTask() {
			public void run() {
				dialogo3.setText("[James]: Acá tirada en el suelo.");
			}
		};
		pepa.schedule(pipo,8000);
		
		TimerTask pupo = new TimerTask() {
			public void run() {
				dialogo4.setText("[Carl]: Genial, guardala, solo por si las moscas.");
				des1.setVisible(true);
				des2.setVisible(true);
			}
		};
		pepa.schedule(pupo,11000);
		
		
		
		
		JLabel dialogo5 = new JLabel("");
		dialogo5.setFont(new Font("Tahoma", Font.PLAIN, 17));
		dialogo5.setForeground(Color.RED);
		dialogo5.setBounds(10, 139, 480, 42);
		dialogo5.setForeground(Color.BLACK);
		panel.add(dialogo5);
		
		JLabel dialogo6 = new JLabel("");
		dialogo6.setFont(new Font("Tahoma", Font.PLAIN, 17));
		dialogo6.setBounds(10, 192, 480, 42);
		dialogo6.setForeground(Color.BLACK);
		panel.add(dialogo6);
		
		JLabel dialogo7 = new JLabel("");
		dialogo7.setFont(new Font("Tahoma", Font.PLAIN, 17));
		dialogo7.setBounds(10, 245, 480, 42);
		dialogo7.setForeground(Color.BLACK);
		panel.add(dialogo7);
		
		JLabel dialogo8 = new JLabel("");
		dialogo8.setFont(new Font("Tahoma", Font.PLAIN, 17));
		dialogo8.setBounds(10, 298, 480, 42);
		dialogo8.setForeground(Color.BLACK);
		panel.add(dialogo8);
		
		JLabel dialogo9 = new JLabel("");
		dialogo9.setForeground(Color.BLACK);
		dialogo9.setFont(new Font("Tahoma", Font.PLAIN, 17));
		dialogo9.setBounds(10, 351, 480, 42);
		panel.add(dialogo9);
		
	
		
		////////////////////////////////////////////////////////////////

		
		
		 //Accion delboton 1
		
		des1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				des1.setVisible(false);
				des2.setVisible(false);
				dialogo5.setText("<html>[Retro]: Estan seguros de llevarla, seguro que no debe de servir. Y puede ser peligroso");	
				
				TimerTask pupo = new TimerTask() {
					public void run() {
						dialogo6.setText("<html>[James]: Vamos Retro, estas jugando o algo asi, es mas peligroso si no la llevamos ");
					}
					};
					pepa.schedule(pupo,5000);
					
					
				TimerTask papo = new TimerTask() {
					public void run() {
						dialogo7.setText("<html>[Tom]: Viendo las circunstancias no tenemos mucho con que defendernos en caso de una emergencia ");
					}
					};
					pepa.schedule(papo,10000);	
					
				TimerTask papa= new TimerTask() {
					public void run() {
						dialogo8.setText("<html>[Carl]: Si, puede ser util miremos como funciona.");	
					}
					};
					pepa.schedule(papa,15000);	
					
					TimerTask papu= new TimerTask() {
						public void run() {
							dialogo9.setText("<html>[Tom]: Al parecer esta bien, solo necesita municiones, tal vez la tuvieron que utilizar.");
							Siguiente.setVisible(true);
						
									
						}
						};
						pepa.schedule(papu,18000);
					
					////////////////////////////////////////////////////////////////
					Siguiente.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							A1_1 p1 = new A1_1();
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
				dialogo5.setText("<html>[Retro]: porque no la prueban, para que sepan como usarla en caso de necesitarla.");	
				
				TimerTask pupo = new TimerTask() {
					public void run() {
						dialogo6.setText("[James]: Tu si me entiendes hermano.");
					}
					};
					pepa.schedule(pupo,5000);
					
					
				TimerTask papo = new TimerTask() {
					public void run() {
						dialogo7.setText("<html>[Trix]: Tranquilo James no seras tu el que la pruebe no quiero morir hoy jaja.  ");
					}
					};
					pepa.schedule(papo,8000);	
					
				TimerTask papa= new TimerTask() {
					public void run() {
						dialogo8.setText("<html>[Carl]: Pues no esta en mal estado solo un poco empolvada, pero porque estaba en el suelo.");
					
								
					}
					};
					pepa.schedule(papa,13000);	
					
					TimerTask papu= new TimerTask() {
						public void run() {
							dialogo9.setText("<html>[Tom]: Tal vez la tuvieron que utilizar, busquemos las munisiones.");
							Siguiente.setVisible(true);
						
									
						}
						};
						pepa.schedule(papu,18000);
					
					////////////////////////////////////////////////////////////////
					Siguiente.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							A1_1 p1 = new A1_1();
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
