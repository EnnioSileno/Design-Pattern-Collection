package ch.ennio.sileno.structural.decorator.examplereadwrite.decorator;

import ch.ennio.sileno.structural.decorator.examplereadwrite.DataSource;

// Concrete Decorator
public class CompressionDecorator extends DataSourceDecorator {
    public CompressionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        data = "COMPRESS(" + data + ")";
        super.writeData(data);
    }

    @Override
    public String readData() {
        // try to decompress if compressed
        return super.readData();
    }
}
