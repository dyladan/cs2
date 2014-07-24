package com.cis.project2;

/**
 * @author Daniel Dyla
 * CIS 2151 - Prof. John P. Baugh
 * Summer 2014
 * Programming Assignment 2
 *
 * Main contains any code to test the
 * other classes
 */
public class Main {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		GenericShip genericShip = new GenericShip();
		Warship warship = new Warship();
		ScienceVessel scienceVessel = new ScienceVessel();
		Transport transport = new Transport();
		
		my_assert(genericShip.getCrew() == 10);
		my_assert(genericShip.getCost() == 5000);
		my_assert(genericShip.getName() == "S.S. Default");
		
		System.out.println("Generic works");
		
		my_assert(warship.getCrew() == 10);
		my_assert(warship.getCost() == 5000);
		my_assert(warship.getName() == "S.S. Default");
		my_assert(warship.getTorpedos() == 2);
		my_assert(warship.getPhasers() == 2);
		my_assert(warship.getShield() == 100.0);
		my_assert(warship.getCaptain() == "Snuggles");
		my_assert(warship.fire() <= 100 && warship.fire() >= 0);
		
		System.out.println("Warship works");
		
		my_assert(scienceVessel.getCrew() == 10);
		my_assert(scienceVessel.getCost() == 5000);
		my_assert(scienceVessel.getName() == "S.S. Default");
		my_assert(scienceVessel.getProbes() == 10);
		my_assert(scienceVessel.getScientists() == 25);
		my_assert(scienceVessel.getChiefResearcher() == "Cochrane");
		scienceVessel.launchProbe();
		my_assert(scienceVessel.getProbes() == 9);
		
		System.out.println("ScienceVessel works");
		
		my_assert(transport.getCrew() == 10);
		my_assert(transport.getCost() == 5000);
		my_assert(transport.getName() == "S.S. Default");
		my_assert(transport.getCapacity() == 100);
		transport.help();
		
		System.out.println("Transport works");
		
		System.out.println("Getters work");
		
		genericShip.setCrew(20);
		genericShip.setCost(10000);
		genericShip.setName("S.S. Dyla");
		
		warship.setCrew(20);
		warship.setCost(10000);
		warship.setName("S.S. Dyla");
		warship.setTorpedos(4);
		warship.setPhasers(4);
		warship.setShield(50);
		warship.setCaptain("Dan");
		
		scienceVessel.setCrew(20);
		scienceVessel.setCost(10000);
		scienceVessel.setName("S.S. Dyla");
		scienceVessel.setProbes(0);
		scienceVessel.setScientists(50);
		scienceVessel.setChiefResearcher("Dan");
		
		transport.setCrew(20);
		transport.setCost(10000);
		transport.setName("S.S. Dyla");
		transport.setCapacity(200);
		
		my_assert(genericShip.getCrew() == 20);
		my_assert(genericShip.getCost() == 10000);
		my_assert(genericShip.getName() == "S.S. Dyla");
		
		my_assert(warship.getCrew() == 20);
		my_assert(warship.getCost() == 10000);
		my_assert(warship.getName() == "S.S. Dyla");
		my_assert(warship.getTorpedos() == 4);
		my_assert(warship.getPhasers() == 4);
		my_assert(warship.getShield() == 50.0);
		my_assert(warship.getCaptain() == "Dan");
		my_assert(warship.fire() <= 100 && warship.fire() >= 0);
		
		my_assert(scienceVessel.getCrew() == 20);
		my_assert(scienceVessel.getCost() == 10000);
		my_assert(scienceVessel.getName() == "S.S. Dyla");
		my_assert(scienceVessel.getProbes() == 0);
		my_assert(scienceVessel.getScientists() == 50);
		my_assert(scienceVessel.getChiefResearcher() == "Dan");
		scienceVessel.launchProbe();
		my_assert(scienceVessel.getProbes() == 0);

		my_assert(transport.getCrew() == 20);
		my_assert(transport.getCost() == 10000);
		my_assert(transport.getName() == "S.S. Dyla");
		my_assert(transport.getCapacity() == 200);
		
		System.out.println("Setters work");
		
		System.out.println("All tests pass");


	}
	
	public static void my_assert(boolean test) throws Exception{
		if (!test) {
			throw new Exception("One or more tests failing");
		}
	}

}
