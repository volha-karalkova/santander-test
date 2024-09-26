package org.santander.service.impl;

import org.santander.dao.ShopDao;
import org.santander.entity.Item;
import org.santander.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * ShopService implementation
 */
public class ShopItemService implements ShopService {

    /**
     * Bean to work with db
     */
    @Autowired
    ShopDao<Item> itemShopDao;

    /**
     * @inheritDoc
     */
    @Override
    public Integer createItem(String name, Double price) {
        Item item = new Item(name, price);

        return itemShopDao.create(item);
    }
}
