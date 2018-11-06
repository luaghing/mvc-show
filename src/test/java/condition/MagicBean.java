package condition;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;

/**
 * @author
 */
@Component
public class MagicBean {
    private String hh;
    private String cc;

    public MagicBean(){}

    public MagicBean(String hh, String cc) {
        this.hh=hh;
        this.cc=cc;
    }


    public void setHh(String hh) {
        this.hh = hh;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getHh() {
        return hh;
    }

    public String getCc() {
        return cc;
    }

    @Override
    public String toString() {
        return "MagicBean{" +
                "hh='" + hh + '\'' +
                ", cc='" + cc + '\'' +
                '}';
    }
    //    @Bean
//    @Conditional(MagicExistsCondition.class)
//    public MagicBean magicBean() {
//        return new MagicBean();
//    }

    public void said() {
        System.out.println("hello");
    }
}
