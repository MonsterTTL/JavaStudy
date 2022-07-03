import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Demo2_Send {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        DatagramSocket socket = new DatagramSocket();
        DatagramPacket packet;
        while(true)
        {
            String line = sc.nextLine();
            //System.out.println("how:" + line);

//            while(sc.hasNext())
//            {   sc.next();
//                Thread.sleep(1000);
//                System.out.println("还有");
//            }
            if("quit".equals(line))
                break;
            packet = new DatagramPacket(line.getBytes(),line.getBytes().length, InetAddress.getByName("127.0.0.1"),6666);
            socket.send(packet);

        }
        socket.close();

    }
}
