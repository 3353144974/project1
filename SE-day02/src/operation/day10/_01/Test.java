package operation.day10._01;

import java.text.DecimalFormat;

public class Test {
    public static void main(String[] args) {
//        new HandleAble(){
//            @Override
//            public void HandleString(String num) {
//                System.out.println("原数字:"+num);
//                try {
//                    double i =Double.valueOf(num);
//                    System.out.println("取整后:"+(int)i);
//                    System.out.println("保留4位小数后:" + new DecimalFormat("#.0000").format(i));
//                }catch (NumberFormatException e){
//                    e.printStackTrace();
//                }
//            }
//        }.HandleString("23.23456789");
        HandleAb((num) -> {
            System.out.println("原数字:" + num);
            double i = Double.valueOf(num);
            System.out.println("取整后:" + (int) i);
            System.out.println("保留4位小数后:" + new DecimalFormat("#.0000").format(i));
        },"23.23456789");
    }
    public static void HandleAb(HandleAble handleAble,String num){
        handleAble.HandleString(num);
    }
}
