package hello.core.member;

public interface MemberRepository {

    // 저장 기능
    void save(Member member);
    // 찾는 기능
    Member findById(Long memberId);
}
