package operation.As4;

import java.util.*;

public class Test04 {

    public static void ﬁndMaxAge(ArrayList<Worker> workers){
        Worker maxAgeWorker= workers.get(0);
        for (int i = 0; i < workers.size(); i++) {
            Worker worker= workers.get(i);
           if(worker.getAge()>maxAgeWorker.getAge()){
               maxAgeWorker=worker;
           }
        }
        maxAgeWorker.show();
    }
    public static void main(String[] args) {
        Worker w1=new Worker("bz001","黄渤",45);
        Worker w2=new Worker("bz002","孙红雷",48);
        Worker w3=new Worker("bz003","罗志祥",35);
        ArrayList<Worker> list=new ArrayList<>();
        list.add(w1);
        list.add(w2);
        list.add(w3);
        ﬁndMaxAge(list);
    }
}
