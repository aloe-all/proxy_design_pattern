import java.rmi.RemoteException;

/**
 * 本地客户端监控器，运行在厂长办公室的jvm上，监控工厂的打印机
 * 
 * @author crg
 *
 */
public class PrinterMonitor{
        private PrinterMachineRemote printerMachineRemote;
        public PrinterMonitor(PrinterMachineRemote printerMachineRemote ){
                this.printerMachineRemote = printerMachineRemote;
        }

        public void report(){
                try {
					System.out.println("the PrinterMachine state is :" + printerMachineRemote.getState().getStateInfo());
					System.out.println("the PrinterMachine location is :" + printerMachineRemote.getLocation());
					System.out.println("the PrinterMachine pages is :" + printerMachineRemote.getCount());
				} catch (RemoteException e) {
					e.printStackTrace();
				}
        }
}