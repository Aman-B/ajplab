import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
public class StringImpl extends UnicastRemoteObject implements StringIntf {
	StringImpl() throws RemoteException {
		super();
	}
	public int len(String string) throws RemoteException {
		return string.length();
	}
    public String conc(String s1,String s2) throws RemoteException {
		return s1.concat(s2);
	}
    public int index(String string,char ch) throws RemoteException {
		return string.indexOf(ch);
	}
    public String lower(String string) throws RemoteException {
		return string.toLowerCase();
	}
	public String upper(String string) throws RemoteException {
		return string.toUpperCase();
	}
}