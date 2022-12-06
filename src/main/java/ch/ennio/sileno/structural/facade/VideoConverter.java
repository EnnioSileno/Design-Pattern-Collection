package ch.ennio.sileno.structural.facade;

import ch.ennio.sileno.structural.facade.business.*;

// Facade that hides the complexity behind a simple interface.
public class VideoConverter {
    public VideoFile convert(String filename, String format) {
        File file = new File(filename);
        CodecFactory sourceCodec = new CodecFactory().extract(file);
        CompressionCodec destinationCodec = selectCodec(format);
        try(BitrateReader reader = new BitrateReader()) {
            MP4File buffer = reader.read(filename, sourceCodec);
            MP4File result = reader.convert(buffer, destinationCodec);
            result = new AudioMixer().fix(result);
            return new VideoFile(result);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private CompressionCodec selectCodec(String format) {
        if("mp4".equals(format)) {
            return new MPEG4CompressionCodec();
        } else {
            return new OggCompressionCodec();
        }
    }
}
