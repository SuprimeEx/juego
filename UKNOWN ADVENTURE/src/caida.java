import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class caida extends JPanel {

	/**
	 * Create the panel.
	 */
	public caida() {
		setBackground(new Color(240, 240, 240));
		setLayout(null);
		int pena = 0;
		Timer pepa = new Timer();

		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 499, 476);
		add(panel);
		panel.setLayout(null);
		
        ////////////////////////////////////////////////////////////////

		JLabel d1 = new JLabel("");
		d1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		d1.setBounds(10, 11, 479, 42);
		panel.add(d1);
		
		JLabel d2 = new JLabel("");
		d2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		d2.setBounds(10, 60, 479, 42);
		panel.add(d2);
		
		JLabel d3 = new JLabel("");
		d3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		d3.setBounds(10, 113, 479, 42);
		panel.add(d3);
		
		JLabel d4 = new JLabel("");
		d4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		d4.setBounds(10, 166, 479, 42);
		panel.add(d4);
		
		JLabel d5 = new JLabel("");
		d5.setFont(new Font("Tahoma", Font.PLAIN, 17));
		d5.setBounds(10, 219, 479, 42);
		panel.add(d5);
		
		JLabel d6 = new JLabel("");
		d6.setFont(new Font("Tahoma", Font.PLAIN, 17));
		d6.setBounds(10, 272, 479, 42);
		panel.add(d6);
		
		JLabel d7 = new JLabel("");
		d7.setFont(new Font("Tahoma", Font.PLAIN, 17));
		d7.setBounds(10, 325, 479, 42);
		panel.add(d7);
		
		JLabel d8 = new JLabel("");
		d8.setFont(new Font("Tahoma", Font.PLAIN, 17));
		d8.setBounds(10, 378, 479, 42);
		panel.add(d8);
		
		JButton Sig = new JButton("SIGUIENTE");
		Sig.setBounds(189, 427, 120, 23);
		panel.add(Sig);
		Sig.setVisible(false);


		
        ////////////////////////////////////////////////////////////////
		
		TimerTask papa = new TimerTask() {
			public void run() {
				d1.setText("<html>[Retro]: Sigan por el camino de la derecha, se ve mas interesante.");
			}
			};
			pepa.schedule(papa,0);
			
		TimerTask pape = new TimerTask() {
			public void run() {
				d2.setText("[Trix]: Pero que clase de entrada a una base es esta.");
			}
			};
			pepa.schedule(pape,4000);

		TimerTask papi = new TimerTask() {
			public void run() {
				d3.setText("[James]: Un tobogan, YO PRIMERO!");
			}
			};
			pepa.schedule(papi,6500);

		TimerTask papo = new TimerTask() {
			public void run() {
				d4.setText("[Tom]: JAMES ESPERA! puede que este roto o algo.");
			}
			};
			pepa.schedule(papo,9000);
	
		TimerTask papu = new TimerTask() {
			public void run() {
				d5.setText("[James]: El que tenga miedo a morir que no nasca.");
			}
			};
			pepa.schedule(papu,11000);
						
		TimerTask papaa = new TimerTask() {
			public void run() {
				d6.setText("<html>[Carl]: Bueno, por lo menos no hubo debate por quien seria el primero.");
			}
			};
			pepa.schedule(papaa,13000);
		TimerTask papee = new TimerTask() {
			public void run() {
				d7.setText("[Tom]: Ok amigos, VAMOS.");
			}
			};
			pepa.schedule(papee,16500);
				
		TimerTask papii = new TimerTask() {
			public void run() {
				d8.setText("[Trix]: Sigan ustedes yo los sigo detras.");
			}
			};
			pepa.schedule(papii,18000);
			
			TimerTask papoo = new TimerTask() {
				public void run() {
					Sig.setVisible(true);
				}
				};
				pepa.schedule(papoo,20000);
							
							
		//Modificacion de rapidez		
		
		Sig.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				decision_1 p1 = new decision_1();
				p1.setSize(499, 476);
				p1.setLocation(0, 0);
				panel.removeAll();
				panel.add(p1, BorderLayout.CENTER);
				panel.revalidate();
				panel.repaint();
			}
		});

	}
}
