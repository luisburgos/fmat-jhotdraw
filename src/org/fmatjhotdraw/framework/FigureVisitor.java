/*
 * @(#)FigureVisitor.java
 *
 * Project:		JHotdraw - a GUI framework for technical drawings
 *				http://www.jhotdraw.org
 *				http://jhotdraw.sourceforge.net
 * Copyright:	� by the original author(s) and all contributors
 * License:		Lesser GNU Public License (LGPL)
 *				http://www.opensource.org/licenses/lgpl-license.html
 */

package org.fmatjhotdraw.framework;

/**
 * @author  Wolfram Kaiser <mrfloppy@sourceforge.net>
 * @version <$CURRENT_VERSION$>
 */
public interface FigureVisitor {
	public void visitFigure(Figure hostFigure);
	public void visitHandle(Handle hostHandle);
	public void visitFigureChangeListener(FigureChangeListener hostFigureChangeListener);
}
