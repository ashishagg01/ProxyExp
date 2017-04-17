package org.acc.proxy.factory;

/*
 * 
 * @author ashish.g.agarwal
 * 
*/

import java.lang.reflect.Proxy;

import org.acc.proxy.common.ISum;
import org.acc.proxy.common.Sum;
import org.acc.proxy.handler.Handler;

public class SumFactory  {
    public ISum createSum(Integer val1, Integer val2) {
         Sum sum = new Sum(val1, val2);
         Handler handler = new Handler(sum);
         Class[] interfacesArray = new Class[] {ISum.class};
 
         return (ISum) Proxy.newProxyInstance(Sum.class.getClassLoader(), interfacesArray, handler);
    }
} 

