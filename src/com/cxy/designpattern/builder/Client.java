package com.cxy.designpattern.builder;

import com.cxy.designpattern.builder.product.Computer;

/** 
 *
 * @author chenxingyu
 */
public class Client {
	
	public static void main(String[] args) {
		ComputerBuilder builder = new InterComputerBuilder();
		ComputerDirector computerDirector = new ComputerDirector(builder);
		computerDirector.assembleComputer();
		Computer computer = builder.getComputer();
		System.out.println(computer.getCpu() + computer.getMotherboard() + computer.getMemoryBar());
	}
}
