package operation.As7._07;

import java.util.ArrayList;

public class GouWuChe {
 ArrayList<Goods> list=new ArrayList<>();
 public void addGoods(Goods goods){
     list.add(goods);
     for (int i = list.size()-1; i < list.size(); i++) {
         System.out.println("加入 "+list.get(i).name+" 成功");
     }

 }
 public void showGoods(){
     System.out.println("==========打印商品==========");
     System.out.println("n选购的商品为：");
     for (int i = 0; i < list.size(); i++) {
         System.out.println("     "+list.get(i).id+","+list.get(i).name+","+list.get(i).price);
     }
 }
 public void total(){
     System.out.println("------------------");
     double sum=0;
     double num=0;
     for (int i = 0; i < list.size(); i++) {
         num+=list.get(i).price;
         if(list.get(i) instanceof EGoods){
             sum+=list.get(i).price*0.88;
         }else {
             sum+=list.get(i).price;
         }
     }
     System.out.println("原  价为:"+num+"元");
     System.out.println("折后价为:"+sum+"元");
 }
}
