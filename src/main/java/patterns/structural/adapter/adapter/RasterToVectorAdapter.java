package patterns.structural.adapter.adapter;

import patterns.structural.adapter.adaptee.RasterGrafics;

public class RasterToVectorAdapter extends RasterGrafics implements VectorGraphicsInterface {
    @Override
    public void drawPicture() {
        drawRasterPicture();
    }

    @Override
    public void drawPhoto() {
        drawRasterPhoto();
    }
}
