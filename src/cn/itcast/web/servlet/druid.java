package cn.itcast.web.servlet;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

public class druid {
    public static void main(String[] args) throws Exception {
        Properties pro=new Properties();
        InputStream resourceAsStream = druid.class.getClassLoader().getResourceAsStream("druid.properties");
        pro.load(resourceAsStream);
        //获取连接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(pro);
        System.out.println(dataSource);
        Connection connection=dataSource.getConnection();
        System.out.println(connection);
    }



}
