package cn.bdqn.service.impl;

import cn.bdqn.bean.News_detail;
import cn.bdqn.service.News_detailService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by dll on 2017/7/27.
 */
public class News_detailServiceImplTest {

    @Test
    public void test01(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        News_detailService news= (News_detailService) ac.getBean("detailService");
       News_detail detail=new News_detail();
       detail.setTitle("hh");
       detail.setCreateDate(new Date());
       news.add(detail);



    }

}