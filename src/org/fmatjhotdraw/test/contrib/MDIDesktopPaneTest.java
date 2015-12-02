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
package org.fmatjhotdraw.test.contrib;

// JUnitDoclet begin import
import org.fmatjhotdraw.contrib.MDIDesktopPane;
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
 * TestCase MDIDesktopPaneTest is generated by
 * JUnitDoclet to hold the tests for MDIDesktopPane.
 * @see org.fmatjhotdraw.contrib.MDIDesktopPane
 */
// JUnitDoclet end javadoc_class
public class MDIDesktopPaneTest
// JUnitDoclet begin extends_implements
extends JHDTestCase
// JUnitDoclet end extends_implements
{
	// JUnitDoclet begin class
	// instance variables, helper methods, ... put them in this marker
	private MDIDesktopPane mdidesktoppane;
	// JUnitDoclet end class

	/**
	 * Constructor MDIDesktopPaneTest is
	 * basically calling the inherited constructor to
	 * initiate the TestCase for use by the Framework.
	 */
	public MDIDesktopPaneTest(String name) {
		// JUnitDoclet begin method MDIDesktopPaneTest
		super(name);
		// JUnitDoclet end method MDIDesktopPaneTest
	}

	/**
	 * Factory method for instances of the class to be tested.
	 */
	public MDIDesktopPane createInstance() throws Exception {
		// JUnitDoclet begin method testcase.createInstance
		return new MDIDesktopPane(getDrawingEditor());
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
		mdidesktoppane = createInstance();
		// JUnitDoclet end method testcase.setUp
	}

	/**
	 * Method tearDown is overwriting the framework method to
	 * clean up after each single test of this TestCase.
	 * It's called from the JUnit framework only.
	 */
	protected void tearDown() throws Exception {
		// JUnitDoclet begin method testcase.tearDown
		mdidesktoppane = null;
		super.tearDown();
		// JUnitDoclet end method testcase.tearDown
	}

	// JUnitDoclet begin javadoc_method getActiveDrawingView()
	/**
	 * Method testGetActiveDrawingView is testing getActiveDrawingView
	 * @see org.fmatjhotdraw.contrib.MDIDesktopPane#getActiveDrawingView()
	 */
	// JUnitDoclet end javadoc_method getActiveDrawingView()
	public void testGetActiveDrawingView() throws Exception {
		// JUnitDoclet begin method getActiveDrawingView
		// JUnitDoclet end method getActiveDrawingView
	}

	// JUnitDoclet begin javadoc_method addToDesktop()
	/**
	 * Method testAddToDesktop is testing addToDesktop
	 * @see org.fmatjhotdraw.contrib.MDIDesktopPane#addToDesktop(org.fmatjhotdraw.framework.DrawingView, int)
	 */
	// JUnitDoclet end javadoc_method addToDesktop()
	public void testAddToDesktop() throws Exception {
		// JUnitDoclet begin method addToDesktop
		// JUnitDoclet end method addToDesktop
	}

	// JUnitDoclet begin javadoc_method removeFromDesktop()
	/**
	 * Method testRemoveFromDesktop is testing removeFromDesktop
	 * @see org.fmatjhotdraw.contrib.MDIDesktopPane#removeFromDesktop(org.fmatjhotdraw.framework.DrawingView, int)
	 */
	// JUnitDoclet end javadoc_method removeFromDesktop()
	public void testRemoveFromDesktop() throws Exception {
		// JUnitDoclet begin method removeFromDesktop
		// JUnitDoclet end method removeFromDesktop
	}

	// JUnitDoclet begin javadoc_method removeAllFromDesktop()
	/**
	 * Method testRemoveAllFromDesktop is testing removeAllFromDesktop
	 * @see org.fmatjhotdraw.contrib.MDIDesktopPane#removeAllFromDesktop(int)
	 */
	// JUnitDoclet end javadoc_method removeAllFromDesktop()
	public void testRemoveAllFromDesktop() throws Exception {
		// JUnitDoclet begin method removeAllFromDesktop
		// JUnitDoclet end method removeAllFromDesktop
	}

	// JUnitDoclet begin javadoc_method getAllFromDesktop()
	/**
	 * Method testGetAllFromDesktop is testing getAllFromDesktop
	 * @see org.fmatjhotdraw.contrib.MDIDesktopPane#getAllFromDesktop(int)
	 */
	// JUnitDoclet end javadoc_method getAllFromDesktop()
	public void testGetAllFromDesktop() throws Exception {
		// JUnitDoclet begin method getAllFromDesktop
		// JUnitDoclet end method getAllFromDesktop
	}

	// JUnitDoclet begin javadoc_method addDesktopListener()
	/**
	 * Method testAddDesktopListener is testing addDesktopListener
	 * @see org.fmatjhotdraw.contrib.MDIDesktopPane#addDesktopListener(org.fmatjhotdraw.contrib.DesktopListener)
	 */
	// JUnitDoclet end javadoc_method addDesktopListener()
	public void testAddDesktopListener() throws Exception {
		// JUnitDoclet begin method addDesktopListener
		// JUnitDoclet end method addDesktopListener
	}

	// JUnitDoclet begin javadoc_method removeDesktopListener()
	/**
	 * Method testRemoveDesktopListener is testing removeDesktopListener
	 * @see org.fmatjhotdraw.contrib.MDIDesktopPane#removeDesktopListener(org.fmatjhotdraw.contrib.DesktopListener)
	 */
	// JUnitDoclet end javadoc_method removeDesktopListener()
	public void testRemoveDesktopListener() throws Exception {
		// JUnitDoclet begin method removeDesktopListener
		// JUnitDoclet end method removeDesktopListener
	}

	// JUnitDoclet begin javadoc_method cascadeFrames()
	/**
	 * Method testCascadeFrames is testing cascadeFrames
	 * @see org.fmatjhotdraw.contrib.MDIDesktopPane#cascadeFrames()
	 */
	// JUnitDoclet end javadoc_method cascadeFrames()
	public void testCascadeFrames() throws Exception {
		// JUnitDoclet begin method cascadeFrames
		// JUnitDoclet end method cascadeFrames
	}

	// JUnitDoclet begin javadoc_method tileFrames()
	/**
	 * Method testTileFrames is testing tileFrames
	 * @see org.fmatjhotdraw.contrib.MDIDesktopPane#tileFrames()
	 */
	// JUnitDoclet end javadoc_method tileFrames()
	public void testTileFrames() throws Exception {
		// JUnitDoclet begin method tileFrames
		// JUnitDoclet end method tileFrames
	}

	// JUnitDoclet begin javadoc_method tileFramesHorizontally()
	/**
	 * Method testTileFramesHorizontally is testing tileFramesHorizontally
	 * @see org.fmatjhotdraw.contrib.MDIDesktopPane#tileFramesHorizontally()
	 */
	// JUnitDoclet end javadoc_method tileFramesHorizontally()
	public void testTileFramesHorizontally() throws Exception {
		// JUnitDoclet begin method tileFramesHorizontally
		// JUnitDoclet end method tileFramesHorizontally
	}

	// JUnitDoclet begin javadoc_method tileFramesVertically()
	/**
	 * Method testTileFramesVertically is testing tileFramesVertically
	 * @see org.fmatjhotdraw.contrib.MDIDesktopPane#tileFramesVertically()
	 */
	// JUnitDoclet end javadoc_method tileFramesVertically()
	public void testTileFramesVertically() throws Exception {
		// JUnitDoclet begin method tileFramesVertically
		// JUnitDoclet end method tileFramesVertically
	}

	// JUnitDoclet begin javadoc_method arrangeFramesVertically()
	/**
	 * Method testArrangeFramesVertically is testing arrangeFramesVertically
	 * @see org.fmatjhotdraw.contrib.MDIDesktopPane#arrangeFramesVertically()
	 */
	// JUnitDoclet end javadoc_method arrangeFramesVertically()
	public void testArrangeFramesVertically() throws Exception {
		// JUnitDoclet begin method arrangeFramesVertically
		// JUnitDoclet end method arrangeFramesVertically
	}

	// JUnitDoclet begin javadoc_method arrangeFramesHorizontally()
	/**
	 * Method testArrangeFramesHorizontally is testing arrangeFramesHorizontally
	 * @see org.fmatjhotdraw.contrib.MDIDesktopPane#arrangeFramesHorizontally()
	 */
	// JUnitDoclet end javadoc_method arrangeFramesHorizontally()
	public void testArrangeFramesHorizontally() throws Exception {
		// JUnitDoclet begin method arrangeFramesHorizontally
		// JUnitDoclet end method arrangeFramesHorizontally
	}

	// JUnitDoclet begin javadoc_method setAllSize()
	/**
	 * Method testSetAllSize is testing setAllSize
	 * @see org.fmatjhotdraw.contrib.MDIDesktopPane#setAllSize(java.awt.Dimension)
	 */
	// JUnitDoclet end javadoc_method setAllSize()
	public void testSetAllSize() throws Exception {
		// JUnitDoclet begin method setAllSize
		// JUnitDoclet end method setAllSize
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
