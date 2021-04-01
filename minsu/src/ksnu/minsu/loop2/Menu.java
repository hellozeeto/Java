package ksnu.minsu.loop2;
import java.util.Scanner;

public class Menu {
public static void main(String[] args)
{
Scanner Scan = new Scanner(System.in);
MenuPrint Menuprint = new MenuPrint();

int num=7;
while (num!=0)
{
Menuprint.print();
num=Scan.nextInt();
switch(num)
{
case 1:
CoffeePrice Coffee = new CoffeePrice();
Coffee.calcPrice();
break;
case 2:
Average Average = new Average();
Average.getAverage();
break;
case 3:
AtoZ AtoZ = new AtoZ();
AtoZ.PrintAtoZ();
break;
case 4:
DoSum doSum = new DoSum();
doSum.printSum();
break;
case 5:
JustRun99 Print99 = new JustRun99();
Print99.PrintJustRun99();
break;
case 6:
Run99 Multipl = new Run99();
Multipl.Multiplication();
break;
}
}
Scan.close();
}
}
