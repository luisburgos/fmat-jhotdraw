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

import java.awt.Point;

// JUnitDoclet begin import
import org.fmatjhotdraw.figures.RectangleFigure;
import org.fmatjhotdraw.standard.LocatorHandle;
import org.fmatjhotdraw.standard.RelativeLocator;
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
 * TestCase LocatorHandleTest is generated by
 * JUnitDoclet to hold the tests for LocatorHandle.
 * @see org.fmatjhotdraw.standard.LocatorHandle
 */
// JUnitDoclet end javadoc_class
public class LocatorHandleTest
// JUnitDoclet begin extends_implements
extends JHDTestCase
// JUnitDoclet end extends_implements
{
	// JUnitDoclet begin class
	// instance variables, helper methods, ... put them in this marker
	private LocatorHandle locatorhandle;
	// JUnitDoclet end class

	/**
	 * Constructor LocatorHandleTest is
	 * basically calling the inherited constructor to
	 * initiate the TestCase for use by the Framework.
	 */
	public LocatorHandleTest(String name) {
		// JUnitDoclet begin method LocatorHandleTest
		super(name);
		// JUnitDoclet end method LocatorHandleTest
	}

	/**
	 * Factory method for instances of the class to be tested.
	 */
	public LocatorHandle createInstance() throws Exception {
		// JUnitDoclet begin method testcase.createInstance
		return new LocatorHandle(new RectangleFigure(new Point(), new Point()), new RelativeLocator(1.0, 2.0));
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
		locatorhandle = createInstance();
		// JUnitDoclet end method testcase.setUp
	}

	/**
	 * Method tearDown is overwriting the framework method to
	 * clean up after each single test of this TestCase.
	 * It's called from the JUnit framework only.
	 */
	protected void tearDown() throws Exception {
		// JUnitDoclet begin method testcase.tearDown
		locatorhandle = null;
		super.tearDown();
		// JUnitDoclet end method testcase.tearDown
	}

	// JUnitDoclet begin javadoc_method getLocator()
	/**
	 * Method testGetLocator is testing getLocator
	 * @see org.fmatjhotdraw.standard.LocatorHandle#getLocator()
	 */
	// JUnitDoclet end javadoc_method getLocator()
	public void testGetLocator() throws Exception {
		// JUnitDoclet begin method getLocator
		// JUnitDoclet end method getLocator
	}

	// JUnitDoclet begin javadoc_method locate()
	/**
	 * Method testLocate is testing locate
	 * @see org.fmatjhotdraw.standard.LocatorHandle#locate()
	 */
	// JUnitDoclet end javadoc_method locate()
	public void testLocate() throws Exception {
		// JUnitDoclet begin method locate
		// JUnitDoclet end method locate
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
