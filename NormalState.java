
/**
 * 
 * State 的一个实现类，正常状态
 * @author crg
 *
 */
public class NormalState implements State {
	
	/**
	 * PrinterMachineRemote 对象的引用，可以调用 PrinterMachine 的方法；
	 * transient 修饰 PrinterMachine，告诉 JVM 不要实例化该字段
	 */
	private transient PrinterMachineRemote mPrinterMachineRemote;
	@Override
	public int getStateInfo() {
		
		//0 代表正常状态
		return 0;
	}

}
