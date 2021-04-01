package ksnu.minsu.loop2;
import java.util.Scanner;

public class DoSum {
public void printSum() {
int sum =0;
System.out.println("두 정수 x와 y값 입력 : ");
Scanner Input = new Scanner(System.in);
int x = Input.nextInt();
int y = Input.nextInt();
sum = x;
for(int i=x+1;i<=y;i++,System.out.println()) 
{System.out.printf(sum+"+"+i+"="+"%d",sum+i);
sum += i;
}
}
}
