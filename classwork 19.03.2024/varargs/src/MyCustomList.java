import java.util.ArrayList;
import java.util.Iterator;

public class MyCustomList<T> implements Iterable {
    private ArrayList<T> items;
    public MyCustomList(){
        items = new ArrayList<>();
    }
    public void add(T element){
        items.add(element);
    }

    @Override
    public Iterator iterator() {
        return new MyCustomIterator();
    }

    public  class MyCustomIterator implements Iterator<T>{
        private int index = 0;

        @Override
        public boolean hasNext() {
            return items.size() > index;
        }

        @Override
        public T next() {
            return items.get(index++);
        }
    }
}
