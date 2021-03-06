import com.maxeler.maxcompiler.v1.kernelcompiler.Kernel;
import com.maxeler.maxcompiler.v1.managers.MAX3BoardModel;
import com.maxeler.maxcompiler.v1.managers.standard.Manager;
import com.maxeler.maxcompiler.v1.managers.standard.Manager.IOType;

public class PassThroughHWBuilder {
	  private static final int nxMax = 416;

	public static void main(String[] args) {
		Manager m = new Manager("PassThrough", MAX3BoardModel.MAX3424A);
		Kernel k = new PassThroughKernel( m.makeKernelParameters(), nxMax,
		                                 new FloatingPointParam(8, 24));

		m.setKernel(k);

		m.setIO(IOType.ALL_PCIE);

		m.build();
	}
}
