package Demo06Collection;

import java.util.ArrayList;
import java.util.Collection;

/*
Collection接口是单列集合的最顶层，定义了所有单列集合的共性，所有单列集合都可以用collection接口的方法

 */
public class MyCollection {
    public static void main(String[] args) {
        //创建集合对象（多态）
        Collection collection = new ArrayList();//重写了toString方法
        System.out.println(collection);
        /*add方法返回布尔值，一般都返回true 可以不用接收到*/
         boolean d = collection.add("贺峻霖");
        System.out.println(d);//不接收
        System.out.println(collection);
        System.out.println("=========================");

        /*
        remove集合中存在删除返回true 不存在，返回false
         */
        collection.add("syx");
        boolean a =collection.remove("syx");
        boolean b = collection.remove("lisi");
        System.out.println(a);
        System.out.println(b);
        System.out.println("==========================");


        /*
            判断集合是为空
         */
        boolean c = collection.isEmpty();
        System.out.println(c);
        /*
        size():返回集合中元素的个数
        toArray：将集合变为数组

         */
    }
}
