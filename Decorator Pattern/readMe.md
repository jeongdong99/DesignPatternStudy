
□ Decorator Pattern
   1. 목적 : 
	• 객체의 결합을 통해 기능을 동적으로 유연하게 확장 할 수 있게해주는 패턴.
	• 유사한 행위들을 캡슐화하여 하나의 인터페이스로 만들고
	  행위 객체를 조합해가며 기능을 추가함.

   2. 적용해야 할 때 : 
     • 행위가 동적으로 수정 가능해야 하는 경우.
     • 여러 가지 추가 기능을 조합해야 하는 경우.
     • 책임과 행동이 분리되 있어야 할 하는 경우.

   3. UML Class Diagram : 
   
   ![image](https://user-images.githubusercontent.com/93365714/230721215-3561d273-3019-40a9-9dd5-17f03685f371.png)

4. 해당 패턴을 적용한 부분 : 
- Beverage라는 추상 클래스 생성.
- Concrete Component인 DarkRoast 생성
- Decorator라는 추상 클래스 생성.
- Concrete Decorator인 Mocha, Whip, Soy를
  조합해가며 기능을 추가하고 꾸밈.
  
  5. 해당 패턴 적용 시의 이점 :
     • 기능 확장을 위해 서브클래스에 대한 유연한 대안을 제공함.
     • 런타임에 동작 수정이 가능함.
     • 객체에 동적으로 기능 추가가 간단함.

   6. 해당 패턴이 적용된 실행결과 내용 설명
     • Concrete Component인 Espresso, DarkRoast, HouseBlend를 만듬
     • 장식품인 Mocha, Soy, Whip을 Decorator 패턴을 적용하여
       기본 Component에 기능(가격 추가 + 출력문) 추가해줌.
       
       ![image](https://user-images.githubusercontent.com/93365714/230721226-afdb2be5-9512-447f-90a9-d9d7fe8ab8ac.png)

       
