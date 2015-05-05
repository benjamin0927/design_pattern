package org.parttern.simple.factory;

public class Client {

	public static void main(String[] args) {
		API api = Factory.createAPI(1);
		api.operation("Simple API Testing");
	}

}
