package ch.ennio.sileno.structural.decorator.examplereadwrite;

// Concrete Component
public class FileDataSource implements DataSource {
    private final String fileName;
    private String data = "";

    public FileDataSource(String fileName) {
        this.fileName = fileName;
    }


    @Override
    public void writeData(String data) {
        this.data = data;
    }

    @Override
    public String readData() {
        return data;
    }
}
