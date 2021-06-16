package jbabook.jpashop.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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

}
