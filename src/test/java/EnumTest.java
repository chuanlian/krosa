import com.baidu.pangu.JobModule;
import org.junit.Test;

/**
 * Created by yangchuanlian on 2016/11/22.
 */
public class EnumTest {

    @Test
    public void test() {
        System.out.println(JobModule.market.getCode());
        System.out.println(JobModule.market.getName());
        System.out.println(JobModule.market.toString());
    }
}
