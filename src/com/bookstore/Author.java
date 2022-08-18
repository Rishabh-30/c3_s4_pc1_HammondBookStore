package com.bookstore;

public class Author  {
   private  String authorName;
   private   String authorPenName;




    @Override
    public String toString() {
        return "com.bookstore.Author{" + "authorName='" + authorName + '\'' + ", authorPenName='" + authorPenName + '\'' + '}';
    }

    public Author(String authorName, String authorPenName) {
        this.authorName = authorName;
        this.authorPenName = authorPenName;
    }
    public void display(){
        System.out.println("authorName = " + authorName);
        System.out.println("authorPenName = " + authorPenName);
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorPenName() {
        return authorPenName;
    }

    public void setAuthorPenName(String authorPenName) {
        this.authorPenName = authorPenName;
    }
}
