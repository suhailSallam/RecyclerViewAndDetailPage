package com.example.recyclerviewanddetailpage.Model;

import android.widget.ImageView;

//Listitems Class,
//     defining private variables for items to be used in the list
public class Listitem {
    private String name , price,l_description, s_description;
    private int intImage;
//Listitem constructor
//     give the the local variable values of the calling parameters
    public Listitem(int intImage,String name , String s_description ,String l_description, String price) {
        this.intImage = intImage;
        this.name =name;
        this.l_description = l_description;
        this.s_description = s_description;
        this.price = price;
    }//end constructor Listitem
    //get method of the image variable
    public int getintImage() {
        return intImage;
    }
    //set method of the image variable
    public void setintImage(int intImage) {
        this.intImage = intImage;
    }
    //get method of the first variable
    public String getName() {
        return name;
    }
//set method of the first variable
    public void setName(String name) {
        this.name = name;
    }
//get method of the second variable
    public String get_l_Description() {
        return l_description;
    }
//set method of the second variable
    public void set_l_Description(String l_description) {
        this.l_description = l_description;
    }
//get method of the third variable
    public String get_s_Description() {
        return s_description;
    }
//set method of the third variable
    public void set_s_Description(String s_description) {
        this.s_description = s_description;
    }
//get method of the fourth variable
    public String getPrice() {
        return price;
    }
//set method of the fourth variable
    public void setPrice(String price) {
        this.price = price;
    }
}//end class Listitem