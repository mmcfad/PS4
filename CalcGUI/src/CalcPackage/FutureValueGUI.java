package CalcPackage;

import java.awt.EventQueue;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class FutureValueGUI {
	private JFrame frame;
	private JTextField AmountStart;
	private JTextField AmountYears;
	private JTextField InterestRate;
	private JTextField FutureValue;

	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FutureValueGUI window = new FutureValueGUI();
					window.frame.setVisible(true);
					} catch (Exception except) {
						except.printStackTrace();
						}
				}
			});
		}

	
	public FutureValueGUI() {
		initialize();
		}

	
	
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(80, 80, 400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel splitPanel = new JPanel();
		splitPanel.setBounds(20, 25, 387, 175);
		frame.getContentPane().add(splitPanel);
		splitPanel.setLayout(null);
		
		JLabel InvestmentAmount = new JLabel("Investment Amount");
		InvestmentAmount.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		InvestmentAmount.setBounds(10, 11, 154, 32);
		splitPanel.add(InvestmentAmount);
		
		AmountStart = new JTextField();
		AmountStart.setBounds(220, 11, 140, 32);
		splitPanel.add(AmountStart);
		AmountStart.setColumns(10);
		
		JLabel Years = new JLabel("Years");
		Years.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		Years.setHorizontalAlignment(SwingConstants.LEFT);
		Years.setBounds(10, 58, 130, 25);
		splitPanel.add(Years);
		
		AmountYears = new JTextField();
		AmountYears.setBounds(220, 54, 140, 32);
		splitPanel.add(AmountYears);
		AmountYears.setColumns(10);
		
		JLabel AnnualInterestRate = new JLabel("Annual Interest Rate");
		AnnualInterestRate.setHorizontalAlignment(SwingConstants.LEFT);
		AnnualInterestRate.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		AnnualInterestRate.setBounds(10, 105, 154, 14);
		splitPanel.add(AnnualInterestRate);
		
		JLabel futurevalue = new JLabel("Future Value");
		futurevalue.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		futurevalue.setHorizontalAlignment(SwingConstants.LEFT);
		futurevalue.setBounds(10, 150, 130, 14);
		splitPanel.add(futurevalue);
		
		InterestRate = new JTextField();
		InterestRate.setBounds(220, 97, 140, 32);
		splitPanel.add(InterestRate);
		InterestRate.setColumns(10);
		
		FutureValue = new JTextField();
		FutureValue.setBounds(220, 141, 140, 32);
		splitPanel.add(FutureValue);
		FutureValue.setColumns(10);
		
		JButton calculateButton = new JButton("Calculate");
		calculateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FutureValue.setBackground(Color.LIGHT_GRAY);
				
				double InvestmentAmount = Double.parseDouble(AmountStart.getText());
				double Years = Double.parseDouble(AmountYears.getText());
				double AnnualInterestRate = Double.parseDouble(InterestRate.getText());
				
				double total;
				
				total = FutureValueCalc.futureValueCalc(InvestmentAmount, Years, AnnualInterestRate);
				
				FutureValue.setText("$" + total);
			}
		});
		calculateButton.setBounds(250, 210, 127, 41);
		frame.getContentPane().add(calculateButton);
	}
}