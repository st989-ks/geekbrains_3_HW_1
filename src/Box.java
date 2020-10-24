import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> storage = new ArrayList<>();

    public void put(T fruit) {
        storage.add( fruit );
    }

    public T get() {
        return storage.remove( 0 );
    }

    public float getWeight() {
        float weight = 0;
        for (int i = 0; i < storage.size(); i++) {
            weight += storage.get( i ).getWeight();
        }
        return weight;
    }

    public boolean compare(Box<?> box) {
        return Math.abs(this.getWeight() - box.getWeight()) < 0.001;
    }

    public void pourBox(Box<T> box) {
        while (!storage.isEmpty()) {
            box.put( this.get() );
        }
    }

    public int size() {
        return storage.size();
    }

}