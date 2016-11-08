
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Client {
    public static void main(String arg[]) {
        DatagramSocket socket = null;
        try{
            socket=new DatagramSocket();
            String requestStr="Hello from client!";
            InetAddress host=InetAddress.getByName("localhost");
            int port=1026;
            DatagramPacket request=new DatagramPacket(requestStr.getBytes(),requestStr.length(),host,port);
            System.out.println("Sending request to server...");
            socket.send(request);
            System.out.println("Request sent.");
            byte buffer[]=new byte[1000];
            DatagramPacket reply=new DatagramPacket(buffer, buffer.length);
            //socket.setSoTimeout(2000);
            socket.receive(reply);
            buffer=reply.getData();
            String replyStr=new String(buffer,0,reply.getLength());
            System.out.println("Receiving reply from server...");
            System.out.println("Reply from server:  "+replyStr);
            
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        finally {
            socket.close();
        }
    }
}
