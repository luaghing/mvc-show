package soundsystem;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
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
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {
    @Rule
    public final StandardOutputStreamLog  log = new StandardOutputStreamLog();


    @Autowired
    private MediaPlayer player;

    @Autowired
    @Qualifier("blankDisc")
    private CompactDisc cd;

    @Test
    public void cdShouldNotBeNull(){
        assertNotNull(cd);
    }
//    @Test
//    public void play(){
//        player.play();
//        assertEquals("playing Sgt.pepper`s Lonely Hearts Club Band"+" by The Beatles\n",log.getLog());
//    }
    @Test
    public void play1(){
        cd.play();
    }
}
