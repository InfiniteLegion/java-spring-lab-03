package org.example;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
    @Before("org.example.MyPointcuts.countryGetAny()")
    public void beforeCountryGetAny() {
        System.out.println("beforeCountryGetAny");
    }

    @Before("org.example.MyPointcuts.brandGetAny()")
    public void beforeBrandGetAny() {
        System.out.println("beforeBrandGetAny");
    }

    @Before("org.example.MyPointcuts.carGetAny()")
    public void beforeCarGetAny() {
        System.out.println("beforeCarGetAny");
    }

    @Before("org.example.MyPointcuts.personGetAny()")
    public void beforePersonGetAny() {
        System.out.println("beforePersonGetAny");
    }
}
