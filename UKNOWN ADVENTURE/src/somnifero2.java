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

public class somnifero2 extends JPanel {

	/**
	 * Create the panel.
	 */
	public somnifero2() {
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
		
		JButton Sig = new JButton("GAME OVER");
		Sig.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GameOver p1 = new GameOver();
				p1.setSize(499, 476);
				p1.setLocation(0, 0);
				panel.removeAll();
				panel.add(p1, BorderLayout.CENTER);
				panel.revalidate();
				panel.repaint();
			}
		});
		Sig.setBounds(195, 421, 110, 29);
		panel.add(Sig);
		Sig.setVisible(false);

        ////////////////////////////////////////////////////////////////
		
		TimerTask papa = new TimerTask() {
			public void run() {
				d1.setText("[Carl]: Te vas a arrepentir de esto Tom.");
			}
			};
			pepa.schedule(papa,1000);
			
		TimerTask pape = new TimerTask() {
			public void run() {
				d2.setText("[James]: ¿Por que no acabamos con eso de una vez Retro?");
			}
			};
			pepa.schedule(pape,2000);

		TimerTask papi = new TimerTask() {
			public void run() {
				d3.setText("[Retro]:Puede servirnos para futuras investigaciones.");
			}
			};
			pepa.schedule(papi,3000);

		TimerTask papo = new TimerTask() {
			public void run() {
				d4.setText("[James]: Pues no se tu pero yo no pienzo volver ahí.");
			}
			};
			pepa.schedule(papo,4000);
	
		TimerTask papu = new TimerTask() {
			public void run() {
				d5.setText("[Tom]: Por lo menos logramos conseguir el arma y algunos sueros");
			}
			};
			pepa.schedule(papu,5000);
						
		TimerTask papaa = new TimerTask() {
			public void run() {
				d6.setText("<html>[Carl]: Si, si logramos hacer mas como estos podremos lograr grandes cosas.");
			}
			};
			pepa.schedule(papaa,6000);
		TimerTask papee = new TimerTask() {
			public void run() {
				d7.setText("[James]: AMIGOOOOOOOooooss.");
			}
			};
			pepa.schedule(papee,7000);
				
		TimerTask papii = new TimerTask() {
			public void run() {
				d8.setText("<html>[Proyacto Abigail]: *Vuelve por James y desaparece entre las sombras*");
			}
			
			};
			pepa.schedule(papii,8000);
			
			TimerTask papoo = new TimerTask() {
				public void run() {
					Sig.setVisible(true);
				}
				};
				pepa.schedule(papoo,10000);
	}

}
