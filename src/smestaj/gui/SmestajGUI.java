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
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JScrollPane;

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
	private JButton returnV;
	private JLabel lblHoteli;
	private JLabel lblApartmani_1;
	private JLabel lblVile_1;
	private JList listaHotela;
	private JButton AddHoteli;
	private JButton removeHoteli;
	private JButton PronadjiHotel;
	private JTextField textHotel;
	private JScrollPane scrollPaneHotel;
	private JList listaApartmana;
	private JButton removeApartman;
	private JButton addApartman;
	private JButton PronadjiApartman;
	private JTextField textApartman;
	private JScrollPane scrollPaneApartman;
	private JList listaVila;
	private JButton removeVila;
	private JButton addVila;
	private JButton pronadjiVilu;
	private JTextField textVila;
	private JScrollPane scrollPaneVila;

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
			HoteliPanel.add(getListaHotela());
			HoteliPanel.add(getAddHoteli());
			HoteliPanel.add(getRemoveHoteli());
			HoteliPanel.add(getPronadjiHotel());
			HoteliPanel.add(getTextHotel());
			HoteliPanel.add(getScrollPaneHotel());
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
			ApartmaniPanel.add(getListaApartmana());
			ApartmaniPanel.add(getRemoveApartman());
			ApartmaniPanel.add(getAddApartman());
			ApartmaniPanel.add(getPronadjiApartman());
			ApartmaniPanel.add(getTextApartman());
			ApartmaniPanel.add(getScrollPaneApartman());
			ApartmaniPanel.setVisible(false);
		}
		return ApartmaniPanel;
	}
	private JPanel getVilePanel() {
		if (VilePanel == null) {
			VilePanel = new JPanel();
			VilePanel.setBackground(new Color(0, 0, 102));
			VilePanel.setLayout(null);
			VilePanel.add(getReturnV());
			VilePanel.add(getLblVile_1());
			VilePanel.add(getListaVila());
			VilePanel.add(getRemoveVila());
			VilePanel.add(getAddVila());
			VilePanel.add(getPronadjiVilu());
			VilePanel.add(getTextVila());
			VilePanel.add(getScrollPaneVila());
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
	private JButton getReturnV() {
		if (returnV == null) {
			returnV = new JButton("");
			returnV.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					VilePanel.setVisible(false);
					CentarPanel.setVisible(true);
				}
			});
			returnV.setIcon(new ImageIcon(SmestajGUI.class.getResource("/com/sun/javafx/scene/control/skin/caspian/fxvk-backspace-button.png")));
			returnV.setBounds(10, 10, 36, 35);
		}
		return returnV;
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
	private JList getListaHotela() {
		if (listaHotela == null) {
			listaHotela = new JList();
			listaHotela.setBounds(10, 109, 181, 221);
		}
		return listaHotela;
	}
	private JButton getAddHoteli() {
		if (AddHoteli == null) {
			AddHoteli = new JButton("");
			AddHoteli.setIcon(new ImageIcon("D:\\workspace\\Smestaj\\src\\smestaj\\gui\\add_service.gif"));
			AddHoteli.setBounds(201, 247, 39, 35);
		}
		return AddHoteli;
	}
	private JButton getRemoveHoteli() {
		if (removeHoteli == null) {
			removeHoteli = new JButton("");
			removeHoteli.setIcon(new ImageIcon("D:\\workspace\\Smestaj\\src\\smestaj\\gui\\Remove.gif"));
			removeHoteli.setBounds(201, 293, 39, 35);
		}
		return removeHoteli;
	}
	private JButton getPronadjiHotel() {
		if (PronadjiHotel == null) {
			PronadjiHotel = new JButton("");
			PronadjiHotel.setIcon(new ImageIcon("D:\\workspace\\Smestaj\\src\\smestaj\\gui\\search.gif"));
			PronadjiHotel.setBounds(201, 70, 39, 28);
		}
		return PronadjiHotel;
	}
	private JTextField getTextHotel() {
		if (textHotel == null) {
			textHotel = new JTextField();
			textHotel.setToolTipText("");
			textHotel.setText("Prona\u0111i hotel...");
			textHotel.setBounds(10, 70, 181, 28);
			textHotel.setColumns(10);
		}
		return textHotel;
	}
	private JScrollPane getScrollPaneHotel() {
		if (scrollPaneHotel == null) {
			scrollPaneHotel = new JScrollPane();
			scrollPaneHotel.setBounds(318, 70, 203, 260);
		}
		return scrollPaneHotel;
	}
	private JList getListaApartmana() {
		if (listaApartmana == null) {
			listaApartmana = new JList();
			listaApartmana.setBounds(10, 109, 181, 221);
		}
		return listaApartmana;
	}
	private JButton getRemoveApartman() {
		if (removeApartman == null) {
			removeApartman = new JButton("");
			removeApartman.setIcon(new ImageIcon("D:\\workspace\\Smestaj\\src\\smestaj\\gui\\Remove.gif"));
			removeApartman.setBounds(201, 295, 39, 35);
		}
		return removeApartman;
	}
	private JButton getAddApartman() {
		if (addApartman == null) {
			addApartman = new JButton("");
			addApartman.setIcon(new ImageIcon("D:\\workspace\\Smestaj\\src\\smestaj\\gui\\add_service.gif"));
			addApartman.setBounds(201, 249, 39, 35);
		}
		return addApartman;
	}
	private JButton getPronadjiApartman() {
		if (PronadjiApartman == null) {
			PronadjiApartman = new JButton("");
			PronadjiApartman.setIcon(new ImageIcon("D:\\workspace\\Smestaj\\src\\smestaj\\gui\\search.gif"));
			PronadjiApartman.setBounds(201, 69, 39, 28);
		}
		return PronadjiApartman;
	}
	private JTextField getTextApartman() {
		if (textApartman == null) {
			textApartman = new JTextField();
			textApartman.setText("Prona\u0111i apartman...");
			textApartman.setColumns(10);
			textApartman.setBounds(10, 69, 181, 28);
		}
		return textApartman;
	}
	private JScrollPane getScrollPaneApartman() {
		if (scrollPaneApartman == null) {
			scrollPaneApartman = new JScrollPane();
			scrollPaneApartman.setBounds(318, 70, 203, 260);
		}
		return scrollPaneApartman;
	}
	private JList getListaVila() {
		if (listaVila == null) {
			listaVila = new JList();
			listaVila.setBounds(10, 110, 181, 221);
		}
		return listaVila;
	}
	private JButton getRemoveVila() {
		if (removeVila == null) {
			removeVila = new JButton("");
			removeVila.setIcon(new ImageIcon("D:\\workspace\\Smestaj\\src\\smestaj\\gui\\Remove.gif"));
			removeVila.setBounds(201, 296, 39, 35);
		}
		return removeVila;
	}
	private JButton getAddVila() {
		if (addVila == null) {
			addVila = new JButton("");
			addVila.setIcon(new ImageIcon("D:\\workspace\\Smestaj\\src\\smestaj\\gui\\add_service.gif"));
			addVila.setBounds(201, 250, 39, 35);
		}
		return addVila;
	}
	private JButton getPronadjiVilu() {
		if (pronadjiVilu == null) {
			pronadjiVilu = new JButton("");
			pronadjiVilu.setIcon(new ImageIcon("D:\\workspace\\Smestaj\\src\\smestaj\\gui\\search.gif"));
			pronadjiVilu.setBounds(201, 70, 39, 28);
		}
		return pronadjiVilu;
	}
	private JTextField getTextVila() {
		if (textVila == null) {
			textVila = new JTextField();
			textVila.setText("Prona\u0111i vilu...");
			textVila.setColumns(10);
			textVila.setBounds(10, 70, 181, 28);
		}
		return textVila;
	}
	private JScrollPane getScrollPaneVila() {
		if (scrollPaneVila == null) {
			scrollPaneVila = new JScrollPane();
			scrollPaneVila.setBounds(318, 71, 203, 260);
		}
		return scrollPaneVila;
	}
}
