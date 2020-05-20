package cn.itcast.web.servlet;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.io.InputStream;
import java.util.Properties;

public class Spring {
    //导包
    //2.创建对象
    public static void main(String[] args) throws Exception {
        Properties pro=new Properties();
        InputStream resourceAsStream = Spring.class.getClassLoader().getResourceAsStream("druid.properties");
        pro.load(resourceAsStream);
        //获取连接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(pro);
        System.out.println(pro);
        System.out.println("chengogn");
        System.out.println(dataSource);
        JdbcTemplate template = new JdbcTemplate(dataSource);
        System.out.println("chengong");
        String sql="update student set sname='k' where SID = 3";
        int count=template.update(sql);
        System.out.println(count);
    }
}
