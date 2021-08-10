package jbabook.jpashop.repository;

import jbabook.jpashop.domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class MemberRepository {


    private final EntityManager em;

    public void save(Member member){
        em.persist(member);
    }

    public Member findOne(Long id){
        return em.find(Member.class, id);
    }

    public List<Member> findAll(){
        return em.createQuery("select m from Member m", Member.class) // JPQL & 반환 타입 -> 엔티티 객체를 대상으로 쿼리
                     .getResultList();
    }

    public List<Member> findByName(String name){
        return em.createQuery("select m from Member m where m.name = :name", Member.class)
                    .setParameter("name", name)
                    .getResultList();
    }

//    BooleanBuilder booleanBuilder = new BooleanBuilder();
//    booleanBuilder.and(singleOrder.buyerReferenceKey.eq(ownerkey));
//    jpaQueryFactory.select()
//    .from()
//        .fetch()
}
