import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StringServer {
    public static void main(String arg[]) {
        try {
            StringImpl stringImpl=new StringImpl();
            Naming.rebind("StringServer", stringImpl);
        } catch (RemoteException | MalformedURLException ex) {
            Logger.getLogger(StringServer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}