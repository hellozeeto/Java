package ksnu.minsu.loop2;
import java.util.Scanner;
public class Average {
	void getAverage()
	{
		Scanner Scan = new Scanner(System.in);
		int count=0;
		double sum=0;
		int i=0;
		while (( i = Scan.nextInt()) != -1) {
			sum+=i;
			count++;
		}
		System.out.println("�Էµ� ���� ������ "+count+"���̸� ����� "+sum/count+"�Դϴ�.");
	}
}
