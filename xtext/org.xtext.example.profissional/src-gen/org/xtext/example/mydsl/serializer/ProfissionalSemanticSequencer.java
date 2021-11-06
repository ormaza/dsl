/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.xtext.example.mydsl.profissional.Academico;
import org.xtext.example.mydsl.profissional.Empresa;
import org.xtext.example.mydsl.profissional.Linguagens;
import org.xtext.example.mydsl.profissional.Model;
import org.xtext.example.mydsl.profissional.ProfissionalPackage;
import org.xtext.example.mydsl.services.ProfissionalGrammarAccess;

@SuppressWarnings("all")
public class ProfissionalSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ProfissionalGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ProfissionalPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ProfissionalPackage.ACADEMICO:
				sequence_Academico(context, (Academico) semanticObject); 
				return; 
			case ProfissionalPackage.EMPRESA:
				sequence_Empresa(context, (Empresa) semanticObject); 
				return; 
			case ProfissionalPackage.LINGUAGENS:
				sequence_Linguagens(context, (Linguagens) semanticObject); 
				return; 
			case ProfissionalPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Type returns Academico
	 *     Academico returns Academico
	 *
	 * Constraint:
	 *     (name=ID name=ID? name=ID linguagem+=Linguagens*)
	 */
	protected void sequence_Academico(ISerializationContext context, Academico semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Type returns Empresa
	 *     Empresa returns Empresa
	 *
	 * Constraint:
	 *     (name=ID name=ID? name=ID linguagem+=Linguagens*)
	 */
	protected void sequence_Empresa(ISerializationContext context, Empresa semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Linguagens returns Linguagens
	 *
	 * Constraint:
	 *     (name=ID name=ID)
	 */
	protected void sequence_Linguagens(ISerializationContext context, Linguagens semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     profissional+=Type+
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
