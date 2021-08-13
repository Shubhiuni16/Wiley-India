
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArraysProperSubset {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 6 };
		int[] arr1 = { 1, 2, 3, 4 , 5 };
		Set<Integer> set = new HashSet<>();
		Set<Integer> set1 = new HashSet<>();
		for (int t : arr) {
			set.add(t);
		}
		for (int t : arr1) {
			set1.add(t);
		}

		if (set.size() < set1.size()) {

			boolean result = set1.containsAll(set);

			System.out.println(result);

		} else {
			System.out.println("flase");
		}

		/*************************************/

		/*List<Integer> l = new ArrayList<>();

		for (int t : arr) {
			l.add(t);
		}
		List<Integer> l1 = new ArrayList<>();

		for (int t : arr1) {
			l1.add(t);
		}

		int count = 0;

		for (int i = 0; i < l.size(); i++) {

			if (!(l1.contains(l.get(i)))) {
				count++;
			}
		}
		if (count == 1) {
			System.out.println("possible");
		} else
			System.out.println("not possible");*/
		
		for(int i = 0 ; i < arr.length ;i++) {
			if(set1.contains(arr[i])) {
				int n = arr[i];
				set.remove(n);
			}
		}
		if(set.size() == 1) {
			System.out.println("possible");
		}else
			System.out.println("not possible");
	}
}
