package org.santander.service;

/**
 * Business logic to work with shop items
 */
public interface ShopService {

    /**
     * Method to create new item in db
     *
     * @param name name value
     * @param price price value
     * @return generated tem id
     */
    Integer createItem(String name, Double price);
}
