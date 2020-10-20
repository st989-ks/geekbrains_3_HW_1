import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String [] arr = {"1","2","3","4","5"};
        changeArr( arr,4,1 );
        System.out.println("1зд\n" + Arrays.toString(arr));

        ArrayList<String> arrayList = ArrayToArrayList( arr );
        System.out.println("\n2зд\n" + arrayList.toString());

        System.out.println("\n3зд\n");

        Box<Apple> apple = new Box<>();
        for (int i = 0; i < 20; i++) {
            apple.put(new Apple());
        }

        Box<Orange> orange = new Box<>();
        for (int i = 0; i < 10; i++) {
            orange.put(new Orange());
        }

        System.out.println("сравнение веса коробок (compare): " + apple.compare(orange));

        Box<Apple> apple2 = new Box<>();
        for (int i = 0; i < 15; i++) {
            apple2.put(new Apple());
        }

        System.out.println("коробка с яблоками до пересыпки:" + apple.size());
        System.out.println("вторая коробка с яблоками до пересыпки: " + apple2.size());
        apple.pourBox(apple2);
        System.out.println("коробка с яблоками после пересыпки: " + apple.size());
        System.out.println("вторая коробка с яблоками после пересыпки: " + apple2.size());

    }
    public static <T> void changeArr(T[] array, int x, int y) {
        T t = array[x];
        array[x] = array[y];
        array[y] = t;
    }

    public static <T> ArrayList<T> ArrayToArrayList(T[] arr) {
        ArrayList<T> arrayList = new ArrayList<>( arr.length );
        for (int i = 0; i < arr.length; i++) {
            arrayList.add( arr[i] );
        }
        return arrayList;
    }
}
