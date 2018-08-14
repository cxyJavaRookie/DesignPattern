package com.cxy.designpattern.builder.product;
/** 
 *
 * @author chenxingyu
 */
public class Computer {
	
	private String cpu;
	private String motherboard;
	private String memoryBar;
	
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public String getMotherboard() {
		return motherboard;
	}
	public void setMotherboard(String motherboard) {
		this.motherboard = motherboard;
	}
	public String getMemoryBar() {
		return memoryBar;
	}
	public void setMemoryBar(String memoryBar) {
		this.memoryBar = memoryBar;
	}
}
