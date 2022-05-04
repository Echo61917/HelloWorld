package Week6_DataStructures;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args)
    {
        Map<String, Integer> treeMap = new TreeMap<>();

        treeMap.put("ZZZ", 1000);
        treeMap.put("ZZZ", 1001);
        treeMap.put("Iven", 15);
        treeMap.put("Carlos", 30);
        treeMap.put("Carmen", 50);
        treeMap.put("Hazel", 20);



        System.out.println(treeMap);
    }
}
