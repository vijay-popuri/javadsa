package dsa.basicprogs;

public class InsertionSort {
	public static void main(String[] args) {
		int a[] = { 45, 56, 78, 45, 232, 56, 7, 3, };
		for (int i = 1; i <= a.length - 1; i++) {
			int t = a[i];
			for (int j = i - 1; j >= 0; j--) {
				if (t < a[j]) {
					a[j + 1] = a[j];
					a[j] = t;
				}
			}

		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
