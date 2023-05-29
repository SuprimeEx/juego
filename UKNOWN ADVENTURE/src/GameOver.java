import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

public class GameOver extends JPanel {

	/**
	 * Create the panel.
	 */
	public GameOver() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 499, 476);
		add(panel);
		panel.setLayout(null);
		
		JLabel FIN = new JLabel("GAME OVER");
		FIN.setFont(new Font("Tahoma", Font.PLAIN, 86));
		FIN.setBounds(10, 169, 479, 165);
		panel.add(FIN);

	}
}
