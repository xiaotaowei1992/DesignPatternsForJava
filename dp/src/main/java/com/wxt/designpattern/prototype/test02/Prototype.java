package com.wxt.designpattern.prototype.test02;
public interface Prototype {
	Prototype clone();
	String getName();
	void setName(String name);
}