package cleancode;
import java.util.Scanner;

public class Calculate{
public void simple(float p, float t, float r) {
float amt = (p*t*r)/100;
System.out.format("%s",amt);
}
public void compound(float p, float t, float r) {
double amt = Math.pow(1+(r/t), t);
double cin = amt-p;
System.out.format("%s", cin);
}
public void details() {
try (Scanner sc = new Scanner(System.in)) {
Boolean flag = true;
Calculate s = new Calculate();
while(flag) {
System.out.format("%s", "1.Simple Interest\n2.Compound Interest\n");
System.out.format("%s", "Select which operation to performed : \n");
int ch = sc.nextInt();
System.out.format("%s", "Enter the principle amout given : ");
float p = sc.nextFloat();
System.out.format("%s", "Enter the number of years : ");
float t = sc.nextFloat();
System.out.format("%s", "Enter the rate of interest : ");
float r = sc.nextFloat();
switch(ch) {
case 1 :
System.out.format("%s","-----SIMPLE INTEREST-----\n");
System.out.format("%s", "The simple interest for the given amount is : ");
s.simple(p, t, r);
System.out.format("%s", "\n");
System.out.println("\nDo you want to perform more operations?(y/n)");
        ch=sc.next().charAt(0);
        if(ch == 'y'||ch=='Y')
        flag = true;
        else {
        flag = false;
        System.out.format("%s","Exit");
        }
        break;
case 2:
System.out.format("%s","-----COMPOUND INTEREST-----\n");
System.out.format("%s", "The compound interest for the given amount is : ");
s.compound(p, t, r);
System.out.format("%s", "\n");
System.out.format("%s","\nDo you want to perform more operations?(y/n)");
        ch=sc.next().charAt(0);
        if(ch == 'y'||ch=='Y')
        flag = true;
        else {
        flag = false;
        System.out.println("Exit");
        }
        break;
}
}
}
catch(Exception e) {
System.out.format("%s", "Input exception");
}

}


}


