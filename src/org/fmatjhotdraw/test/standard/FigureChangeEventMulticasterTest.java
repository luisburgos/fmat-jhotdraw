/*
 * @(#)Test.java
 *
 * Project:		JHotdraw - a GUI framework for technical drawings
 *				http://www.jhotdraw.org
 *				http://jhotdraw.sourceforge.net
 * Copyright:	� by the original author(s) and all contributors
 * License:		Lesser GNU Public License (LGPL)
 *				http://www.opensource.org/licenses/lgpl-license.html
 */
package org.fmatjhotdraw.test.standard;

import java.util.EventListener;

// JUnitDoclet begin import
import org.fmatjhotdraw.figures.TextFigure;
import org.fmatjhotdraw.framework.Drawing;
import org.fmatjhotdraw.standard.FigureChangeEventMulticaster;
import org.fmatjhotdraw.test.JHDTestCase;
// JUnitDoclet end import

/*
 * Generated by JUnitDoclet, a tool provided by
 * ObjectFab GmbH under LGPL.
 * Please see www.junitdoclet.org, www.gnu.org
 * and www.objectfab.de for informations about
 * the tool, the licence and the authors.
 */

// JUnitDoclet begin javadoc_class
/**
 * TestCase FigureChangeEventMulticasterTest is generated by
 * JUnitDoclet to hold the tests for FigureChangeEventMulticaster.
 * @see org.fmatjhotdraw.standard.FigureChangeEventMulticaster
 */
// JUnitDoclet end javadoc_class
public class FigureChangeEventMulticasterTest
// JUnitDoclet begin extends_implements
extends JHDTestCase
// JUnitDoclet end extends_implements
{
	// JUnitDoclet begin class
	// instance variables, helper methods, ... put them in this marker
	private FigureChangeEventMulticaster figurechangeeventmulticaster;
	// JUnitDoclet end class

	/**
	 * Constructor FigureChangeEventMulticasterTest is
	 * basically calling the inherited constructor to
	 * initiate the TestCase for use by the Framework.
	 */
	public FigureChangeEventMulticasterTest(String name) {
		// JUnitDoclet begin method FigureChangeEventMulticasterTest
		super(name);
		// JUnitDoclet end method FigureChangeEventMulticasterTest
	}

	/**
	 * Factory method for instances of the class to be tested.
	 */
	public FigureChangeEventMulticaster createInstance() throws Exception {
		// JUnitDoclet begin method testcase.createInstance
		EventListener l1 = new TextFigure();
		Drawing l2 = getDrawingEditor().view().drawing();
		return new FigureChangeEventMulticaster(l1, l2);
		// JUnitDoclet end method testcase.createInstance
	}

	/**
	 * Method setUp is overwriting the framework method to
	 * prepare an instance of this TestCase for a single test.
	 * It's called from the JUnit framework only.
	 */
	protected void setUp() throws Exception {
		// JUnitDoclet begin method testcase.setUp
		super.setUp();
		getDrawingEditor().open();
		figurechangeeventmulticaster = createInstance();
		// JUnitDoclet end method testcase.setUp
	}

	/**
	 * Method tearDown is overwriting the framework method to
	 * clean up after each single test of this TestCase.
	 * It's called from the JUnit framework only.
	 */
	protected void tearDown() throws Exception {
		// JUnitDoclet begin method testcase.tearDown
		figurechangeeventmulticaster = null;
		super.tearDown();
		// JUnitDoclet end method testcase.tearDown
	}

	// JUnitDoclet begin javadoc_method figureInvalidated()
	/**
	 * Method testFigureInvalidated is testing figureInvalidated
	 * @see org.fmatjhotdraw.standard.FigureChangeEventMulticaster#figureInvalidated(org.fmatjhotdraw.framework.FigureChangeEvent)
	 */
	// JUnitDoclet end javadoc_method figureInvalidated()
	public void testFigureInvalidated() throws Exception {
		// JUnitDoclet begin method figureInvalidated
		// JUnitDoclet end method figureInvalidated
	}

	// JUnitDoclet begin javadoc_method figureRequestRemove()
	/**
	 * Method testFigureRequestRemove is testing figureRequestRemove
	 * @see org.fmatjhotdraw.standard.FigureChangeEventMulticaster#figureRequestRemove(org.fmatjhotdraw.framework.FigureChangeEvent)
	 */
	// JUnitDoclet end javadoc_method figureRequestRemove()
	public void testFigureRequestRemove() throws Exception {
		// JUnitDoclet begin method figureRequestRemove
		// JUnitDoclet end method figureRequestRemove
	}

	// JUnitDoclet begin javadoc_method figureRequestUpdate()
	/**
	 * Method testFigureRequestUpdate is testing figureRequestUpdate
	 * @see org.fmatjhotdraw.standard.FigureChangeEventMulticaster#figureRequestUpdate(org.fmatjhotdraw.framework.FigureChangeEvent)
	 */
	// JUnitDoclet end javadoc_method figureRequestUpdate()
	public void testFigureRequestUpdate() throws Exception {
		// JUnitDoclet begin method figureRequestUpdate
		// JUnitDoclet end method figureRequestUpdate
	}

	// JUnitDoclet begin javadoc_method figureChanged()
	/**
	 * Method testFigureChanged is testing figureChanged
	 * @see org.fmatjhotdraw.standard.FigureChangeEventMulticaster#figureChanged(org.fmatjhotdraw.framework.FigureChangeEvent)
	 */
	// JUnitDoclet end javadoc_method figureChanged()
	public void testFigureChanged() throws Exception {
		// JUnitDoclet begin method figureChanged
		// JUnitDoclet end method figureChanged
	}

	// JUnitDoclet begin javadoc_method figureRemoved()
	/**
	 * Method testFigureRemoved is testing figureRemoved
	 * @see org.fmatjhotdraw.standard.FigureChangeEventMulticaster#figureRemoved(org.fmatjhotdraw.framework.FigureChangeEvent)
	 */
	// JUnitDoclet end javadoc_method figureRemoved()
	public void testFigureRemoved() throws Exception {
		// JUnitDoclet begin method figureRemoved
		// JUnitDoclet end method figureRemoved
	}

	// JUnitDoclet begin javadoc_method add()
	/**
	 * Method testAdd is testing add
	 * @see org.fmatjhotdraw.standard.FigureChangeEventMulticaster#add(org.fmatjhotdraw.framework.FigureChangeListener, org.fmatjhotdraw.framework.FigureChangeListener)
	 */
	// JUnitDoclet end javadoc_method add()
	public void testAdd() throws Exception {
		// JUnitDoclet begin method add
		// JUnitDoclet end method add
	}

	// JUnitDoclet begin javadoc_method remove()
	/**
	 * Method testRemove is testing remove
	 * @see org.fmatjhotdraw.standard.FigureChangeEventMulticaster#remove(org.fmatjhotdraw.framework.FigureChangeListener, org.fmatjhotdraw.framework.FigureChangeListener)
	 */
	// JUnitDoclet end javadoc_method remove()
	public void testRemove() throws Exception {
		// JUnitDoclet begin method remove
		// JUnitDoclet end method remove
	}

	// JUnitDoclet begin javadoc_method testVault
	/**
	 * JUnitDoclet moves marker to this method, if there is not match
	 * for them in the regenerated code and if the marker is not empty.
	 * This way, no test gets lost when regenerating after renaming.
	 * <b>Method testVault is supposed to be empty.</b>
	 */
	// JUnitDoclet end javadoc_method testVault
	public void testVault() throws Exception {
		// JUnitDoclet begin method testcase.testVault
		// JUnitDoclet end method testcase.testVault
	}

}
