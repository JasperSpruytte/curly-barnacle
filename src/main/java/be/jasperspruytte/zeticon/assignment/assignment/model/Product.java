package be.jasperspruytte.zeticon.assignment.assignment.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String title;

    protected Product() {}

    public Product(String title) {
        this.title = title;
    }

}
