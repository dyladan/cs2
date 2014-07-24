package com.cis.project3;

/**
 * @author Daniel Dyla
 * CIS 2151 - Prof. John P. Baugh
 * Summer 2014
 * Programming Assignment 3
 *
 * Custom exception for too many values
 */

public class TooManyValuesException extends Exception {
	public TooManyValuesException() {
		super();
	}
	public TooManyValuesException(String message) {
		super(message);
	}

}
