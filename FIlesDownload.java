public class FIlesDownload {
    public static void main(String[] args) {
        String[] files = {
                "File path1  100MB",
                "File path2  200kb",
                "File path3  100kb"
        };

        for (int i = 0; i < files.length; i++) {
            // System.out.println(files[i]);
            Downloader tFiles = new Downloader(files[i]);
            Thread filesThread = new Thread(tFiles);
            filesThread.start();
        }

    }
}
