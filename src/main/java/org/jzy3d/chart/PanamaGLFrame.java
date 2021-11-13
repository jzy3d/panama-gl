package org.jzy3d.chart;

import org.jzy3d.chart.factories.IFrame;
import org.jzy3d.painters.PanamaGLPainter;
import org.jzy3d.maths.Rectangle;

/**
 * This is not a real frame, but just a simple class calling the appropriate painter method to open a native frame.
 */
public class PanamaGLFrame implements IFrame {
    Thread glutBackgroundThread;

    public PanamaGLFrame(Chart chart) {
        this(chart, new Rectangle(0, 0, 800, 600), "");
    }

    public PanamaGLFrame(Chart chart, Rectangle bounds, String title) {
        initialize(chart, bounds, title);
    }

    @Override
    public void initialize(Chart chart, Rectangle bounds, String title) {
        initialize(chart, bounds, title, "PanamaGL");
    }

    @Override
    public void initialize(Chart chart, Rectangle bounds, String title, String message) {
        PanamaGLPainter painter = (PanamaGLPainter) chart.getPainter();

        painter.glutStart(chart, bounds, title, message);

        /*// Attempted access outside owning thread
        glutBackgroundThread = new Thread(new Runnable(){
            @Override
            public void run() {
                glutStart(chart, bounds, title, message);
            }
        });
        glutBackgroundThread.start();*/
    }
}
