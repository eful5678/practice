package jbabook.jpashop.service;

import jbabook.jpashop.domain.Member;
import jbabook.jpashop.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class MemberServiceTest {

    @Autowired
    MemberService memberService;

    @Autowired
    MemberRepository memberRepository;

    @Test
    public void join() throws Exception{
        Member member = new Member();
        member.setName("Kim");

        Long saveId = memberService.join(member);

        assertEquals(member, memberRepository.findOne(saveId));
    }

    @Test
    public void duplicatedMember() throws Exception{
        Member member1 = new Member();
        member1.setName("Jin");

        Member member2 = new Member();
        member2.setName("Hyun");

        memberService.join(member1);
        memberService.join(member2);

        fail("Exception!!");
    }

}