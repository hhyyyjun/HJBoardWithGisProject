package com.lee.hjboard.common;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Map;

//Object type 변수가 비어있는지 체크
public class StringUtil {
    public static Boolean empty(Object obj) {
        if (obj instanceof String) return obj == null || "".equals(obj.toString().trim());
        else if (obj instanceof List) return obj == null || ((List<?>) obj).isEmpty();
        else if (obj instanceof Map) return obj == null || ((Map<?, ?>) obj).isEmpty();
        else if (obj instanceof Object[]) return obj == null || Array.getLength(obj) == 0;
        else return obj == null;
    }
 
    public static Boolean notEmpty(Object obj) {
        return !empty(obj);
    }
}
