/*
 * generated by Xtext 2.25.0
 */
package edu.upb.lp.isc.parser.antlr;

import com.google.inject.Inject;
import edu.upb.lp.isc.parser.antlr.internal.InternalCompilacionParser;
import edu.upb.lp.isc.services.CompilacionGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class CompilacionParser extends AbstractAntlrParser {

	@Inject
	private CompilacionGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalCompilacionParser createParser(XtextTokenStream stream) {
		return new InternalCompilacionParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Programa";
	}

	public CompilacionGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(CompilacionGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}