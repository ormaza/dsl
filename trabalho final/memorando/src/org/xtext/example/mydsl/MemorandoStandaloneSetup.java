/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class MemorandoStandaloneSetup extends MemorandoStandaloneSetupGenerated {

	public static void doSetup() {
		new MemorandoStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}