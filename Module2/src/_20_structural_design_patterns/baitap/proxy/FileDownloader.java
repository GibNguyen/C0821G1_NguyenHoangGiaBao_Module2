package _20_structural_design_patterns.baitap.proxy;

public class FileDownloader implements Downloader{
    private String UserAgent;

    public FileDownloader(String userAgent) {
        UserAgent = userAgent;
    }

    @Override
    public void download(String url) {
        System.out.println("doing connection to : " + url);
    }
}
