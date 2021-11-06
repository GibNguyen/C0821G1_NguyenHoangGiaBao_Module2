package _20_structural_design_patterns.baitap.proxy;

public class FileDownloaderProxy implements Downloader {
    FileDownloader fileDownloader = new FileDownloader("FireFox");

    @Override
    public void download(String url) {
        fileDownloader.download(url);
    }
}
