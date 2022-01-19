package Demo07Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*Iterator 迭代器：遍历数组
Iterator是一个接口，需要实现类来进行使用
collection有一个方法：Iterator（），就是接口的实现类
步骤：先用Iterator（）方法获取迭代器的实现类对象用接口接收
     用hasNext（）判读是否还有下一个对象
     用next（）取出集合中的下一个元素

 */
public class MyIterator {
    public static void main(String[] args) {


        Collection<String> collection = new ArrayList<>();
        collection.add("hjl");
        collection.add("yhx");

    }
}
