package jbabook.jpashop.repository;

import jbabook.jpashop.domain.Order;
import jbabook.jpashop.domain.OrderSearch;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class OrderRepository {

    private final EntityManager em;

    public void save(Order order){
        em.persist(order);
    }

    public Order findOne(long id){
        return em.find(Order.class, id);
    }

//    public List<Order> findAll(OrderSearch orderSearch){
//
//    }

    public List<Order> findAllByString(OrderSearch orderSearch){

    }
}