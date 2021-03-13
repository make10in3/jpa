package hellojpa;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="Member") // @Entity가 붙은 클래스를 엔티티라 부름, JPA내부에서 사용하는 이름이지만 기본으로 해놔야지 안헷갈린다.
@Table(name="MBR") // 엔티티와 매핑 테이블 지정
public class Member {
    @Id
    private Long id;

    @Column(unique = true, length = 10) // DDL 생성 기능은 DDL을 자동 생성할 때만 사용되고 JPA의 실행 로직에는 영향을 주지 않는다.
    private String name;

    // JPA 에서 사용할 기본 생성자
    public Member() {
    }

    public Member(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}