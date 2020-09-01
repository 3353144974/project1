                  package operation.day20.test3;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UdpFa {
    public static void main(String[] args) {
        String data="hello UDP";
        DatagramSocket datagramSocket=null;
        try {
            //实例化套接字，并指定发送端口
            datagramSocket=new DatagramSocket(8080);
            //指定数据目的地的地址，以及目标端口
            InetAddress destination=InetAddress.getByName("localhost");
            DatagramPacket datagramPacket=
                    new DatagramPacket(data.getBytes(), data.getBytes().length,destination,8081);
            //发送数据
            datagramSocket.send(datagramPacket);
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            datagramSocket.close();
        }
    }

}
