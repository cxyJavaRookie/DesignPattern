package com.cxy.designpattern.builder;
/** 
 *
 * @author chenxingyu
 */
public class ComputerDirector {
	
	private ComputerBuilder computerBuilder;
	
	public ComputerDirector(ComputerBuilder computerBuilder) {
		this.computerBuilder = computerBuilder;
	}
	
	public void assembleComputer(){
		computerBuilder.builderMotherboard();
		computerBuilder.builderCpu();
		computerBuilder.builderMemoryBar();
	}
}
