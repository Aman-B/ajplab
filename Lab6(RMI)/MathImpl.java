//package MathFunctions;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
public class MathImpl extends UnicastRemoteObject implements MathIntf {
    MathImpl() throws RemoteException {
        super();
    }
    public double absolute(double d) throws RemoteException {
        return Math.abs(d);
    }
    public double cosine(double d) throws RemoteException {
        return Math.cos(d);
    }
    public double sine(double d) throws RemoteException {
        return Math.sin(d);
    }
    public double tangent(double d) throws RemoteException {
        return Math.tan(d);
    }
    public double logValue(double d) throws RemoteException {
        return Math.log10(d);
    }
}
