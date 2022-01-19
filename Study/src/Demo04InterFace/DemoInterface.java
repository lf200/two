package Demo04InterFace;

import java.util.ArrayList;
import java.util.List;

/*
java.util.List就是Arraylist实现的接口
 */
public class DemoInterface {
    public static void main(String[] args) {
        //左边接口 右边实现类 多态的写法
        List<String> list = new ArrayList<>();
        List<String> result = addNames(list);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
    public static List<String> addNames(List<String> list){
        list.add("贺峻霖 ");
        list.add("严浩翔 ");
        return list;
    }

}
