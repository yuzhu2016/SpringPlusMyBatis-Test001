package com.springMyBatis.system.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springMyBatis.system.dao.UserDao;
import com.springMyBatis.system.model.User;

public class UserController {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        ApplicationContext ctx=null;
        ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao=(UserDao) ctx.getBean("userDao");
        User user=new User();
        //添加两条数据
        user.setId(1);
        user.setUsername("Jessica");
        user.setPassword("123");
        userDao.addUser(user);
        user.setId(2);
        user.setUsername("Jessica2");
        user.setPassword("123");
        userDao.addUser(user);
        System.out.println("添加成功");
        //查询数据
       /* user.setUsername("Jessica");
        user.setPassword("123");
        System.out.println(userDao.getUser(user).toString());
        user.setUsername("Jessica2");
        user.setPassword("123");
        System.out.println(userDao.getUser(user).toString());
        //修改数据
        user.setId(2);
        user.setPassword("802");
        userDao.updateUser(user);
        System.out.println("修改成功");
        //删除数据
        userDao.deleteUser(1);
        System.out.println("删除成功");*/
        
    }

}