import javax.swing.JPanel;

import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;

public class parte3 extends JPanel {

	/**
	 * Create the panel.
	 */
	Timer oe = new Timer();
	public parte3() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 499, 476);
		add(panel);
		panel.setLayout(null);
		
		JLabel conversa = new JLabel("<html><p> [RETRO] Yo diría mas bien de gestión, desde la computadora puedo ver y registrar cada hallazgo, aunque la cinta solo será visible cuando corte la grabación, aunque si presionan ese botón verde tomaran una captura que si podre ver, así puedo guiarlos un poco mejor.<p>"
				+ "<p> [TRIX] Bien, mientras las capturas sean bien tomadas la grabación no será tan dispensable, aunque seria bueno poder ver como james llora al ver un ratón mutante.<p>"
				+ "	<p> [CARL] Jaja, pagaría por ver eso<p>"
				+ "<p> [JAMES] Púdranse.<p>");
		conversa.setBounds(10, 11, 479, 210);
		panel.add(conversa);
		
		JLabel conversa1 = new JLabel("");
		conversa1.setBounds(10, 211, 479, 225);
		panel.add(conversa1);
		
		JButton continuar = new JButton("Continuar");
		continuar.setBounds(400, 447, 89, 23);
		panel.add(continuar);
		continuar.setVisible(false);
		
		
		
		
		////////////////////////////////TIEMPO//////////////////////////////////////
		TimerTask dialogos=new TimerTask() {
			public void run() {
				conversa1.setText("<html>[RETRO] Dejando de lado eso, el software que diseñe interpreta las voces como comando de texto, algo así como lo que hacen los teléfonos que escriben cuando hablas, así tendrán un informe escrito y auditivo, además de que lo que hablen lo vere en la computadora escrito sin esa molesta interferencia de los radios<p>\r\n"
				+ "<p> [CARL] Bueno salgamos de una vez y buena suerte en la búsqueda de especímenes raros y Tom no olvides medir constantemente la radiación, no quiero que me de cáncer luego.<p>"
				+ "<p> [JAMES] Mirar por el lado bueno podrás decir que eres libra y cáncer.<p>"
				+ "<p> [CARL] Mejor calla y ponte el equipo, ya casi todos lo tenemos<p>"
				+ "\r\n"
				+ "");
			}
		};
		oe.schedule(dialogos, 2000);
		
		TimerTask re = new TimerTask() {
			public void run(){
				continuar.setVisible(true);
			}
		};
		oe.schedule(re, 5000);
		
		continuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				parte4 p1 = new parte4();
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
