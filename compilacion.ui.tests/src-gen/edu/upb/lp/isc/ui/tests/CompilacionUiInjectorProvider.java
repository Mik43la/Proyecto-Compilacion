/*
 * generated by Xtext 2.25.0
 */
package edu.upb.lp.isc.ui.tests;

import com.google.inject.Injector;
import compilacion.ui.internal.CompilacionActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class CompilacionUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return CompilacionActivator.getInstance().getInjector("edu.upb.lp.isc.Compilacion");
	}

}
