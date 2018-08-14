package com.cxy.designpattern.builder;

import com.cxy.designpattern.builder.product.Computer;

/** 
 *
 * @author chenxingyu
 */
public interface ComputerBuilder {
	
	/**
	 *构建CPU
	 */
	void builderCpu();
	
	/**
	 * 构建主板
	 */
	void builderMotherboard();
	
	/**
	 * 构建内存卡
	 */
	void builderMemoryBar();
	
	/**
	 * 获得电脑
	 * @return
	 */
	Computer getComputer();
}
