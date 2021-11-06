package _20_structural_design_patterns.baitap.proxy;

public class Client {
    public static void main(String[] args) {
        Downloader downloader = new FileDownloaderProxy();
        downloader.download("google.com");
    }
}