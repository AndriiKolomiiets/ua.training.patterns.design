package patterns.structural.proxy.proxy;

import patterns.structural.proxy.service.Image;
import patterns.structural.proxy.service.RealImage;

/**
 * Proxy - lazy downloading
 * */
public class ProxyImage implements Image {
    private String file;
    private RealImage image;

    public ProxyImage(String file) {
        this.file = file;
    }

    @Override
    public void display() {
        if (image == null){
            image = new RealImage(file);
        }
        image.display();
    }
}
