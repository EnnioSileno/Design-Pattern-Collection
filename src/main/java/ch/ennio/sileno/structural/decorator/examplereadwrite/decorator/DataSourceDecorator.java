package ch.ennio.sileno.structural.decorator.examplereadwrite.decorator;

import ch.ennio.sileno.structural.decorator.examplereadwrite.DataSource;

// Base Decorator
public class DataSourceDecorator implements DataSource {
    private final DataSource wrappee;

    public DataSourceDecorator(DataSource source) {
        this.wrappee = source;
    }

    @Override
    public void writeData(String data) {
        wrappee.writeData(data);
    }

    @Override
    public String readData() {
        return wrappee.readData();
    }
}
