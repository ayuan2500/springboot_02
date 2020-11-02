package com.itheima.condition;


import com.itheima.annotation.ConditionalOnClass;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;


/***
 * @ClassName OnClassCondition
 * @Description 描述
 * @version 1.0.0
 * @author ayuan
 * @createTime 2020年10月31日 15:22:00
 */
public class OnClassCondition implements Condition {

    /***
     * @title matches
     * @description 返回true 则满足条件  返回false 则不满足条件
     * @param context 上下文信息对象 可以获取环境的信息 和容器工程 和类加载器对象
	 * @param metadata 注解的元数据 获取注解的属性信息
     * @return boolean
     * @author ayuan
     * @updateTime 2020/10/31 15:29
     */
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        //获取注解的信息
        Map<String, Object> annotationAttributes = metadata.getAnnotationAttributes(ConditionalOnClass.class.getName());
        //获取注解中的name的方法的数据值
        String[] names = (String[]) annotationAttributes.get("name");
        for (String name : names) {
            try {
                // 获取成功
                Class.forName(name);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                // 获取失败
                return false;
            }
        }
        return true;
    }
}
