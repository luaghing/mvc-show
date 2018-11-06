package soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;

/**
 * @author
 */
@Configuration
@ComponentScan(basePackages = "soundsystem")
@ContextConfiguration(locations = "classpath*:springconfig.xml")
public class CDPlayerConfig {
}
