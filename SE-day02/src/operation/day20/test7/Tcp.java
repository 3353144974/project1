package operation.day20.test7;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Tcp {

    public static void main(String[] args) throws Exception {
        System.out.println("服务器 启动..... ");
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        ServerSocket serverSocket = new ServerSocket(8888);
        while (true) {
            Socket accept = serverSocket.accept();
            Thread thread = new Thread(() -> {
                try {
                    InputStream is = accept.getInputStream();
                    BufferedInputStream bis = new BufferedInputStream(is);
                    FileOutputStream fos = new FileOutputStream("d:\\a\\" + UUID.randomUUID() + ".txt");
                    BufferedOutputStream bos = new BufferedOutputStream(fos);
                    while (true) {
                        int len = bis.read();
                        if (len == -1) {
                            break;
                        }
                        bos.write(len);
                        bos.flush();
                    }
                    System.out.println("文件上传已保存");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
            executorService.submit(thread);
        }

    }
}
