import javax.swing.JPanel;
import javax.swing.JLabel;

import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;

public class izqui3 extends JPanel {

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
	
	
	
	public izqui3() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 499, 476);
		add(panel);
		panel.setLayout(null);
		
		JLabel dial = new JLabel("<html>[TRIX] ¿Quién es esa mujer?<p>"
				+ "<p>[JAMES] Abigail Wester ¿9810?, Oigan… ¿Creen que sea la misma de aquella historia?<p>"
				+ "<p>[CARL] Imposible, algo como el proyecto Abigail no es biológicamente posible recuerden lo qu….<p>");
		dial.setBounds(10, 11, 479, 110);
		panel.add(dial);
		
		JLabel inter = new JLabel("<html>[TOM] ¡OIGAN! Me importa un carajo lo que recuerden, ¡¿Cómo es que esto no les da pánico?!.");
		inter.setBounds(10, 132, 479, 41);
		panel.add(inter);
		
		JButton tranquilizar = new JButton("Calmate");
		tranquilizar.setBounds(400, 183, 89, 23);
		panel.add(tranquilizar);
		
		JButton miedo = new JButton("No seas cobarde");
		miedo.setBounds(259, 183, 139, 23);
		panel.add(miedo);
		
		JLabel respu = new JLabel("");
		respu.setBounds(10, 178, 469, 26);
		panel.add(respu);
		
		JLabel dial1 = new JLabel("");
		dial1.setBounds(10, 210, 479, 23);
		panel.add(dial1);
		
		JLabel dial2 = new JLabel("<html>[JAMES] Oigan aquí hay una puerta<p>"
				+ "<p>[CARL] Y aquí tengo otra<p>"
				+ "<p>[JAMES] Mierda tiene una especie de candado<p>"
				+ "<p>[CARL] Esta parece normal");
		dial2.setBounds(10, 245, 479, 110);
		panel.add(dial2);
		
		JButton james = new JButton("<html> Camino de James");
		james.setBounds(57, 396, 145, 48);
		panel.add(james);
		
		JButton carl = new JButton("<html>Camino Carl");
		carl.setBounds(265, 396, 145, 48);
		panel.add(carl);
		
		inter.setVisible(false);
		tranquilizar.setVisible(false);
		miedo.setVisible(false);
		dial1.setVisible(false);
		dial2.setVisible(false);
		james.setVisible(false);
		carl.setVisible(false);
		
		///////////////////////////////////////////7TIEMPO////////////////////////
		aparecer(inter,1800);
		apabot(tranquilizar,3600);
		apabot(miedo,3600);
		
		
		
		
		
		
		
		////////////////////////////////////////////BOTONES////////////////////////////////
		miedo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tranquilizar.setVisible(false);
				miedo.setVisible(false);
				respu.setText("[RETRO] No seas cobarde Tom, es solo una foto");
				dial1.setText("[TRIX] Oye, tu no eres el que esta aqui abajo");
				aparecer(dial1, 1800);
				aparecer(dial2, 3600);
				apabot(james,6300);
				apabot(carl,6300);
				
			}
		});
		
		
		tranquilizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tranquilizar.setVisible(false);
				miedo.setVisible(false);
				respu.setText("[RETRO] Calmense todos, alli abajo hay que mantener la calma");
				dial1.setText("[CARL] Geacias por las palabras Retro");
				aparecer(dial1, 1800);
				aparecer(dial2, 3600);
				apabot(james,6300);
				apabot(carl,6300);
			}
		});
		
		james.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				james1 p1 = new james1();
				p1.setSize(499, 476);
				p1.setLocation(0, 0);
				panel.removeAll();
				panel.add(p1, BorderLayout.CENTER);
				panel.revalidate();
				panel.repaint();
			}
		});
		
		carl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				james1 p1 = new james1();
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
