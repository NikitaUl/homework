package lesson2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Starter {
    public static void main(String[] args) {
        List<String> list = new DIYarrayList<String>();

        List<String> testList = new ArrayList<String>();
        testList.add("test1");
        testList.add("test2");
        testList.add("test3");
        testList.add("test4");
        testList.add("test5");

        List<String> testList2 = new ArrayList<String>();
        testList2.add("test6");
        testList2.add("test7");

        list.addAll(testList);

        list.addAll(testList2);

        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
