package hello.core.scan.filter;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.assertj.core.api.Assertions;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class ComponentFilterAppConfIgTEST {

    @Test
    void filterScan(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(ComponentFilterAppConfig.class);
        BeanA beanA = ac.getBean("beanA", BeanA.class);
        assertThat(beanA).isNotNull();


        assertThrows(
                NoSuchBeanDefinitionException.class,
                ()->ac.getBean("beanB", BeanB.class)
        );

    }




    @Configuration
    @ComponentScan(includeFilters = @ComponentScan.Filter(classes = MyIncludeComponent.class),
                   excludeFilters = @ComponentScan.Filter(classes = MyExcludeComponent.class)
    )

    static class ComponentFilterAppConfig{

    }
}
