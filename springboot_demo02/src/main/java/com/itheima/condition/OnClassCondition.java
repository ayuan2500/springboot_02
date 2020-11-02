package com.itheima.condition;


import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;


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
        // 需求：当pom中有redis-client坐标时，返回true，否则返回false
        try {
            // 1.获取当前的redis的类字节码对象
            Class.forName("redis.clients.jedis.Jedis");
            // 2.加载成功则说明存在 redis的依赖 返回true
            return true;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            // 3.如果加载不成功则redis依赖不存在 返回false
            return false;
        }
    }
}
