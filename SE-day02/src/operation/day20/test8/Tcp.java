package operation.day20.test8;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Tcp {
    public static void main(String[] args) throws Exception {
        System.out.println("服务器 启动..... ");
        Properties pro = new Properties();
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        pro.load(new FileInputStream("D:\\a\\1.txt"));
        Set<String> strings = pro.stringPropertyNames();
        ServerSocket serverSocket = new ServerSocket(8888);
        while (true) {
            Socket accept = serverSocket.accept();
            Thread thread = new Thread(() -> {
                try {
                    InputStream is = accept.getInputStream();
                    InputStreamReader isr = new InputStreamReader(is);
                    BufferedReader br = new BufferedReader(isr);
                    String[] split = br.readLine().split("=");
                    OutputStream os = accept.getOutputStream();
                    OutputStreamWriter osw = new OutputStreamWriter(os);
                    BufferedWriter bw = new BufferedWriter(osw);
                    boolean a = true;
                    for (String key : strings) {
                        if (split[0].equals(key)) {
                            a = false;
                            if (pro.getProperty(split[0]).equals(split[1])) {
                                bw.write("登录成功");
                                bw.flush();
                            } else {
                                bw.write("密码错误");
                                bw.flush();
                            }
                        }
                    }
                    if (a) {
                        FileOutputStream fos = new FileOutputStream("D:\\a\\1.txt", true);
                        fos.write((split[0] + "=" + split[1] + "\r\n").getBytes());
                        bw.write("注册成功");
                        bw.flush();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
            executorService.submit(thread);
        }
    }

}
