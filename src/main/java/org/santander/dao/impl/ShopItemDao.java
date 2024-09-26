package org.santander.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.santander.dao.ShopDao;
import org.santander.entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * ShopDao implementation for Item entity
 */
@Repository
@Transactional
public class ShopItemDao implements ShopDao<Item> {

    /**
     * SessionFactory to work with database
     */
    @Autowired
    private SessionFactory sessionFactory;

    /**
     * @inheritDoc
     */
    @Override
    public Integer create(Item item) {
        Session session = sessionFactory.getCurrentSession();

        return (Integer)session.save(item);
    }
}
