package temp;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
		System.out.println("Введите размерность массива NxM");
		//Scanner sc = new Scanner(System.in); // создаём объект типа Scanner
		Random r = new Random(); // создаём объект типа Random
		int n = 5, m = 5; // объявление переменных
		
		int mass[][] = new int[n][m]; // инициализация массива размером NxM
		for (int i = 0; i < n; i++) { // Заполнение массива случайными числами от 0 до 9
			for (int j = 0; j < m; j++) {
				mass[i][j] = r.nextInt(9);
			}
		}
		for (int i = 0; i < n; i++) {// вывод массива в консоль
			for (int j = 0; j < m; j++) {
				System.out.print(mass[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println(mass[4][4]);

	}

}
