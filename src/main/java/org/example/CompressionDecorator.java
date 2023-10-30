package org.example;

class CompressionDecorator implements DataSource {
    private DataSource dataSource;

    public CompressionDecorator(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public String read(String filePath) {
        String content = dataSource.read(filePath);
        return content;
    }

    @Override
    public void write(String filePath, String content) {
        dataSource.write(filePath, content);
    }
}