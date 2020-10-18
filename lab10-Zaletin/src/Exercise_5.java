import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Exercise_5 {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = Decision.newHashMap("First", "1");
        hashMap.put("Second", "2");
        System.out.println(hashMap);

        ArrayList<Integer> arrayList = Decision.newArrayList(1);
        arrayList.add(2);
        System.out.println(arrayList);

        HashSet<Integer> hashSet = Decision.newHashSet(123);
        hashSet.add(321);
        hashSet.add(321);
        System.out.println(hashSet);
    }

}
