package com.briup.mybatis;

import com.briup.mybatis.bean.Customer;
import com.briup.mybatis.bean.Scustomer;
import com.briup.mybatis.mapper.CustomerMapper;
import com.briup.mybatis.mapper.ScustomerMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisApplicationTests {

    @Autowired
    private CustomerMapper customerMapper;
    @Autowired
    private ScustomerMapper scustomerMapper;

    @Test
    public void contextLoads() {
        Customer customer = new Customer();
        customer.setId(3);
        customer.setMoney(45);
        customer.setName("bb");
        customerMapper.insert(customer);
    }

    @Test
    public void test1(){
        customerMapper.deleteById(1);
    }

    @Test
    public void test2(){
        customerMapper.deleteAll();

    }

    @Test
    public void test3(){
        Customer customer = new Customer();
        customer.setId(3);
        customer.setMoney(42);
        customer.setName("gf");
        customerMapper.update(customer);
    }

    @Test
    public void teat4(){
        List<Customer> list = customerMapper.selectAll();
        for (Customer customer : list){
            System.out.println("id:"+customer.getId());
            System.out.println("name"+customer.getName());
        }
    }

    @Test
    public void teat5(){
        Customer customer = customerMapper.selectById(3);
            System.out.println("id:"+customer.getId());
            System.out.println("name"+customer.getName());

    }
    @Test
    public void teat6(){
        Customer customer = customerMapper.count();

    }

    public void test



}
