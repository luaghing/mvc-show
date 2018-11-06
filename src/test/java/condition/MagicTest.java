package condition;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import static org.junit.Assert.assertNotNull;

/**
 * @author
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Config.class)
public class MagicTest {
    @Autowired
    @Qualifier("magic3")
    private MagicBean mb;


    @Autowired
    private MagicExistsCondition mc;


    @Test
    public void cdShouldNotBeNull(){
        System.out.println(mb.toString());
        mb.said();
        assertNotNull(mb);
        assertNotNull(mc);
    }
}
