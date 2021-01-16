package com.example.a2020_2forifhackathon;
import com.google.firebase.firestore.Exclude;

public class Post {
    private String documentID;
    private String title;
    private String description;
    private String writer;
    private String imgURL;

    public Post(){
        //Public no-args constructor required
    }

    public Post(String title, String description, String writer, String imgURL){
        this.title = title;
        this.description = description;
        this.writer = writer;
        this.imgURL = imgURL;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWriter(){
        return writer;
    }

    public void setWriter(String username){
        this.writer = writer;
    }

    public String getimgURL(){
        return imgURL;
    }

    public void setimgURL(String imgURL){
        this.imgURL = imgURL;
    }

    public void setDocumentID(String documentID) {
        this.documentID = documentID;
    }

    @Exclude
    public String getDocumentID() {
        return documentID;
    }
}