package Demo05haomiaozhi;

import java.util.Date;

/*
计算从某年的某天到另一年的某天
可将年月日化为毫秒值进行计算
 */
public class Demo01Date {
    public static void main(String[] args) {
        demo01();
        demo02();
        demo03();
    }/*
    空参构造方法
    获取当前的日期和时间
    */
    public  static void demo01(){
        Date date = new Date();
        System.out.println(date);
    }
    /*
    带参数的构造方法
     */
    public static void demo02(){
        Date da = new Date(0L);
        System.out.println(da);
        Date da2 = new Date(1212452L);
        System.out.println(da2);
    }
    /*
    Date类的成员方法getTime(),将日期转化为毫秒
     */
    public static void demo03(){
        Date date3 = new Date();
        long time =  date3.getTime();//将现在的时间转化为毫秒值
        System.out.println(time);
    }
}
