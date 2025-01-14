package com.sebi.shops.request;

import com.sebi.shops.model.Category;
import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.math.BigDecimal;

//nu este ok sa lucram direct cu modelul din bd pt ca nu e sigur...are anumite proprietati etc..mai bine facem o copie
@Data //setter si getter
public class AddProductRequest {
    private Long id;
    private String name;
    private String brand;
    private BigDecimal price;
    private int inventory;
    private String description;
    private Category category;
}
