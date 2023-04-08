□ Strategy Pattern
   1. 목적 : 유사한 행위들을 캡슐화하여 하나의 인터페이스로 만들고
      동적으로 행위를 바꾸고 싶은 경우 직접 행위를 수정하지 않고 전략을
      추가하거나 다른 전략을 바꿔주기만 함으로써 행위를 유연하게 확장
      또는 수정하기 위함
   
   2. 사용해야 할 때 : 
     - 관련 클래스 간의 차이점이 행위밖에 없을 때
     - 새롭게 추가되는 행위가 기존의 코드에 영향을 미치면 안될 때
     - 행위의 여러 버전 또는 변형이 필요할 때
     - 클래스의 행동이 런타임 시에 정의되어야 할 때
     - 조건문이 너무 많아 유지보수 관리가 힘들 때
     
   3. UML Class Diagram : 
   
   ![image](https://user-images.githubusercontent.com/93365714/230719598-de037e46-b28d-4c64-825c-8c212921b5d9.png)
   
  4. 해당 패턴을 적용한 부분과 해당 패턴 적용 시의 이점 기술 : 
      - Context에 해당하는 Class MallardDuck이 Strategy에 해당하는
        Interface FlyBehavior와 Interface QuackBehavior를
        composition관계를 가짐으로써 Strategy 패턴을 적용하였음
       
       - Context에 해당하는 Class ModelDuck이 Strategy에 해당하는
        Interface FlyBehavior를 composition관계를 가짐으로써 
        Strategy 패턴을 적용하였음
  
      - 다른 클래스여도 행위만 다르면 Context에 해당하는 Class 추가가 용이하고 행위가 바뀌어도 Concrete Strategy를 추가해 set만 하면
        되어 수정이 용이하다는 이점이 있음
  
   5.  해당 패턴이 적용된 실행결과 내용 설명
       Mallard Duck, Model Duck이 울음소리와 나는 행위가 
       각각 다르므로 구현을 Strategy 패턴을 적용하여
       각각 울음소리와 나는 행위를 출력함
       
       Model Duck은 기본적으로 날 수 없으나, 
       새로운 Flying Behavior인 FlyingRocketPowered를 생성하여
       setFlyBehavior해서 로켓을 타고 날 수 있음을 출력함
       
       ![image](https://user-images.githubusercontent.com/93365714/230719614-615499ef-de68-4fd8-8e5e-c5de0beeacbc.png)
6. 추가 실습코드 – Class Diagram

![image](https://user-images.githubusercontent.com/93365714/230719620-e49bc27b-c28d-4be7-a52c-0aca34bb477f.png)
 
7. 추가 실습코드 – 패턴 적용부분 및 이점
      - Context에 해당하는 Class Player가 Strategy에 해당하는
        Interface Strategy와 composition관계를 가짐으로써 
        Strategy 패턴을 적용하였음
      - Player가 가위 바위 보에서 이길 전략을 바꾸고 싶을 때, 생성자에서
        쉽게 바꾸면 되기 때문에 해당 패턴을 적용함으로써 교체가 용이함

  
 8. 추가 실습코드 – 해당 패턴이 적용된 실행결과 내용 설명
     가위 바위 보 전략을 Interface Strategy에 모아 둔다.
     홍길동은 WinningStrategy를 전략으로 사용하였고 
     임꺽정은 ProbStartegy를 전략으로 사용하여
     가위 바위 보 게임을 하였다.
     홍길동의 전략이 임꺽정 전략보다 더 승리가 많았다.
     
     ![image](https://user-images.githubusercontent.com/93365714/230719624-b482e3e6-0008-4a22-9b7c-9d3fb8eb8c21.png)

