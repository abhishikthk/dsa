package arrays;

public class ArrayMain {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>(2);
		System.out.println("Is the array list empty? "+ arrayList.isEmpty());
		
		arrayList.add(1);
		arrayList.add(2);
		
		System.out.println("Current capacity is "+arrayList.currentCapacity());
		
		arrayList.add(3);
		arrayList.add(4);
		
		System.out.println("Current capacity is "+arrayList.currentCapacity());
		
		arrayList.add(5);
		arrayList.add(6);
		
		System.out.println("Current capacity is "+arrayList.currentCapacity());
		
//		arrayList.add("Hello");
//		arrayList.add(true);
//		arrayList.add(null);
		
		System.out.println("Printing array list elements:");
		for(int i = 0; i<arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		System.out.println("Size of the array list is "+ arrayList.size());
		System.out.println("Is the array list empty? "+ arrayList.isEmpty());
		System.out.println("Current capacity is "+arrayList.currentCapacity());
		
		//System.out.println(arrayList.get(15));

	}
}
