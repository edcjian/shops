package com.example.demo.config;



import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author helen
 * @since 2020/4/1
 */
@EnableTransactionManagement
@Configuration
@MapperScan("com.example.demo.mapper")
public class MybatisPlusConfig {
/*@Bean
public MyMetaObjectHandler metaObjectHandler(){
    return new MyMetaObjectHandler();
    }*/
    /**
     * 分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}
