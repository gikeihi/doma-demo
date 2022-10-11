package com.example.domademo;

import org.seasar.doma.jdbc.type.BooleanType;

public class CustomBooleanType extends BooleanType {
    @Override
    protected String doConvertToLogFormat(Boolean value) {
        return value.toString();
    }
}
