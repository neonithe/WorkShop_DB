package org.example;

import org.example.data.MyDataSource;

import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException {
        MyDataSource.getConnection();
    }
}
