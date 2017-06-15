package config;

import blurbs.Blurb;
import capitalGains.CapitalGainsImp;
import interfaces.BlurbInterface;
import interfaces.CapitalGainsInterface;
import interfaces.DropoutStackInterface;

/**
 * This class acts as a configuration file which tells the testing framework
 * which implementation you want us to use when we grade your assignment.
 * 
 * @author jddevaug
 * 
 */
public class Configuration {
	
	/**
	 * Returns a new instance of the {@link BlurbInterface} that you want to be
	 * graded.
	 */
	public static BlurbInterface getBlurbInterface(){
		return new Blurb();
	}
	
	/**
	 * Returns a new instance of the {@link CapitalGainsInterface} that you want to be
	 * graded.
	 */
	public static CapitalGainsInterface getCapitalGainsInterface(){
		return new CapitalGainsImp();
	}
	
	//TODO: Add interface for DropoutStack
	public static DropoutStackInterface getDropoutStackInterface() { 
		return null; 
	}

}
