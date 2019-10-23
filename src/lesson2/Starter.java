package lesson2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

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

        DIYarrayList.copy(list,testList);

        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        List<String> list2 = new DIYarrayList<String>();
        DIYarrayList.copy(list2,testList);

        for (int i=0;i<list2.size();i++){
            System.out.println(list2.get(i));
        }
    }
}
