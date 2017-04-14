//**************************************************************************
//** Name: Virtual Keyboard or onscreen keyboard                         ***
//** Description:on screen keyboard, which controls keyboard using mouse ***
//** By: Muhammad Bahaa                                                  ***
//**************************************************************************

import java.awt.*;
import java.awt.Robot.*;
import java.awt.event.*;
import java.io.*;
import java.awt.AWTException;
import java.awt.Robot;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.*;

public class VirtualKeybord extends JFrame implements ActionListener
{

//private static final long serialVersionUID = 1L;
private JPanel contentPane;

JButton a0 = new JButton("0  ");
JButton ctrl = new JButton("Ctrl");
JButton down = new JButton("!  ^");
JButton star= new JButton("start");
JButton b=new JButton("B");
JButton n=new JButton("N");
JButton up=new JButton("^");
JButton m=new JButton("M");
JButton que=new JButton("? /");
JButton lt=new JButton("<");
JButton ap=new JButton(".");
JButton fullstop=new JButton(". >");
JButton a6=new JButton("6");
JButton rt=new JButton(">");
JButton l=new JButton("L");
JButton a1=new JButton("1");
JButton enter=new JButton("Enter                   "); 
JButton semi=new JButton(": ;");
JButton space=new JButton("                                                                    ");
JButton v=new JButton("V");
JButton z=new JButton("Z");
JButton a3=new JButton("3");
JButton x=new JButton("X");
JButton c=new JButton("C"); 
JButton a4=new JButton("4");
JButton a2=new JButton("2");
JButton coma=new JButton(", <"); 
JButton a5=new JButton("5");
JButton k=new JButton("K");
JButton w=new JButton("W");
JButton q=new JButton("Q");
JButton ocolon=new JButton("-_");
JButton plus=new JButton("=+");
JButton backspace=new JButton("Backspace");
JButton Shift=new JButton("Shift            ");
JButton o1=new JButton("1  !");
JButton scrolllockr=new JButton("Release Scrol");
JButton home=new JButton("Home");
JButton tab=new JButton("Tab  "); 
JButton alt=new JButton("Alt");
JButton f9=new JButton("F9");
JButton f8=new JButton("F8");
JButton f7=new JButton("F7");
JButton f6=new JButton("F6");
JButton esc=new JButton("Esc");
JButton f3=new JButton("F3");
JButton f4=new JButton("F4");
JButton f5=new JButton("F5");
JButton s=new JButton("S");
JButton o2=new JButton("2 @");
JButton f11=new JButton("F11"); 
JButton f10=new JButton("F10");
JButton f1=new JButton("F1");
JButton e=new JButton("E");
JButton o9=new JButton("9  ("); 
JButton oo=new JButton("0  )");
JButton o8=new JButton("8  *"); 
JButton o7=new JButton("7  &");
JButton o6=new JButton("6  ^");
JButton o5=new JButton("5  %");
JButton o4=new JButton("4  $");
JButton o3=new JButton("3  #"); 
JButton pause=new JButton("Pasue");
JButton Insert=new JButton("Insert");
JButton scrolllock=new JButton("Scroll \n lock");
JButton f12=new JButton("F12");
JButton f2=new JButton("F2");
JButton d=new JButton("D");
JButton cpas=new JButton("Cpas Lock"); 
JButton end=new JButton("End");
JButton numlock=new JButton("Numlock");
JButton slash=new JButton("Slash"); 
JButton mult=new JButton("*");
JButton minus=new JButton("-");
JButton f=new JButton("F");
JButton r=new JButton("R");
JButton t=new JButton("T");
JButton u=new JButton("U");
JButton i=new JButton("I");
JButton o=new JButton("O"); 
JButton p=new JButton("P");
JButton openCurly=new JButton("{ [");
JButton closeCurly=new JButton("} ]"); 
JButton pageUp=new JButton("pageUp");
JButton pageDown=new JButton("PageDown");
JButton a7=new JButton("7");
JButton a8=new JButton("8");
JButton a=new JButton("A"); 
JButton per=new JButton("| \\");
JButton delete=new JButton("Delete"); 
JButton a9=new JButton("9");
JButton apl=new JButton("+");
JButton g=new JButton("G");
JButton h=new JButton("H");
JButton j=new JButton("J");JButton cote=new JButton("' doublecote");
int shiftcount=0;
int al=0;int count=0;
int numl=0,cp=0;


public VirtualKeybord(String keybord) {
	
super("On-Screen Keyboard");	
setAlwaysOnTop(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 300, 250);
setFocusableWindowState(false);

contentPane = new JPanel();
contentPane.setLayout(new FlowLayout());
setContentPane(contentPane);

o1.addActionListener(this);
contentPane.add(o1);
esc.addActionListener(this);
contentPane.add(esc); 
contentPane.add(f1);f1.addActionListener(this);
contentPane.add(f2);f2.addActionListener(this);
contentPane.add(f3);f3.addActionListener(this);
contentPane.add(f4);f4.addActionListener(this);
contentPane.add(f5);f5.addActionListener(this);
contentPane.add(f6);f6.addActionListener(this);
contentPane.add(f7);f7.addActionListener(this);
contentPane.add(f8);f8.addActionListener(this);
contentPane.add(f9);f9.addActionListener(this);
contentPane.add(f10);f10.addActionListener(this);
contentPane.add(f11);f11.addActionListener(this);
contentPane.add(f12);f12.addActionListener(this);
contentPane.add(Insert).setSize(100, 12);;Insert.addActionListener(this);
contentPane.add(pause);pause.addActionListener(this);
contentPane.add(o1);o1.addActionListener(this);
contentPane.add(o2);o2.addActionListener(this);
contentPane.add(o3);o3.addActionListener(this);
contentPane.add(o4);o4.addActionListener(this);
contentPane.add(o5);o5.addActionListener(this);
contentPane.add(o6);o6.addActionListener(this);
contentPane.add(o7);o7.addActionListener(this);
contentPane.add(o8);o8.addActionListener(this);
contentPane.add(o9);o9.addActionListener(this);
contentPane.add(oo);oo.addActionListener(this);
contentPane.add(ocolon);ocolon.addActionListener(this);
contentPane.add(plus);plus.addActionListener(this);
contentPane.add(backspace);backspace.addActionListener(this);
contentPane.add(home);home.addActionListener(this);
contentPane.add(tab);tab.addActionListener(this);
contentPane.add(q);q.addActionListener(this);
contentPane.add(w);w.addActionListener(this);
contentPane.add(e);e.addActionListener(this);
contentPane.add(r);r.addActionListener(this);
contentPane.add(t);t.addActionListener(this);
contentPane.add(u);u.addActionListener(this);
contentPane.add(i);i.addActionListener(this);
contentPane.add(o);o.addActionListener(this);
contentPane.add(p);p.addActionListener(this);
contentPane.add(openCurly);openCurly.addActionListener(this);
contentPane.add(closeCurly);closeCurly.addActionListener(this);
contentPane.add(per);per.addActionListener(this);
contentPane.add(delete);delete.addActionListener(this);
contentPane.add(slash);slash.addActionListener(this);
contentPane.add(end);end.addActionListener(this);
contentPane.add(cpas);cpas.addActionListener(this);
contentPane.add(a);a.addActionListener(this);
contentPane.add(s);s.addActionListener(this);
contentPane.add(d);d.addActionListener(this);
contentPane.add(f);f.addActionListener(this);
contentPane.add(g);g.addActionListener(this);
contentPane.add(h);h.addActionListener(this);
contentPane.add(j);j.addActionListener(this);
contentPane.add(k);k.addActionListener(this);
contentPane.add(l);l.addActionListener(this);
contentPane.add(semi);semi.addActionListener(this);
contentPane.add(cote);cote.addActionListener(this);
contentPane.add(enter);enter.addActionListener(this);
contentPane.add(Shift).setSize(100, 50);Shift.addActionListener(this);
contentPane.add(z);z.addActionListener(this);
contentPane.add(x);x.addActionListener(this);
contentPane.add(c);c.addActionListener(this);
contentPane.add(v);v.addActionListener(this);
contentPane.add(b);b.addActionListener(this);
contentPane.add(n);n.addActionListener(this);
contentPane.add(m);m.addActionListener(this);
contentPane.add(coma);coma.addActionListener(this);
contentPane.add(fullstop);fullstop.addActionListener(this);
contentPane.add(que);que.addActionListener(this);
contentPane.add(apl);apl.addActionListener(this);
contentPane.add(mult);mult.addActionListener(this);
contentPane.add(up);up.addActionListener(this);
contentPane.add(minus);minus.addActionListener(this);
contentPane.add(ap);ap.addActionListener(this);
contentPane.add(pageUp);pageUp.addActionListener(this);
contentPane.add(pageDown);pageDown.addActionListener(this);
contentPane.add(ctrl);ctrl.addActionListener(this);
contentPane.add(star);star.addActionListener(this);
contentPane.add(alt);alt.addActionListener(this);
contentPane.add(space); space.setBounds(20, 20, 50, 50);space.addActionListener(this);
contentPane.add(lt);lt.addActionListener(this);
contentPane.add(down);down.addActionListener(this);
contentPane.add(rt);rt.addActionListener(this);

setFocusableWindowState(false);
}

public void actionPerformed(ActionEvent a){
if(a.getSource()==esc)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_ESCAPE); 
}
catch(Exception E){}
}
if(a.getSource()==f1)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_F1); 
}
catch(Exception E){}
}
if(a.getSource()==f2)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_F2); 
}
catch(Exception E){}
}
if(a.getSource()==f3)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_F3); 
}
catch(Exception E){}
}
if(a.getSource()==f4)
{
try{
Robot robot = new Robot();
 
robot.keyPress(KeyEvent.VK_F4); 
}
catch(Exception E){}
}
if(a.getSource()==f5)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_F5); 
}
catch(Exception E){}
}
if(a.getSource()==f6)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_F6); 
}
catch(Exception E){}
}
if(a.getSource()==f7)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_F7); 
}
catch(Exception E){}
}
 if(a.getSource()==f8)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_F8); 
}
catch(Exception E){}
}
 if(a.getSource()==f9)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_F9); 
}
catch(Exception E){}
}
 if(a.getSource()==f10)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_F10); 
}
catch(Exception E){}
}
if(a.getSource()==f11)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_F11);
}
catch(Exception E){}
}
 if(a.getSource()==f12)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_F12);
}
catch(Exception E){}
}
 if(a.getSource()==scrolllock)
{ 
count++;
if(count%2==0)
{
try{
scrolllock.setBackground(Color.RED);
Robot robot = new Robot(); 
robot.keyRelease(KeyEvent.VK_SCROLL_LOCK);
}
catch(Exception E){}}
else{
try{
scrolllock.setBackground(Color.BLUE);
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_SCROLL_LOCK);
}
catch(Exception E){}
}}
if(a.getSource()==pause)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_PAUSE);
}
catch(Exception E){}
}
 if(a.getSource()==Insert)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_INSERT);
}
catch(Exception E){}
}
 if(a.getSource()==o1)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_1);
}
catch(Exception E){}
}
 if(a.getSource()==o2)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_2);
}
catch(Exception E){}
}
 if(a.getSource()==o3)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_3);
}
catch(Exception E){}
}
 if(a.getSource()==o4)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_4);
}
catch(Exception E){}
}
if(a.getSource()==o5)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_5);
}
catch(Exception E){}
}
if(a.getSource()==o6)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_6);
}
catch(Exception E){}
}
if(a.getSource()==o7)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_7);
}
catch(Exception E){}
}
if(a.getSource()==o8)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_8);
}
catch(Exception E){}
}
if(a.getSource()==o9)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_9);
}
catch(Exception E){}
}
if(a.getSource()==oo)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_0);
}
catch(Exception E){}
}
if(a.getSource()==ocolon)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_MINUS);
}
catch(Exception E){}
}
if(a.getSource()==plus)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_PLUS);
}
catch(Exception E){}
}
if(a.getSource()==backspace)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_BACK_SPACE);
}
catch(Exception E){}
}
if(a.getSource()==home)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_HOME);
}
catch(Exception E){}
}
if(a.getSource()==end)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_END);
}
catch(Exception E){}
}
if(a.getSource()==numlock)
{
numl++;
if(numl%2==0)
{
try{
numlock.setBackground(Color.RED);
Robot robot = new Robot(); 
robot.keyRelease(KeyEvent.VK_NUM_LOCK);
}
catch(Exception E){}
}
else
{ 
try{
numlock.setBackground(Color.BLUE);
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_NUM_LOCK);
}
catch(Exception E){}
}
}
if(a.getSource()==slash)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_SLASH);
}
catch(Exception E){}
}
if(a.getSource()==mult)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_MULTIPLY);
}
catch(Exception E){}
}
if(a.getSource()==minus)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_MINUS);
}
catch(Exception E){}
}
if(a.getSource()==tab)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_TAB);
}
catch(Exception E){}
}
if(a.getSource()==q)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_Q);
}
catch(Exception E){}
}
if(a.getSource()==w)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_W);
}
catch(Exception E){}
}
if(a.getSource()==e)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_E);
}
catch(Exception E){}
}
if(a.getSource()==r)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_R);
}
catch(Exception E){}
}
if(a.getSource()==t)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_T);
}
catch(Exception E){}
}
if(a.getSource()==u)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_U);
}
catch(Exception E){}
}
if(a.getSource()==i)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_I);
}
catch(Exception E){}
}
if(a.getSource()==o)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_O);
}
catch(Exception E){}
}
if(a.getSource()==p)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_P);
}
catch(Exception E){}
}
if(a.getSource()==openCurly)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_OPEN_BRACKET);
}
catch(Exception E){}
}
if(a.getSource()==closeCurly)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_CLOSE_BRACKET);
}
catch(Exception E){}
}
if(a.getSource()==per)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_BACK_SLASH);
}
catch(Exception E){}
}
if(a.getSource()==delete)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_DELETE);
}
catch(Exception E){}
}
if(a.getSource()==pageUp)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_PAGE_UP);
}
catch(Exception E){}
}
if(a.getSource()==a7)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_7);
}
catch(Exception E){}
}
if(a.getSource()==a8)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_8);
}
catch(Exception E){}
}
if(a.getSource()==a9)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_9);
}
catch(Exception E){}
}
if(a.getSource()==apl)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_PLUS);
}
catch(Exception E){}
}
if(a.getSource()==a)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_A);
}
catch(Exception E){}
}
if(a.getSource()==s)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_S);
}
catch(Exception E){}
}
if(a.getSource()==d)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_D);
}
catch(Exception E){}
}
if(a.getSource()==f)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_F);
}
catch(Exception E){}
}
if(a.getSource()==g)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_G);
}
catch(Exception E){}
}
if(a.getSource()==cpas)
{
cp++;
if(cp%2==0)
{
try{
Robot robot = new Robot(); 
robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
}
catch(Exception E){}
}
else
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_CAPS_LOCK);
}
catch(Exception E){}
}}
if(a.getSource()==h)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_H);
}
catch(Exception E){}
}
if(a.getSource()==j)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_J);
}
catch(Exception E){}
}
if(a.getSource()==k)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_K);
}
catch(Exception E){}
}
if(a.getSource()==l)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_L);
}
catch(Exception E){}
}
if(a.getSource()==m)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_M);
}
catch(Exception E){}
}
if(a.getSource()==semi)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_SEMICOLON);
}
catch(Exception E){}
}
if(a.getSource()==cote)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_QUOTE);
}
catch(Exception E){}
}
if(a.getSource()==enter)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_ENTER);
}
catch(Exception E){}
}
if(a.getSource()==pageDown)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_PAGE_DOWN);
}
catch(Exception E){}
}
if(a.getSource()==a4)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_4);
}
catch(Exception E){}
}
if(a.getSource()==a5)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_5);
}
catch(Exception E){}
}
if(a.getSource()==a6)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_6);
}
catch(Exception E){}
}
if(a.getSource()==z)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_Z);
}
catch(Exception E){}
}
if(a.getSource()==x)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_X);
}
catch(Exception E){}
}
if(a.getSource()==c)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_C);
}
catch(Exception E){}
}
if(a.getSource()==v)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_V);
}
catch(Exception E){}
}
if(a.getSource()==b)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_B);
}
catch(Exception E){}
}
if(a.getSource()==n)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_N);
}
catch(Exception E){}
}
if(a.getSource()==m)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_M);
}
catch(Exception E){}
}
if(a.getSource()==coma)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_COMMA);
}
catch(Exception E){}
}
if(a.getSource()==fullstop)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_PERIOD);
}
catch(Exception E){}
}
 if(a.getSource()==que)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_SLASH);
}
catch(Exception E){}
}
 if(a.getSource()==a1)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_1);
}
catch(Exception E){}
}
 if(a.getSource()==a2)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_2);
}
catch(Exception E){}
}
 if(a.getSource()==a3)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_3);
}
catch(Exception E){}
}
 if(a.getSource()==ap)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_PLUS);
}
catch(Exception E){}
}
 if(a.getSource()==ctrl)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_CONTROL);
}
catch(Exception E){}
}
 if(a.getSource()==star)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_WINDOWS);
robot.keyRelease(KeyEvent.VK_WINDOWS);
}
catch(Exception E){}
}
 if(a.getSource()==space)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_SPACE);
}
catch(Exception E){}
}
 if(a.getSource()==up)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_UP);
}
catch(Exception E){}
}
 if(a.getSource()==down)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_DOWN);
}
catch(Exception E){}
}
 if(a.getSource()==rt)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_RIGHT);
}
catch(Exception E){}
}
 if(a.getSource()==lt)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_LEFT);
}
catch(Exception E){}
}
 if(a.getSource()==a0)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_0);
}
catch(Exception E){}
}
 if(a.getSource()==fullstop)
{
try{
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_PERIOD);
}
catch(Exception E){}
}
if(a.getSource()==Shift)
{ 
shiftcount++;
if(shiftcount%2==0)
{
 try{
 Shift.setBackground(Color.RED);
Robot robot = new Robot(); 
robot.keyRelease(KeyEvent.VK_SHIFT);
}
catch(Exception E){}
}
else
{
try{
Shift.setBackground(Color.BLUE);
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_SHIFT);
}
catch(Exception E){}}}
if(a.getSource()==alt)
{ 
al++;
if(al%2==0)
{
try{
alt.setBackground(Color.RED);
Robot robot = new Robot(); 
robot.keyRelease(KeyEvent.VK_ALT);
}
catch(Exception E){}
}
else
{
try{
alt.setBackground(Color.BLUE);
Robot robot = new Robot(); 
robot.keyPress(KeyEvent.VK_ALT);
}
catch(Exception E){}
}
}
}

public static void main(String[] args) {
VirtualKeybord frame = new VirtualKeybord("keybord");
frame.setSize(900,280);
frame.setVisible(true);
} 
}