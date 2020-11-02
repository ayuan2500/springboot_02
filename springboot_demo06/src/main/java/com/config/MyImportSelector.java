package com.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/***
 * @ClassName MyImportSelector
 * @Description 描述
 * @version 1.0.0
 * @author ayuan
 * @createTime 2020年10月31日 20:25:00
 */
public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        //返回要注册到spring容器中的Bean的全路径
        return new String[]{"com.itheima.pojo.User","com.itheima.pojo.Role"};
    }
}
