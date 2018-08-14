package com.cxy.designpattern.builder;

import com.cxy.designpattern.builder.product.Computer;

/** 
 *
 * @author chenxingyu
 */
public class InterComputerBuilder implements ComputerBuilder{
	
	public Computer computer = new Computer();
	
	public void builderCpu() {
		computer.setCpu("Inter CPU");
		System.out.println("获得Inter Cpu");
	}

	public void builderMotherboard() {
		computer.setMotherboard("Inter 主板");
		System.out.println("获得Inter 主板");
		
	}

	public void builderMemoryBar() {
		computer.setMemoryBar("Inter 内存条");
		System.out.println("获得金士顿 内存条");
	}

	public Computer getComputer() {
		return computer;
	}
	
}
