package dsa.basicprogs;

public class BinarySearch {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int left = 0, ele = 18, flag = 0;
		int right = a.length - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (a[mid] == ele) {
				flag = 1;
				break;
			}
			if (ele < a[mid]) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		if (flag == 1) {
			System.out.println("element found");
		} else {
			System.out.println("eleemnt not found");
		}

	}

}
