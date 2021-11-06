/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.mydsl.parser.antlr.internal.InternalProfissionalParser;
import org.xtext.example.mydsl.services.ProfissionalGrammarAccess;

public class ProfissionalParser extends AbstractAntlrParser {

	@Inject
	private ProfissionalGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalProfissionalParser createParser(XtextTokenStream stream) {
		return new InternalProfissionalParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public ProfissionalGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ProfissionalGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}