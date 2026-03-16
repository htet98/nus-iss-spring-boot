package sg.edu.nus.jpademo.controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link DummyController}.
 */
@Generated
public class DummyController__BeanDefinitions {
  /**
   * Get the bean definition for 'dummyController'.
   */
  public static BeanDefinition getDummyControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(DummyController.class);
    InstanceSupplier<DummyController> instanceSupplier = InstanceSupplier.using(DummyController::new);
    instanceSupplier = instanceSupplier.andThen(DummyController__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
