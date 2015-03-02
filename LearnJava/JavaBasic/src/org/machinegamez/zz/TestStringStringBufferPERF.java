package org.machinegamez.zz;

/*
 * String和StringBuffer的效率对比
 * 将26个英文字母加了10000次
 * 
 * (参考测试结果：String: 1477ms StringBuffer: 1ms)
 * 
 */
public class TestStringStringBufferPERF {

	
	public static void main(String[] args) {
		String fragment = "abcdefghijklmnopqrstuvwxyz";
		int times = 10000;
		
		// String
		long timeStart1 = System.currentTimeMillis();
		String str1 = "";
		for(int i = 0; i < times; i++){
			str1 += fragment;
		}
		long timeEnd1 = System.currentTimeMillis();
		System.out.println("String: " + (timeEnd1 - timeStart1) + "ms");
		
		// StringBuffer
		long timeStart2 = System.currentTimeMillis();
		StringBuffer str2 = new StringBuffer();
		for(int i = 0; i < times; i++) {
			str2.append(fragment);
		}
		long timeEnd2 = System.currentTimeMillis();
		System.out.println("StringBuffer: " + (timeEnd2 - timeStart2) + "ms");
	}
}
