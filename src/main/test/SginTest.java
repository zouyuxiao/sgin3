import com.bean.Sign;
import com.service.SginService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

/**
 * Created by ${邹} on 2019/2/26.
 * 描述：
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:applicationContext.xml")
//@ActiveProfiles("dev")
public class SginTest {
    @Autowired
    private SginService sginService;
    @Test
    public void add(){
        Sign sign = new Sign();
        sign.setuId( (long) 1 );
        sign.setTime( new Date(  ) );
        sginService.insert( sign );
    }
}
