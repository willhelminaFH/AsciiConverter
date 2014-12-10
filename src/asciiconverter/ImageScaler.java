/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asciiconverter;

import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.SwingWorker;

/**
 *
 * @author Willhelmina
 */
public class ImageScaler extends SwingWorker{

    private BufferedImage imageA,imageB;
    //private Graphics2D g;
    private double x, y,r;
    
    
    void scale(BufferedImage i, double ratio){
        imageA = i;
        r = ratio;
        x = ratio*imageA.getWidth();
        y = ratio*imageA.getHeight();
        this.execute();
    }
    
    @Override
    protected Object doInBackground() throws Exception {
        
    AffineTransform scaleTransform = AffineTransform.getScaleInstance(r, r);
    AffineTransformOp bilinearScaleOp = new AffineTransformOp(scaleTransform, AffineTransformOp.TYPE_BILINEAR);
    imageA = bilinearScaleOp.filter(
        imageA,
        new BufferedImage((int)x, (int) y, 
                imageA.getType()));
    
        /*
        Graphics2D g = imageA.createGraphics();
        AffineTransform t = g.getTransform();
        t.scale(x, y);
        imageA = imageA.getSubimage(0, 0, w, h);
        //firePropertyChange(null, null, new ImageIcon(imageA.getSubimage(x, y, w, h)));
        */
        return null;
    }
    
}
