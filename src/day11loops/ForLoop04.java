package day11loops;

import java.util.Scanner;

public class ForLoop04 {

	public static void main(String[] args) {
		/*
        Ask user to enter the length of the perpendicular side of an isoscles right triangle
        then create the triangle by using *
        Example: side length = 3
                 *
                 * *
                 * * *
 */

Scanner scanner = new Scanner(System.in);
System.out.println("Enter the lenght of side..");
int len = scanner.nextInt();
for(int i=1;i<len+1;i++) {
	for(int j=1;j<i+1;j++) {
		System.out.print("* ");
	}
	System.out.println();
	}

	}

}
