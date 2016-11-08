//package MathFunctions;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MathServer {
    public static void main(String arg[]) {
        try {
            MathImpl mathImpl=new MathImpl();
            Naming.rebind("MathServer", mathImpl);
        } catch (RemoteException | MalformedURLException ex) {
            Logger.getLogger(MathServer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
