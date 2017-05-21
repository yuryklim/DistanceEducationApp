package servlets;

import org.junit.Assert;
import org.junit.Test;

import java.sql.Connection;

/**
 * Created by Yuriy on 21.05.2017.
 */
public class DBconnectTest {
    @Test
    public void getConnection() throws Exception {
        DBconnect dBconnect = new DBconnect();
        Connection actual = dBconnect.getConnection();
        Connection expected = dBconnect.getConnection();
        Assert.assertEquals(expected,actual);
    }

}