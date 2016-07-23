
import java.io.Serializable;

/**
 * 打印机的状态接口，把此接口序列化，所有的实现类中的 State 就可以在网络上传送了
 * @author crg
 *
 */
public interface State extends Serializable {
	public int getStateInfo();
}
