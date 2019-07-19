package com.wxt.designpattern.facade.test04;

public class FacadeFactory {

	private FacadeFactory(){
		
	}
	
	public static FacadeApi createFacadeApi(){
		return new Facade();
	}
}
