/*
 * generated by Xtext 2.25.0
 */
package edu.upb.lp.isc.serializer;

import com.google.inject.Inject;
import edu.upb.lp.isc.services.CompilacionGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class CompilacionSyntacticSequencer extends AbstractSyntacticSequencer {

	protected CompilacionGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Equal_EqKeyword_0_1_0_1_or_EqualKeyword_0_1_0_0;
	protected AbstractElementAlias match_If_LeftParenthesisKeyword_5_q;
	protected AbstractElementAlias match_If_RightParenthesisKeyword_7_q;
	protected AbstractElementAlias match_IsDataType_ListKeyword_1_2_or_NumberKeyword_1_0_or_StringKeyword_1_1;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (CompilacionGrammarAccess) access;
		match_Equal_EqKeyword_0_1_0_1_or_EqualKeyword_0_1_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getEqualAccess().getEqKeyword_0_1_0_1()), new TokenAlias(false, false, grammarAccess.getEqualAccess().getEqualKeyword_0_1_0_0()));
		match_If_LeftParenthesisKeyword_5_q = new TokenAlias(false, true, grammarAccess.getIfAccess().getLeftParenthesisKeyword_5());
		match_If_RightParenthesisKeyword_7_q = new TokenAlias(false, true, grammarAccess.getIfAccess().getRightParenthesisKeyword_7());
		match_IsDataType_ListKeyword_1_2_or_NumberKeyword_1_0_or_StringKeyword_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getIsDataTypeAccess().getListKeyword_1_2()), new TokenAlias(false, false, grammarAccess.getIsDataTypeAccess().getNumberKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getIsDataTypeAccess().getStringKeyword_1_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getINTRule())
			return getINTToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal INT returns ecore::EInt: ('0'..'9')+;
	 */
	protected String getINTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Equal_EqKeyword_0_1_0_1_or_EqualKeyword_0_1_0_0.equals(syntax))
				emit_Equal_EqKeyword_0_1_0_1_or_EqualKeyword_0_1_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_If_LeftParenthesisKeyword_5_q.equals(syntax))
				emit_If_LeftParenthesisKeyword_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_If_RightParenthesisKeyword_7_q.equals(syntax))
				emit_If_RightParenthesisKeyword_7_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_IsDataType_ListKeyword_1_2_or_NumberKeyword_1_0_or_StringKeyword_1_1.equals(syntax))
				emit_IsDataType_ListKeyword_1_2_or_NumberKeyword_1_0_or_StringKeyword_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     'equal?' | 'eq?'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) '(' (ambiguity) n1=DataType_
	 *     (rule start) '>' '(' (ambiguity) n1=DataType_
	 */
	protected void emit_Equal_EqKeyword_0_1_0_1_or_EqualKeyword_0_1_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('?
	 *
	 * This ambiguous syntax occurs at:
	 *     condition=Equal ')' (ambiguity) then=Bloque
	 */
	protected void emit_If_LeftParenthesisKeyword_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ')'?
	 *
	 * This ambiguous syntax occurs at:
	 *     then=Bloque (ambiguity) '(' else=Bloque
	 */
	protected void emit_If_RightParenthesisKeyword_7_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'number?' | 'string?' | 'list?'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) '(' (ambiguity) isType=DataType_
	 */
	protected void emit_IsDataType_ListKeyword_1_2_or_NumberKeyword_1_0_or_StringKeyword_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
