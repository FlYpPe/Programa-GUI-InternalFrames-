import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

class GUI extends JFrame{
	
	JMenuBar menuBar;
	JMenu nasters, booking, testPerform, printing, transaccion, laoReports, sentings, Utilities, window, help;
	JInternalFrame IF_1, IF_2, IF_3;
	
	JPanel panel1, panel2, panel3;
	public GUI() {
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("InternalFrames");
		setSize(1000, 800);
		setLocationRelativeTo(null);
		setVisible(true);
		
		menuBar = new JMenuBar();
		nasters = new JMenu("nasters");
		menuBar.add(nasters);
		booking = new JMenu("booking");
		menuBar.add(booking);
		testPerform = new JMenu("testPerform");
		menuBar.add(testPerform);
		printing = new JMenu("printing");
		menuBar.add(printing);
		transaccion = new JMenu("transaccion");
		menuBar.add(transaccion);
		laoReports = new JMenu("laoReports");
		menuBar.add(laoReports);
		sentings = new JMenu("sentings");
		menuBar.add(sentings);
		Utilities = new JMenu("Utilities");
		menuBar.add(Utilities);
		window = new JMenu("window");
		menuBar.add(window);
		help = new JMenu("help");
		menuBar.add(help);
		setJMenuBar(menuBar);
		

		
		JPanel jp = new JPanel();
		
		add(jp);
		jp.setBounds(0, 0, 800, 45);
		jp.setVisible(true);
		
		
		JButton b1 = new JButton("Add");
		jp.add(b1);
		JButton b2 = new JButton("Add");
		jp.add(b2);
		JButton b3 = new JButton("Add");
		jp.add(b3);
		JButton b4 = new JButton("Add");
		jp.add(b4);
		JButton b5 = new JButton("Add");
		jp.add(b5);
		JButton b6 = new JButton("Add");
		jp.add(b6);
		JButton b7 = new JButton("Add");
		jp.add(b7);
		JButton b8 = new JButton("Add");
		jp.add(b8);
		JButton b9 = new JButton("Add");
		jp.add(b9);
		JButton b10 = new JButton("Add");
		jp.add(b10);
		JButton b11 = new JButton("Add");
		jp.add(b11);
		JButton b12 = new JButton("Add");
		jp.add(b12);
		JButton b13 = new JButton("Add");
		jp.add(b13);
		jp.setBackground(Color.BLUE);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(0, 45, 1000, 900);
		
		
		IF_1 = new JInternalFrame();
		IF_1.getContentPane().setLayout(null);
		IF_1.setSize(890, 510);
		IF_1.setClosable(false);
		IF_1.setResizable(false);
		IF_1.setDefaultCloseOperation(HIDE_ON_CLOSE);
		IF_1.setVisible(true);
		
		panel1 = new JPanel();
			panel1.setBackground(Color.WHITE);
			panel1.setBounds(5, 5, 870, 200);
			panel1.setLayout(null);
			
			JLabel lbl1 = new JLabel("Patient ID: ");
			setBound(panel1, lbl1, 10, 10, 100, 30);
			
			JLabel lbl2 = new JLabel("Name: ");
			setBound(panel1, lbl2, 10, 40, 100, 30);
			
			JLabel lbl3 = new JLabel("Sex: ");
			setBound(panel1, lbl3, 10, 70, 100, 30);
			
			JLabel lbl4 = new JLabel("Referred By: ");
			setBound(panel1, lbl4, 10, 100, 100, 30);
			
			JTextField caja1 = new JTextField();
			setBound(panel1, caja1, 85, 15, 90, 20);
			
			JTextField caja2 = new JTextField();
			setBound(panel1, caja2, 85, 105, 100, 20);
			
			JTextField caja3 = new JTextField();
			setBound(panel1, caja3, 160, 45, 180, 20);
			
			JComboBox combo1 = new JComboBox();
			combo1.addItem("MR.");
			combo1.addItem("MRS.");
			combo1.addItem("MISS.");
			setBound(panel1, combo1, 85, 45, 60, 20);
			
			JComboBox combo2 = new JComboBox();
			combo2.addItem("MALE");
			combo2.addItem("FEMALE");
			setBound(panel1, combo2, 85, 75, 70, 20);
			
			JLabel lbl5 = new JLabel("Age: ");
			setBound(panel1, lbl5, 175, 70, 70, 30);
			
			JTextField caja4 = new JTextField("0");
			
			setBound(panel1, caja4, 205, 75, 30, 20);
			
			JLabel lbl6 = new JLabel("Mons: ");
			setBound(panel1, lbl6, 240, 70, 70, 30);
			
			JTextField caja5 = new JTextField("0");
			setBound(panel1, caja5, 280, 75, 30, 20);
			
			JLabel lbl7 = new JLabel("Days: ");
			setBound(panel1, lbl7, 315, 70, 70, 30);
			
			JTextField caja6 = new JTextField("0");
			
			setBound(panel1, caja6, 350, 75, 30, 20);
			
			JLabel lbl8 = new JLabel("Date");
			setBound(panel1, lbl8, 250, 10, 100, 30);
			
			JSpinner spinn1 = new JSpinner();
			setBound(panel1, spinn1, 280, 15, 100, 20);
			
			JLabel lbl9 = new JLabel("*Time (hh:mm)");
			setBound(panel1, lbl9, 390, 10, 100, 30);
			
			JLabel lbl10 = new JLabel(":");
			setBound(panel1, lbl10, 530, 10, 100, 30);
			
			JSpinner spinn2 = new JSpinner();
			setBound(panel1, spinn2, 480, 15, 40, 20);
			
			JSpinner spinn3 = new JSpinner();
			setBound(panel1, spinn3, 540, 15, 40, 20);
			
			JLabel lbl11 = new JLabel("Lab No.");
			setBound(panel1, lbl11, 600, 10, 100, 30);
			
			JTextField caja7 = new JTextField();
			setBound(panel1, caja7, 650, 15, 100, 20);
			
			JLabel lbl12 = new JLabel("Sample By: ");
			setBound(panel1, lbl12, 400, 70, 70, 30);
			
			JTextField caja8 = new JTextField();
			setBound(panel1, caja8, 470, 75, 100, 20);
			
			JLabel lbl13 = new JLabel("Panel Code: ");
			setBound(panel1, lbl13, 400, 100, 70, 30);
			
			JTextField caja9 = new JTextField();
			setBound(panel1, caja9, 470, 105, 100, 20);
			
			JLabel lbl14 = new JLabel("Panel ID: ");
			setBound(panel1, lbl14, 400, 130, 70, 30);
			
			JTextField caja10 = new JTextField();
			setBound(panel1, caja10, 470, 135, 100, 20);
			
			JLabel lbl15 = new JLabel("E-mail: ");
			setBound(panel1, lbl15, 400, 160, 70, 30);
			
			JTextField caja11 = new JTextField();
			setBound(panel1, caja11, 470, 165, 100, 20);
			
		IF_1.add(panel1);
		

		
		panel3 = new JPanel();
			panel3.setBackground(Color.gray);
			panel3.setBounds(0, 205, 1000, 210);
			
		
		
		IF_1.add(panel3);
		desktopPane.add(IF_1);
	
	add(desktopPane);
	}
	
	public void setBound(JPanel panel, JComponent comp, int x, int y, int w, int h) {
		comp.setBounds(x, y, w, h);
		panel.add(comp);
	}
	
}

public class PruebaGUI {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new GUI();
			}
		});	

	}

}
