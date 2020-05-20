package cn.itcast.web.work;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

@WebServlet(value = "/CheckCodeServlet1",name = "nihao")
public class CheckCodeServlet1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      int width=100;
      int height=100;

        BufferedImage image=new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);

        //美化
          //2.1填充背景色
        Graphics g=image.getGraphics();//画笔对象
        g.setColor(Color.BLUE);
        g.fillRect(0,0,width,height);
        //画边框
        g.setColor(Color.pink);
        g.draw3DRect(0,0,width-10,height-10,true);
//写验证码
        String S="ABCDEEFGHIGKLMN";
        //生成随机角标
        Random ran=new Random();
//        int index=ran.nextInt(S.length());
        for (int i = 0; i <4 ; i++) {
            int index=ran.nextInt(S.length());
            char ch=S.charAt(index);
            g.drawString(ch+"",width/5*i,height/2);
        }
//        g.drawString("A",20,25);
//        g.drawString("A",40,25);
//        g.drawString("A",60,25);
//        g.drawString("A",80,25);
       //2.4画干扰线
        g.setColor(Color.BLACK);

        //输出内容
        ImageIO.write(image,"jpg",response.getOutputStream());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      this.doPost(request,response);
    }
}
