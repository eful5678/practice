package jbabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
public class MemberForm {

    @NotEmpty(message = "회원 이름은 필수입니다.") // 값이 필수일 때
    private String name;

    private String city;

    private String street;

    private String zipcode;
}
