 

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Toolkit;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Font;
import java.awt.Component;
import javax.swing.SwingConstants;

public class Credits extends JFrame {

	private JPanel Jpanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Credits frame = new Credits();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Credits() {
		setTitle("Credits");
		setBackground(new Color(255, 0, 0));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 262, 271);
		Jpanel = new JPanel();
		Jpanel.setBackground(new Color(0, 0, 0));
		Jpanel.setBorder(new LineBorder(new Color(178, 34, 34), 5, true));
		setContentPane(Jpanel);
		Jpanel.setLayout(null);
		Jpanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Miguel Angel Villegas");
		lblNewLabel.setFont(new Font("DK Face Your Fears", Font.PLAIN, 20));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(36, 50, 177, 66);
		Jpanel.add(lblNewLabel);
		
		JLabel lblSantiagoCardosoVinasco = new JLabel("<html>Santiago Cardoso Vinasco");
		lblSantiagoCardosoVinasco.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSantiagoCardosoVinasco.setForeground(Color.WHITE);
		lblSantiagoCardosoVinasco.setFont(new Font("DK Face Your Fears", Font.PLAIN, 20));
		lblSantiagoCardosoVinasco.setBounds(10, 95, 215, 66);
		Jpanel.add(lblSantiagoCardosoVinasco);
		
		JLabel lblandresCamilo = new JLabel("<html>Andres Camilo Pescador\r\n");
		lblandresCamilo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblandresCamilo.setForeground(Color.WHITE);
		lblandresCamilo.setFont(new Font("DK Face Your Fears", Font.PLAIN, 20));
		lblandresCamilo.setBounds(20, 143, 193, 66);
		Jpanel.add(lblandresCamilo);
		
		JLabel lblNewLabel_1 = new JLabel("THE DEVELOPMENT TEAM");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Ghastly Panic", Font.PLAIN, 40));
		lblNewLabel_1.setBounds(26, 0, 210, 66);
		Jpanel.add(lblNewLabel_1);
		this.setLocationRelativeTo(null);
		
	}
}
