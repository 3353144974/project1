package operation.day19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Test10 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list=new ArrayList<>();
        BufferedReader bis = new BufferedReader(new FileReader("b.txt"));
        BufferedWriter bw=new BufferedWriter(new FileWriter("b1.txt"));
        String line = null;
        while ((line = bis.readLine()) != null) {
            list.add(line);
        }
        Collections.reverse(list);
        for (String s : list) {
            bw.write(s);
            bw.newLine();
        }
        bw.close();
        bis.close();

    }

}
