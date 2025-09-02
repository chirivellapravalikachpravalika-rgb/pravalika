import java.awt.*;
import java.awt.event.*;
public class Mycalculater extends frame implements actionlistener{
double num1,num2,result;
label lbl1,lbl2,lbl3;
textfield tf1,tf2,tf3;
buton btn1,btn2,btn3,btn4;
char op;
my calculator(){
lbl1=new label("number1:");
lbl1.set bonds(50,100,100,300);
tf1=new textfield();
tf1.setbounds(160,100,100,30);
lbl2=new label("number2:");
lbl2.setbounds(50,170,100,30);
tf2=new textfield();
tf2.setbounds(160,170,100,30);
tbn1=new botton("+");
btn1.setbounds(50,250,40,40);
btn2=new botton("-");
btn2.setbounds(120,250,40,40);
btn3=new button("*");
btn3.setbounds(190,250,40,40);
btn4=ne button("/");
btn4.setbounds(260,250,40,40);
lbl3=new lebel("result:");
lbl3.setbounds(160,320,100,30);
tf3=new textfield();
tf3.setbounds(160,320,100,30);
btn1.addaction listener(this);
btn2.addaction listener(this);
btn3.addaction listener(this);
btn4.addaction listener(this);
add(lbl1); add(lbl2); add(lbl3);
add(tf1); add(tf2); add(tf3);
add(btn1); add(btn2); add(btn3);
set size(400,500);
set layout(null);
set title("calculator");
set visible(true);
}
public void action performed(actionevent){
num1=double.parsedouble(tf1.get text());
num2=double.parsedouble(tf2.gettext());
if(ae.get source()==btn1)
{
result=num1+num2;
tf3.set text(string.value of(result));
}
if(ae.getsource()==btn3)
{
result=num1_num2;
tf3.set text(string.value of(result));
}
if(ae.getsource()==btn3)
{
result=num1*num2;
tf3.set text(string.value of(result));
}
}
public static void main(string args[]){
my calculator calc=new my calculator();
}
}