/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.xtext.example.memorando.ui.internal.MemorandoActivator;

public class MemorandoUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return MemorandoActivator.getInstance().getInjector("org.xtext.example.mydsl.Memorando");
	}

}