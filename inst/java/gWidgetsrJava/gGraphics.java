// This just doesn't work. I tried to get the canvas, and not the
// frame. However, it appears there is some magic at the C level (the .so)
// file in the code
// To use this, you do something like
// > .jinit(.javaGD.get.class.path())
// > .javaGD.set.class.path("")
// > .jnew("gWidgetsrJava/gGraphics")
package gWidgetsrJava;

import org.rosuda.javaGD.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.reflect.Method;

public class gGraphics extends GDInterface {
    
    private static gGraphics _instance;

    public gGraphics() {
        super();
        _instance = this;
    }
    
    public static GDContainer getCanvas() {
        return _instance.c;
    }

    public void     gdOpen(double w, double h) {
        c = new GDCanvas(w, h);
    }
}
