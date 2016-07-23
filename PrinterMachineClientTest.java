
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * 监视器测试程序
 * 厂长会执行这个程序，就可以得到 ，打印机报告
 * @author crg
 *
 */
public class PrinterMachineClientTest {

	public static void main(String[] args) {
		
		//远程打印机 名称数组
		String[] location = {"rmi://10.0.0.54/10_PrinterMachine", "rmi://10.0.0.54/20_PrinterMachine", "rmi://10.0.0.54/30_PrinterMachine"};
		PrinterMonitor[] printerMonitors = new PrinterMonitor[location.length];
		
		for (int i = 0; i < location.length; i++) {
			try {
				
				//获得远程打印机对象，实际上得到的是远程呢个 打印机的代理 stub
				PrinterMachineRemote printerMachineRemote = (PrinterMachineRemote) Naming.lookup(location[i]);
				printerMonitors[i] = new PrinterMonitor(printerMachineRemote);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		for (int i = 0; i < printerMonitors.length; i++) {
			
			//打印报告
			printerMonitors[i].report();
		}
	}

}
