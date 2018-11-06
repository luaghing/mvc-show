package condition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author
 */
@Configuration
@ComponentScan(basePackages = "condition")
public class Config {
    @Bean(name = "magic1")
    public MagicBean magicBean1() {
        return new MagicBean("22", "33");
    }

    @Bean(name = "magic2")
    public MagicBean magicBean2() {
        return new MagicBean("33", "44");
    }

    @Bean(name="magic3")
    public MagicBean magicBean3() {
        MagicBean mb = new MagicBean();
        mb.setCc("99");
        mb.setHh("88");
        return mb;
    }

}
