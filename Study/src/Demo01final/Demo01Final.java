package Demo01final;

import Demo01final.Demo02.People;

/*
final:
1.修饰类
     表示不能有任何子类，可以有父类
     final 类的所有方法都不能覆盖重写
     可以覆盖重写自己父类的方法
2.修饰方法
     此方法不能被覆盖重写
     abstract和final不能同时使用
3.修饰局部变量
     则该变量无法再次修改
     基本类型：数值无法改变
     引用类型：地址无法改变，内容可以
4.修饰成员变量
     成员变量有默认值，加final后不会赋默认值，必须手动赋值
     对于final的成员变量要不直接赋值，要不通过构造方法赋值。
     必须保证类中所有重载的构造方法，都必须给final的成员变量赋值
 */
public class Demo01Final {
    public static void main(String[] args) {
        //基本类型
        int num1 = 10;
        System.out.println(num1);
        num1 = 20;
        System.out.println(num1);
         final int num2 = 100;//不可进行更改
        People people1 = new People("赵丽颖");
        people1 = new People("哈哈哈");
        System.out.println(people1.getName());
        final People people2 = new People("贺峻霖");
        //people2 = new People("严浩翔");  错误写法
        System.out.println(people2.getName());
        people2.setName("严浩翔");
        System.out.println(people2.getName());
    }
}
