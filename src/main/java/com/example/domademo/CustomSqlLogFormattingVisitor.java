package com.example.domademo;

import org.seasar.doma.jdbc.SqlLogFormattingFunction;
import org.seasar.doma.jdbc.dialect.MysqlDialect;
import org.seasar.doma.wrapper.BooleanWrapper;

public class CustomSqlLogFormattingVisitor extends MysqlDialect.MysqlSqlLogFormattingVisitor {
    public static final CustomBooleanType BOOLEAN = new CustomBooleanType();

    @Override
    public String visitBooleanWrapper(BooleanWrapper wrapper, SqlLogFormattingFunction p, Void q) throws RuntimeException {
        return p.apply(wrapper, BOOLEAN);
    }
}
