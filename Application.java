package koschei;

import koschei.config.AppConfig;
import koschei.models.Deth8;
import koschei.models.Duck5;
import koschei.models.Egg6;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        KoscheiTheDeathless koscheiTheDeathless =
                    (KoscheiTheDeathless) applicationContext.getBean(KoscheiTheDeathless.class);
          System.out.println(koscheiTheDeathless.getRulesByDeth());
    }
}
