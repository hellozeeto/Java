package ksnu.minsu.loop2;
import java.util.Scanner;



public class Run99
{

public int[] Scaning()  // 입력받기
{
Scanner input = new Scanner(System.in);
int num1 = input.nextInt();
int num2 = input.nextInt();
if(num1>num2) {
int k = 0;
k= num1;
num1 = num2;
num2 = k;
}
int[] array = {num1, num2};


return array;

}

public  void Time_table() { // 구구단 계산

int[] array = Scaning();
if(array[0] == 0 && array[1]==0) 
{
System.out.println("프로그램 종료");
System.exit(0);
}
System.out.print("어느 수 부터 어느 수 까지 곱할까요(int, int) : ");
int[] array2 = Scaning();
for(int i =array[0];i<=array[1];i++) 
{
for(int j =array2[0];j<=array2[1];j++) 
{
System.out.println(i + "*"+ j + "=" + (i*j) + "" );
}

}
}
public void Multiplication()
{
Run99 hello = new Run99();


System.out.print("몇 단 부 터 몇 단 까지 구구단을 출력할까요?(int, int) : ");

hello.Time_table();

}
}

