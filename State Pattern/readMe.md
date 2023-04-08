
□ State Pattern
   1. 목적 : 
     • 객체가 내부 상태에 따라 스스로 다르게 행동하도록 위임하는 패턴.

   2. 사용해야 할 때 : 
     • 객체의 상태에 따라 객체의 동작이 달라야 할 때.
     • 객체의 상태에 따라 달라지는 여러 부분의 조건문이 있을 때.
     • 런타임에 객체의 동작이 해당 상태에 따라 변경되어야 할 때.
     • 상태 간의 전환은 명시적이어야 함.

   3. UML Class Diagram : 
   
   ![image](https://user-images.githubusercontent.com/93365714/230721955-ca03da7f-5deb-4df8-80d0-9d049e316fa6.png)

   4. 해당 패턴을 적용한 부분 : 
      • Gumball 기계의 모든 행동을 State 인터페이스에 정의함.
      • Gumball 기계의 모든 상태를 State 인터페이스를 가져와 재정의함.
      • Gumball 기계 상태에 따라 재정의대로 행동하여 행동이 다름.
      • 일련의 행동을 완료 후 상태를 명시적으로 바꿔줌.

   5. 해당 패턴 적용 시의 이점 : 
     • 새로운 상태가 추가되더라도 Context 코드가 받는 영향 최소화.
     • 상태와 관련된 모든 동작을 하나의 객체에 넣을 수 있음.
     • 상태 전환 로직을 상태 객체에 통합할 수 있음.
     • 동작이 상태별로 구분되기 때문에 상태별 동작을 수정하기 쉬움.
     • 하나의 상태 객체만 사용하여 상태 변경이 발생하므로
       상태가 일관되지 않음을 방지할 수 있음.

   6. 해당 패턴이 적용된 실행결과 내용 설명 :
     • gumBall 기계를 gumBall 10개를 가진채로 생성.
     • 10개 이상으로 생성됐으므로 noQuarter상태로 변환.
     • noQuarter상태에서 insertQuarter했으므로 동전 넣었다고 출력 후
       HasQuater상태로 변경.
     • HasQuater상태에 turnCrank 실행, you turned 출력 후 상태 변환.
     • main문의 행동들이 상태에 따라 다르게 계속 행동되며 출력됨.
    
   ![image](https://user-images.githubusercontent.com/93365714/230721964-c6eb1c5c-26d0-4488-a88e-ccadd48b5f2a.png)

     
