package org.example;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {
    @Pointcut("execution(public * Country.get*())")
    public void countryGetAny() {}

    @Pointcut("execution(public * Brand.get*())")
    public void brandGetAny() {}

    @Pointcut("execution(public * Car.get*())")
    public void carGetAny() {}

    @Pointcut("execution(public * Person.get*())")
    public void personGetAny() {}
}
