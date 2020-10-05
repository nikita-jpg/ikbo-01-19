import java.util.ArrayList;
import java.util.function.Consumer;

public class Exercise_1 {
    static ArrayList<Integer> arrayList;

    public static void main(String[] args) {
        System.out.println("Тест: ArrayList");

        arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        printArrayList();

        arrayList.add(0, 10);
        arrayList.add(2, 20);

        printArrayList();

        arrayList.set(1, 30);
        arrayList.set(3, 40);

        printArrayList();

        arrayList.remove(6);
        arrayList.remove(5);

        printArrayList();

        System.out.println("По индексу 1 лежит: " + arrayList.get(1));
        System.out.println("По индексу 2 лежит: " + arrayList.get(2));

        arrayList.clear();

        printArrayList();
    }

    static void printArrayList() {
        System.out.println("Вывод: ArrayList");

        if (arrayList.isEmpty()) {
            System.out.println("ArrayList: пуст");
        }

        arrayList.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
    }
}
