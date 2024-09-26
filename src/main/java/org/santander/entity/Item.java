package org.santander.entity;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Entity class for shop item to store in db
 */
@Entity
@Table(name = "Items")
public class Item {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Double price;

    /**
     * Constructor to set name and price
     *
     * @param name name value
     * @param price price value
     */
    public Item (String name, Double price) {
        this.name = name;
        this.price = price;
    }

    /**
     * Constructor without parameters
     */
    public Item() {
    }
}
