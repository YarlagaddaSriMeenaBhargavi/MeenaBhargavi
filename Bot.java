import javax.swing.JFrame;
import javax.swing.JTextField;

public class Bot extends JFrame{
private JTextField jft=new JTextField();
private JTextArea jta=new JTextArea();
public Bot()
{
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
this.setSize(600,600);
this.setVisible(true);
this.setResizable(false);
this.setLayout(null);
 this.setTitle("Chat Bot");
 
 
 jft.setLocation(2,560);
 jft.setSize(590,30);
 
 jft.addActionListener(new ActionListener()
 {
 public void actionPerformed(ActionEvent ar)
 {
 String uText=jft.getText();
 jta.append("You:"+uText+"\n");
 if(utext.contains("hi"))
 {
 botSay("Hello there");
 }
 else if(uText.contains("How are you"))
 {
 int decider=(int)Math.random()*2+1;
 if(decider==1)
 botSay("I'm doing fine,thanks");
 else if(decider==2)
 botSay("Not too bad");
 
 }
 else
 {
 int decider=(int)Math.random()*3+1;
 if(decider==1)
 botSay("I didn't get that");
 else if(decider==2)
 botSay("Please repeat that");
 else if(decider==3)
 botSay("?????"):
 jft.setText("");
 }
 }
 )};
 jta.setLocation(15,5);
 jta.setSize(560,510);
 jta.setEditable(false);
 this.add(jft);
 this.add(jta);
 
} //Bot
public void botSay(String s)
{
jta.append("AI"+s+"\n");
}
 public static void main(String args[])
 {
 new Bot();
 }