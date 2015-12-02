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
package org.fmatjhotdraw.test.figures;

import java.awt.Point;

import org.fmatjhotdraw.figures.BorderDecorator;

import junit.framework.TestCase;
// JUnitDoclet begin import
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
 * TestCase BorderDecoratorTest is generated by
 * JUnitDoclet to hold the tests for BorderDecorator.
 * @see org.fmatjhotdraw.figures.BorderDecorator
 */
// JUnitDoclet end javadoc_class
public class BorderDecoratorTest
// JUnitDoclet begin extends_implements
extends TestCase
// JUnitDoclet end extends_implements
{
	// JUnitDoclet begin class
	// instance variables, helper methods, ... put them in this marker
	private BorderDecorator borderdecorator;
	// JUnitDoclet end class

	/**
	 * Constructor BorderDecoratorTest is
	 * basically calling the inherited constructor to
	 * initiate the TestCase for use by the Framework.
	 */
	public BorderDecoratorTest(String name) {
		// JUnitDoclet begin method BorderDecoratorTest
		super(name);
		// JUnitDoclet end method BorderDecoratorTest
	}

	/**
	 * Factory method for instances of the class to be tested.
	 */
	public BorderDecorator createInstance() throws Exception {
		// JUnitDoclet begin method testcase.createInstance
		return new BorderDecorator();
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
		borderdecorator = createInstance();
		// JUnitDoclet end method testcase.setUp
	}

	/**
	 * Method tearDown is overwriting the framework method to
	 * clean up after each single test of this TestCase.
	 * It's called from the JUnit framework only.
	 */
	protected void tearDown() throws Exception {
		// JUnitDoclet begin method testcase.tearDown
		borderdecorator = null;
		super.tearDown();
		// JUnitDoclet end method testcase.tearDown
	}

	// JUnitDoclet begin javadoc_method setBorderOffset()
	/**
	 * Method testSetGetBorderOffset is testing setBorderOffset
	 * and getBorderOffset together by setting some value
	 * and verifying it by reading.
	 * @see org.fmatjhotdraw.figures.BorderDecorator#setBorderOffset(java.awt.Point)
	 * @see org.fmatjhotdraw.figures.BorderDecorator#getBorderOffset()
	 */
	// JUnitDoclet end javadoc_method setBorderOffset()
	public void testSetGetBorderOffset() throws Exception {
		// JUnitDoclet begin method setBorderOffset getBorderOffset
		Point[] tests = { new java.awt.Point()};

		for (int i = 0; i < tests.length; i++) {
			borderdecorator.setBorderOffset(tests[i]);
			assertEquals(tests[i], borderdecorator.getBorderOffset());
		}
		// JUnitDoclet end method setBorderOffset getBorderOffset
	}

	// JUnitDoclet begin method setNullBorderOffset()
	/**
	  * Test a null argument to setBorderOffset.  Expect an Point(0, 0) to come back
	  * 
	  * @see org.fmatjhotdraw.figures.BorderDecorator#setBorderOffset(java.awt.Point)
	  */
	public void setNullBorderOffset() throws Exception {
		Point original = borderdecorator.getBorderOffset();

		borderdecorator.setBorderOffset(null);
		assertEquals(new Point(0, 0), borderdecorator.getBorderOffset());
	}
	// JUnitDoclet end method

	// JUnitDoclet begin javadoc_method draw()
	/**
	 * Method testDraw is testing draw
	 * @see org.fmatjhotdraw.figures.BorderDecorator#draw(java.awt.Graphics)
	 */
	// JUnitDoclet end javadoc_method draw()
	public void testDraw() throws Exception {
		// JUnitDoclet begin method draw
		// JUnitDoclet end method draw
	}

	// JUnitDoclet begin javadoc_method displayBox()
	/**
	 * Method testDisplayBox is testing displayBox
	 * @see org.fmatjhotdraw.figures.BorderDecorator#displayBox()
	 */
	// JUnitDoclet end javadoc_method displayBox()
	public void testDisplayBox() throws Exception {
		// JUnitDoclet begin method displayBox
		// JUnitDoclet end method displayBox
	}

	// JUnitDoclet begin javadoc_method figureInvalidated()
	/**
	 * Method testFigureInvalidated is testing figureInvalidated
	 * @see org.fmatjhotdraw.figures.BorderDecorator#figureInvalidated(org.fmatjhotdraw.framework.FigureChangeEvent)
	 */
	// JUnitDoclet end javadoc_method figureInvalidated()
	public void testFigureInvalidated() throws Exception {
		// JUnitDoclet begin method figureInvalidated
		// JUnitDoclet end method figureInvalidated
	}

	// JUnitDoclet begin javadoc_method connectionInsets()
	/**
	 * Method testConnectionInsets is testing connectionInsets
	 * @see org.fmatjhotdraw.figures.BorderDecorator#connectionInsets()
	 */
	// JUnitDoclet end javadoc_method connectionInsets()
	public void testConnectionInsets() throws Exception {
		// JUnitDoclet begin method connectionInsets
		// JUnitDoclet end method connectionInsets
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
