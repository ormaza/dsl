/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.xtext.example.memorando.ui.internal.MemorandoActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MemorandoExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(MemorandoActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		MemorandoActivator activator = MemorandoActivator.getInstance();
		return activator != null ? activator.getInjector(MemorandoActivator.ORG_XTEXT_EXAMPLE_MYDSL_MEMORANDO) : null;
	}

}