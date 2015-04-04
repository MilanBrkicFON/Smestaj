package smestaj.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Color;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import net.miginfocom.swing.MigLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JMenuItem;
import java.awt.CardLayout;
import java.awt.Component;

public class SmestajGUI extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenu mnEdit;
	private JPanel CentarPanel;
	private JButton Hoteli;
	private JButton Apartmani;
	private JButton button;
	private JLabel lblNewLabel;
	private JLabel lblApartmani;
	private JLabel lblVile;
	private JLabel lblNewLabel_1;
	private JMenu mnHelp;
	private JMenuItem mntmAbout;
	private JPanel HoteliPanel;
	private JPanel ApartmaniPanel;
	private JPanel VilePanel;
	private JButton ReturnH;
	private JButton returnA;
	private JButton button_1;
	private JLabel lblHoteli;
	private JLabel lblApartmani_1;
	private JLabel lblVile_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SmestajGUI frame = new SmestajGUI();
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
	public SmestajGUI() {
		setResizable(false);
		setLocationByPlatform(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 543, 396);
		setJMenuBar(getMenuBar_1());
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		contentPane.add(getCentarPanel(), "name_92324294951478");
		contentPane.add(getHoteliPanel(), "name_92324320591801");
		contentPane.add(getApartmaniPanel(), "name_92324338504552");
		contentPane.add(getVilePanel(), "name_92324351999458");
	}

	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMnFile());
			menuBar.add(getMnEdit());
			menuBar.add(getMnHelp());
		}
		return menuBar;
	}
	private JMenu getMnFile() {
		if (mnFile == null) {
			mnFile = new JMenu("File");
		}
		return mnFile;
	}
	private JMenu getMnEdit() {
		if (mnEdit == null) {
			mnEdit = new JMenu("Edit");
		}
		return mnEdit;
	}
	private JPanel getCentarPanel() {
		if (CentarPanel == null) {
			CentarPanel = new JPanel();
			CentarPanel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			CentarPanel.setBackground(new Color(123, 104, 238));
			CentarPanel.setForeground(new Color(123, 104, 238));
			CentarPanel.setLayout(null);
			CentarPanel.add(getHoteli());
			CentarPanel.add(getApartmani());
			CentarPanel.add(getButton());
			CentarPanel.add(getLblNewLabel());
			CentarPanel.add(getLblApartmani());
			CentarPanel.add(getLblVile());
			CentarPanel.add(getLblNewLabel_1());
		}
		return CentarPanel;
	}
	private JButton getHoteli() {
		if (Hoteli == null) {
			Hoteli = new JButton("Hoteli");
			Hoteli.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
			Hoteli.setVerticalAlignment(SwingConstants.BOTTOM);
			Hoteli.setIcon(new ImageIcon("D:\\workspace\\Smestaj\\src\\smestaj\\gui\\hotels.png"));
			Hoteli.setBounds(10, 94, 158, 163);
			Hoteli.setBackground(new Color(255, 255, 255));
			Hoteli.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					HoteliPanel.setVisible(true);
					CentarPanel.setVisible(false);
				}
			});
		}
		return Hoteli;
	}
	private JButton getApartmani() {
		if (Apartmani == null) {
			Apartmani = new JButton("");
			Apartmani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ApartmaniPanel.setVisible(true);
					CentarPanel.setVisible(false);
				}
			});
			Apartmani.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
			Apartmani.setBackground(new Color(255, 222, 173));
			Apartmani.setIcon(new ImageIcon("D:\\workspace\\Smestaj\\src\\smestaj\\gui\\House-icon.jpg"));
			Apartmani.setBounds(174, 94, 158, 163);
		}
		return Apartmani;
	}
	private JButton getButton() {
		if (button == null) {
			button = new JButton("");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					VilePanel.setVisible(true);
					CentarPanel.setVisible(false);
				}
			});
			button.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
			button.setForeground(new Color(255, 255, 255));
			button.setIcon(new ImageIcon("D:\\workspace\\Smestaj\\src\\smestaj\\gui\\1522521_orig.gif"));
			button.setBackground(new Color(255, 255, 255));
			button.setBounds(338, 94, 158, 163);
		}
		return button;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Hoteli");
			lblNewLabel.setBackground(new Color(255, 222, 173));
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setFont(new Font("Lucida Handwriting", Font.BOLD | Font.ITALIC, 18));
			lblNewLabel.setBounds(10, 261, 158, 32);
		}
		return lblNewLabel;
	}
	private JLabel getLblApartmani() {
		if (lblApartmani == null) {
			lblApartmani = new JLabel("Apartmani");
			lblApartmani.setHorizontalAlignment(SwingConstants.CENTER);
			lblApartmani.setFont(new Font("Lucida Handwriting", Font.BOLD | Font.ITALIC, 18));
			lblApartmani.setBackground(new Color(255, 222, 173));
			lblApartmani.setBounds(174, 261, 158, 32);
		}
		return lblApartmani;
	}
	private JLabel getLblVile() {
		if (lblVile == null) {
			lblVile = new JLabel("Vile");
			lblVile.setHorizontalAlignment(SwingConstants.CENTER);
			lblVile.setFont(new Font("Lucida Handwriting", Font.BOLD | Font.ITALIC, 18));
			lblVile.setBackground(new Color(255, 222, 173));
			lblVile.setBounds(338, 261, 158, 32);
		}
		return lblVile;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Pretrazivanje Smestaja");
			lblNewLabel_1.setFont(new Font("Lucida Handwriting", Font.BOLD | Font.ITALIC, 24));
			lblNewLabel_1.setBounds(96, 30, 357, 32);
		}
		return lblNewLabel_1;
	}
	private JMenu getMnHelp() {
		if (mnHelp == null) {
			mnHelp = new JMenu("Help");
			mnHelp.add(getMntmAbout());
		}
		return mnHelp;
	}
	private JMenuItem getMntmAbout() {
		if (mntmAbout == null) {
			mntmAbout = new JMenuItem("About");
		}
		return mntmAbout;
	}
	private JPanel getHoteliPanel() {
		if (HoteliPanel == null) {
			HoteliPanel = new JPanel();
			HoteliPanel.setBackground(new Color(0, 0, 102));
			HoteliPanel.setLayout(null);
			HoteliPanel.add(getReturnH());
			HoteliPanel.add(getLblHoteli());
			HoteliPanel.setVisible(false);
		}
		return HoteliPanel;
	}
	private JPanel getApartmaniPanel() {
		if (ApartmaniPanel == null) {
			ApartmaniPanel = new JPanel();
			ApartmaniPanel.setBackground(new Color(0, 0, 102));
			ApartmaniPanel.setLayout(null);
			ApartmaniPanel.add(getReturnA());
			ApartmaniPanel.add(getLblApartmani_1());
			ApartmaniPanel.setVisible(false);
		}
		return ApartmaniPanel;
	}
	private JPanel getVilePanel() {
		if (VilePanel == null) {
			VilePanel = new JPanel();
			VilePanel.setBackground(new Color(0, 0, 102));
			VilePanel.setLayout(null);
			VilePanel.add(getButton_1());
			VilePanel.add(getLblVile_1());
			VilePanel.setVisible(false);
		}
		return VilePanel;
	}
	private JButton getReturnH() {
		if (ReturnH == null) {
			ReturnH = new JButton("");
			ReturnH.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					HoteliPanel.setVisible(false);
					CentarPanel.setVisible(true);
				}
			});
			ReturnH.setIcon(new ImageIcon(SmestajGUI.class.getResource("/com/sun/javafx/scene/control/skin/caspian/fxvk-backspace-button.png")));
			ReturnH.setBounds(10, 11, 39, 35);
		}
		return ReturnH;
	}
	private JButton getReturnA() {
		if (returnA == null) {
			returnA = new JButton("");
			returnA.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ApartmaniPanel.setVisible(false);
					CentarPanel.setVisible(true);
				}
			});
			returnA.setIcon(new ImageIcon(SmestajGUI.class.getResource("/com/sun/javafx/scene/control/skin/caspian/fxvk-backspace-button.png")));
			returnA.setBounds(10, 10, 36, 35);
		}
		return returnA;
	}
	private JButton getButton_1() {
		if (button_1 == null) {
			button_1 = new JButton("");
			button_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					VilePanel.setVisible(false);
					CentarPanel.setVisible(true);
				}
			});
			button_1.setIcon(new ImageIcon(SmestajGUI.class.getResource("/com/sun/javafx/scene/control/skin/caspian/fxvk-backspace-button.png")));
			button_1.setBounds(10, 10, 36, 35);
		}
		return button_1;
	}
	private JLabel getLblHoteli() {
		if (lblHoteli == null) {
			lblHoteli = new JLabel("Hoteli");
			lblHoteli.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblHoteli.setAlignmentY(Component.BOTTOM_ALIGNMENT);
			lblHoteli.setForeground(new Color(255, 255, 255));
			lblHoteli.setFont(new Font("Lucida Handwriting", Font.BOLD | Font.ITALIC, 23));
			lblHoteli.setBounds(133, 11, 181, 35);
		}
		return lblHoteli;
	}
	private JLabel getLblApartmani_1() {
		if (lblApartmani_1 == null) {
			lblApartmani_1 = new JLabel("Apartmani");
			lblApartmani_1.setForeground(Color.WHITE);
			lblApartmani_1.setFont(new Font("Lucida Handwriting", Font.BOLD | Font.ITALIC, 23));
			lblApartmani_1.setAlignmentY(1.0f);
			lblApartmani_1.setBounds(124, 10, 197, 35);
		}
		return lblApartmani_1;
	}
	private JLabel getLblVile_1() {
		if (lblVile_1 == null) {
			lblVile_1 = new JLabel("Vile");
			lblVile_1.setVerticalTextPosition(SwingConstants.BOTTOM);
			lblVile_1.setForeground(Color.WHITE);
			lblVile_1.setFont(new Font("Lucida Handwriting", Font.BOLD | Font.ITALIC, 23));
			lblVile_1.setAlignmentY(1.0f);
			lblVile_1.setBounds(124, 10, 181, 35);
		}
		return lblVile_1;
	}
}
