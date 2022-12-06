package ch.ennio.sileno.structural.decorator.examplereadwrite;

// Component
public interface DataSource {

    void writeData(String data);
    String readData();
}
