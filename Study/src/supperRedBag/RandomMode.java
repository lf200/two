package supperRedBag;

import Red.OpenMode;

import java.util.ArrayList;
import java.util.Random;

public class RandomMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(final int totalMoney,final int totalCount) {
        ArrayList<Integer>list = new ArrayList<>();
        //最少一分钱,最多不超过总金额减人数+1，即其他人至少一份
        //第一次发红包：0.01--totalMoney - totalCount+1
        Random random = new Random();
        //totalMoney总金额   totalCount 总人数
        int leftMoney = totalMoney;
        int leftCount = totalCount;
        //最后一个人直接减即可
        for (int i = 0 ;i<totalCount-1;i++){
            //生成随机金额
            int money = random.nextInt(leftMoney - leftCount )+1 ;
            list.add(money);//红包分发放入集合
            leftMoney -=  money;//金额减少
            leftCount--;//剩下的红包个数
        }
        //最后一个红包直接放
        list.add(leftMoney);


        return list;
    }
}
