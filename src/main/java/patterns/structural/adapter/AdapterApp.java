package patterns.structural.adapter;

import patterns.structural.adapter.adapter.RasterToVectorAdapter;
import patterns.structural.adapter.adapter.VectorGraphicsInterface;

/**
 * Adapter gives an opportunity to work with different interfaces via class-adaptor.
 * */
public class AdapterApp {

    public static void main(String[] args) {
        VectorGraphicsInterface vector = new RasterToVectorAdapter();
        vector.drawPhoto();
        vector.drawPicture();
    }
}
