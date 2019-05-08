package com.soft1841.demo6;

public class ImagesEntity {
    private String path;

    public ImagesEntity(String path) {
        this.path = path;
    }

    public ImagesEntity() {
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "ImagesEntity{" +
                "path='" + path + '\'' +
                '}';
    }
}
