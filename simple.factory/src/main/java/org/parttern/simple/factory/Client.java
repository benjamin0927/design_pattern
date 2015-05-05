package org.parttern.simple.factory;

public class Client {

	public static void main(String[] args) {
		API api = Factory.createAPI();
		api.operation("Simple API Testing");
	}

}
