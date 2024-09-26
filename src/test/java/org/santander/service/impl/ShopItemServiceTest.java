package org.santander.service.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.santander.dao.ShopDao;
import org.santander.entity.Item;

import static org.mockito.Mockito.*;


/**
 * Unit test for ShopItemService
 */
@ExtendWith(MockitoExtension.class)
public class ShopItemServiceTest {

    @Mock
    ShopDao<Item> itemShopDao;

    @InjectMocks
    ShopItemService shopItemService;

    /**
     * Unit test for createItem method
     */
    @Test
    public void createItemTest() {
        String name = "name";
        Double price = 12.47;
        Integer id = 1;

        when(itemShopDao.create(any(Item.class))).thenReturn(id);
        Integer resultId = shopItemService.createItem(name, price);
        Assertions.assertEquals(id, resultId);
    }
}
