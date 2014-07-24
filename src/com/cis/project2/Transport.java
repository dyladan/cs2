package com.cis.project2;

/**
 * @author Daniel Dyla
 * CIS 2151 - Prof. John P. Baugh
 * Summer 2014
 * Programming Assignment 2
 *
 * Transport defines a ship class with
 * cargo capacity
 */
public class Transport extends GenericShip {
	private int capacity;
	
	public Transport() {
		super();
		this.capacity = 100;
	}

	/**
	 * @param capacity
	 */
	public Transport(int capacity) {
		super();
		this.capacity = capacity;
	}

	/**
	 * @return the capacity
	 */
	public int getCapacity() {
		return capacity;
	}

	/**
	 * @param capacity the capacity to set
	 */
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public void help() {
		System.out.println("Help! We're under attack!");
	}
}
