package com.learnreactivespring.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document // to represent an mongodb document mapping class
@Data // getters , setters , toString ... are injected
@AllArgsConstructor // name implies
@NoArgsConstructor // name implies
public class Item {

    @Id
    private String id;
    private String description;
    private Double price;
}
