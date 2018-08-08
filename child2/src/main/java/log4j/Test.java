package log4j;
        import org.apache.log4j.Logger;

/**
 * Created by sing on 2018/8/3.
 * desc:
 */
public class Test {
    private static  final Logger LOGGER = Logger.getLogger(Test.class);

    public  void  test(String mess){
        LOGGER.info(mess);
    }
}
