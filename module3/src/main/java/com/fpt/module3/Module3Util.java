package com.fpt.module3;

import io.jitpack.Module1Util;
import io.jitpack.Module2Util;

public class Module3Util {
    public static void main(String[] args) {
    	Module1Util m=new Module1Util();
    	String res=m.testMethod();
    	System.out.println(res);
    	Module2Util m2=new Module2Util();
    	String result=m2.testmethod2();
    	System.out.println(result);
	}
}
