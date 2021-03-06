package fr.obeo.releng.targetplatform.ui.editor.syntaxcoloring;

import java.util.regex.Pattern;

import org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;

import com.google.inject.Singleton;

@Singleton
public class TargetPlatformTokenToAttributeIdMapper extends AbstractAntlrTokenToAttributeIdMapper {

	private static final Pattern PUNCTUATION = Pattern.compile("\\p{Punct}*");
	
	private static final Pattern QUOTED = Pattern.compile("(?:^'([^']*)'$)|(?:^\"([^\"]*)\")$", Pattern.MULTILINE);
	
	@Override
	protected String calculateId(String tokenName, int tokenType) {
		if(PUNCTUATION.matcher(tokenName).matches()) {
			return DefaultHighlightingConfiguration.DEFAULT_ID;
		}
		
		if ("'requirements'".equals(tokenName) ||
			"'allEnvironments'".equals(tokenName) ||
			"'source'".equals(tokenName) ||
			"'configurePhase'".equals(tokenName)) {
			return TargetPlatformHighlightingConfiguration.OPTION_ID;
		}
		
		if ("'version'".equals(tokenName) ||
			"'='".equals(tokenName) ||
			"';'".equals(tokenName)) {
			return DefaultHighlightingConfiguration.DEFAULT_ID;
		}
		
		if(QUOTED.matcher(tokenName).matches()) {
			return DefaultHighlightingConfiguration.KEYWORD_ID;
		}
		if("RULE_STRING".equals(tokenName)) {
			return DefaultHighlightingConfiguration.STRING_ID;
		}
		if("RULE_ML_COMMENT".equals(tokenName) || "RULE_SL_COMMENT".equals(tokenName)) {
			return DefaultHighlightingConfiguration.COMMENT_ID;
		}
		return DefaultHighlightingConfiguration.DEFAULT_ID;
	}

}
