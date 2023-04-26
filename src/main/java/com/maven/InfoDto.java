package com.maven;

public class InfoDto {
    private String name;
    private String lastname;

    public InfoDto(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "com.Info{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
