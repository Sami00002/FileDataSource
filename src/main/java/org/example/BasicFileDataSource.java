package org.example;

class BasicFileDataSource extends FileDataSource {
    private String fileName;

    public BasicFileDataSource(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void readData() {
        System.out.println("Reading data from " + fileName);
        // Implement read logic here
    }

    @Override
    public void writeData() {
        System.out.println("Writing data to " + fileName);
        // Implement write logic here
    }
}