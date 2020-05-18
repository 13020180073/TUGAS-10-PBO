import javax.swing.*;
public class Swing extends JFrame
{
Swing(){

super ("INI SWING...");
setSize(300,300);
show();
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String[] args)
{
Swing sw=new Swing();
}
}