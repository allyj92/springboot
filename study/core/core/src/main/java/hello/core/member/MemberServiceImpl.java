package hello.core.member;

import hello.core.discount.DiscountPolicy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;

    // 생성자 하나있을시 @Autowired 생략가능
     @Autowired //ac.getBean(MemberRepository.class)
    public MemberServiceImpl(MemberRepository memberRepository, DiscountPolicy rateDiscountPolicy) {
        System.out.println("memberRepository = " + memberRepository);
        System.out.println("discountPolicy = " + rateDiscountPolicy);
        this.memberRepository = memberRepository;
        this.discountPolicy = rateDiscountPolicy;

    }

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }

    // 테스트용
     public MemberRepository getMemberRepository() {
        return memberRepository;
     }
}
