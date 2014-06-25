/*
 * generated by Xtext
 */
package fr.obeo.releng.targetplatform.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.autoedit.AbstractEditStrategyProvider;
import org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

import fr.obeo.releng.targetplatform.ui.editor.autoedit.TargetPlatformAutoEditStrategyProvider;
import fr.obeo.releng.targetplatform.ui.editor.syntaxcoloring.TargetPlatformHighlightingConfiguration;
import fr.obeo.releng.targetplatform.ui.editor.syntaxcoloring.TargetPlatformSemanticHighlightingCalculator;
import fr.obeo.releng.targetplatform.ui.editor.syntaxcoloring.TargetPlatformTokenToAttributeIdMapper;

/**
 * Use this class to register components to be used within the IDE.
 */
public class TargetPlatformUiModule extends fr.obeo.releng.targetplatform.ui.AbstractTargetPlatformUiModule {
	
	public TargetPlatformUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	@Override
	public Class<? extends AbstractEditStrategyProvider> bindAbstractEditStrategyProvider() {
		return TargetPlatformAutoEditStrategyProvider.class;
	}
	
	public Class<? extends IHighlightingConfiguration> bindIHighlightingConfiguration() {
		return TargetPlatformHighlightingConfiguration.class;
	}
	
	public Class<? extends ISemanticHighlightingCalculator> bindISemanticHighlightingCalculator() {
		return TargetPlatformSemanticHighlightingCalculator.class;
	}
	
	public Class<? extends AbstractAntlrTokenToAttributeIdMapper> bindAbstractAntlrTokenToAttributeIdMapper() {
		return TargetPlatformTokenToAttributeIdMapper.class;
	}
}
