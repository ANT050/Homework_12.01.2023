/*1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
- Пункты реализовать в методе main
- Пункты реализовать в разных методах
int i = new Random().nextInt(k); //это кидалка случайных чисел!)*/

import java.util.Random;

public class Task_1 {
	public static void main(String[] args) {
		int randomNum = new Random().nextInt(2001);
		int i = randomNum;
		System.out.println("\nСлучайное целое число: " + i);
	}
}

/*Пункты реализованы в разных методах*/
/*
public class Task_1 {
	public static void main(String[] args) {
		int randomNum = RandomNumber();
		printValue(randomNum);
	}

	// Метод выбора случайного сила
	public static int RandomNumber() {
		return new Random().nextInt(2001);
	}

	// Метод вывода значения в терминал
	public static void printValue(int value) {
		System.out.println("\nСлучайное целое число: " + value);
	}
}
*/