package cn.itcast.web.servlet;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class C3P0Demo1 {
    public static void main(String[] args) throws SQLException {
        //创建连接池对象
        DataSource ds=new ComboPooledDataSource("otherc3p1");
        //获取连接对象
        for (int i = 0; i <10 ; i++) {
            Connection connection=ds.getConnection();
            //s
            System.out.println(connection+"   "+(i+1));
//            if(i==4){
//                connection.close();
//            }
        }
        Connection connection=ds.getConnection();
        //s
        System.out.println(connection);
    }
}
