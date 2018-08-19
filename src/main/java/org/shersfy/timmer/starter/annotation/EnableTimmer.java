package org.shersfy.timmer.starter.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.shersfy.timmer.starter.selector.TimmerSelector;
import org.springframework.context.annotation.Import;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(TimmerSelector.class)
public @interface EnableTimmer {

}
