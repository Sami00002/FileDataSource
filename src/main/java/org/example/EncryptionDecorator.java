package org.example;

class EncryptionDecorator implements DataSource {
    private DataSource dataSource;

    public EncryptionDecorator(DataSource dataSource) {
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