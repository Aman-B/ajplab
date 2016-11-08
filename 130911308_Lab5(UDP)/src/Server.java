
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Server {
    public static void main(String arg[]) throws SocketException, IOException {
        DatagramSocket socket;
        DatagramPacket request;
        byte buffer[];
        int count=0;
        socket=new DatagramSocket(1026);
        while(true) {
            String data=null;
            try {
                System.out.println("Waiting for client...");
                buffer=new byte[1024];
                request=new DatagramPacket(buffer,buffer.length);
                socket.receive(request);
                data=new String(request.getData());
                System.out.println("Received: "+data);
                String replyStr="Hello from Server.";
                System.out.println("Sending: "+replyStr);
                DatagramPacket reply=new DatagramPacket(replyStr.getBytes(),replyStr.length(),request.getAddress(),request.getPort());
                socket.send(reply);
                count++;
                if(count==1) {
                    socket.close();
                    break;
                }
            }
            catch(Exception e) {
                e.printStackTrace();
            }
            
        }
    }
}
