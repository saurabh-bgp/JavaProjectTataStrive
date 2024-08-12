import javax.swing.text.html.parser.Entity;
import java.util.*;

public class MappingJava {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(101,"Saurabh");
        hashMap.put(102,"Vishu");
        hashMap.put(103,"Rohan");
        hashMap.put(104,"Sunder");
        hashMap.put(105,"Singhle");
        System.out.println(hashMap);
        System.out.println(hashMap.get(102));
        System.out.println(hashMap.remove(102));
        System.out.println(hashMap.containsKey(102));
        System.out.println(hashMap.containsValue("Vishu"));
        System.out.println(hashMap.size());
        System.out.println(hashMap.isEmpty());
        hashMap.clear();
        System.out.println(hashMap);
        System.out.println(hashMap.isEmpty());

        LinkedHashMap linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(101,"Saurabh");
        linkedHashMap.put(102,"Vishu");
        linkedHashMap.put(103,"Rohan");
        linkedHashMap.put(104,"Sunder");
        linkedHashMap.put(105,"Singhle");
        System.out.println(linkedHashMap);
        System.out.println(linkedHashMap.get(102));
        System.out.println(linkedHashMap.remove(102));
        System.out.println(linkedHashMap.containsKey(102));
        System.out.println(linkedHashMap.containsValue("Vishu"));
        System.out.println(linkedHashMap.size());
        System.out.println(linkedHashMap.isEmpty());
        linkedHashMap.clear();
        System.out.println(linkedHashMap);
        System.out.println(linkedHashMap.isEmpty());

        TreeMap treeMap = new TreeMap<>();
        treeMap.put(101,"Saurabh");
        treeMap.put(102,"Vishu");
        treeMap.put(103,"Rohan");
        treeMap.put(104,"Sunder");
        treeMap.put(105,"Singhle");
        System.out.println(treeMap);
        System.out.println(treeMap.get(102));
        System.out.println(treeMap.remove(102));
        System.out.println(treeMap.containsKey(102));
        System.out.println(treeMap.containsValue("Vishu"));
        System.out.println(treeMap.size());
        System.out.println(treeMap.isEmpty());
        treeMap.clear();
        System.out.println(treeMap);
        System.out.println(treeMap.isEmpty());


        hashMap.put(101,"Saurabh");
        hashMap.put(102,"Vishu");
        hashMap.put(103,"Rohan");
        hashMap.put(104,"Sunder");
        hashMap.put(105,"Singhle");
        hashMap.put(108,"Sihle");
        hashMap.put(107,"Sihle");
        hashMap.put(109,"Singhle");

        Set<Integer> keySet = hashMap.keySet();
        Iterator<Integer> iterator = keySet.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
        Set<Map.Entry<Integer,String>> entrySet = hashMap.entrySet();
        for (Map.Entry<Integer, String> val : entrySet)
            System.out.println(val);
    }

}
