import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;

public class parte2 extends JPanel {

	/**
	 * Create the panel.
	 */
	Timer oe = new Timer();
	public parte2() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 499, 476);
		add(panel);
		panel.setLayout(null);
		
		JLabel historia = new JLabel("<html>[RETRO] Retro esta bien, bueno ya esta el equipo ahora creo que debemos hablar en los altos cargos para solicitar un prestamos, lo que me piden armar no se financia con cariño<p>"
				+ "<p>[CARL] Si tienes razón déjanos eso a nosotros te llamaremos cuanto ya esté listo<p>"
				+ "<p>[TOM] Mientras, los otros deberíamos prepararnos para el viaje, no va ser nada corto<p>"
				+ "<p>[TRIX] Confirmo."
				+ "");
		historia.setBounds(10, 0, 479, 173);
		panel.add(historia);
		JLabel hist2 = new JLabel("");
		hist2.setBounds(10, 177, 466, 173);
		panel.add(hist2);
		
		JLabel Dialogos = new JLabel("");
		Dialogos.setBounds(10, 347, 466, 75);
		panel.add(Dialogos);
		
		JButton continuar = new JButton("continuar");
		continuar.setBounds(387, 442, 89, 23);
		panel.add(continuar);
		continuar.setVisible(false);
		TimerTask tarea= new TimerTask() {
			public void run() {
				hist2.setText("<html>6 meses después… Tras tan arduo trabajo por parte de todos, al fin llego el momento de salir, james tenia una furgón en el \"\r\n"
						+ "cual montaron el equipo para documentar todo, los equipos fabricado por retro resultaron bastante efectivos en las pruebas \"\r\n"
						+ "de campo: El equipo consistía de radios de alta frecuencia caseros con un software interno que interpretaba la voz en forma de \"\r\n"
						+ "texto, esto para que retro pudiera saber mejor lo que hablaban sin la molesta interferencia que suelen tener, también contaba \"\r\n"
						+ "con cámaras de lentes para que se pudiera ver exactamente lo mismo que quien las traía, así mientras retro se cerciora de que \"\r\n"
						+ "todo esté funcionando correctamente desde el furgón, podría también observar lo que ven James, Carl, Trix y Tom.");
		}
		};//Fin del timertask
		//El tiempo esta dado en milisegundos
		oe.schedule(tarea, 1000);
		
		TimerTask dialogos=new TimerTask() {
			public void run() {
				Dialogos.setText("<html><p>[TOM] Bueno, aquí estamos señores. <p>"
				+ "<p> [JAMES] Si, que bien que este viejo furgón sirva como sala de vigilancia<p>");
			}
		};
		oe.schedule(dialogos, 2000);
		
		TimerTask boto=new TimerTask() {
			public void run() {
				continuar.setVisible(true);
			}
		};
		oe.schedule(boto, 4000);
		
		
		
		
		///////////////////////////////////BOTONES//////////////////////////
		continuar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				parte3 p1 = new parte3();
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
