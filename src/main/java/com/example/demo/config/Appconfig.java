/**
 * @Project:
 * @Author: liming
 * @Date: 2018年11月12日
 */
package com.example.demo.config;

import com.example.demo.service.App;
import org.springframework.boot.autoconfigure.AutoConfigurationExcludeFilter;
import org.springframework.boot.context.TypeExcludeFilter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * ClassName: Appconfig
 * @Description:
 * @author liming
 * @date 2018年11月12日
 */

@Configuration
@ComponentScan(
       /* excludeFilters = {@ComponentScan.Filter(
                classes = {TypeExcludeFilter.class}
        ), @ComponentScan.Filter(
                type = FilterType.CUSTOM,
                classes = {AutoConfigurationExcludeFilter.class}
        )}*/
       basePackages = {"com.example.demo.*"}
)
public class Appconfig {
}
