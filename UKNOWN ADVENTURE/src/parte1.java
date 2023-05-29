import java.awt.BorderLayout;
import java.awt.Font;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.border.BevelBorder;

public class parte1 extends JPanel {

	/**
	 * Create the panel.
	 */
	Timer oe = new Timer();
	public parte1() {
		setLayout(null);
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 499, 476);
		add(panel);
		panel.setLayout(null);
		
	
		JLabel intro = new JLabel("<html>Eres un/una estudiante de ingeniera en su ultima etapa, tu ingenio y creatividad son tan peculiares que "
				+ "te hacen uno e los mejores en su facultad… Un día cuatro alumnos de biología te proponen unirte a ellos a forma de trabajo de "
				+ "grado; Su propuesta es que tu fabricas un equipo para documentar y monitorear el movimiento de cada uno de los miembros y les"
				+ " brindas guía remotamente, y ellos exploran y recolectan pruebas y residuos de la zona para analizarlas mejor en el laboratorio "
				+ "además de adentrarse en la ya abandonada base….");
		intro.setBounds(10, 0, 468, 127);
		panel.add(intro);
		JLabel Dialogo1 = new JLabel("<html><p>[CARL] ¿Y entonces por que te llaman retro?<p>"
				+ "<p>[RETRO] Este…es más por mi gusto a la tecnología antigua, aunque otros dicen que es por mi ingenio<p>"
				+ "<p>[JAMES] ¡JA ¡que genial bro, pero, ¿en cuanto a la nuestra idea?<p>"
				+ "<p>[RETRO] ¿Si acepto ir a un lugar olvidado por Dios?<p>"
				+ "<p>[TRIX] Si lo dices así suena raro, aunque si es cierto.<p>"
				+ "");
		Dialogo1.setBounds(10, 123, 468, 155);
		panel.add(Dialogo1);
		
		////////////////////////Opsiones///////////////////////////////
		JButton no = new JButton("NO");
		no.setBounds(389, 300, 89, 17);
		panel.add(no);
		
		JButton si = new JButton("¡¡Por supuesto!!");
		si.setBounds(253, 300, 136, 17);
		panel.add(si);
		
		JLabel positivo = new JLabel("");
		positivo.setVerticalAlignment(SwingConstants.TOP);
		positivo.setBounds(10, 291, 466, 84);
		panel.add(positivo);
		
		JLabel respuesta = new JLabel("");
		respuesta.setBounds(10, 328, 466, 126);
		panel.add(respuesta);
		
		JLabel texto2 = new JLabel("");
		texto2.setBounds(10, 289, 466, 71);
		panel.add(texto2);
		
		JButton continua = new JButton("continuar");
		continua.setBounds(410, 453, 89, 23);
		panel.add(continua);
		continua.setVisible(false);

		/////////////////////deciciones///////////////////////////
		si.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				positivo.setText("<html>[RETRO] ¡¡Por supuesto que voy!!, como voy a perderme un pase para a observar el lugar donde se rumora lo de Abigail");
				no.setVisible(false);
				si.setVisible(false);
				TimerTask tarea= new TimerTask() {
					public void run() {
						respuesta.setText("<html>[JAMES] Sabia que dirias eso jaja, por eso les dije que te contaramos<p>"
								+ "<p>[TRIX] ¿Enserio creen que haya pasado lo de Abigail?<p>"
								+ "<p>[CARL] Tal vez, recuer..<p>"
								+ "<p>[TOM] !!Oigan¡¡, ya habra tiempo para hablar sobre teorias conspiranoicas luego, oye ¿te molesta que te llamemos retro o quieres que te llamemos por tu nombre?<p>"
								+ "");
						continua.setVisible(true);
						
					}//Fin del run	
					
				};//Fin del timetask
				oe.schedule(tarea, 900);
			} 	 
		});
		
		no.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				no.setVisible(false);
				si.setVisible(false);
				positivo.setText("<html>[RETRO] No gracias, suena interesante pero tambi�n peligroso entrar a una base abandonada y destruida por un ataque vietnamita que fue hace relativamente poco, asi que tomare otros proyectos, gracias igualmente por la oferta.");
				//Se encarga de mostrar el mensaje despues de x tiempo
				TimerTask tarea= new TimerTask() {
					public void run() {
						respuesta.setText("<html>[JAMES] Ohh vamos eres la persona ideal para esto.<p>\r\n"
								+ "<p>[CARL] Oye calma james, puede que tenga razon, nosotros deberiamos replantearlo tambien.\r\n"
								+ "");
					}
				};//Fin del timertask
				//El tiempo esta dado en milisegundos
				oe.schedule(tarea, 900);
				TimerTask tiempo=new TimerTask() {
					public void run() {
						JOptionPane.showMessageDialog(null, "Final basico hecho. Gracias por jugar");	
					}
				};
				oe.schedule(tiempo, 1800);
			}
		});
		
		continua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				parte2 p1 = new parte2();
				p1.setSize(499, 476);
				p1.setLocation(0, 0);
				panel.removeAll();
				panel.add(p1, BorderLayout.CENTER);
				panel.revalidate();
				panel.repaint();
				continua.setVisible(false);
			}
		});
	
	/////////////////////////////////////////////////////////////////////////////////////////////
		
	}//Funcion principal
}
