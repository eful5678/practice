package jbabook.jpashop.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Member {

    @Id
    @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    @NotEmpty
    private String name;

    @Embedded
    private Address address;

    // 하나의 회원이 여러 주문을 한다
    @OneToMany(mappedBy = "member") // 연관관계의 주인이 아닐 때 mapped by / 누구에 의해? Order table의 member field -> 읽기 전용
    private List<Order> orders = new ArrayList<>();


}
