package com.wxt.designpattern.facade.test04;

public class Client {
	public static void main(String[] args) {
		FacadeApi api = FacadeFactory.createFacadeApi();
		
		api.generate();
	}
	
	
}