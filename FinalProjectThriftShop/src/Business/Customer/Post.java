/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.UUID;

/**
 *
 * @author Vishakha
 */
public class Post {
   
    private String name;
    private double price;
    private String description;
    private String category;
    private String picture;
    private String id;
  

    public Post(String name, double price,String category, String description, String filePath) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.description = description;
        this.picture = filePath;
        UUID uuid = UUID.randomUUID();
        id = uuid.toString();
    }
    
    public String getId() {
        return id;
    }
  
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
    
   
    @Override
    public String toString() {
        return this.name;
    }
    
}
