package com.lee.hjboard.common;

import org.springframework.jdbc.support.JdbcUtils;

import java.util.HashMap;
//mapper resultmap 생략
//camel case 처리
@SuppressWarnings("serial")
public class CustomMap extends HashMap<String, Object> {

    @Override
    public Object put(String key, Object value) {
        return super.put(JdbcUtils.convertUnderscoreNameToPropertyName(key), value);
    }
    
}