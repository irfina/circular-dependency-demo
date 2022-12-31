/*
 * ClassX.java
 *
 * Created on Dec 31, 2022, 17.43
 */
package com.irfin.demo;

import org.springframework.stereotype.Component;

/**
 * @author Irfin A.
 */
@Component
public class ClassX
{
    private final ClassY y;

    public ClassX(ClassY _y)
    {
        y = _y;
    }
}
