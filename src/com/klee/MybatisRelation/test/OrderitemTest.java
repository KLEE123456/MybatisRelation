package com.klee.MybatisRelation.test;

import com.klee.MybatisRelation.mapper.OrderitemMapper;
import com.klee.MybatisRelation.mybatisutils.MybatisUtils;
import com.klee.MybatisRelation.pojo.Ordersitem;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class OrderitemTest {
    /**
     * 新增订单和产品中间表记录的测试方法
     */
    @Test
    public void insertOrderitemTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession(true);
        OrderitemMapper orderitemMapper = sqlSession.getMapper(OrderitemMapper.class);
        Ordersitem ordersitem=new Ordersitem();
        ordersitem.setOid(2);
        ordersitem.setPid(2);
        int rows = orderitemMapper.insertOrderitem(ordersitem);
        if (rows>0){
            System.out.println("----------新增成功!-----------");
        }
        else {
            System.out.println("------------新增失败！------------");
        }
        MybatisUtils.closeSqlSession(sqlSession);
    }

    /**
     * 删除订单和产品中间表的记录测试方法
     */
    @Test
    public void deleteOrderitemTest(){
        SqlSession sqlSession=MybatisUtils.getSqlSession(true);
        OrderitemMapper orderitemMapper = sqlSession.getMapper(OrderitemMapper.class);
        int rows = orderitemMapper.deleteOrderitem(11);
        if (rows>0){
            System.out.println("-----------删除成功!-------------");
        }
        else {
            System.out.println("----------删除失败!------------");
        }
        MybatisUtils.closeSqlSession(sqlSession);
    }
}
