package operation.day20.test3;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpJie {
    public static void main(String[] args) {
        DatagramSocket datagramSocket=null;
        try {
            //监视8081端口的内容
            datagramSocket=new DatagramSocket(8081);
            byte[] buf=new byte[1024];

            //定义接收数据的数据包
            DatagramPacket datagramPacket=new DatagramPacket(buf, 0, buf.length);
            datagramSocket.receive(datagramPacket);

            //从接收数据包取出数据
            String data=new String(datagramPacket.getData() , 0 ,datagramPacket.getLength());
            System.out.println(data);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            datagramSocket.close();
        }
    }

}
