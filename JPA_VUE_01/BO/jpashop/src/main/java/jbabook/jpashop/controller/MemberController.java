package jbabook.jpashop.controller;

import jbabook.jpashop.domain.Address;
import jbabook.jpashop.domain.Member;
import jbabook.jpashop.domain.MemberDto;
import jbabook.jpashop.domain.MemberForm;
import jbabook.jpashop.service.MemberService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequiredArgsConstructor
@RequestMapping("/members")
public class MemberController {

    private final MemberService memberService;

//    @GetMapping("/new")
//    public String createForm(Model model){
//        model.addAttribute("memberForm",new MemberForm());
//        return "members/createMemberForm";
//    }

    @PostMapping("/new")
    public String create(@Valid MemberForm form) {
        Address address = new Address(form.getCity(), form.getStreet(), form.getZipcode());

        Member member = new Member();
        member.setName(form.getName());
        member.setAddress(address);

        memberService.join(member);

        return "redirect/";
    }



//    @PostMapping("/insert")
//    public MemberDto.insert insert(@RequestBody final MemberDto.insertParam insertParam){
//        return memberService.insert(insertParam);
//    }


}
