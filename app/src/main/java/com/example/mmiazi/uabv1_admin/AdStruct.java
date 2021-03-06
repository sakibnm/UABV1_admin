package com.example.mmiazi.uabv1_admin;

public class AdStruct {
    String name;
    String rating;
    String productName;
    String comment;
    String userPhoto;
    String productPhoto;

    AdStruct() {

    }

    @Override
    public String toString() {
        return "AdStruct{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                ", productName='" + productName + '\'' +
                ", comment='" + comment + '\'' +
                ", userPhoto='" + userPhoto + '\'' +
                ", productPhoto='" + productPhoto + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getUserPhoto() {
        return userPhoto;
    }

    public void setUserPhoto(String userPhoto) {
        this.userPhoto = userPhoto;
    }

    public String getProductPhoto() {
        return productPhoto;
    }

    public void setProductPhoto(String productPhoto) {
        this.productPhoto = productPhoto;
    }

    AdStruct(String name, String rating, String productName, String comment, String userPhoto, String productPhoto) {
        this.name = name;
        this.rating = rating;
        this.productName = productName;
        this.comment = comment;
        this.userPhoto = userPhoto;
        this.productPhoto = productPhoto;

    }

}
