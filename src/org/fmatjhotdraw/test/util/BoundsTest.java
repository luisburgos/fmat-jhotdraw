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
package org.fmatjhotdraw.test.util;

import java.awt.Dimension;
import java.awt.geom.Point2D;

import org.fmatjhotdraw.util.Bounds;

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
 * TestCase BoundsTest is generated by
 * JUnitDoclet to hold the tests for Bounds.
 * @see org.fmatjhotdraw.util.Bounds
 */
// JUnitDoclet end javadoc_class
public class BoundsTest
// JUnitDoclet begin extends_implements
extends TestCase
// JUnitDoclet end extends_implements
{
	// JUnitDoclet begin class
	// instance variables, helper methods, ... put them in this marker
	private Bounds bounds;
	// JUnitDoclet end class

	/**
	 * Constructor BoundsTest is
	 * basically calling the inherited constructor to
	 * initiate the TestCase for use by the Framework.
	 */
	public BoundsTest(String name) {
		// JUnitDoclet begin method BoundsTest
		super(name);
		// JUnitDoclet end method BoundsTest
	}

	/**
	 * Factory method for instances of the class to be tested.
	 */
	public Bounds createInstance() throws Exception {
		// JUnitDoclet begin method testcase.createInstance
		return new Bounds(new Dimension(100, 100));
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
		bounds = createInstance();
		// JUnitDoclet end method testcase.setUp
	}

	/**
	 * Method tearDown is overwriting the framework method to
	 * clean up after each single test of this TestCase.
	 * It's called from the JUnit framework only.
	 */
	protected void tearDown() throws Exception {
		// JUnitDoclet begin method testcase.tearDown
		bounds = null;
		super.tearDown();
		// JUnitDoclet end method testcase.tearDown
	}

	// JUnitDoclet begin javadoc_method getLesserX()
	/**
	 * Method testGetLesserX is testing getLesserX
	 * @see org.fmatjhotdraw.util.Bounds#getLesserX()
	 */
	// JUnitDoclet end javadoc_method getLesserX()
	public void testGetLesserX() throws Exception {
		// JUnitDoclet begin method getLesserX
		// JUnitDoclet end method getLesserX
	}

	// JUnitDoclet begin javadoc_method getGreaterX()
	/**
	 * Method testGetGreaterX is testing getGreaterX
	 * @see org.fmatjhotdraw.util.Bounds#getGreaterX()
	 */
	// JUnitDoclet end javadoc_method getGreaterX()
	public void testGetGreaterX() throws Exception {
		// JUnitDoclet begin method getGreaterX
		// JUnitDoclet end method getGreaterX
	}

	// JUnitDoclet begin javadoc_method getLesserY()
	/**
	 * Method testGetLesserY is testing getLesserY
	 * @see org.fmatjhotdraw.util.Bounds#getLesserY()
	 */
	// JUnitDoclet end javadoc_method getLesserY()
	public void testGetLesserY() throws Exception {
		// JUnitDoclet begin method getLesserY
		// JUnitDoclet end method getLesserY
	}

	// JUnitDoclet begin javadoc_method getGreaterY()
	/**
	 * Method testGetGreaterY is testing getGreaterY
	 * @see org.fmatjhotdraw.util.Bounds#getGreaterY()
	 */
	// JUnitDoclet end javadoc_method getGreaterY()
	public void testGetGreaterY() throws Exception {
		// JUnitDoclet begin method getGreaterY
		// JUnitDoclet end method getGreaterY
	}

	// JUnitDoclet begin javadoc_method getWest()
	/**
	 * Method testGetWest is testing getWest
	 * @see org.fmatjhotdraw.util.Bounds#getWest()
	 */
	// JUnitDoclet end javadoc_method getWest()
	public void testGetWest() throws Exception {
		// JUnitDoclet begin method getWest
		// JUnitDoclet end method getWest
	}

	// JUnitDoclet begin javadoc_method getEast()
	/**
	 * Method testGetEast is testing getEast
	 * @see org.fmatjhotdraw.util.Bounds#getEast()
	 */
	// JUnitDoclet end javadoc_method getEast()
	public void testGetEast() throws Exception {
		// JUnitDoclet begin method getEast
		// JUnitDoclet end method getEast
	}

	// JUnitDoclet begin javadoc_method getSouth()
	/**
	 * Method testGetSouth is testing getSouth
	 * @see org.fmatjhotdraw.util.Bounds#getSouth()
	 */
	// JUnitDoclet end javadoc_method getSouth()
	public void testGetSouth() throws Exception {
		// JUnitDoclet begin method getSouth
		// JUnitDoclet end method getSouth
	}

	// JUnitDoclet begin javadoc_method getNorth()
	/**
	 * Method testGetNorth is testing getNorth
	 * @see org.fmatjhotdraw.util.Bounds#getNorth()
	 */
	// JUnitDoclet end javadoc_method getNorth()
	public void testGetNorth() throws Exception {
		// JUnitDoclet begin method getNorth
		// JUnitDoclet end method getNorth
	}

	// JUnitDoclet begin javadoc_method getWidth()
	/**
	 * Method testGetWidth is testing getWidth
	 * @see org.fmatjhotdraw.util.Bounds#getWidth()
	 */
	// JUnitDoclet end javadoc_method getWidth()
	public void testGetWidth() throws Exception {
		// JUnitDoclet begin method getWidth
		// JUnitDoclet end method getWidth
	}

	// JUnitDoclet begin javadoc_method getHeight()
	/**
	 * Method testGetHeight is testing getHeight
	 * @see org.fmatjhotdraw.util.Bounds#getHeight()
	 */
	// JUnitDoclet end javadoc_method getHeight()
	public void testGetHeight() throws Exception {
		// JUnitDoclet begin method getHeight
		// JUnitDoclet end method getHeight
	}

	// JUnitDoclet begin javadoc_method asRectangle2D()
	/**
	 * Method testAsRectangle2D is testing asRectangle2D
	 * @see org.fmatjhotdraw.util.Bounds#asRectangle2D()
	 */
	// JUnitDoclet end javadoc_method asRectangle2D()
	public void testAsRectangle2D() throws Exception {
		// JUnitDoclet begin method asRectangle2D
		// JUnitDoclet end method asRectangle2D
	}

	// JUnitDoclet begin javadoc_method setCenter()
	/**
	 * Method testSetGetCenter is testing setCenter
	 * and getCenter together by setting some value
	 * and verifying it by reading.
	 * @see org.fmatjhotdraw.util.Bounds#setCenter(java.awt.geom.Point2D)
	 * @see org.fmatjhotdraw.util.Bounds#getCenter()
	 */
	// JUnitDoclet end javadoc_method setCenter()
	public void testSetGetCenter() throws Exception {
		// JUnitDoclet begin method setCenter getCenter
		Point2D[] tests = { new Point2D.Double(2.0, 3.0)};

		for (int i = 0; i < tests.length; i++) {
			bounds.setCenter(tests[i]);
			assertEquals(tests[i], bounds.getCenter());
		}
		// JUnitDoclet end method setCenter getCenter
	}

	// JUnitDoclet begin method setNullCenter()
	/**
	  * Test a null argument to setCenter.  Expect an IllegalArgumentException
	  * 
	  * @see org.fmatjhotdraw.util.Bounds#setCenter(java.awt.geom.Point2D)
	  */
	public void testSetNullCenter() throws Exception {
		Point2D original = bounds.getCenter();

		try {
			bounds.setCenter(null);
			fail("IllegalArgumentException expected");
		}
		catch (IllegalArgumentException ok) {
			assertEquals("setCenter(null) altered property value", original, bounds.getCenter());
		}
	}
	// JUnitDoclet end method

	// JUnitDoclet begin javadoc_method zoomBy()
	/**
	 * Method testZoomBy is testing zoomBy
	 * @see org.fmatjhotdraw.util.Bounds#zoomBy(double)
	 */
	// JUnitDoclet end javadoc_method zoomBy()
	public void testZoomBy() throws Exception {
		// JUnitDoclet begin method zoomBy
		// JUnitDoclet end method zoomBy
	}

	// JUnitDoclet begin javadoc_method shiftBy()
	/**
	 * Method testShiftBy is testing shiftBy
	 * @see org.fmatjhotdraw.util.Bounds#shiftBy(int, int)
	 */
	// JUnitDoclet end javadoc_method shiftBy()
	public void testShiftBy() throws Exception {
		// JUnitDoclet begin method shiftBy
		// JUnitDoclet end method shiftBy
	}

	// JUnitDoclet begin javadoc_method offset()
	/**
	 * Method testOffset is testing offset
	 * @see org.fmatjhotdraw.util.Bounds#offset(double, double)
	 */
	// JUnitDoclet end javadoc_method offset()
	public void testOffset() throws Exception {
		// JUnitDoclet begin method offset
		// JUnitDoclet end method offset
	}

	// JUnitDoclet begin javadoc_method expandToRatio()
	/**
	 * Method testExpandToRatio is testing expandToRatio
	 * @see org.fmatjhotdraw.util.Bounds#expandToRatio(double)
	 */
	// JUnitDoclet end javadoc_method expandToRatio()
	public void testExpandToRatio() throws Exception {
		// JUnitDoclet begin method expandToRatio
		// JUnitDoclet end method expandToRatio
	}

	// JUnitDoclet begin javadoc_method includeXCoordinate()
	/**
	 * Method testIncludeXCoordinate is testing includeXCoordinate
	 * @see org.fmatjhotdraw.util.Bounds#includeXCoordinate(double)
	 */
	// JUnitDoclet end javadoc_method includeXCoordinate()
	public void testIncludeXCoordinate() throws Exception {
		// JUnitDoclet begin method includeXCoordinate
		// JUnitDoclet end method includeXCoordinate
	}

	// JUnitDoclet begin javadoc_method includeYCoordinate()
	/**
	 * Method testIncludeYCoordinate is testing includeYCoordinate
	 * @see org.fmatjhotdraw.util.Bounds#includeYCoordinate(double)
	 */
	// JUnitDoclet end javadoc_method includeYCoordinate()
	public void testIncludeYCoordinate() throws Exception {
		// JUnitDoclet begin method includeYCoordinate
		// JUnitDoclet end method includeYCoordinate
	}

	// JUnitDoclet begin javadoc_method includePoint()
	/**
	 * Method testIncludePoint is testing includePoint
	 * @see org.fmatjhotdraw.util.Bounds#includePoint(double, double)
	 */
	// JUnitDoclet end javadoc_method includePoint()
	public void testIncludePoint() throws Exception {
		// JUnitDoclet begin method includePoint
		// JUnitDoclet end method includePoint
	}

	// JUnitDoclet begin javadoc_method includeLine()
	/**
	 * Method testIncludeLine is testing includeLine
	 * @see org.fmatjhotdraw.util.Bounds#includeLine(double, double, double, double)
	 */
	// JUnitDoclet end javadoc_method includeLine()
	public void testIncludeLine() throws Exception {
		// JUnitDoclet begin method includeLine
		// JUnitDoclet end method includeLine
	}

	// JUnitDoclet begin javadoc_method includeBounds()
	/**
	 * Method testIncludeBounds is testing includeBounds
	 * @see org.fmatjhotdraw.util.Bounds#includeBounds(org.fmatjhotdraw.util.Bounds)
	 */
	// JUnitDoclet end javadoc_method includeBounds()
	public void testIncludeBounds() throws Exception {
		// JUnitDoclet begin method includeBounds
		// JUnitDoclet end method includeBounds
	}

	// JUnitDoclet begin javadoc_method includeRectangle2D()
	/**
	 * Method testIncludeRectangle2D is testing includeRectangle2D
	 * @see org.fmatjhotdraw.util.Bounds#includeRectangle2D(java.awt.geom.Rectangle2D)
	 */
	// JUnitDoclet end javadoc_method includeRectangle2D()
	public void testIncludeRectangle2D() throws Exception {
		// JUnitDoclet begin method includeRectangle2D
		// JUnitDoclet end method includeRectangle2D
	}

	// JUnitDoclet begin javadoc_method intersect()
	/**
	 * Method testIntersect is testing intersect
	 * @see org.fmatjhotdraw.util.Bounds#intersect(org.fmatjhotdraw.util.Bounds)
	 */
	// JUnitDoclet end javadoc_method intersect()
	public void testIntersect() throws Exception {
		// JUnitDoclet begin method intersect
		// JUnitDoclet end method intersect
	}

	// JUnitDoclet begin javadoc_method intersectsPoint()
	/**
	 * Method testIntersectsPoint is testing intersectsPoint
	 * @see org.fmatjhotdraw.util.Bounds#intersectsPoint(double, double)
	 */
	// JUnitDoclet end javadoc_method intersectsPoint()
	public void testIntersectsPoint() throws Exception {
		// JUnitDoclet begin method intersectsPoint
		// JUnitDoclet end method intersectsPoint
	}

	// JUnitDoclet begin javadoc_method intersectsLine()
	/**
	 * Method testIntersectsLine is testing intersectsLine
	 * @see org.fmatjhotdraw.util.Bounds#intersectsLine(double, double, double, double)
	 */
	// JUnitDoclet end javadoc_method intersectsLine()
	public void testIntersectsLine() throws Exception {
		// JUnitDoclet begin method intersectsLine
		// JUnitDoclet end method intersectsLine
	}

	// JUnitDoclet begin javadoc_method intersectsBounds()
	/**
	 * Method testIntersectsBounds is testing intersectsBounds
	 * @see org.fmatjhotdraw.util.Bounds#intersectsBounds(org.fmatjhotdraw.util.Bounds)
	 */
	// JUnitDoclet end javadoc_method intersectsBounds()
	public void testIntersectsBounds() throws Exception {
		// JUnitDoclet begin method intersectsBounds
		// JUnitDoclet end method intersectsBounds
	}

	// JUnitDoclet begin javadoc_method completelyContainsLine()
	/**
	 * Method testCompletelyContainsLine is testing completelyContainsLine
	 * @see org.fmatjhotdraw.util.Bounds#completelyContainsLine(double, double, double, double)
	 */
	// JUnitDoclet end javadoc_method completelyContainsLine()
	public void testCompletelyContainsLine() throws Exception {
		// JUnitDoclet begin method completelyContainsLine
		// JUnitDoclet end method completelyContainsLine
	}

	// JUnitDoclet begin javadoc_method isCompletelyInside()
	/**
	 * Method testIsCompletelyInside is testing isCompletelyInside
	 * @see org.fmatjhotdraw.util.Bounds#isCompletelyInside(org.fmatjhotdraw.util.Bounds)
	 */
	// JUnitDoclet end javadoc_method isCompletelyInside()
	public void testIsCompletelyInside() throws Exception {
		// JUnitDoclet begin method isCompletelyInside
		// JUnitDoclet end method isCompletelyInside
	}

	// JUnitDoclet begin javadoc_method cropLine()
	/**
	 * Method testCropLine is testing cropLine
	 * @see org.fmatjhotdraw.util.Bounds#cropLine(double, double, double, double)
	 */
	// JUnitDoclet end javadoc_method cropLine()
	public void testCropLine() throws Exception {
		// JUnitDoclet begin method cropLine
		// JUnitDoclet end method cropLine
	}

	// JUnitDoclet begin javadoc_method equals()
	/**
	 * Method testEquals is testing equals
	 * @see org.fmatjhotdraw.util.Bounds#equals(java.lang.Object)
	 */
	// JUnitDoclet end javadoc_method equals()
	public void testEquals() throws Exception {
		// JUnitDoclet begin method equals
		// JUnitDoclet end method equals
	}

	// JUnitDoclet begin javadoc_method hashCode()
	/**
	 * Method testHashCode is testing hashCode
	 * @see org.fmatjhotdraw.util.Bounds#hashCode()
	 */
	// JUnitDoclet end javadoc_method hashCode()
	public void testHashCode() throws Exception {
		// JUnitDoclet begin method hashCode
		// JUnitDoclet end method hashCode
	}

	// JUnitDoclet begin javadoc_method toString()
	/**
	 * Method testToString is testing toString
	 * @see org.fmatjhotdraw.util.Bounds#toString()
	 */
	// JUnitDoclet end javadoc_method toString()
	public void testToString() throws Exception {
		// JUnitDoclet begin method toString
		// JUnitDoclet end method toString
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
