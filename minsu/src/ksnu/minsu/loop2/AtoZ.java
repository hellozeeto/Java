package ksnu.minsu.loop2;

public class AtoZ {
	public void PrintAtoZ() {
		char A ='a';
		do {
			System.out.print(A);
			A=(char)(A+1);
		} while (A<='z');
		System.out.println();
	}
}
