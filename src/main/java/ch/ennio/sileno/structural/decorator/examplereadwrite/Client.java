package ch.ennio.sileno.structural.decorator.examplereadwrite;

import ch.ennio.sileno.structural.decorator.examplereadwrite.decorator.CompressionDecorator;
import ch.ennio.sileno.structural.decorator.examplereadwrite.decorator.EncryptionDecorator;

public class Client {
    public static void main(String[] args) {
        boolean isEncryptionEnabled = true;
        boolean isCompressionEnabled = true;

        DataSource source = new FileDataSource("someFile.dat");
        System.out.println(source.readData());

        if(isEncryptionEnabled) {
            source = new EncryptionDecorator(source);
        }
        System.out.println(source.readData());
        if (isCompressionEnabled) {
            source = new CompressionDecorator(source);
        }
        // be aware of the order write data is executed ;)
        // 1st comes compression, 2nd encryption of the compressed data
        source.writeData("Hello World!");
        System.out.println(source.readData());
    }
}
