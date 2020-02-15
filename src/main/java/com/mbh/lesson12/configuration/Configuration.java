/**
 * 
 */
package com.mbh.lesson12.configuration;

import org.springframework.context.annotation.Import;

/**
 * @author amineboufatah
 *
 */
@org.springframework.context.annotation.Configuration
@Import({SecondConfiguration.class, FirstConfiguration.class})
public class Configuration {
}
