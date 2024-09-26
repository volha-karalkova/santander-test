package dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.santander.dao.impl.ShopItemDao;
import org.santander.entity.Item;

import static org.mockito.Mockito.when;

/**
 * Unit test for ShopItemDao
 */
@ExtendWith(MockitoExtension.class)
public class ShopItemDaoTest {

    @Mock
    SessionFactory sessionFactory;

    @InjectMocks
    ShopItemDao dao;

    @Mock
    Session session;

    @Test
    public void saveTest() {
        String name = "name";
        Double price = 12.56;
        Integer id = 1;

        Item item = new Item(name, price);

        when(sessionFactory.getCurrentSession()).thenReturn(session);
        when(session.save(item)).thenReturn(id);
        Integer resultId = dao.create(item);

        Assertions.assertEquals(id, resultId);
    }
}
