
□ Adapter Pattern
   1. 목적 : 
     • 서로 다른 인터페이스를 갖는 클래스들을 공통 객체를 만들어 함께
       동작하도록 만듬.
     • 클래스의 인터페이스를 사용자가 원하는 인터페이스 형태로 변환.
   
   2. 사용해야 할 때 : 
     • 사용할 클래스가 사용자가 원하는 인터페이스 요구 사항을 충족하지 
       않을 때. 

   3. UML Class Diagram : 
   
   ![image](https://user-images.githubusercontent.com/93365714/230721538-40ee699d-92fb-427f-bf7b-d01b301b0c94.png)

4. 해당 패턴을 적용한 부분 : 
      • TurkyAdapter가 Duck 인터페이스를 상속받음.
      • TurkyAdapter가 Turkey 객체를 가짐.
      • 인터페이스 재정의를 Turkey의 행동으로 대체시킴.


 5. 해당 패턴 적용 시의 이점 : 
     • 기존 코드를 변경하지 않아도 되어서 클래스 재활용성을 증가시킴.
     • 호환성 문제 간단하게 해결.

 6. 해당 패턴이 적용된 실행결과 내용 설명 :
     • 칠면조를 그냥 동작시킴. (gobble, fly short)
     • testDuck은 Duck 인터페이스를 받고 Duck 동작을 실행함.
     • testDuck에 오리를 넣으니 오리 동작을 실행함.
     • 칠면조를 Adapter에 넣어 Duck으로 만듬.
     • testDuck에 Duck이 된 칠면조를 넣으니 칠면조 동작을 실행함.
     
     ![image](https://user-images.githubusercontent.com/93365714/230721546-7fa2c7df-aaed-4b8d-ad5f-14728e0711d9.png)
