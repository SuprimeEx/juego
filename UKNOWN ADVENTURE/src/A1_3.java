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

public class A1_3 extends JPanel {

	/**
	 * Create the panel.
	 */
	public A1_3() {
		setBackground(new Color(240, 240, 240));
		setLayout(null);
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
		Sig.setBounds(195, 421, 110, 29);
		panel.add(Sig);
		Sig.setVisible(false);

        ////////////////////////////////////////////////////////////////
		
		TimerTask papa = new TimerTask() {
			public void run() {
				d1.setText("[Tom]: Buena esa Retro sigue asi.");
			}
			};
			pepa.schedule(papa,1000);
			
		TimerTask pape = new TimerTask() {
			public void run() {
				d2.setText("<html>[Carl]: Busquemos mas Sueros, puede venir en cualquier momennto.");
			}
			};
			pepa.schedule(pape,2000);

		TimerTask papi = new TimerTask() {
			public void run() {
				d3.setText("[Tom]: Retro ayudanos a buscar una salida.");
			}
			};
			pepa.schedule(papi,3000);

		TimerTask papo = new TimerTask() {
			public void run() {
				d4.setText("<html>[Retro]: Dense prisa muchachos aun puedo ver la camara de Trix y parace que los esta buscando.");
			}
			};
			pepa.schedule(papo,4000);
	
		TimerTask papu = new TimerTask() {
			public void run() {
				d5.setText("[Tom]: Encontre otro suero, pero este es azul, dice que es adrealina.");
			}
			};
			pepa.schedule(papu,5000);
						
		TimerTask papaa = new TimerTask() {
			public void run() {
				d6.setText("[Carl]: Eso nos nos servira conta el bicho este.");
			}
			};
			pepa.schedule(papaa,6000);
		TimerTask papee = new TimerTask() {
			public void run() {
				d7.setText("<html>[James]: Encontre uno violeta dice que es para adormecer.");
			}
			};
			pepa.schedule(papee,7000);
				
		TimerTask papii = new TimerTask() {
			public void run() {
				d8.setText("[Carl]: Tengo otro.");
			}
			
			};
			pepa.schedule(papii,8000);
			
			TimerTask papoo = new TimerTask() {
				public void run() {
					Sig.setVisible(true);
				}
				};
				pepa.schedule(papoo,10000);
								
							
							
							
		
		Sig.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				decision_5 p1 = new decision_5();
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
