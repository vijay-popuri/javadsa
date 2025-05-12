package dsa.basicprogs;

//this is used for sorting order only if the elements are sequential then it will find the element in O(1) .
//if the elements are sorted and un sequental then it wil take arounf O(n).'
public class InterPolationSearch {

	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50, 60, 70 };
		int low = 0;
		int x = 110;
		int flag = 0;
		int high = a.length - 1;
		while (low <= high && x >= a[low] && x <= a[high]) {
			if (a[high] == a[low])
				break;

			int pos = low + ((x - a[low]) * (high - low)) / (a[high] - a[low]);
			if (a[pos] == x) {
				flag = 1;
				break;
			} else if (a[pos] < x) {
				low = pos + 1;
			} else {
				high = pos;
			}
		}
		if (flag == 1) {
			System.out.println("Element Found");
		} else {
			System.out.println("Element not dfound");
		}

	}

}
