import java.io.*;
import java.util.Scanner;
class lenovo{
	public static void main(String args[]){
		System.out.println("enter how many subjects?");
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int marks[]=new int[n];
		for (int i=0;i<n;i++){
			System.out.println("enter marks of sub"+(i+1));
			marks[i]=in.nextInt();
		}
		int total=0;
		for (int i=0;i<n;i++){
			total=total+marks[i];
		}
		System.out.println("total marks=="+total);

		float percent=(float)total/n;
		System.out.println("total percentage"+percent);
	}
	


}