/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class ProfissionalGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.Profissional.Model");
		private final Assignment cProfissionalAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cProfissionalPessoaParserRuleCall_0 = (RuleCall)cProfissionalAssignment.eContents().get(0);
		
		//Model:
		//    profissional+=Pessoa*;
		@Override public ParserRule getRule() { return rule; }
		
		//profissional+=Pessoa*
		public Assignment getProfissionalAssignment() { return cProfissionalAssignment; }
		
		//Pessoa
		public RuleCall getProfissionalPessoaParserRuleCall_0() { return cProfissionalPessoaParserRuleCall_0; }
	}
	public class PessoaElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.Profissional.Pessoa");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNomeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cCommaKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cEmpresaAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cEmpresaEmpresaParserRuleCall_3_0 = (RuleCall)cEmpresaAssignment_3.eContents().get(0);
		
		//Pessoa:
		//    'Nome:' name=ID ','
		//    empresa+=Empresa;
		@Override public ParserRule getRule() { return rule; }
		
		//'Nome:' name=ID ','
		//empresa+=Empresa
		public Group getGroup() { return cGroup; }
		
		//'Nome:'
		public Keyword getNomeKeyword_0() { return cNomeKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//','
		public Keyword getCommaKeyword_2() { return cCommaKeyword_2; }
		
		//empresa+=Empresa
		public Assignment getEmpresaAssignment_3() { return cEmpresaAssignment_3; }
		
		//Empresa
		public RuleCall getEmpresaEmpresaParserRuleCall_3_0() { return cEmpresaEmpresaParserRuleCall_3_0; }
	}
	public class EmpresaElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.Profissional.Empresa");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEmpresaKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLinguagensKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cLinguagensAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cLinguagensLinguagensParserRuleCall_3_0 = (RuleCall)cLinguagensAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Empresa:
		//    'Empresa:' name=ID ',Linguagens:{'
		//    linguagens+=Linguagens* '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'Empresa:' name=ID ',Linguagens:{'
		//linguagens+=Linguagens* '}'
		public Group getGroup() { return cGroup; }
		
		//'Empresa:'
		public Keyword getEmpresaKeyword_0() { return cEmpresaKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//',Linguagens:{'
		public Keyword getLinguagensKeyword_2() { return cLinguagensKeyword_2; }
		
		//linguagens+=Linguagens*
		public Assignment getLinguagensAssignment_3() { return cLinguagensAssignment_3; }
		
		//Linguagens
		public RuleCall getLinguagensLinguagensParserRuleCall_3_0() { return cLinguagensLinguagensParserRuleCall_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class LinguagensElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.Profissional.Linguagens");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cCommaKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//Linguagens:
		//    name=ID ','?;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID ','?
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//','?
		public Keyword getCommaKeyword_1() { return cCommaKeyword_1; }
	}
	
	
	private final ModelElements pModel;
	private final PessoaElements pPessoa;
	private final EmpresaElements pEmpresa;
	private final LinguagensElements pLinguagens;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public ProfissionalGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pPessoa = new PessoaElements();
		this.pEmpresa = new EmpresaElements();
		this.pLinguagens = new LinguagensElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.mydsl.Profissional".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//    profissional+=Pessoa*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Pessoa:
	//    'Nome:' name=ID ','
	//    empresa+=Empresa;
	public PessoaElements getPessoaAccess() {
		return pPessoa;
	}
	
	public ParserRule getPessoaRule() {
		return getPessoaAccess().getRule();
	}
	
	//Empresa:
	//    'Empresa:' name=ID ',Linguagens:{'
	//    linguagens+=Linguagens* '}';
	public EmpresaElements getEmpresaAccess() {
		return pEmpresa;
	}
	
	public ParserRule getEmpresaRule() {
		return getEmpresaAccess().getRule();
	}
	
	//Linguagens:
	//    name=ID ','?;
	public LinguagensElements getLinguagensAccess() {
		return pLinguagens;
	}
	
	public ParserRule getLinguagensRule() {
		return getLinguagensAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
