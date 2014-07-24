package com.cis.project2;

import java.util.Random;

/**
 * @author Daniel Dyla
 * CIS 2151 - Prof. John P. Baugh
 * Summer 2014
 * Programming Assignment 2
 *
 * Warship defines a ship class with
 * photon torpedos, phaser banks, shield,
 * and name of captain
 */
public class Warship extends GenericShip {
	private int torpedos;
	private int phasers;
	private double shield;
	private String captain;
	
	public Warship() {
		super();
		this.torpedos = 2;
		this.phasers = 2;
		this.shield = 100.0;
		this.captain = "Snuggles";
	}

	/**
	 * @param torpedos
	 * @param phasers
	 * @param shield
	 * @param captain
	 */
	public Warship(int torpedos, int phasers, double shield, String captain) {
		super();
		this.torpedos = torpedos;
		this.phasers = phasers;
		this.shield = shield;
		this.captain = captain;
	}
	/**
	 * @return random damage between 0 and 100
	 */
	
	public int fire() {
		Random rand = new Random();
		
		return rand.nextInt(101);
	}

	/**
	 * @return the torpedos
	 */
	public int getTorpedos() {
		return torpedos;
	}

	/**
	 * @param torpedos the torpedos to set
	 */
	public void setTorpedos(int torpedos) {
		this.torpedos = torpedos;
	}

	/**
	 * @return the phasers
	 */
	public int getPhasers() {
		return phasers;
	}

	/**
	 * @param phasers the phasers to set
	 */
	public void setPhasers(int phasers) {
		this.phasers = phasers;
	}

	/**
	 * @return the shield
	 */
	public double getShield() {
		return shield;
	}

	/**
	 * @param shield the shield to set
	 */
	public void setShield(double shield) {
		this.shield = shield;
	}

	/**
	 * @return the captain
	 */
	public String getCaptain() {
		return captain;
	}

	/**
	 * @param captain the captain to set
	 */
	public void setCaptain(String captain) {
		this.captain = captain;
	}
}
