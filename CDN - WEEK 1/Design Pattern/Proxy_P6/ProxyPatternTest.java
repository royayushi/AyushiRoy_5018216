package Proxy_P6;

public class ProxyPatternTest {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");

        // Image is loaded and displayed on first access
        image1.display();

        // Image is already loaded, so it's just displayed
        image1.display();

        // Image is loaded and displayed on first access
        image2.display();
    }
}

