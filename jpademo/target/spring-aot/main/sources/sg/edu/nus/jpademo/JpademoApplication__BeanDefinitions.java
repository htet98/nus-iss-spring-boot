package sg.edu.nus.jpademo;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link JpademoApplication}.
 */
@Generated
public class JpademoApplication__BeanDefinitions {
  /**
   * Get the bean definition for 'jpademoApplication'.
   */
  public static BeanDefinition getJpademoApplicationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(JpademoApplication.class);
    beanDefinition.setInstanceSupplier(JpademoApplication::new);
    return beanDefinition;
  }
}
