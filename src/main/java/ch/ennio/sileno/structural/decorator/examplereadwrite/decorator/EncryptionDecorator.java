package ch.ennio.sileno.structural.decorator.examplereadwrite.decorator;

import ch.ennio.sileno.structural.decorator.examplereadwrite.DataSource;

// Concrete Decorator
public class EncryptionDecorator extends DataSourceDecorator {

    public EncryptionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        data = "ENCRYPT(" + data + ")";
        super.writeData(data);
    }

    @Override
    public String readData() {
        // try to decrypt if encrypted
        return super.readData();
    }
}
