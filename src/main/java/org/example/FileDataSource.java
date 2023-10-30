package org.example;

import java.io.*;

abstract class FileDataSource implements DataSource {

    @Override
    public String read(String filePath) {
        String content = "";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            StringBuilder stringBuilder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line).append("\n");
            }
            content = stringBuilder.toString();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }

    @Override
    public void write(String filePath, String content) {
        // Write the content to the file
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
            writer.write(content);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public abstract void readData();

    public abstract void writeData();
}