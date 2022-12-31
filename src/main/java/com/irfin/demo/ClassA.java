/*
 * ClassA.java
 *
 * Created on Dec 31, 2022, 16.35
 */
package com.irfin.demo;

import org.springframework.stereotype.Component;

/**
 * @author Irfin A.
 */
@Component
public class ClassA
{
    private final ClassB b;

    public ClassA(ClassB _b)
    {
        b = _b;
    }
}
