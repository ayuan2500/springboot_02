package com.config;

import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/***
 * @ClassName EnableUser
 * @Description 描述
 * @version 1.0.0
 * @author ayuan
 * @createTime 2020年10月31日 20:12:00
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(UserConfig.class)
public @interface EnableUser {
}