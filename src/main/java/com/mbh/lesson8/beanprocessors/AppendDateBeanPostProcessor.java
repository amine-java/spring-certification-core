/**
 * 
 */
package com.mbh.lesson8.beanprocessors;

import java.util.Calendar;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import com.mbh.lesson8.beans.ProcessingBean;

/**
 * Appends a date time in miliseconds in the processing bean ID
 * 
 * @author amineboufatah
 *
 */
@Component
public class AppendDateBeanPostProcessor implements BeanPostProcessor, Ordered {

  public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
    if (bean instanceof ProcessingBean) {
      ProcessingBean processingBean = (ProcessingBean) bean;
      String newId = processingBean.getId() + "___" + Calendar.getInstance().getTimeInMillis();
      processingBean.setId(newId);
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
    return 1;
  }

}
