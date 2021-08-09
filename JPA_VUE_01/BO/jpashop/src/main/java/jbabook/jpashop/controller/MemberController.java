package jbabook.jpashop.controller;

import jbabook.jpashop.domain.MemberDto;
import jbabook.jpashop.service.MemberService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("member")
public class MemberController {

    @NonNull
    private final MemberService memberService;

    @PostMapping("/insert")
    public MemberDto.insert insert(@RequestBody final MemberDto.insertParam insertParam){
        return memberService.insert(insertParam);
    }


}
