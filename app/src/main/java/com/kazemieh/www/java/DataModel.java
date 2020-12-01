package com.kazemieh.www.java;

public class DataModel {
    String title;
    int image;

    String titlemain;
    int imagemain;



    DataModel(String dtitle,int dimage){
        this.image=dimage;
        this.title=dtitle;
    }

    DataModel(int dimagemain,String dtitlemain){
        this.titlemain=dtitlemain;
        this.imagemain=dimagemain;
    }

    public int getImagemain() {
        return imagemain;
    }

    public String getTitlemain() {
        return titlemain;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }
}
