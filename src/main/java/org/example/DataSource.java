package org.example;

interface DataSource {
    String read(String filePath);
    void write(String filePath, String content);
}