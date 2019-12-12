package com.example.demothymeleaf.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Product {

    private Integer id;
    private String courseName;
    private String courseSubtitle;
    private String courseDescription;
    private Author author;
    private BigDecimal price;
    private List<ProductCategory> productCategories = new ArrayList<>();
    private String imageUrl;

    public Integer getId() {
        return id;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseSubtitle() {
        return courseSubtitle;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public Author getAuthor() {
        return author;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public List<ProductCategory> getProductCategories() {
        return productCategories;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseSubtitle(String courseSubtitle) {
        this.courseSubtitle = courseSubtitle;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setProductCategories(List<ProductCategory> productCategories) {
        this.productCategories = productCategories;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
