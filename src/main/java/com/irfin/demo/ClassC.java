/*
 * ClassC.java
 *
 * Created on Dec 31, 2022, 16.53
 */
package com.irfin.demo;

import org.springframework.stereotype.Component;

/**
 * @author Irfin A.
 */
@Component
public class ClassC
{
    private final ClassA a;

    public ClassC(ClassA _a)
    {
        a = _a;
    }
}
