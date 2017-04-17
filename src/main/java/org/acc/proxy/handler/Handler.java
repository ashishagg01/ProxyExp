package org.acc.proxy.handler;

/*
 * 
 * @author ashish.g.agarwal
 * 
*/

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import org.acc.proxy.common.Sum;
 
public class Handler implements InvocationHandler {
 
    public Sum trueSum;
 
    public Handler(Sum sum) {
        this.trueSum = sum;
    }
 
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try {
            return method.invoke(trueSum, args);
        } catch ( Exception e ) {
            return new Integer(0);
        }
    }
} 

