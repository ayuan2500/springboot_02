package com.config;

import com.itheima.pojo.User;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/***
 * @ClassName MyImportBeanDefinitionRegistrar
 * @Description ImportBeanDefinitionRegistrar实现类，只注册User的bean，不注册Role的bean
 * @version 1.0.0
 * @author ayuan
 * @createTime 2020年10月31日 20:38:00
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        //创建BeanDefiniation
        AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.rootBeanDefinition(User.class).getBeanDefinition();
        //注册bean 只注册User
        registry.registerBeanDefinition("user",beanDefinition);
    }
}
