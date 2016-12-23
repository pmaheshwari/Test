import java.util.Arrays;

public class MyArrayList {

	Object[] array;
	int initialSize = 0;

	public MyArrayList() {
		array = new Object[10];

	}

	public void add(Object obj) {
		if (array.length - initialSize < 5) {
			increaseSize();
		} else {
			array[initialSize++] = obj;
		}
	}

	public Object get(int index) {
		if (initialSize < index) {
			throw new ArrayIndexOutOfBoundsException();
		} else {
			return array[index];
		}
	}

	public Object remove(int index) {
		if (initialSize < index) {
			throw new ArrayIndexOutOfBoundsException();
		} else {
			Object temp = array[index];
			while (index < initialSize) {
				array[index] = array[index + 1];
				array[index + 1] = null;
				index++;
			}
			initialSize--;
			return temp;
		}
	}

	private Object[] increaseSize() {
		// TODO Auto-generated method stub
		return Arrays.copyOf(array, array.length * 2);
	}

	public static void main(String[] args) {
		MyArrayList list = new MyArrayList();
		list.add("abbj");
		list.add("dsd");
		list.add("hjhkj");
		list.add("hnjkjkj");
		list.remove(0);
		System.out.println(list.get(0));
	}
}
