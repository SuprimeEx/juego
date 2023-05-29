import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.ActionEvent;

public class A1 extends JPanel {

	/**
	 * Create the panel.
	 */
	public A1() {
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
				d1.setText("<html>[Carl]: Amigos miren esto parece una nevera. Puede que aún halla algo que sirva.");
			}
			};
			pepa.schedule(papa,0);
			
		TimerTask pape = new TimerTask() {
			public void run() {
				d2.setText("<html>[Trix]: kdjcksjdvbkuyf... Huele como si hubiera muerto algo ahí.");
			}
			};
			pepa.schedule(pape,3000);

		TimerTask papi = new TimerTask() {
			public void run() {
				d3.setText("[James]: Cierra eso! ");
			}
			};
			pepa.schedule(papi,5000);

		TimerTask papo = new TimerTask() {
			public void run() {
				d4.setText("<html>[Tom]: Espera. Mira eso que brilla ahí atrás, parece un suero. Puede que sirva.");
			}
			};
			pepa.schedule(papo,9000);
	
		TimerTask papu = new TimerTask() {
			public void run() {
				d5.setText("[Carl]: *Lo agarra*");
			}
			};
			pepa.schedule(papu,11000);
						
		TimerTask papaa = new TimerTask() {
			public void run() {
				d6.setText("<html>[Carl]: Muy bien! Sigan buscando, nuestra investigación va a ser un éxito.");
			}
			};
			pepa.schedule(papaa,13000);
		TimerTask papee = new TimerTask() {
			public void run() {
				d7.setText("[James]: AMIGOS!!!");
			}
			};
			pepa.schedule(papee,17000);
				
		TimerTask papii = new TimerTask() {
			public void run() {
				d8.setText("[Carl]: QUE PASO JAMES!! . . .");
			}
			};
			pepa.schedule(papii,19000);
			
			TimerTask papoo = new TimerTask() {
				public void run() {
					Sig.setVisible(true);
				}
				};
				pepa.schedule(papoo,22000);
								
							
							
							
		
		Sig.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				decision_2 p1 = new decision_2();
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


