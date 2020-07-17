package LoginGUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Facebook_Call.*;

import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class LoginScreen extends JFrame {

	private JPanel Login;
	private JTextField AccessToken;
	private String Token;
	private Vector<String> posts = new Vector<String>();
	private User_Profile nome = new User_Profile();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {					
					LoginScreen frame = new LoginScreen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// INSERISCI L'ACCESS TOKEN PER ENTRARE NEL MENU'
	public LoginScreen() {
		setTitle("LOGIN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		Login = new JPanel();
		Login.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Login);
		Login.setLayout(null);
		
		AccessToken = new JTextField();
		AccessToken.setFont(new Font("Tahoma", Font.PLAIN, 11));
		AccessToken.setBounds(30, 170, 372, 20);
		Login.add(AccessToken);
		AccessToken.setColumns(10);
		
		JButton btnNewButton = new JButton("Accedi");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Token= AccessToken.getText();
				try {
					Call call= new Call();
					nome=call.Leggi_Post(posts,Token);
					JOptionPane.showMessageDialog(null, "Benvenuto, " + nome.getUser_name() + ".");
					Menù window = new Menù();
					window.initialize(posts);
					window.frame.setVisible(true);
					
				}catch(Exception y) {
					JOptionPane.showMessageDialog(null, "Il token che hai messo non è valido. Riprovare.");
				}
			}
		});
		btnNewButton.setBackground(SystemColor.controlHighlight);
		btnNewButton.setBounds(170, 220, 89, 23);
		Login.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Inserisci l'access token");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(204, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(150, 125, 135, 14);
		Login.add(lblNewLabel);
		
		JLabel lbl1 = new JLabel("New label");
		Image sfondo = new ImageIcon(this.getClass().getResource("/SfondoAuth.png")).getImage();
		lbl1.setIcon(new ImageIcon(sfondo));
		lbl1.setBounds(0, 0, 434, 261);
		getContentPane().add(lbl1);
	}
}
