/**
 * 
 */
package com.mbh.lesson8.beanprocessors;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import com.mbh.lesson8.beans.ProcessingBean;

/**
 * Appends a default ID in the case where the ID for a ProcessingBean is null
 * 
 * @author amineboufatah
 *
 */
@Component
public class AppendDefaultIDBeanProcessor implements BeanPostProcessor, Ordered {

  public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
    if (bean instanceof ProcessingBean) {
      ProcessingBean processingBean = (ProcessingBean) bean;
      if (processingBean.getId() == null) {
        processingBean.setId("DefaultID");
      }
      return processingBean;
    }
    return bean;
  }

  /*
   * (non-Javadoc)
   * 
   * @see org.springframework.core.Ordered#getOrder()
   */
  @Override
  public int getOrder() {
    return 0;
  }

}
