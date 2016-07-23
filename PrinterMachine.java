
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class PrinterMachine extends UnicastRemoteObject implements PrinterMachineRemote {
	
	//打印机位置，及第几台打印机
    private int location;

    //打印机当前的打印页数
    private int pages;

    //打印机当前的状态
    private State state;
    
	protected PrinterMachine(int location, int pages) throws RemoteException {
		super();
		this.pages = pages;
        this.location = location;
        this.state = new NormalState();
	}

	@Override
	public int getCount() throws RemoteException {
		// TODO Auto-generated method stub
		return pages;
	}

	@Override
	public int getLocation() throws RemoteException {
		// TODO Auto-generated method stub
		return location;
	}

	@Override
	public State getState() throws RemoteException {
		// TODO Auto-generated method stub
		return state;
	}

}
