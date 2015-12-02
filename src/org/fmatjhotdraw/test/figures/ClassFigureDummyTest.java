package org.fmatjhotdraw.test.figures;

import junit.framework.TestCase;
import org.fmatjhotdraw.classdiagrams.ClassFigureDummy;

/**
 * Created by luisburgos on 25/11/15.
 */
public class ClassFigureDummyTest extends TestCase {


        // JUnitDoclet begin class
        // instance variables, helper methods, ... put them in this marker
        private ClassFigureDummy classFigureDummy;
        // JUnitDoclet end class

        /**
         * Constructor RectangleFigureTest is
         * basically calling the inherited constructor to
         * initiate the TestCase for use by the Framework.
         */
        public ClassFigureDummyTest(String name) {
        // JUnitDoclet begin method RectangleFigureTest
        super(name);
        // JUnitDoclet end method RectangleFigureTest
    }

        /**
         * Factory method for instances of the class to be tested.
         */
    public ClassFigureDummy createInstance() throws Exception {
        // JUnitDoclet begin method testcase.createInstance
        return new ClassFigureDummy();
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
        classFigureDummy = createInstance();
        // JUnitDoclet end method testcase.setUp
    }

    /**
     * Method tearDown is overwriting the framework method to
     * clean up after each single test of this TestCase.
     * It's called from the JUnit framework only.
     */
    protected void tearDown() throws Exception {
        // JUnitDoclet begin method testcase.tearDown
        classFigureDummy = null;
        super.tearDown();
        // JUnitDoclet end method testcase.tearDown
    }

    // JUnitDoclet begin javadoc_method basicDisplayBox()
    /**
     * Method testBasicDisplayBox is testing basicDisplayBox
     * @see org.fmatjhotdraw.figures.RectangleFigure#basicDisplayBox(java.awt.Point, java.awt.Point)
     */
    // JUnitDoclet end javadoc_method basicDisplayBox()
    public void testBasicDisplayBox() throws Exception {
        // JUnitDoclet begin method basicDisplayBox
        // JUnitDoclet end method basicDisplayBox
    }

    // JUnitDoclet begin javadoc_method handles()
    /**
     * Method testHandles is testing handles
     * @see org.fmatjhotdraw.figures.RectangleFigure#handles()
     */
    // JUnitDoclet end javadoc_method handles()
    public void testHandles() throws Exception {
        // JUnitDoclet begin method handles
        // JUnitDoclet end method handles
    }

    // JUnitDoclet begin javadoc_method displayBox()
    /**
     * Method testDisplayBox is testing displayBox
     * @see org.fmatjhotdraw.figures.RectangleFigure#displayBox()
     */
    // JUnitDoclet end javadoc_method displayBox()
    public void testDisplayBox() throws Exception {
        // JUnitDoclet begin method displayBox
        // JUnitDoclet end method displayBox
    }

    // JUnitDoclet begin javadoc_method drawBackground()
    /**
     * Method testDrawBackground is testing drawBackground
     * @see org.fmatjhotdraw.figures.RectangleFigure#drawBackground(java.awt.Graphics)
     */
    // JUnitDoclet end javadoc_method drawBackground()
    public void testDrawBackground() throws Exception {
        // JUnitDoclet begin method drawBackground
        // JUnitDoclet end method drawBackground
    }

    // JUnitDoclet begin javadoc_method drawFrame()
    /**
     * Method testDrawFrame is testing drawFrame
     * @see org.fmatjhotdraw.figures.RectangleFigure#drawFrame(java.awt.Graphics)
     */
    // JUnitDoclet end javadoc_method drawFrame()
    public void testDrawFrame() throws Exception {
        // JUnitDoclet begin method drawFrame
        // JUnitDoclet end method drawFrame
    }

    // JUnitDoclet begin javadoc_method write()
    /**
     * Method testWrite is testing write
     * @see org.fmatjhotdraw.figures.RectangleFigure#write(org.fmatjhotdraw.util.StorableOutput)
     */
    // JUnitDoclet end javadoc_method write()
    public void testWrite() throws Exception {
        // JUnitDoclet begin method write
        // JUnitDoclet end method write
    }

    // JUnitDoclet begin javadoc_method read()
    /**
     * Method testRead is testing read
     * @see org.fmatjhotdraw.figures.RectangleFigure#read(org.fmatjhotdraw.util.StorableInput)
     */
    // JUnitDoclet end javadoc_method read()
    public void testRead() throws Exception {
        // JUnitDoclet begin method read
        // JUnitDoclet end method read
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
