package com.cis.project2;

/**
 * @author Daniel Dyla
 * CIS 2151 - Prof. John P. Baugh
 * Summer 2014
 * Programming Assignment 2
 *
 * GenericShip defines a class for all ships
 * to inherit from.
 */
public class GenericShip {
	private int crew;
	private int cost;
	private String name;
	
	public GenericShip(){
		crew = 10;
		cost = 5000;
		name = "S.S. Default";
	}
	
	/**
	 * @param crew
	 * @param cost
	 * @param name
	 */
	public GenericShip(int crew, int cost, String name) {
		this.crew = crew;
		this.cost = cost;
		this.name = name;
	}

	/**
	 * @return the crew
	 */
	public int getCrew() {
		return crew;
	}

	/**
	 * @param crew the crew to set
	 */
	public void setCrew(int crew) {
		this.crew = crew;
	}

	/**
	 * @return the cost
	 */
	public int getCost() {
		return cost;
	}

	/**
	 * @param cost the cost to set
	 */
	public void setCost(int cost) {
		this.cost = cost;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}
