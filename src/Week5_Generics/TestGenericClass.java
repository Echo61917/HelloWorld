package Week5_Generics;


import java.util.ArrayList;

public class TestGenericClass {
    public static void main(String[] args)
    {
        OperateOnArray list = new OperateOnArray<Integer>(new ArrayList<>());

        list.push(10);
        list.push(20);
        list.push(30);
        list.push(100);
        list.push(50);

        System.out.println(list.isSorted());
        System.out.println(list.max());
        System.out.println(list.linearSearch(100));
        System.out.println(list.binarySearch(100));



    }



}
