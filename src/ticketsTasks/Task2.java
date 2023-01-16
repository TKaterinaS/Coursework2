package ticketsTasks;

public class Task2 {
	public static void main(String[] args) {
		bar();
	}

	private static void bar() {
		int[] nums = {1, 2, 3};
		int x;
		for (x = 0; x < nums.length; x++) {
			x += nums[x];
		}
		System.out.println(x);
	}
}

// Значение х будет равняться 6. Потому, что метод bar() содержит в себе цикл
// (for (x = 0; x < nums.length; x++)) и массив чисел(int[] nums = {1, 2, 3};),
// и, при вызове данного цикла, он пробегается по всей длинне ( nums.length) данного массива,
// прибавляя предыдущее число к следующему (x++).
// Отсюда получается 1+2=3,3+3=6.
