import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Demo3_Threads {
    public static void main(String[] args) throws InterruptedException {
        new Receive().start();
        Thread.sleep(1000);
        new Sentd().start();
    }
}

class Receive extends Thread{
    public void run()
    {
        DatagramSocket socket = null;
        try {
            socket = new DatagramSocket(6666);
        } catch (SocketException e) {
            throw new RuntimeException(e);
        }
        DatagramPacket packet = new DatagramPacket(new byte[1024],1024);
        while(true)
        {
            try {
                socket.receive(packet);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            byte[] arr = packet.getData();
            int n = packet.getLength();
            String ip = packet.getAddress().getHostAddress();
            int port = packet.getPort();
            System.out.println(ip+":"+port+":"+new String(arr,0,n));
        }
    }
}

class Sentd extends Thread{
    public void run()
    {
        DatagramSocket socket = null;
        try {
            socket = new DatagramSocket();
        } catch (SocketException e) {
            throw new RuntimeException(e);
        }
        DatagramPacket packet  ;
        Scanner scanner = new Scanner(System.in);
        while(true)
        {
            String line = scanner.nextLine();
            try {
                packet =
                        new DatagramPacket(line.getBytes(),line.getBytes().length, InetAddress.getByName("127.0.0.1"),6666);
            } catch (UnknownHostException e) {
                throw new RuntimeException(e);
            }
            try {
                socket.send(packet);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
