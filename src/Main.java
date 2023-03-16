import rikkei.academy.MyList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        ArrayList<Students> list = new ArrayList<>();
//        list.add(new Students("mimi",100));
//        list.add(new Students("mimikyu",120));
//        list.add(new Students("kyu",130));
//        ArrayList<Students> studentsList=(ArrayList<Students>)list.clone();
//        System.out.println(list.clone());
//        list.ensureCapacity(10);
//        System.out.println(list.size());
        MyList<Integer> myList = new MyList<>();
        System.out.println(myList.get(1));
        myList.add(12);
        myList.add(20);
        myList.add(13);
        myList.add(21);
        myList.add(18);
        System.out.println(myList.size());
        System.out.println(myList.get(3));
        System.out.println(myList.indexOf(13));
        System.out.println(myList.indexOf(0));
        System.out.println(myList.contains(18));
        System.out.println(myList.contains(100));
        myList.clear();
        System.out.println(myList.size());
        System.out.println(myList.get(3));
    }
}