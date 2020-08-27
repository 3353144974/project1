package day14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap<>();
        ArrayList<String> arr=new ArrayList<>();
        ArrayList<String> arr2=new ArrayList<>();
        Collections.addAll(arr,"♦", "♣", "♥", "♠");
        Collections.addAll(arr2,"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");
        int count=1;
        hm.put(count++,"大王");
        hm.put(count++,"小王");
        for (String i:arr2){
            for (String j:arr){
                String str=i+j;
                hm.put(count++,str);
            }
        }
        Set<Integer> integers = hm.keySet();
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(integers);
        Collections.shuffle(list);
        ArrayList<Integer> paly1=new ArrayList<>();
        ArrayList<Integer> paly2=new ArrayList<>();
        ArrayList<Integer> paly3=new ArrayList<>();
        ArrayList<Integer> dipaiNo=new ArrayList<>();
        for (int i=0;i<list.size();i++){
            Integer no=list.get(i);
            if(i>=51){
                dipaiNo.add(no);
            }else {
                if(i%3==0){
                    paly1.add(no);
                }else if(i%3==1){
                    paly2.add(no);
                }else {
                    paly3.add(no);
                }
            }
        }
        Collections.sort(paly1);
        Collections.sort(paly2);
        Collections.sort(paly3);
        Collections.sort(dipaiNo);
        ArrayList<String> paly11=new ArrayList<>();
        ArrayList<String> paly22=new ArrayList<>();
        ArrayList<String> paly33=new ArrayList<>();
        ArrayList<String> dipai=new ArrayList<>();
        for (Integer i:paly1){
            String s = hm.get(i);
            paly11.add(s);
        }
        for (Integer i:paly2){
            String s = hm.get(i);
            paly22.add(s);
        }
        for (Integer i:paly3){
            String s = hm.get(i);
            paly33.add(s);
        }
        for (Integer i:dipaiNo){
            String s = hm.get(i);
            dipai.add(s);
        }
        System.out.println("令狐冲："+paly11);
        System.out.println("石破天："+paly22);
        System.out.println("鸠摩智："+paly33);
        System.out.println("底牌："+dipai);

    }
}
