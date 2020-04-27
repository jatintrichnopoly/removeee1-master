package com.epam.RemoveA;

public class RemovingAFirst {

	public Object shif(String string) {
		int st=string.length();
		String result=string;
		if(string.charAt(0)=='A' && string.charAt(1)=='A') {
			result=string.substring(2,st);
		}
		if(string.charAt(0)=='A' && string.charAt(1)!='A') {
			result=string.substring(1,st);
		}
		if(string.charAt(0)!='A' && string.charAt(1)=='A') {
			result= string.charAt(0)+string.substring(2,st);
		}
		return result;
	}

}
