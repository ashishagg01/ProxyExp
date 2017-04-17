package org.acc.proxy.common;

/*
 * 
 * @author ashish.g.agarwal
 * 
*/

public class Sum implements ISum{

	public Integer value1;
    public Integer value2;
 
    public Sum(Integer val1, Integer val2) {
        value1 = val1;
        value2 = val2;
    }
 
    public Integer sum() {
        return new Integer(value1.intValue() + value2.intValue());
    }

    
}
