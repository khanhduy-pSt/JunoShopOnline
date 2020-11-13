package com.example.junoshop.Model;

public class Drawermenu {
    public Drawermenu(int id,String text_optionmenu, String img_optionmenu) {
        this.id = id;
        this.text_optionmenu = text_optionmenu;
        this.img_optionmenu = img_optionmenu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int id;
    public String text_optionmenu;

    public String getText_optionmenu() {
        return text_optionmenu;
    }

    public void setText_optionmenu(String text_optionmenu) {
        this.text_optionmenu = text_optionmenu;
    }

    public String getImg_optionmenu() {
        return img_optionmenu;
    }

    public void setImg_optionmenu(String img_optionmenu) {
        this.img_optionmenu = img_optionmenu;
    }
    public String img_optionmenu;

}
