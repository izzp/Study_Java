package Java高级特性.集合框架1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * 第3关：集合的体系结构
 *
 * @author zhaozhipeng
 * @version 1.0
 * @date 2021/3/24
 */
public class Q3 {
    public HashSet getHashSet() {
        /********** Begin **********/
        HashSet hashSet = new HashSet();
        hashSet.add("www.educoder.net");
        return hashSet;
        /********** End **********/
    }

    public ArrayList getArrayList() {
        /********** Begin **********/
        ArrayList arrayList = new ArrayList();
        arrayList.add("www.educoder.net");
        return arrayList;
        /********** End **********/
    }

    public LinkedList getLinkedList() {
        /********** Begin **********/
        LinkedList linkedList = new LinkedList();
        linkedList.add("www.educoder.net");
        return linkedList;
        /********** End **********/
    }

    public Map getHashMap() {
        /********** Begin **********/
        Map map = new HashMap();
        map.put("address", "www.educoder.net");
        return map;
        /********** End **********/
    }

    public static void main(String[] args) {

        Q3 hello = new Q3();

        ArrayList list = hello.getArrayList();
        System.out.println(list.get(0));
        Map map = hello.getHashMap();
        System.out.println(map.get("address"));
        LinkedList link = hello.getLinkedList();
        System.out.println(link.get(0));
        HashSet set = hello.getHashSet();
        for (Object object : set) {
            System.out.println(object);
        }
    }
}
