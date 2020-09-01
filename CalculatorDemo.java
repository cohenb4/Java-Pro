package Calculator;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*Programmer: Brendan Cohen
 * Date: 8/3/20
 * 
 * This program creates a gui calculator that allows the user the function of a real calculator
 */
public class CalculatorDemo extends JFrame implements ActionListener
{
	public static final int WIDTH = 400;
	public static final int HEIGHT = 400;

	private JPanel buttonPanel; //creates buttonPanel
	private JPanel resultPanel; //creates resultPanel
	private JTextField results; //creates a text field for results
	private JButton zeroButton; //creates the 0 button
	private JButton oneButton; //creates the 1 button
	private JButton twoButton; //creates the 2 button
	private JButton threeButton; //creates the 3 button
	private JButton fourButton; //creates the 4 button
	private JButton fiveButton; //creates the 5 button
	private JButton sixButton; //creates the 6 button
	private JButton sevenButton; //creates the 7 button
	private JButton eightButton; //creates the 8 button
	private JButton nineButton; //creates the 9 button
	private JButton divideButton; //creates the division button
	private JButton timesButton; //creates multiplication button
	private JButton minusButton; //creates subtraction button
	private JButton addButton; //creates addition button
	private JButton equalButton; //creates equals button
	private JButton decimalButton; //creates decimal button
	private JButton clearButton; //creates the clear button
	private JButton nothingButton; //creates empty button
	private int opt;
	private double holder, bholder, result; //holds values
	
	public CalculatorDemo()
	{
		super("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(WIDTH, HEIGHT);
		setLayout(new BorderLayout());
		opt = 0;
		holder = 0;
		result = 0;
		
		buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(5, 4));
		
		resultPanel = new JPanel();
		resultPanel.setLayout(new FlowLayout());
		
		results = new JTextField(20);
		results.setEditable(false);
		zeroButton = new JButton("0");
		zeroButton.addActionListener(this);
		oneButton = new JButton("1");
		oneButton.addActionListener(this);
		twoButton = new JButton("2");
		twoButton.addActionListener(this);
		threeButton = new JButton("3");
		threeButton.addActionListener(this);
		fourButton = new JButton("4");
		fourButton.addActionListener(this);
		fiveButton = new JButton("5");
		fiveButton.addActionListener(this);
		sixButton = new JButton("6");
		sixButton.addActionListener(this);
		sevenButton = new JButton("7");
		sevenButton.addActionListener(this);
		eightButton = new JButton("8");
		eightButton.addActionListener(this);
		nineButton = new JButton("9");
		nineButton.addActionListener(this);
		divideButton = new JButton("/");
		divideButton.addActionListener(this);
		timesButton = new JButton("X");
		timesButton.addActionListener(this);
		minusButton = new JButton("-");
		minusButton.addActionListener(this);
		addButton = new JButton("+");
		addButton.addActionListener(this);
		equalButton = new JButton("=");
		equalButton.addActionListener(this);
		decimalButton = new JButton(".");
		decimalButton.addActionListener(this);
		clearButton = new JButton("C");
		decimalButton.addActionListener(this);
		nothingButton = new JButton("");
		
		resultPanel.add(results);
		buttonPanel.add(sevenButton);
		buttonPanel.add(eightButton);
		buttonPanel.add(nineButton);
		buttonPanel.add(divideButton);
		buttonPanel.add(fourButton);
		buttonPanel.add(fiveButton);
		buttonPanel.add(sixButton);
		buttonPanel.add(timesButton);
		buttonPanel.add(oneButton);
		buttonPanel.add(twoButton);
		buttonPanel.add(threeButton);
		buttonPanel.add(minusButton);
		buttonPanel.add(zeroButton);
		buttonPanel.add(decimalButton);
		buttonPanel.add(equalButton);
		buttonPanel.add(addButton);
		buttonPanel.add(nothingButton);
		buttonPanel.add(clearButton);
		
		add(resultPanel, BorderLayout.NORTH);
		add(buttonPanel, BorderLayout.CENTER);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String actionCommand = e.getActionCommand();
		
		if(actionCommand.equals("1"))
			results.setText(results.getText() + "1"); //allows for user to see results
		else if(actionCommand.equals("2"))
			results.setText(results.getText() + "2");
		else if(actionCommand.equals("3"))
			results.setText(results.getText() + "3");
		else if(actionCommand.equals("4"))
			results.setText(results.getText() + "4");
		else if(actionCommand.equals("5"))
			results.setText(results.getText() + "5");
		else if(actionCommand.equals("6"))
			results.setText(results.getText() + "6");
		else if(actionCommand.equals("7"))
			results.setText(results.getText() + "7");
		else if(actionCommand.equals("8"))
			results.setText(results.getText() + "8");
		else if(actionCommand.equals("9"))
			results.setText(results.getText() + "9");
		else if(actionCommand.equals("0"))
			results.setText(results.getText() + "0");
		else if(actionCommand.equals("."))
			results.setText(results.getText() + ".");
		else if(actionCommand.equals("+"))
		{
			if(opt != 1)
			{
				opt = 1;
				holder = Double.parseDouble(results.getText());
				results.setText("");
			}
			else 
			{
				holder = holder + Double.parseDouble(results.getText()); //does addition
				results.setText("");
			}
		}
		else if(actionCommand.equals("-"))
		{
			if(opt != 2)
			{
				opt = 2;
				holder = Double.parseDouble(results.getText());
				results.setText("");
			}
			else 
			{
				holder = holder - Double.parseDouble(results.getText()); //does subtraction
				results.setText("");
			}
		}
		else if(actionCommand.equals("X"))
		{
			if(opt != 3)
			{
				opt = 3;
				holder = Double.parseDouble(results.getText());
				results.setText("");
			}
			else 
			{
				holder = holder * Double.parseDouble(results.getText()); //does multiplication
				results.setText("");
			}
		}
		else if(actionCommand.equals("/"))
		{
			if(opt != 4)
			{
				opt = 4;
				holder = Double.parseDouble(results.getText());
				results.setText("");
			}
			else 
			{
				holder = holder / Double.parseDouble(results.getText()); //does division
				results.setText("");
			}
		}
		else if(actionCommand.equals("="))
		{
			bholder = Double.parseDouble(results.getText());
			
			switch(opt)
			{
			case 1: result = holder + bholder;
			opt = 0;
				break;
				
			case 2: result = holder - bholder;
			opt = 0;
				break;
			
			case 3: result = holder * bholder;
			opt = 0;
				break;
				
			case 4: result = holder / bholder;
			opt = 0;
				break;
				
			default: result = 0;
			}
			
			results.setText("" + result);
		}
		else if(actionCommand.equals("C")) //clears console
		{
			results.setText("");
			holder = 0;
			bholder = 0;
			opt = 0;
		}
	}
	
	public static void main(String[] args) 
	{
		CalculatorDemo gui = new CalculatorDemo();
		gui.setVisible(true);
	}

}
