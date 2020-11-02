package com.itheima.annotation;

import com.itheima.condition.OnClassCondition;
import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/***
 * @ClassName ConditionalOnClass
 * @Description 描述
 * @version 1.0.0
 * @author ayuan
 * @createTime 2020年10月31日 16:09:00
 */
@Target({ ElementType.TYPE, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Conditional(OnClassCondition.class)
public @interface ConditionalOnClass {
    //指定所有的类全路径的字符数组
    String[] name() default {};
}
