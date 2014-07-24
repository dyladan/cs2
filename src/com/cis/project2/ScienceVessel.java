package com.cis.project2;

/**
 * @author Daniel Dyla
 * CIS 2151 - Prof. John P. Baugh
 * Summer 2014
 * Programming Assignment 2
 *
 * ScienceVessel defines a ship class with
 * probes, scientists, and a chief researcher
 */
public class ScienceVessel extends GenericShip {
	private int probes;
	private int scientists;
	private String chiefResearcher;

	public ScienceVessel() {
		super();
		this.probes = 10;
		this.scientists = 25;
		this.chiefResearcher = "Cochrane";
	}

	/**
	 * @param probes
	 * @param scientists
	 * @param chiefResearcher
	 */
	public ScienceVessel(int probes, int scientists, String chiefResearcher) {
		super();
		this.probes = probes;
		this.scientists = scientists;
		this.chiefResearcher = chiefResearcher;
	}

	/**
	 * @return the probes
	 */
	public int getProbes() {
		return probes;
	}

	/**
	 * @param probes the probes to set
	 */
	public void setProbes(int probes) {
		this.probes = probes;
	}

	/**
	 * @return the scientists
	 */
	public int getScientists() {
		return scientists;
	}

	/**
	 * @param scientists the scientists to set
	 */
	public void setScientists(int scientists) {
		this.scientists = scientists;
	}

	/**
	 * @return the chiefResearcher
	 */
	public String getChiefResearcher() {
		return chiefResearcher;
	}

	/**
	 * @param chiefResearcher the chiefResearcher to set
	 */
	public void setChiefResearcher(String chiefResearcher) {
		this.chiefResearcher = chiefResearcher;
	}
	
	public void launchProbe() {
		System.out.println("We're launching the probe, sir.");
		if (this.probes > 0) {
			probes--;
		} else {
			System.out.println("Sorry sir there are no probes left.");
		}
		
	}
}
