package patterns.structural.proxy;

import patterns.structural.proxy.proxy.ProxyImage;
import patterns.structural.proxy.service.Image;

public class ProxyApp {
    public static final String IMAGE = "D:/temp/image.jpeg";

    public static void main(String[] args) {
        /*Instead of:
        Image image = new RealImage(IMAGE);
        image.display();
  */
//        Downloading happen only while object is called, but not with object creation.
        Image proxyImage = new ProxyImage(IMAGE);
        proxyImage.display();
    }
}