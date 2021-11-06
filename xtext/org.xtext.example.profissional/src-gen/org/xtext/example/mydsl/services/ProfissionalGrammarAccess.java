/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
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
		private final RuleCall cProfissionalTypeParserRuleCall_0 = (RuleCall)cProfissionalAssignment.eContents().get(0);
		
		//Model:
		//    profissional+=Type*;
		@Override public ParserRule getRule() { return rule; }
		
		//profissional+=Type*
		public Assignment getProfissionalAssignment() { return cProfissionalAssignment; }
		
		//Type
		public RuleCall getProfissionalTypeParserRuleCall_0() { return cProfissionalTypeParserRuleCall_0; }
	}
	public class TypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.Profissional.Type");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cAcademicoParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cEmpresaParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Type:
		//    Academico | Empresa;
		@Override public ParserRule getRule() { return rule; }
		
		//Academico | Empresa
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Academico
		public RuleCall getAcademicoParserRuleCall_0() { return cAcademicoParserRuleCall_0; }
		
		//Empresa
		public RuleCall getEmpresaParserRuleCall_1() { return cEmpresaParserRuleCall_1; }
	}
	public class AcademicoElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.Profissional.Academico");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNomeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cCommaKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cLinkedinKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cNameAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_3_1_0 = (RuleCall)cNameAssignment_3_1.eContents().get(0);
		private final Keyword cCommaKeyword_3_2 = (Keyword)cGroup_3.eContents().get(2);
		private final Keyword cLattesKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cNameAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cNameIDTerminalRuleCall_5_0 = (RuleCall)cNameAssignment_5.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cLeftCurlyBracketKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cLinguagemAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final RuleCall cLinguagemLinguagensParserRuleCall_6_1_0 = (RuleCall)cLinguagemAssignment_6_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6_2 = (Keyword)cGroup_6.eContents().get(2);
		
		//Academico:
		//    'Nome:' name=ID ','
		//    ('Linkedin:' name=ID ',')?
		//    'Lattes:' name=ID
		//    ('{'
		//        (linguagem+=Linguagens)*
		//    '}')?;
		@Override public ParserRule getRule() { return rule; }
		
		//'Nome:' name=ID ','
		//('Linkedin:' name=ID ',')?
		//'Lattes:' name=ID
		//('{'
		//    (linguagem+=Linguagens)*
		//'}')?
		public Group getGroup() { return cGroup; }
		
		//'Nome:'
		public Keyword getNomeKeyword_0() { return cNomeKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//','
		public Keyword getCommaKeyword_2() { return cCommaKeyword_2; }
		
		//('Linkedin:' name=ID ',')?
		public Group getGroup_3() { return cGroup_3; }
		
		//'Linkedin:'
		public Keyword getLinkedinKeyword_3_0() { return cLinkedinKeyword_3_0; }
		
		//name=ID
		public Assignment getNameAssignment_3_1() { return cNameAssignment_3_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_3_1_0() { return cNameIDTerminalRuleCall_3_1_0; }
		
		//','
		public Keyword getCommaKeyword_3_2() { return cCommaKeyword_3_2; }
		
		//'Lattes:'
		public Keyword getLattesKeyword_4() { return cLattesKeyword_4; }
		
		//name=ID
		public Assignment getNameAssignment_5() { return cNameAssignment_5; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_5_0() { return cNameIDTerminalRuleCall_5_0; }
		
		//('{'
		//    (linguagem+=Linguagens)*
		//'}')?
		public Group getGroup_6() { return cGroup_6; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_6_0() { return cLeftCurlyBracketKeyword_6_0; }
		
		//(linguagem+=Linguagens)*
		public Assignment getLinguagemAssignment_6_1() { return cLinguagemAssignment_6_1; }
		
		//Linguagens
		public RuleCall getLinguagemLinguagensParserRuleCall_6_1_0() { return cLinguagemLinguagensParserRuleCall_6_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6_2() { return cRightCurlyBracketKeyword_6_2; }
	}
	public class EmpresaElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.Profissional.Empresa");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNomeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cCommaKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cLattesKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cNameAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_3_1_0 = (RuleCall)cNameAssignment_3_1.eContents().get(0);
		private final Keyword cCommaKeyword_3_2 = (Keyword)cGroup_3.eContents().get(2);
		private final Keyword cLinkedinKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cNameAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cNameIDTerminalRuleCall_5_0 = (RuleCall)cNameAssignment_5.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cLeftCurlyBracketKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cLinguagemAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final RuleCall cLinguagemLinguagensParserRuleCall_6_1_0 = (RuleCall)cLinguagemAssignment_6_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6_2 = (Keyword)cGroup_6.eContents().get(2);
		
		//Empresa:
		//    'Nome:' name=ID ','
		//    ('Lattes:' name=ID ',')?
		//    'Linkedin:' name=ID
		//    ('{'
		//        (linguagem+=Linguagens)*
		//    '}')?;
		@Override public ParserRule getRule() { return rule; }
		
		//'Nome:' name=ID ','
		//('Lattes:' name=ID ',')?
		//'Linkedin:' name=ID
		//('{'
		//    (linguagem+=Linguagens)*
		//'}')?
		public Group getGroup() { return cGroup; }
		
		//'Nome:'
		public Keyword getNomeKeyword_0() { return cNomeKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//','
		public Keyword getCommaKeyword_2() { return cCommaKeyword_2; }
		
		//('Lattes:' name=ID ',')?
		public Group getGroup_3() { return cGroup_3; }
		
		//'Lattes:'
		public Keyword getLattesKeyword_3_0() { return cLattesKeyword_3_0; }
		
		//name=ID
		public Assignment getNameAssignment_3_1() { return cNameAssignment_3_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_3_1_0() { return cNameIDTerminalRuleCall_3_1_0; }
		
		//','
		public Keyword getCommaKeyword_3_2() { return cCommaKeyword_3_2; }
		
		//'Linkedin:'
		public Keyword getLinkedinKeyword_4() { return cLinkedinKeyword_4; }
		
		//name=ID
		public Assignment getNameAssignment_5() { return cNameAssignment_5; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_5_0() { return cNameIDTerminalRuleCall_5_0; }
		
		//('{'
		//    (linguagem+=Linguagens)*
		//'}')?
		public Group getGroup_6() { return cGroup_6; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_6_0() { return cLeftCurlyBracketKeyword_6_0; }
		
		//(linguagem+=Linguagens)*
		public Assignment getLinguagemAssignment_6_1() { return cLinguagemAssignment_6_1; }
		
		//Linguagens
		public RuleCall getLinguagemLinguagensParserRuleCall_6_1_0() { return cLinguagemLinguagensParserRuleCall_6_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6_2() { return cRightCurlyBracketKeyword_6_2; }
	}
	public class LinguagensElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.Profissional.Linguagens");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNomeDaLinguagemKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cCommaKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cTempoDeExperiNciaKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cNameAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cNameIDTerminalRuleCall_4_0 = (RuleCall)cNameAssignment_4.eContents().get(0);
		private final Keyword cMesesKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Linguagens:
		//    'Nome da Linguagem:' name=ID ','
		//    'Tempo de Experi�ncia:' name=ID 'meses';
		@Override public ParserRule getRule() { return rule; }
		
		//'Nome da Linguagem:' name=ID ','
		//'Tempo de Experi�ncia:' name=ID 'meses'
		public Group getGroup() { return cGroup; }
		
		//'Nome da Linguagem:'
		public Keyword getNomeDaLinguagemKeyword_0() { return cNomeDaLinguagemKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//','
		public Keyword getCommaKeyword_2() { return cCommaKeyword_2; }
		
		//'Tempo de Experi�ncia:'
		public Keyword getTempoDeExperiNciaKeyword_3() { return cTempoDeExperiNciaKeyword_3; }
		
		//name=ID
		public Assignment getNameAssignment_4() { return cNameAssignment_4; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_4_0() { return cNameIDTerminalRuleCall_4_0; }
		
		//'meses'
		public Keyword getMesesKeyword_5() { return cMesesKeyword_5; }
	}
	
	
	private final ModelElements pModel;
	private final TypeElements pType;
	private final AcademicoElements pAcademico;
	private final EmpresaElements pEmpresa;
	private final LinguagensElements pLinguagens;
	private final TerminalRule tDIGIT;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public ProfissionalGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pType = new TypeElements();
		this.pAcademico = new AcademicoElements();
		this.pEmpresa = new EmpresaElements();
		this.pLinguagens = new LinguagensElements();
		this.tDIGIT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.Profissional.DIGIT");
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
	//    profissional+=Type*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Type:
	//    Academico | Empresa;
	public TypeElements getTypeAccess() {
		return pType;
	}
	
	public ParserRule getTypeRule() {
		return getTypeAccess().getRule();
	}
	
	//Academico:
	//    'Nome:' name=ID ','
	//    ('Linkedin:' name=ID ',')?
	//    'Lattes:' name=ID
	//    ('{'
	//        (linguagem+=Linguagens)*
	//    '}')?;
	public AcademicoElements getAcademicoAccess() {
		return pAcademico;
	}
	
	public ParserRule getAcademicoRule() {
		return getAcademicoAccess().getRule();
	}
	
	//Empresa:
	//    'Nome:' name=ID ','
	//    ('Lattes:' name=ID ',')?
	//    'Linkedin:' name=ID
	//    ('{'
	//        (linguagem+=Linguagens)*
	//    '}')?;
	public EmpresaElements getEmpresaAccess() {
		return pEmpresa;
	}
	
	public ParserRule getEmpresaRule() {
		return getEmpresaAccess().getRule();
	}
	
	//Linguagens:
	//    'Nome da Linguagem:' name=ID ','
	//    'Tempo de Experi�ncia:' name=ID 'meses';
	public LinguagensElements getLinguagensAccess() {
		return pLinguagens;
	}
	
	public ParserRule getLinguagensRule() {
		return getLinguagensAccess().getRule();
	}
	
	//terminal DIGIT:
	//    ('0'..'9');
	public TerminalRule getDIGITRule() {
		return tDIGIT;
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