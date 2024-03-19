package task2;

public class ArrayList<T> {
    private Object[] elements;
    private int size;

    public ArrayList() {
        elements = new Object[10];
        size =  0;
    }

    public ArrayList(int initialCapacity) {
        elements = new Object[initialCapacity];
        size =  0;
    }

    public void add(T element) {
        if (size == elements.length) {
            grow();
        }
        elements[size] = element;
        size++;
    }

    public T get(int index) {
        if (index <  0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return (T) elements[index];
    }

    public void set(int index, T element) {
        if (index <  0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        elements[index] = element;
    }

    public int size() {
        return size;
    }

    private void grow() {
        int newSize = elements.length *  2;
        Object[] newElements = new Object[newSize];
        System.arraycopy(elements,  0, newElements,  0, size);
        elements = newElements;
    }
}

