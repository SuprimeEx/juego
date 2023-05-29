import javax.swing.JPanel;

import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class carl1 extends JPanel {

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
	
	public carl1() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 499, 476);
		add(panel);
		panel.setLayout(null);
		
		JLabel respu = new JLabel("[RETRO] Mejor vamos a la fija por el camino que vio Carl");
		respu.setBounds(10, 11, 479, 27);
		panel.add(respu);
		
		JLabel dial = new JLabel("<html>[CARL] Uff menudo aroma<p>"
				+ "<p>[JAMES] Yo no fui<p>"
				+ "<p>[TOM] Oigan..eso es..<p>");
		dial.setBounds(10, 47, 479, 81);
		panel.add(dial);
		
		JButton salva = new JButton("¡SALGAN!");
		salva.setBounds(303, 139, 89, 23);
		panel.add(salva);
		
		JButton muerte = new JButton("Indagar");
		muerte.setBounds(400, 139, 89, 23);
		panel.add(muerte);
		
		JLabel resp1 = new JLabel("");
		resp1.setBounds(10, 143, 479, 27);
		panel.add(resp1);
		
		JLabel muertee = new JLabel("<html> [TRIX] Claro por que no<p>"
				+ "<p>[JAMES] Oigan que mi¡erdaa!...<p>"
				+ "<p>[CARL] (**GRUÑIDOS**)<p>"
				+ "<p>[TRIX] (**SONIDO DE GOTAS**)<p>"
				+ "<p>[JAMES] Aaaaaaaaaaaaaaggggg (**DESGARRO**)<p>"
				+ "<p>[TOM] Ree..retro es..es");
		muertee.setBounds(10, 173, 479, 188);
		panel.add(muertee);
		
		JButton corre = new JButton("¡¡¡¡correee!!!");
		corre.setBounds(184, 371, 134, 23);
		panel.add(corre);
		
		JLabel sal = new JLabel("[RETRO] ¡SOLO CORRE!");
		sal.setBounds(10, 373, 479, 19);
		panel.add(sal);
		
		JButton fin = new JButton("¿fin?");
		fin.setBounds(215, 423, 89, 23);
		panel.add(fin);
		
		JLabel vida = new JLabel("<html>[TOM] Tienes razon, mejor vamonos<p>"
				+ "<p>[JAMES] Alli hay algoo, mierda creo que se mueve<p>"
				+ "<p>[CARL] Retro enciente el furgon vamos corriendo, tambien vi que algo se movio<p>");
		vida.setBounds(10, 167, 479, 105);
		panel.add(vida);
		
		sal.setVisible(false);
		muertee.setVisible(false);
		dial.setVisible(false);
		muerte.setVisible(false);
		salva.setVisible(false);
		corre.setVisible(false);
		fin.setVisible(false);
		vida.setVisible(false);
		
		///////////////////////////////////////////TIEMPOS/////////////////////////////////////////////
		aparecer(dial,1800);
		apabot(muerte,3600);
		apabot(salva,3600);
		
	
		
		
		
		///////////////////////////////////////////////////////////////////////////////////////////////////
		salva.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				muerte.setVisible(false);
				salva.setVisible(false);
				resp1.setText("[RETRO] Mierda, ¡Váyanse ahora!, esto ya me dio mala espina");
				aparecer(vida,1800);
				apabot(fin, 3600);
			}
		});
		
		muerte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				muerte.setVisible(false);
				salva.setVisible(false);
				resp1.setText("[RETRO] ¿Pueden acercarce un poco?");
				aparecer(muertee,3600);
				apabot(corre,7200);
			}
		});
		
		corre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sal.setVisible(true);
				corre.setVisible(false);
				apabot(fin,3600);
			}
		});
		
		fin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "¿Realmente termino? ¿Que fue lo que paso?");
			}
		});
		
	}
}
