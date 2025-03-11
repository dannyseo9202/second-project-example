여러분의 프로젝트 초기 구성을 돕기 위해 **모노레포(Monorepo)** 방식으로 구성하였습니다.  

### **📌 DDD 핵심 요소**  

1. **엔티티(Entity)** - 고유한 ID를 가진 객체  
2. **밸류 오브젝트(Value Object)** - 값 자체가 중요한 객체  
3. **애그리게이트(Aggregate)** - 연관된 객체들을 하나의 단위로 묶어 관리  
4. **리포지토리(Repository)** - 애그리게이트의 저장 및 조회를 담당  
5. **도메인 서비스(Domain Service)** - 특정 애그리게이트에 속하지 않는 비즈니스 로직 처리  

또한, DDD의 핵심 개념을 적용하여 **기획서의 '허브' 도메인**을 기반으로 `hub-service` 예제 코드를 작성하였습니다.
![image](https://github.com/user-attachments/assets/a38a981e-344d-416d-83ba-cd4fd16b50e2)


[프로젝트2 가이드를 참고하세요 ~!](https://www.notion.so/2-1b2861c68fb180cc9a72d85aaaf2f4ba)
