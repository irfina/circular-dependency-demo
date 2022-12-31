/*
 * ClassB.java
 *
 * Created on Dec 31, 2022, 16.35
 */
package com.irfin.demo;

import org.springframework.stereotype.Component;

/**
 * @author Irfin A.
 */
@Component
public class ClassB
{
    private ClassC c;

    public ClassB(ClassC _c)
    {
        c = _c;
    }
}
