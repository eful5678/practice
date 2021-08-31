package jbabook.jpashop;

import jbabook.jpashop.domain.*;
import jbabook.jpashop.domain.item.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;

@Component
@RequiredArgsConstructor
public class InitDb {

    private final InitService initService;

    @PostConstruct
    public void init(){
        initService.dbInit1();
        initService.dbInit2();
    }

    @Component
    @Transactional
    @RequiredArgsConstructor
    static class InitService{
        private final EntityManager em;

        public void dbInit1(){

            Member member = createMember("UserA", "서울", "1", "1111");
            em.persist(member);

            Book book1 = createBook("JPA1", 10000, 10);
            em.persist(book1);

            Book book2 = createBook("JPA2", 12000, 8);
            em.persist(book2);

            OrderItem orderItem1 = OrderItem.createOrderItem(book1, 10000, 1);
            OrderItem orderItem2 = OrderItem.createOrderItem(book2, 12000, 3);


            Order order = Order.createOrder(member, createDelivery(member), orderItem1, orderItem2);

            em.persist(order);


        }

        public void dbInit2(){
            Member member = createMember("UserB", "안양", "2", "1311");
            em.persist(member);

            Book book1 = createBook("SPRING1", 40000, 10);
            em.persist(book1);

            Book book2 = createBook("SPRING2", 52000, 8);
            em.persist(book2);

            OrderItem orderItem1 = OrderItem.createOrderItem(book1, 40000, 4);
            OrderItem orderItem2 = OrderItem.createOrderItem(book2, 52000, 2);

            Delivery delivery = createDelivery(member);

            Order order = Order.createOrder(member, delivery, orderItem1, orderItem2);

            em.persist(order);
        }

        private Member createMember(String name, String city, String street, String zipcode){
            Member member = new Member();
            member.setName(name);
            member.setAddress(new Address(city, street, zipcode));
            return member;
        }

        private Book createBook(String name, int price, int stockQuantity){

            Book book = new Book();
            book.setName(name);
            book.setPrice(price);
            book.setStockQuantity(stockQuantity);
            return book;

        }

        private Delivery createDelivery(Member member){

            Delivery delivery = new Delivery();
            delivery.setAddress(member.getAddress());
            return delivery;

        }
    }
}
