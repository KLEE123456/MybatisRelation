package com.klee.MybatisRelation.test;

import com.klee.MybatisRelation.mapper.CustomerMapper;
import com.klee.MybatisRelation.mapper.IDCardMapper;
import com.klee.MybatisRelation.mybatisutils.MybatisUtils;
import com.klee.MybatisRelation.pojo.Customer;
import com.klee.MybatisRelation.pojo.IDCard;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class OneToOneTest {
    /**
     * 查询IDCard测试方法
     */
    @Test
    public void findIDCardTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession(false);
        IDCardMapper idCardMapper = sqlSession.getMapper(IDCardMapper.class);
        List<IDCard> idCard = idCardMapper.findIDCard();
        for (IDCard card : idCard) {
            System.out.println(card+","+card.getCustomer());
        }
    }

    /**
     * 查询客户测试方法
     */
    @Test
    public  void findCustomerTest(){
        SqlSession sqlSession=MybatisUtils.getSqlSession(false);
        CustomerMapper customerMapper = sqlSession.getMapper(CustomerMapper.class);
        List<Customer> customerList = customerMapper.findCustomer();
        for (Customer customer : customerList) {
            System.out.println(customer+","+customer.getIdCard());
        }
    }
}
