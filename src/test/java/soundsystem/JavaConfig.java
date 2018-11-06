package soundsystem;

import org.springframework.context.annotation.Bean;

/**
 * @author
 */
public class JavaConfig {
    @Bean
    public CompactDisc sgtPpers(){
        return new Sgtpeppers();
    }

    @Bean
    public CDPlayer cdPlayer(){
        return new CDPlayer(sgtPpers());
    }
}
