package cn.itcast.web.work;

//import com.sun.xml.internal.fastinfoset.sax.Properties;

//import java.io.FileInputStream;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class JDBC {
    //获取配置文件中的信息
    public static void load() throws Exception {
        //打根目录对的概率大一些
        FileInputStream fis = new FileInputStream("D:\\day_13Tomcat\\day13 servlet\\src\\cn\\itcast\\web\\work\\db.properties");
        Properties properties = new Properties();
        try {
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
        fis.close();
        String driverClass=properties.getProperty("driverClassName");
        String url=properties.getProperty("url");
        String username=properties.getProperty("username");
        String password=properties.getProperty("password");
        System.out.println(driverClass+"      "+url+" "+username+"         "+password);

        Class.forName(driverClass);
        Connection con= DriverManager.getConnection(url,username,password);
        Statement statement=con.createStatement();
        String sql="select*from user1";
        ResultSet rs=statement.executeQuery(sql);
        while(rs.next()){
            System.out.println("zhixing");
            System.out.println(rs.getInt("password")+"      "+rs.getString("username"));
        }
    }

    public static void main(String[] args) throws Exception {
        load();
    }

}
