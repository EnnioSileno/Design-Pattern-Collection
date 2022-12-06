package ch.ennio.sileno.structural.facade.business;

public class BitrateReader implements AutoCloseable {
    @Override
    public void close() throws Exception {

    }

    public MP4File read(String filename, CodecFactory sourceCodec) {
        return new MP4File();
    }

    public MP4File convert(MP4File buffer, CompressionCodec destinationCodec) {
        return buffer;
    }
}
