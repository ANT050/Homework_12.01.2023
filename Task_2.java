/*2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
- Реализовать в методе main
- Реализовать в разных методах
int i = new Random().nextInt(k); //это кидалка случайных чисел!)*/

import java.util.Random;
import java.util.Scanner;

/*Используя цикл While и рандомное число*/ 

public class Task_2 {
	public static void main(String[] args) {

		int randomNum = new Random().nextInt(99_001) + 1_000;
		System.out.println("\nСгенерированное случайное число диапазона от 1 000 до 10 000 является: " + randomNum);

		int n = 0;
		while (randomNum != 0) {
			randomNum = randomNum / 2;
			n++;
		}
		System.out.println("Номер наиболее значимого бита случайного числа равен: " + n);
	}
}


/*Используя цикл While и рандомное число (пункты реализованы в разных методах)*/
/*
public class Task_2 {

	public static void main(String[] args) {
		int randomNum = RandomNumber();
		System.out.println("\nСгенерированное случайное число диапазона от 1 000 до 10 000 является: " + randomNum);

		int n = MostSignificantBit(randomNum);
		System.out.println("Номер наиболее значимого бита случайного числа равен: " + n);
	}

	// Метод выбора случайного сила
	public static int RandomNumber() {
		return new Random().nextInt(99_001) + 1_000;
	}

	// Метод нахождения старшего значащего бита выпавшего числа
	public static int MostSignificantBit(int number) {
		int n = 0;
		while (number != 0) {
			number = number / 2;
			n++;
		}
		return n;
	}
}*/


/*-------------------------------------------------------------------------------------------------------------------------*/

/*Используя цикл While и ввод числа пользователем*/
/*
public class Task_2 {
	public static void main(String[] args) {

		Scanner userNumber = new Scanner(System.in);
		System.out.print("\nВведите число: ");
		int number = userNumber.nextInt();
		userNumber.close();

		int n = 0;
		while (number != 0) {
			number = number / 2;
			n++;
		}
		System.out.println("Номер наиболее значимого бита случайного числа равен: " + n);
	}
}
*/

/*Используя цикл While и ввод числа пользователем (пункты реализованы в разных методах)*/
/*
public class Task_2 {
	public static void main(String[] args) {
		int number = readingEnteredNumber();
		int n = MostSignificantBit(number);
		System.out.println("Номер наиболее значимого бита числа равен: " + n);
	}

	// Метод считывания номера, введеного пользователем
	public static int readingEnteredNumber() {
		Scanner userNumber = new Scanner(System.in);
		System.out.print("\nВведите число: ");
		int number = userNumber.nextInt();
		userNumber.close();
		return number;
	}

	// Метод нахождения старшего значащего бита выпавшего числа
	public static int MostSignificantBit(int num) {
		int n = 0;
		while (num != 0) {
			num = num / 2;
			n++;
		}
		return n;
	}
}*/


/*-------------------------------------------------------------------------------------------------------------------------*/

/*Используя метод Java Math log() и рандомное число*/
/*
public class Task_2 {
	public static void main(String[] args) {

		int randomNum = new Random().nextInt(10_000);
		System.out.println("\nСгенерированное случайное число является:: " + randomNum);

		int n = (int) (Math.log(randomNum) / Math.log(2)) + 1;
		System.out.println("Номер наиболее значимого бита случайного числа равен: " + n);

	}
}*/


/*Используя метод Java Math log() и ввод числа пользователем*/
/*
public class Task_2 {
	public static void main(String[] args) {

		Scanner userNumber = new Scanner(System.in);
		System.out.print("\nВведите число: ");
		int number = userNumber.nextInt();
		userNumber.close();

		int n = (int) (Math.log(number) / Math.log(2)) + 1;
		System.out.println("Номер наиболее значимого бита случайного числа равен: " + n);

	}
}
*/