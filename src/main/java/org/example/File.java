package org.example;

public class File extends Entry {

    private byte[] content;

    @Override
    public boolean isDirectory() {
        return false;
    }

    @Override
    public int getSize() {
        return this.content.length;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public String getExtension() {
        return name.substring(name.indexOf(".") + 1);
    }

    @Override
    public String toString() {
        return "File{" +
                "name='" + name + '\'' +
                '}';
    }
}
