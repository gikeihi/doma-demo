package com.example.domademo;

import org.seasar.doma.jdbc.dialect.Dialect;
import org.seasar.doma.jdbc.dialect.MysqlDialect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DomaConfiguration {
    @Bean
    public Dialect dialect() {
        return new MysqlDialect(new CustomSqlLogFormattingVisitor());
    }
}
