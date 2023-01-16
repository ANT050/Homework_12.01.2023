/*4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2.
- Реализовать в методе main
- Реализовать в разных методах
int i = new Random().nextInt(k); //это кидалка случайных чисел!)*/

import java.util.Random;

/*Реализовано в методе main*/
public class Task_4 {
	public static void main(String[] args) {

		// Получение случайного числа n диапазона от 2 до 10
		int n = new Random().nextInt(9) + 2;
		System.out.print("\nСлучайное число n диапазона от 2 до 10 = " + n);

		// Получение случайного числа i диапазона 32600-32767
		int i = (int) (Math.random() * (Short.MIN_VALUE - (-32600) + 1)) + (-32600);
		System.out.print("\nДиапазон: от " + Short.MIN_VALUE + " до  " + i + "\n");

		// Создание массив m2 и заполнение его числами кратными n
		// из диапазона от Short.MIN_VALUE до i
		int[] m2 = new int[i - Short.MIN_VALUE];
		int index = 0;
		for (int j = Short.MIN_VALUE; j <= i; j++) {
			if (j % n != 0) {
				m2[index++] = j;
			}
		}

		// Вывод окончательного массива в терминал
		int[] resultArray = new int[index];
		System.arraycopy(m2, 0, resultArray, 0, index);
		System.out.print("\nВсе некратные n числа в диапазоне от " + Short.MIN_VALUE + " до " + i + ": [");

		for (int j = 0; j < resultArray.length; j++) {
			if (j != resultArray.length - 1) {
				System.out.print(resultArray[j] + ", ");
			} else {
				System.out.print(resultArray[j]);
			}
		}
		System.out.print("]\n");
	}
}

/*Реализовано в разных методах*/
/*
public class Task_4 {
	public static void main(String[] args) {
		int n = new Random().nextInt(9) + 2;
		System.out.print("\nСлучайное число n диапазона от 2 до 10 = " + n);

		int i = (int) (Math.random() * (Short.MIN_VALUE - (-32600) + 1)) + (-32600);
		System.out.print("\nДиапазон: от " + Short.MIN_VALUE + " до  " + i + "\n");
		int[] m2 = createArray(i, n);
		printArray(m2, i);
	}

	// Метод создания массива
	public static int[] createArray(int i, int n) {
		int length = 0;
		for (int j = Short.MIN_VALUE; j <= i; j++) {
			if (j % n != 0) {
				length++;
			}
		}
		int[] m2 = new int[length];
		int index = 0;
		for (int j = Short.MIN_VALUE; j <= i; j++) {
			if (j % n != 0) {
				m2[index++] = j;
			}
		}
		return m2;
	}

	// Метод вывода окончательного массива в терминал
	public static void printArray(int[] m2, int i) {
		System.out.print("\nВсе некратные n числа в диапазоне от " + Short.MIN_VALUE + " до " + i + ": [");
		for (int j = 0; j < m2.length; j++) {
			if (j != m2.length - 1) {
				System.out.print(m2[j] + ", ");
			} else {
				System.out.print(m2[j]);
			}
		}
		System.out.print("]\n");
	}
}
*/