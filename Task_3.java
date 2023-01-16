/*3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
- Реализовать в методе main
- Реализовать в разных методах
int i = new Random().nextInt(k); //это кидалка случайных чисел!)*/

import java.util.Random;

/*Реализовано в методе main*/

public class Task_3 {
	public static void main(String[] args) {

		// Получение случайного числа n диапазона 150-1500
		int n = new Random().nextInt(1351) + 150;
		System.out.print("\nСлучайное число n диапазона от 150 до 1500 = " + n);

		// Получение случайного числа i диапазона 0-32767
		int i = new Random().nextInt(Short.MAX_VALUE);
		System.out.print("\nДиапазон: от " + i + " до " + Short.MAX_VALUE + "\n");

		// Создание массив m1 и заполнение его числами кратными n
		// из диапазона от i до Short.MAX_VALUE
		int[] m1 = new int[Short.MAX_VALUE - i];
		int index = 0;
		for (int j = i; j <= Short.MAX_VALUE; j++) {
			if (j % n == 0) {
				m1[index++] = j;
			}
		}

		// Вывод окончательного массива в терминал
		int[] resultArray = new int[index];
		System.arraycopy(m1, 0, resultArray, 0, index);
		System.out.print("\nВсе кратные n числа в диапазоне от " + i + " до " + Short.MAX_VALUE + ": [");

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
public class Task_3 {
	public static void main(String[] args) {
		int n = new Random().nextInt(1351) + 150;
		System.out.print("\nСлучайное число n диапазона от 150 до 1500 = " + n);

		int i = new Random().nextInt(Short.MAX_VALUE);
		System.out.print("\nДиапазон: от " + i + " до " + Short.MAX_VALUE + "\n");
		int[] m1 = createArray(i, n);
		printArray(m1, i);
	}

	// Метод создания массива
	public static int[] createArray(int i, int n) {
		int length = 0;
		for (int j = i; j <= Short.MAX_VALUE; j++) {
			if (j % n == 0) {
				length++;
			}
		}
		int[] m1 = new int[length];
		int index = 0;
		for (int j = i; j <= Short.MAX_VALUE; j++) {
			if (j % n == 0) {
				m1[index++] = j;
			}
		}
		return m1;
	}

	// Метод вывода окончательного массива в терминал
	public static void printArray(int[] m1, int i) {
		System.out.print("\nВсе кратные n числа в диапазоне от " + i + " до " + Short.MAX_VALUE + ": [");
		for (int j = 0; j < m1.length; j++) {
			if (j != m1.length - 1) {
				System.out.print(m1[j] + ", ");
			} else {
				System.out.print(m1[j]);
			}
		}
		System.out.print("]\n");
	}
}
*/