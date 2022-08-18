package com.bookstore;

public class Book extends Author {
  private   int isbnNumber;
  private   String title;
   private String description;
  private   int prize;

    public Book(String authorName, String authorPenName, int isbnNumber, String title, String description, int prize) {
        super(authorName, authorPenName);
        this.isbnNumber = isbnNumber;
        this.title = title;
        this.description = description;
        this.prize = prize;
    }

    public void displayBookDetails(){
        System.out.println("getAuthorName() = " + getAuthorName());
        System.out.println("getAuthorPenName() = " + getAuthorPenName());
        System.out.println("getIsbnNumber() = " + getIsbnNumber());
        System.out.println("getTitle() = " + getTitle());
        System.out.println("getDescription() = " + getDescription());
        System.out.println("getPrize() = " + getPrize());
    }

    public int getIsbnNumber() {
        return isbnNumber;
    }

    public void setIsbnNumber(int isbnNumber) {
        this.isbnNumber = isbnNumber;
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

    public int getPrize() {
        return prize;
    }

    public void setPrize(int prize) {
        this.prize = prize;
    }
}
