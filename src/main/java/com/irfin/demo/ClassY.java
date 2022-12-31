/*
 * ClassY.java
 *
 * Created on Dec 31, 2022, 17.43
 */
package com.irfin.demo;

import org.springframework.stereotype.Component;

/**
 * @author Irfin A.
 */
@Component
public class ClassY
{
    private final ClassX x;

    public ClassY(ClassX _x)
    {
        x = _x;
    }
}
