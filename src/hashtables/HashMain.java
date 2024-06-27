package hashtables;

public class HashMain {
	
	public static void main(String[] args) {
		HashTable hashTable = new HashTable();
		//print hash table size and check if it's empty after initialization
		System.out.println(hashTable.size());
		System.out.println(hashTable.isEmpty());
		
		hashTable.put(101,  "Warner");
		hashTable.put(111,  "Steve");
		hashTable.put(121,  "John");
		
		//Check hash table size after adding some data
		System.out.println(hashTable.size());
		hashTable.remove(101);
		hashTable.remove(111);
		hashTable.remove(121);
		
		System.out.println(hashTable.get(101));
		System.out.println(hashTable.get(111));
		System.out.println(hashTable.get(121));
		System.out.println(hashTable.size());
		System.out.println(hashTable.isEmpty());
		
	}

}
