import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginFrame extends JFrame implements ActionListener {
	private JTextField useridField;
	private JPasswordField passwordField;
	JFrame nextFrame;
	
	public LoginFrame() {
		setSize(300, 400);
		setDefaultCloseOperation (EXIT_ON_CLOSE);
		
		setLayout (new GridLayout(3, 1));
		
		useridField = new JTextField();
		useridField.setEditable(true);
		passwordField = new JPasswordField(20);
		passwordField.setEditable(true);
		
		JButton loginButton = new JButton("Login");
		loginButton.addActionListener(this);
		
		add(useridField);
		add(passwordField);
		add(loginButton);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (checkCredentials()) {
			nextFrame = new CalcFrame();
		}
	}
	
	private boolean checkCredentials() {
		final String userid = useridField.getText().trim();
		final String password = passwordField.getText().trim();
		return (userid.equals("a") && password.equals("b"));
	}
	
	public static void main(String[] args) {
		JFrame loginFrame = new LoginFrame();
	}

}
