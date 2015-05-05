package org.parttern.simple.factory;

public class Factory {
	
	public static API createAPI(int condition) {
		API api = null;
		
		if(condition ==1) {
			api = new ImplA();
		} else if(condition == 2){
			api = new ImplB();
		}
		
		return api;
	}

}
