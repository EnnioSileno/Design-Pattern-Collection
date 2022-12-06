package ch.ennio.sileno.structural.facade;

import ch.ennio.sileno.structural.facade.business.VideoFile;

public class Client {
    public static void main(String[] args) {
        VideoConverter converter = new VideoConverter();
        VideoFile file = converter.convert("funny-cats-video.ogg", "mp4");
    }
}
