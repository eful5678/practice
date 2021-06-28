package jbabook.jpashop.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import jbabook.jpashop.domain.item.Item;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class OrderItem {

    @Id
    @GeneratedValue
    @Column(name = "order_item_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;

    // 하나의 주문이 여러 아이템을 가질 수 있다.
    // 반대로 하나의 아이템은 하나의 주문만 가질 수 있다.
    // FK -> OrderItem
    @ManyToOne
    @JoinColumn(name = "order_id") // FK -> order_id
    private Order order;

    private int orderPrice; // 주문 가격

    private int count; // 주문 수량
}
