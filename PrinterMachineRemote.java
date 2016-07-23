import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 远程接口
 * @author crg
 * 方法的返回类型都必须是 可序列化的，因为要在网络传输
 *
 */
public interface PrinterMachineRemote extends Remote {
	public int getCount() throws RemoteException;
	public int getLocation() throws RemoteException;
	public State getState() throws RemoteException;
}
