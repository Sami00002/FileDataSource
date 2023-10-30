package org.example;

public class Main {
    public static void main(String[] args) {

        DataSource fileDataSource = new FileDataSource() {
            @Override
            public void readData() {

            }

            @Override
            public void writeData() {

            }
        };

        // Wrap it with an encryption decorator
        DataSource encryptedFile = new EncryptionDecorator(fileDataSource);

        // Wrap it with a compression decorator
        DataSource compressedAndEncryptedFile = new CompressionDecorator(encryptedFile);

        String content = "This is some example content.";
        compressedAndEncryptedFile.write("example.txt", content);

        String readContent = compressedAndEncryptedFile.read("example.txt");
        System.out.println("Read content: " + readContent);
    }
}