import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.*;

public class GUI extends JFrame implements ActionListener {
	
	private CurrencyConverter c = new CurrencyConverter();
	//private ApartmentBlock a = new ApartmentBlock();
	//private OfficeBlock o = new OfficeBlock();
	//private String [] choices = {"House", "Apartment", "Office"};
	private Container contentPane = this.getContentPane();
	private JLabel lab1, lab2, lab3, lab4;
	private JTextField f1, f2, f3, f4;
	//private JComboBox choice = new JComboBox(choices);

	private JButton convert = new JButton("convert");

	//private JPanel panel1 = new JPanel();

	public GUI()
	{
	this.setTitle("Currency Converter");
	this.setSize(400, 400);

	contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
	//contentPane.add(panel1);
	//choice.addActionListener(this);
	//panel1.add(choice);
	}

	public void init()
	{
	lab1 = new JLabel("Euro");
	lab2 = new JLabel("USDollars");
	lab3 = new JLabel("Yuan");
	lab4 = new JLabel("GBPounds");

	f1 = new JTextField();
	f2 = new JTextField();
	f3 = new JTextField();
	f4 = new JTextField();

	f1.setText(""+ c.getEuros());
	f2.setText(""+ c.getDollars());
	f3.setText(""+ c.getYuan());
	f4.setText(""+ c.getPounds());

	contentPane.add(lab1);
	contentPane.add(f1);
	contentPane.add(lab2);
	contentPane.add(f2);
	contentPane.add(lab3);
	contentPane.add(f3);
	contentPane.add(lab4);
	contentPane.add(f4);

	contentPane.add(convert);

	convert.addActionListener(this);

	this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

	if(e.getSource() == convert)
	{



	String dollars = f2.getText();

	c.setEuros(Double.parseDouble(dollars));
	c.setDollars(Double.parseDouble(dollars));
	c.setYuan(Double.parseDouble(dollars));
	c.setPounds(Double.parseDouble(dollars));

	double euros = c.getEuros();
	double yuan = c.getYuan();
	double pounds = c.getPounds();

	f1.setText(Double.toString(euros));
	f3.setText(Double.toString(yuan));
	f4.setText(Double.toString(pounds));
	}
	}


}
