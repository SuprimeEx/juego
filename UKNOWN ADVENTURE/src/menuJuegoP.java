

import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.UIManager;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JToggleButton;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class menuJuegoP extends JFrame {

	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menuJuegoP frame = new menuJuegoP();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/* Funcion que genera el Icono del Jframe*/
	public Image getIconImage () {
		
	Image retValue=Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/Logo3.png"));
	return retValue;
	}
	
	/**
	 * Create the frame.
	 * 
	 */
	AudioClip playerMe;
	
	@SuppressWarnings("deprecation")
	public menuJuegoP() {
		setIconImage(getIconImage()); //Invocar funcion del icono
		playerMe=java.applet.Applet.newAudioClip(getClass().getResource("/musica/010794050_prev.wav"));
		playerMe.loop();
		
		setForeground(Color.BLACK);
		setTitle("UNKNOWN ADVENTURE");
		setFont(new Font("Bell MT", Font.PLAIN, 12));
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 700, 615);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("Credits");
		button.setBackground(new Color(0, 0, 0));
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
			AudioClip player;
			player=java.applet.Applet.newAudioClip(getClass().getResource("/musica/i-will-kill-you.wav"));
			player.play();
			playerMe.stop();
			}
		});
		button.setForeground(new Color(255, 0, 0));
		button.setFont(new Font("DK Face Your Fears", Font.PLAIN, 21));
		button.addActionListener(new ActionListener() {
			
			/*Boton de ventana credits*/
			public void actionPerformed(ActionEvent e) {
				Credits newframe = new Credits();
				
				newframe.setVisible(true);
			}
		});
		
		
		JButton btnPlay = new JButton("PLAY");
		btnPlay.setBackground(new Color(0, 0, 0));
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contenedor_principal m = new contenedor_principal();
				m.setVisible(true);
				dispose();
			}
		});
		
		
		JButton btnNewButton = new JButton("Exit");
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setForeground(new Color(255, 255, 224));
		btnNewButton.setFont(new Font("DK Face Your Fears", Font.PLAIN, 34));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				confirmarSalida();
			}
		});
		
		JLabel lblNewLabel = new JLabel("<html>un grupo de j\u00F3venes estudiantes de Biolog\u00EDa provenientes de una universidad en Ohio viajaron a Nevada para observar los da\u00F1os ambientales causados por el \u201CAtaque vietnamita\u201D y tambi\u00E9n para investigar acerca de un supuesto \u201Cexperimento\u201D que se dio en los alrededores de la base\u2026pero\u2026 \u00BFRealmente es un rumor?");
		lblNewLabel.setForeground(new Color(255, 255, 224));
		
		lblNewLabel.setFont(new Font("Papyrus", Font.PLAIN, 14));
		lblNewLabel.setBounds(41, 316, 253, 249);
		contentPane.add(lblNewLabel);
		btnNewButton.setBounds(40, 128, 152, 53);
		contentPane.add(btnNewButton);
		btnPlay.setForeground(new Color(255, 0, 0));
		btnPlay.setFont(new Font("DK Face Your Fears", Font.PLAIN, 33));
		btnPlay.setBounds(40, 46, 152, 53);
		contentPane.add(btnPlay);
		button.setBounds(576, 537, 98, 28);
		contentPane.add(button);
		
		JLabel ImagenMenu = new JLabel("");
		ImagenMenu.setBackground(Color.RED);
		ImagenMenu.setIcon(new ImageIcon(menuJuegoP.class.getResource("/Imagenes/Imagen menu juego.jpg")));
		ImagenMenu.setBounds(0, 0, 684, 576);
		contentPane.add(ImagenMenu);
		this.setLocationRelativeTo(null);
		}

	/*Metodo para confirmar la salida*/
	public void confirmarSalida() {
		int valor=JOptionPane.showConfirmDialog(this, "Estas seguro de cerrar la Aplicacion","Advertencia",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
		if(valor==JOptionPane.YES_OPTION) {
			JOptionPane.showConfirmDialog(null,"Gracias por su visita Unknown, hasta pronto","Developers",JOptionPane.WARNING_MESSAGE,JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);		
	}
	}
}