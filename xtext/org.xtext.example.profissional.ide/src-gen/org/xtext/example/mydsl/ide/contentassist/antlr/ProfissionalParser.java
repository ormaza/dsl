/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.mydsl.ide.contentassist.antlr.internal.InternalProfissionalParser;
import org.xtext.example.mydsl.services.ProfissionalGrammarAccess;

public class ProfissionalParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(ProfissionalGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, ProfissionalGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
			builder.put(grammarAccess.getAcademicoAccess().getGroup(), "rule__Academico__Group__0");
			builder.put(grammarAccess.getAcademicoAccess().getGroup_3(), "rule__Academico__Group_3__0");
			builder.put(grammarAccess.getAcademicoAccess().getGroup_6(), "rule__Academico__Group_6__0");
			builder.put(grammarAccess.getEmpresaAccess().getGroup(), "rule__Empresa__Group__0");
			builder.put(grammarAccess.getEmpresaAccess().getGroup_3(), "rule__Empresa__Group_3__0");
			builder.put(grammarAccess.getEmpresaAccess().getGroup_6(), "rule__Empresa__Group_6__0");
			builder.put(grammarAccess.getLinguagensAccess().getGroup(), "rule__Linguagens__Group__0");
			builder.put(grammarAccess.getModelAccess().getProfissionalAssignment(), "rule__Model__ProfissionalAssignment");
			builder.put(grammarAccess.getAcademicoAccess().getNameAssignment_1(), "rule__Academico__NameAssignment_1");
			builder.put(grammarAccess.getAcademicoAccess().getNameAssignment_3_1(), "rule__Academico__NameAssignment_3_1");
			builder.put(grammarAccess.getAcademicoAccess().getNameAssignment_5(), "rule__Academico__NameAssignment_5");
			builder.put(grammarAccess.getAcademicoAccess().getLinguagemAssignment_6_1(), "rule__Academico__LinguagemAssignment_6_1");
			builder.put(grammarAccess.getEmpresaAccess().getNameAssignment_1(), "rule__Empresa__NameAssignment_1");
			builder.put(grammarAccess.getEmpresaAccess().getNameAssignment_3_1(), "rule__Empresa__NameAssignment_3_1");
			builder.put(grammarAccess.getEmpresaAccess().getNameAssignment_5(), "rule__Empresa__NameAssignment_5");
			builder.put(grammarAccess.getEmpresaAccess().getLinguagemAssignment_6_1(), "rule__Empresa__LinguagemAssignment_6_1");
			builder.put(grammarAccess.getLinguagensAccess().getNameAssignment_1(), "rule__Linguagens__NameAssignment_1");
			builder.put(grammarAccess.getLinguagensAccess().getNameAssignment_4(), "rule__Linguagens__NameAssignment_4");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private ProfissionalGrammarAccess grammarAccess;

	@Override
	protected InternalProfissionalParser createParser() {
		InternalProfissionalParser result = new InternalProfissionalParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public ProfissionalGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ProfissionalGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}