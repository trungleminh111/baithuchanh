package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  Hãy viết chương trình nhậpvào 2sốnguyênvà inra giá trịlớn nhất và bé nhất.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap a");
		int a = sc.nextInt();
		
		System.out.println("nhap b");
		int b = sc.nextInt();
		System.out.println( a > b ?  a +" la so lon nhat " : b +" la so lon nhat");
		System.out.println( a < b ?  a +" la so be nhat " : b +" la so lon be");

	}

}
