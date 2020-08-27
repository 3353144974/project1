package operation.day12.test12;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        String[] str={"♠","♥","♣","♦"};
        String[] str1={"J","Q","K","A"};
        for (int i = 0; i < str.length; i++) {
            for (int j = 2; j <=10 ; j++) {
                list.add(str[i]+j);
            }
            for (int j = 0; j < str1.length; j++) {
                list.add(str[i]+str1[j]);
            }
        }
        list.add("大王");
        list.add("小王");
        Collections.shuffle(list);
        ArrayList<String> paly1=new ArrayList<>();
        ArrayList<String> paly2=new ArrayList<>();
        ArrayList<String> paly3=new ArrayList<>();
        ArrayList<String> DiPai=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(i>=51){
                DiPai.add(list.get(i));
            }else {
                if(i%3==0){
                    paly1.add(list.get(i));
                }else if(i%3==1){
                    paly2.add(list.get(i));
                }else {
                    paly3.add(list.get(i));
                }
            }
        }
      if (paly1.contains("大王")) {
            for (int i = 0; i < DiPai.size(); i++) {
                paly1.add(DiPai.get(i));
            }
        }else if (paly2.contains("大王")) {
            for (int i = 0; i < DiPai.size(); i++) {
                paly2.add(DiPai.get(i));
            }
        }else if (paly3.contains("大王")) {
            for (int i = 0; i < DiPai.size(); i++) {
                paly3.add(DiPai.get(i));
            }
        }
        System.out.println(paly1);
        System.out.println(paly2);
        System.out.println(paly3);

    }
}
