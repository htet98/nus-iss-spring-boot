package sg.edu.nus.jpademo.controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link DummyController}.
 */
@Generated
public class DummyController__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static DummyController apply(RegisteredBean registeredBean, DummyController instance) {
    instance.cRepo = AutowiredFieldValueResolver.forRequiredField("cRepo").resolve(registeredBean);
    instance.tRepo = AutowiredFieldValueResolver.forRequiredField("tRepo").resolve(registeredBean);
    instance.uRepo = AutowiredFieldValueResolver.forRequiredField("uRepo").resolve(registeredBean);
    return instance;
  }
}
