package calcu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class calcu {

	private JFrame frame;
	private JTextField textField;
	
	double num1;
	double num2;
	double total;
	String action;
	String answer;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calcu window = new calcu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public calcu() {
		initialize();
	}
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 625, 532);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setForeground(new Color(255, 255, 255));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBackground(new Color(0, 0, 0));
		textField.setFont(new Font("Bookman Old Style", Font.PLAIN, 28));
		textField.setBounds(10, 10, 580, 103);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnSin = new JButton("sin");
		btnSin.setForeground(new Color(64, 0, 128));
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double s=Math.sin(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+s);
			}
		});
		btnSin.setFont(new Font("Berlin Sans FB", Font.PLAIN, 29));
		btnSin.setBounds(10, 123, 83, 49);
		frame.getContentPane().add(btnSin);
		
		JButton btn7 = new JButton("7");
		btn7.setForeground(new Color(0, 128, 0));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Berlin Sans FB", Font.PLAIN, 29));
		btn7.setBounds(10, 182, 83, 49);
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.setForeground(new Color(0, 128, 0));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Berlin Sans FB", Font.PLAIN, 29));
		btn4.setBounds(10, 241, 83, 49);
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.setForeground(new Color(0, 128, 0));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Berlin Sans FB", Font.PLAIN, 29));
		btn1.setBounds(10, 300, 83, 49);
		frame.getContentPane().add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.setForeground(new Color(0, 128, 0));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Berlin Sans FB", Font.PLAIN, 29));
		btn0.setBounds(10, 367, 176, 62);
		frame.getContentPane().add(btn0);
		
		JButton btnCos = new JButton("cos");
		btnCos.setForeground(new Color(64, 0, 128));
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double c=Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+c);
			}
		});
		btnCos.setFont(new Font("Berlin Sans FB", Font.PLAIN, 29));
		btnCos.setBounds(103, 123, 83, 49);
		frame.getContentPane().add(btnCos);
		
		JButton btn8 = new JButton("8");
		btn8.setForeground(new Color(0, 128, 0));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Berlin Sans FB", Font.PLAIN, 29));
		btn8.setBounds(103, 182, 83, 49);
		frame.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.setForeground(new Color(0, 128, 0));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Berlin Sans FB", Font.PLAIN, 29));
		btn5.setBounds(103, 241, 83, 49);
		frame.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.setForeground(new Color(0, 128, 0));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Berlin Sans FB", Font.PLAIN, 29));
		btn2.setBounds(103, 300, 83, 49);
		frame.getContentPane().add(btn2);
		
		JButton btnTan = new JButton("tan");
		btnTan.setForeground(new Color(64, 0, 128));
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double t=Math.tan(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+t);
			}
		});
		btnTan.setFont(new Font("Berlin Sans FB", Font.PLAIN, 29));
		btnTan.setBounds(196, 123, 92, 49);
		frame.getContentPane().add(btnTan);
		
		JButton btnB = new JButton("B");
		btnB.setForeground(new Color(255, 0, 0));
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bck=null;
				if(textField.getText().length()>0) {
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					bck=str.toString();
					textField.setText(bck);
				}
			}
		});
		btnB.setFont(new Font("Berlin Sans FB", Font.PLAIN, 29));
		btnB.setBounds(298, 123, 92, 49);
		frame.getContentPane().add(btnB);
		
		JButton btn9 = new JButton("9");
		btn9.setForeground(new Color(0, 128, 0));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Berlin Sans FB", Font.PLAIN, 29));
		btn9.setBounds(196, 182, 92, 49);
		frame.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.setForeground(new Color(0, 128, 0));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Berlin Sans FB", Font.PLAIN, 29));
		btn6.setBounds(196, 241, 92, 49);
		frame.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.setForeground(new Color(0, 128, 0));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Berlin Sans FB", Font.PLAIN, 29));
		btn3.setBounds(196, 300, 92, 49);
		frame.getContentPane().add(btn3);
		
		JButton btnDot = new JButton(".");
		btnDot.setForeground(new Color(0, 128, 64));
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setFont(new Font("Berlin Sans FB", Font.PLAIN, 29));
		btnDot.setBounds(196, 367, 92, 62);
		frame.getContentPane().add(btnDot);
		
		JButton btnsq = new JButton("x^2");
		btnsq.setForeground(new Color(64, 0, 128));
		btnsq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double x=Double.parseDouble(textField.getText());
				x=x*x;
				textField.setText("");
				textField.setText(textField.getText()+x);
			}
		});
		btnsq.setFont(new Font("Berlin Sans FB", Font.PLAIN, 29));
		btnsq.setBounds(298, 182, 92, 49);
		frame.getContentPane().add(btnsq);
		
		JButton btncub = new JButton("x^3");
		btncub.setForeground(new Color(64, 0, 128));
		btncub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double x=Double.parseDouble(textField.getText());
				x=x*x*x;
				textField.setText("");
				textField.setText(textField.getText()+x);
			}
		});
		btncub.setFont(new Font("Berlin Sans FB", Font.PLAIN, 29));
		btncub.setBounds(298, 241, 92, 49);
		frame.getContentPane().add(btncub);
		
		JButton btnSqrt = new JButton("sqrt");
		btnSqrt.setForeground(new Color(64, 0, 128));
		btnSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double sqr=Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+sqr);
			}
		});
		btnSqrt.setFont(new Font("Berlin Sans FB", Font.PLAIN, 29));
		btnSqrt.setBounds(298, 300, 92, 49);
		frame.getContentPane().add(btnSqrt);
		
		JButton btnEQU = new JButton("=");
		btnEQU.setForeground(new Color(255, 0, 0));
		btnEQU.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num2=Double.parseDouble(textField.getText());
				if(action=="+") {
					total=num1+num2;
					answer=String.format("%.1f + %.1f=%.2f",num1,num2,total);
					textField.setText(answer);
				}
				else if(action=="-") {
					total=num1-num2;
					answer=String.format("%.1f - %.1f=%.2f",num1,num2,total);
					textField.setText(answer);
				}
				else if(action=="*") {
					total=num1*num2;
					answer=String.format("%.1f * %.1f=%.2f",num1,num2,total);
					textField.setText(answer);
				}
				else if(action=="/") {
					total=num1/num2;
					answer=String.format("%.1f / %.1f=%.2f",num1,num2,total);
					textField.setText(answer);
				}
				else if (action.equals("x^y")) {
				    total = Math.pow(num1, num2);
				    answer = String.format("%.1f ^ %.1f = %.2f", num1, num2, total);
				    textField.setText(answer);
				}

			}
		});
		btnEQU.setFont(new Font("Berlin Sans FB", Font.PLAIN, 29));
		btnEQU.setBounds(298, 367, 179, 62);
		frame.getContentPane().add(btnEQU);
		
		JButton btnC = new JButton("C");
		btnC.setForeground(new Color(255, 0, 0));
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnC.setFont(new Font("Berlin Sans FB", Font.PLAIN, 29));
		btnC.setBounds(400, 123, 190, 49);
		frame.getContentPane().add(btnC);
		
		JButton btnfact = new JButton("x!");
		btnfact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double f=Double.parseDouble(textField.getText());
				double fac=1;
				while(f!=0) {
					fac=fac*f;
					f--;
				}
				textField.setText("");
				textField.setText(textField.getText()+fac);
			}
		});
		btnfact.setForeground(new Color(64, 0, 128));
		btnfact.setFont(new Font("Berlin Sans FB", Font.PLAIN, 29));
		btnfact.setBounds(400, 182, 77, 49);
		frame.getContentPane().add(btnfact);
		
		JButton btnLog = new JButton("log");
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double log = Math.log(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+log);
			}
		});
		btnLog.setForeground(new Color(64, 0, 128));
		btnLog.setFont(new Font("Berlin Sans FB", Font.PLAIN, 29));
		btnLog.setBounds(400, 241, 77, 49);
		frame.getContentPane().add(btnLog);
		
		JButton btPow = new JButton("x^y");
		btPow.setForeground(new Color(64, 0, 128));
		btPow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				action="x^y";
				textField.setText("");
			}
		});
		btPow.setFont(new Font("Berlin Sans FB", Font.PLAIN, 29));
		btPow.setBounds(400, 300, 77, 49);
		frame.getContentPane().add(btPow);
		
		JButton btnAdd = new JButton("+");
		btnAdd.setForeground(new Color(128, 128, 64));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				action="+";
				
			}
		});
		btnAdd.setFont(new Font("Berlin Sans FB", Font.PLAIN, 29));
		btnAdd.setBounds(485, 182, 105, 49);
		frame.getContentPane().add(btnAdd);
		
		JButton btnSub = new JButton("-");
		btnSub.setForeground(new Color(128, 128, 64));
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				action="-";
			}
		});
		btnSub.setFont(new Font("Berlin Sans FB", Font.PLAIN, 29));
		btnSub.setBounds(487, 241, 103, 49);
		frame.getContentPane().add(btnSub);
		
		JButton btnMul = new JButton("*");
		btnMul.setForeground(new Color(128, 128, 64));
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				action="*";
			}
		});
		btnMul.setFont(new Font("Berlin Sans FB", Font.PLAIN, 29));
		btnMul.setBounds(487, 300, 103, 49);
		frame.getContentPane().add(btnMul);
		
		JButton btnDiv = new JButton("/");
		btnDiv.setForeground(new Color(128, 128, 64));
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				action="/";
			}
		});
		btnDiv.setFont(new Font("Berlin Sans FB", Font.PLAIN, 29));
		btnDiv.setBounds(487, 367, 103, 62);
		frame.getContentPane().add(btnDiv);
		
		JRadioButton btnWant = new JRadioButton("Want");
		btnWant.setHorizontalAlignment(SwingConstants.CENTER);
		btnWant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnSin.setEnabled(true);
				btnCos.setEnabled(true);
				btnTan.setEnabled(true);
				btnLog.setEnabled(true);
				btnsq.setEnabled(true);
				btncub.setEnabled(true);
				btnSqrt.setEnabled(true);
				btnfact.setEnabled(true);
				btPow.setEnabled(true);
			}
		});
		btnWant.setForeground(new Color(255, 255, 255));
		btnWant.setBackground(new Color(0, 0, 0));
		btnWant.setFont(new Font("Book Antiqua", Font.PLAIN, 19));
		btnWant.setBounds(10, 453, 103, 34);
		frame.getContentPane().add(btnWant);
		
		JRadioButton btnClose = new JRadioButton("Close");
		btnClose.setHorizontalAlignment(SwingConstants.CENTER);
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnSin.setEnabled(false);
				btnCos.setEnabled(false);
				btnTan.setEnabled(false);
				btnLog.setEnabled(false);
				btnsq.setEnabled(false);
				btncub.setEnabled(false);
				btnSqrt.setEnabled(false);
				btnfact.setEnabled(false);
				btPow.setEnabled(false);
			}
		});
		btnClose.setForeground(Color.WHITE);
		btnClose.setFont(new Font("Book Antiqua", Font.PLAIN, 19));
		btnClose.setBackground(Color.BLACK);
		btnClose.setBounds(485, 453, 103, 34);
		frame.getContentPane().add(btnClose);
	}
}
