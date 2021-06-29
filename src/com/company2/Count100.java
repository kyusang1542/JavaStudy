package com.company2;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// 어노테이션
// 어노테이션으로 등록하기 위해서는 @Retention 어노테이션을 붙여주어야함
// 실행시 감지할 수 있도록 RetentionPolicy.RUNTIME 어노테이션을 붙여줌
@Retention(RetentionPolicy.RUNTIME)
public @interface Count100 {

}
