package jbabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class MemberDto {

    @Getter
    @Setter
    public static class insert{
        private String name;

        private Address address;

        private List<Order> orders;
    }

    @Getter
    @Setter
    public static class insertParam{

        private String name;

        private Address address;

        private List<Order> orders;
    }
}
