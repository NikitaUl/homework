package lesson2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class Starter {
    public static void main(String[] args) {
        List<String> list = new DIYarrayList<String>();


        List<String> testList = new ArrayList<String>();
        testList.add("AAA");
        testList.add("A");
        testList.add("AAAAAAA");
        testList.add("AAAA");
        testList.add("AA");

        List<String> testList2 = new ArrayList<String>();
        testList2.add("BBBBBBBBBBBB");
        testList2.add("BBBBB");

        list.addAll(testList);

        //list.addAll(testList2);

        Collections.copy(list,testList2);

        Comparator<String> strlenComp = (a, b) -> Integer.compare(a.length(), b.length());

        Collections.sort(list,strlenComp);

        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

    }
}
