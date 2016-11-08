//package MathFunctions;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MathIntf extends Remote{
    double absolute(double d) throws RemoteException;
    double cosine(double d) throws RemoteException;
    double sine(double d) throws RemoteException;
    double tangent(double d) throws RemoteException;
    double logValue(double d) throws RemoteException; //return base10 log
}
