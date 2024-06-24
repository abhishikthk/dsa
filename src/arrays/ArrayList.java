package arrays;

public class ArrayList<T> {
	private T[] arr;
	private int index;
	private int capacity;

	@SuppressWarnings("unchecked")
	ArrayList() {
		this.capacity = 10;
		this.index = 0;
		arr = (T[]) new Object[capacity];
	}

	@SuppressWarnings("unchecked")
	ArrayList(int capacity) {
		this.capacity = capacity;
		this.index = 0;
		arr = (T[]) new Object[capacity];
	}

	@SuppressWarnings("unchecked")
	void add(T item) {
		if (index == capacity) {
			capacity = capacity * 3 / 2 + 1;
			T[] newArr = (T[]) new Object[capacity];
			for (int i = 0; i < index; i++) {
				newArr[i] = arr[i];
			}
			arr = newArr;
		}
		arr[index++] = item;
	}

	T get(int index) {
		if (index >= this.index || index < 0) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + this.index);
		}
		return (T) arr[index];
	}

	int size() {
		return index;
	}

	boolean isEmpty() {
		return index == 0 ? true : false;
	}

	int currentCapacity() {
		return capacity;
	}

}
