package LoginGUI;

import Salva_File.*;
import Statistiche.*;

import java.awt.Image;
import java.util.Vector;
import javax.swing.JList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;

public class Menù {

	public JFrame frame;;
	public int[] posts_l;
		
	public void initialize(Vector<String> posts) {		
		frame = new JFrame();
		frame.setTitle("Menù");
		frame.getContentPane().setBackground(new Color(51, 51, 153));
		frame.getContentPane().setFont(new Font("Arial", Font.ITALIC, 14));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		// SALVA LISTA DI TUTTI I POST SU FILE
		JButton btnNewButton = new JButton("Salva Post su File");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Writer file = new Writer();
				file.Scrivi_File(posts);
				JOptionPane.showMessageDialog(null, "Il file è stato scritto e salvato sul percorso scelto.");				
			}
		});
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(127, 255, 0));
		btnNewButton.setBounds(145, 227, 154, 23);
		frame.getContentPane().add(btnNewButton);
		
		// MEDIA LUNGHEZZA POST
		JButton btnNewButton_1 = new JButton("Media della lunghezza dei post");
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Lunghezza l= new Lunghezza();
				posts_l=l.lunghezza(posts);
				int media=l.media(posts_l);
				JOptionPane.showMessageDialog(null, "La media della lunghezza di tutti i post è di " + media + " caratteri.");
			}
		});
		btnNewButton_1.setBounds(100, 11, 237, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		// POST PIU' LUNGO
		JButton btnNewButton_2 = new JButton("Visualizza lunghezza post pi\u00F9 lungo");
		btnNewButton_2.setForeground(Color.BLACK);
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setForeground(new Color(0, 0, 0));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Lunghezza l= new Lunghezza();
				posts_l=l.lunghezza(posts);
				int max=l.massimo(posts_l);
				JOptionPane.showMessageDialog(null, "Il post con più caratteri ne ha " + max + ".");
			}
		});
		btnNewButton_2.setBounds(100, 45, 237, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		// POST PIU' CORTO
		JButton btnNewButton_3 = new JButton("Visualizza lunghezza post pi\u00F9 corto");
		btnNewButton_3.setForeground(Color.BLACK);
		btnNewButton_3.setBackground(Color.WHITE);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Lunghezza l= new Lunghezza();
				posts_l=l.lunghezza(posts);
				int min=l.minimo(posts_l);
				JOptionPane.showMessageDialog(null, "Il post con meno caratteri ne ha " + min + ".");
			}
		});
		btnNewButton_3.setBounds(100, 79, 237, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		// VISUALIZZA GLI HASHTAGS PRESENTI NEI POSTS
		JButton btnNewButton_4 = new JButton("Visualizza Post con hashtags");
		btnNewButton_4.setForeground(Color.BLACK);
		btnNewButton_4.setBackground(Color.WHITE);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Hashtags H = new Hashtags();
				int num=H.hashtag(posts);
				JList<String> HT = new JList<>(new Vector<>(H.getHT()));
				if(num==0) JOptionPane.showMessageDialog(null, "Non ci sono hashtags nei post analizzati.");
				else JOptionPane.showMessageDialog(null, new JScrollPane(HT), "Lista Post con hashtags:", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnNewButton_4.setBounds(100, 147, 237, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		// LISTA DEI POSTS SCRITTI SOLO IN MAIUSCOLO
		JButton btnNewButton_5 = new JButton("Visualizza Post solo in maiuscolo");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SoloMaiuscoli M = new SoloMaiuscoli();
				M.Maiuscolo(posts);
				JList<String> PM = new JList<>(new Vector<>(M.getM()));
				JOptionPane.showMessageDialog(null, new JScrollPane(PM),"Lista Post solo in maiuscolo",JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnNewButton_5.setForeground(Color.BLACK);
		btnNewButton_5.setBackground(Color.WHITE);
		btnNewButton_5.setBounds(100, 113, 237, 23);
		frame.getContentPane().add(btnNewButton_5);
		
		
		// LOGO FACEBOOK
		JLabel lbl = new JLabel();
		Image logo = new ImageIcon(this.getClass().getResource("/Icona.png")).getImage();
		lbl.setIcon(new ImageIcon(logo));
		lbl.setBounds(360, 186, 64, 64);
		frame.getContentPane().add(lbl);
		
		// SFONDO FACEBOOK
		JLabel lbl1 = new JLabel("New label");
		Image sfondo = new ImageIcon(this.getClass().getResource("/Sfondo.png")).getImage();
		lbl1.setIcon(new ImageIcon(sfondo));
		lbl1.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(lbl1);
		
	}
}

