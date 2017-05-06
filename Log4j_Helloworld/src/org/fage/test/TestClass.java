package org.fage.test;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

public class TestClass {
	private static Logger log = Logger.getLogger(TestClass.class);
	
	public static void main(String args[]){
		Map map = new HashMap();
		log.debug("第一次学习日志框架！！");
		testMehtod();
	}
	
	public static void testMehtod(){
		log.debug("已经开始使用当前方法");
	}

}
