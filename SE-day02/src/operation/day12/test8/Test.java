package operation.day12.test8;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        ArrayList<Mankind> list=new ArrayList<>();
        Mankind mankind=new Mankind("张三",20,1.80);
        Mankind mankind2=new Mankind("李四",20,1.60);
        Mankind mankind3=new Mankind("王五",20,1.70);
        Mankind mankind4=new Mankind("麻子",20,1.70);
        Mankind mankind5=new Mankind("赵六",20,1.70);
        list.add(mankind);
        list.add(mankind2);
        list.add(mankind3);
        list.add(mankind4);
        list.add(mankind5);
        Iterator<Mankind> iterator = list.iterator();
        double maxMankind=list.get(0).getHeight();
        double minMankind=list.get(0).getHeight();
        String name1="";
        String name2="";
        while (iterator.hasNext()){
            Mankind m=iterator.next();
            if(m.getHeight()>maxMankind){
                maxMankind=m.getHeight();
                name1=m.getName();
            }
            if(m.getHeight()<minMankind){
                minMankind=m.getHeight();
                name2=m.getName();
            }
        }
        System.out.println("最高的人是："+name1+",身高"+String.format("%.2f", maxMankind));
        System.out.println("最高的人是："+name2+",身高"+String.format("%.2f", minMankind));
    }
}
