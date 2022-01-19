package Demo05haomiaozhi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
计算一个人出生了多少天
 1.先用Scanner获取出生日期
 2.获取当前日期，将两个日期转化为毫秒值
 3.毫秒值相减，将毫秒值转化为天即可
 */
public class Practice {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的出生日期：格式为yyyy-MM-dd");
        String birthdayDate =sc.next();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = sdf.parse(birthdayDate);
        long time1 = date1.getTime();
        Date date2 = new Date();
        long time2 = date2.getTime();
        long time3 = time2 - time1;
        long day = time3/1000/3600/24;
        System.out.println("您出生了"+day+"天");
    }
}
