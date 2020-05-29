package com.example.etcstudymaterial;

public class Books {
    private String Subname;
    private String Sub;
    private int Photo;

    public Books() {
    }

    public Books(String subname, String sub, int photo) {
        Subname = subname;
        Sub = sub;
        Photo = photo;
    }
    //Getter

    public String getSubname() {
        return Subname;
    }

    public String getSub() {
        return Sub;
    }

    public int getPhoto() {
        return Photo;
    }


    //Setter


    public void setSubname(String subname) {
        Subname = subname;
    }

    public void setSub(String sub) {
        Sub = sub;
    }

    public void setPhoto(int photo) {
        Photo = photo;
    }
}
