package jbabook.jpashop.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "orders")
@Getter
@Setter
public class Order {

    @Id
    @GeneratedValue
    @Column(name = "order_id")
    private Long id;

    // FK : member_id
    // 연관관계 주인 -> FK가 있는 곳
    @ManyToOne
    @JoinColumn(name = "member_id") // 매핑을 무엇으로? FK의 이름 : member_id
    private Member member;

    @OneToMany(mappedBy = "order")
    private List<OrderItem> orderItems = new ArrayList<>();

    // 하나의 주문 -> 하나의 배송정보
    // 연관관계 주인 : Order table
    @OneToOne
    @JoinColumn(name = "delivery_id")
    private Delivery delivery;

    private LocalDateTime orderDate; // 주문 시간

    @Enumerated(EnumType.STRING)
    private OrderStatus status; // 주문상태 - ORDER, CANCEL

//    // 생성 메서드
//
//    public static Order createOrder(Member member, Delivery delivery, OrderItem... orderItems) {
//        Order order = new Order();
//        order.setMember(member);
//        order.setDelivery(delivery);
//        for (OrderItem orderItem : orderItems) {
//            order.addOrderItem();
//        }
//    }

}