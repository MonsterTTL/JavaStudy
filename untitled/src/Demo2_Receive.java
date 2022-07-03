import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Demo2_Receive {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(6666);
        DatagramPacket packet = new DatagramPacket(new byte[1024],1024);
        int n;
        byte[] arr;
        while(true)
        {
            socket.receive(packet);
            arr = packet.getData();
            n = packet.getLength();

            String ip = packet.getAddress().getHostAddress();
            int port = packet.getPort();

            System.out.println(ip + ":" + port + ":" + new String(arr,0,n));
        }
    }
}
