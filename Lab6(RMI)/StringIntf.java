import java.rmi.Remote;
import java.rmi.RemoteException;
public interface StringIntf extends Remote{
    int len(String string) throws RemoteException;	//length of string
    String conc(String s1,String s2) throws RemoteException;	//concatenation
    int index(String string,char ch) throws RemoteException;
    String lower(String string) throws RemoteException;		//toLowerCase
	String upper(String string) throws RemoteException;		//toUpperCase
}