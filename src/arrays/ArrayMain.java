package arrays;

/*
 * PROS -
 * Fast lookups, fast push & pop, ordered/continuous memory blocks
 * 
 * CONS -
 * Slow inserts, slow deletes, fixed size
 */
public class ArrayMain {

	public static void main(String[] args) {

		ArrayList<Integer> arrayList = new ArrayList<>(2);
		System.out.println("Is the array list empty? " + arrayList.isEmpty());

		arrayList.add(1);
		arrayList.add(2);

		System.out.println("Current capacity is " + arrayList.currentCapacity());

		arrayList.add(3);
		arrayList.add(4);

		System.out.println("Current capacity is " + arrayList.currentCapacity());

		arrayList.add(5);
		arrayList.add(6);

		System.out.println("Current capacity is " + arrayList.currentCapacity());

//		arrayList.add("Hello");
//		arrayList.add(true);
//		arrayList.add(null);

		System.out.println("Printing array list elements:");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		System.out.println("Size of the array list is " + arrayList.size());
		System.out.println("Is the array list empty? " + arrayList.isEmpty());
		System.out.println("Current capacity is " + arrayList.currentCapacity());

		// Exception handling
		// System.out.println(arrayList.get(15));

	}

	/*
	 * Print array of int type
	 */
	public static void printIntArray(int[] arr) {
		System.out.print("[ ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println("]");
	}

}
