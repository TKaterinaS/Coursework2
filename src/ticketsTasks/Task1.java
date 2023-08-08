package ticketsTasks;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Введите целое число: ");
		int number = scanner.nextInt();
		System.out.println(sumDigits(number));
	}
	public static int sumDigits(int i){
		return i ==0 ? 0:i % 10 + sumDigits(i/10);
	}
}
