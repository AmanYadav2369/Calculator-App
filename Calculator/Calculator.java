import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Calculator extends JFrame
{
Container c;
JLabel head, firstNo, secondNo, ans;
JTextField txtfirstNo, txtsecondNo;
JButton btnAdd, btnSub, btnMult, btnDiv;

Calculator(){
c=getContentPane();
c.setLayout(null);
c.setBackground(Color.CYAN);

head=new JLabel("CALCULATOR");
head.setBounds(110,10,500,40);
head.setFont(new Font("Arial", Font.BOLD, 35));
head.setForeground(Color.RED);
c.add(head);

firstNo=new JLabel("Enter First Number :");
firstNo.setBounds(115, 110, 500, 30);
firstNo.setFont(new Font("Arial", Font.BOLD, 25));
firstNo.setForeground(Color.BLUE);
c.add(firstNo);

txtfirstNo=new JTextField(12);
txtfirstNo.setBounds(120, 150, 210, 30);
txtfirstNo.setFont(new Font("Arial", Font.PLAIN, 20));
c.add(txtfirstNo);

secondNo=new JLabel("Enter Second Number :");
secondNo.setBounds(115, 200, 500, 30);
secondNo.setFont(new Font("Arial", Font.BOLD, 25));
secondNo.setForeground(Color.BLUE);
c.add(secondNo);

txtsecondNo=new JTextField(12);
txtsecondNo.setBounds(120, 240, 210, 30);
txtsecondNo.setFont(new Font("Arial", Font.PLAIN, 20));
c.add(txtsecondNo);

btnAdd=new JButton("Add");
btnAdd.setBounds(80,310,150,30);
btnAdd.setFont(new Font("Arial", Font.BOLD,25));
btnAdd.setForeground(Color.BLUE);
c.add(btnAdd);

btnSub=new JButton("Sub");
btnSub.setBounds(250,310,150,30);
btnSub.setFont(new Font("Arial", Font.BOLD,25));
btnSub.setForeground(Color.BLUE);
c.add(btnSub);

btnMult=new JButton("Mul");
btnMult.setBounds(80,370,150,30);
btnMult.setFont(new Font("Arial", Font.BOLD,25));
btnMult.setForeground(Color.BLUE);
c.add(btnMult);

btnDiv=new JButton("Div");
btnDiv.setBounds(250,370,150,30);
btnDiv.setFont(new Font("Arial", Font.BOLD,25));
btnDiv.setForeground(Color.BLUE);
c.add(btnDiv);

ans=new JLabel("");
ans.setBounds(120,450,400,30);
ans.setFont(new Font("Arial", Font.BOLD, 25));
ans.setForeground(Color.BLUE);
c.add(ans);

ActionListener a1 = (ae) -> { 
double no1=Double.parseDouble(txtfirstNo.getText());
double no2=Double.parseDouble(txtsecondNo.getText());
double res=no1+no2;
String msg="Addition = "+" "+res;
ans.setText(msg);
 };
btnAdd.addActionListener(a1);

ActionListener a2 = (ae) -> { 
double no1=Double.parseDouble(txtfirstNo.getText());
double no2=Double.parseDouble(txtsecondNo.getText());
double res=no1-no2;
String msg="Substraction = "+" "+res;
ans.setText(msg);
 };
btnSub.addActionListener(a2);

ActionListener a3 = (ae) -> { 
double no1=Double.parseDouble(txtfirstNo.getText());
double no2=Double.parseDouble(txtsecondNo.getText());
double res=no1*no2;
String msg="Multiplication = "+" "+res;
ans.setText(msg);
 };
btnMult.addActionListener(a3);

ActionListener a4 = (ae) -> { 
double no1=Double.parseDouble(txtfirstNo.getText());
double no2=Double.parseDouble(txtsecondNo.getText());
double res=no1/no2;
String msg="Division = "+" "+res;
ans.setText(msg);
 };
btnDiv.addActionListener(a4);

setSize(500, 600);
setLocationRelativeTo(null);
setTitle("Calculator app by Aman Yadav...");
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String args[])
{
Calculator c=new Calculator();
}
}