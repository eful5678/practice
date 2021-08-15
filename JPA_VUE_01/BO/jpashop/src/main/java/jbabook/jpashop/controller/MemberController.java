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
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/members")
public class MemberController {

    private final MemberService memberService;

//    @GetMapping("/new")
//    public String createForm(Model model){
//        model.addAttribute("memberForm",new MemberForm());
//        return "members/createMemberForm";
//    }
    @CrossOrigin(origins = "http://localhost:8084")
    @PostMapping("/new")
    public String create(@Valid @RequestBody MemberForm form) {
        Address address = new Address(form.getCity(), form.getStreet(), form.getZipcode());

        Member member = new Member();
        member.setName(form.getUsername());
        member.setAddress(address);

        memberService.join(member);

        return "redirect/";
    }

    @CrossOrigin(origins = "http://localhost:8084")
    @GetMapping("/list")
    public List<Member> list(){
        List<Member> members = memberService.findMembers();

        return members;
    }



//    @PostMapping("/insert")
//    public MemberDto.insert insert(@RequestBody final MemberDto.insertParam insertParam){
//        return memberService.insert(insertParam);
//    }


}
