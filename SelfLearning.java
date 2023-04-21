import java.util.*;

public class SelfLearning {

    public static void main(String[] args) {
        //Java Array List
        List<String> list = new ArrayList<>();
        list.add("Jun Kai");
        list.add("Keane");
        list.add("Chester");
        list.add("Andy");

        for (String i : list){
            if (i.startsWith("J")){
                System.out.println(i);
            }
        }

        list.stream().filter(i -> i.startsWith("J")).forEach(i -> System.out.println(i));


        //Java Hashmap
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");

        map.forEach((key,value) -> System.out.println(key+": "+ value));

        map.entrySet().stream().filter(k -> k.getKey()%2==0).forEach(obj -> System.out.println(obj));
    }
}
