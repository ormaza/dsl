/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.mydsl.parser.antlr.internal.InternalMemorandoParser;
import org.xtext.example.mydsl.services.MemorandoGrammarAccess;

public class MemorandoParser extends AbstractAntlrParser {

	@Inject
	private MemorandoGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalMemorandoParser createParser(XtextTokenStream stream) {
		return new InternalMemorandoParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public MemorandoGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MemorandoGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
