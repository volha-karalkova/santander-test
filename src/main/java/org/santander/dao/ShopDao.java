package org.santander.dao;

/**
 * Interface to work with database
 *
 * @param <T> type to work with
 */
public interface ShopDao<T> {

    /**
     * Method to create a new record in database
     *
     * @param t object to add to database
     */
    Integer create(T t);
}
