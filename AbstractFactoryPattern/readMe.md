
□ Abstract Factory Pattern
   1. 목적 : 
     • 제품군을 생성하기 위한 구체적인 클래스에 생성 호출을 위임하는
       인터페이스를 제공.

   2. 적용해야 할 때 : 
     • 객체의 집합을 생성해야 할 때.
     • 여러 종류의 객체를 일관된 방식으로 생성 할 때.
     • 구현 세부 정보를 클라이언트에게 감추고 싶을 때.

   3. UML Class Diagram : 
   
   ![image](https://user-images.githubusercontent.com/93365714/230719905-cfdeafe2-f01e-4bef-9578-d7ed3b19d5c1.png)

   4. 해당 패턴을 적용한 부분 :
   ![image](https://user-images.githubusercontent.com/93365714/230719935-6a1fd772-29d4-4214-8856-f9b3b45d24ba.png)

![image](https://user-images.githubusercontent.com/93365714/230719936-b11d08ca-b173-47a5-aead-36325f4579db.png)

   
- NYPizzaIngredientFactory를 따로 생성.
- NY스타일의 재료들은 동일 피자 종류는 타입에 따라 다름.
- Product인 cheese or veggie pizza등을 만듬.

 5. 해당 패턴 적용 시의 이점 :
     • 추상 팩토리 패턴은 실제 객체가 무엇인지 알지 못해도
       객체를 생성하고 조작할 수 있도록 함.
     • 구체적인 클래스를 분리시킴으로써 재사용성 증진.
     • 제품군을 쉽게 대체할 수 있다.

   6. 해당 패턴이 적용된 실행결과 내용 설명
     • NYPizzaStore랑 ChicagoPizzaStore가 있음.
     • Store에 따라, ingredientFactory를 달리 설정함.
     • Store의 Style에 맞게 피자가 만들어짐.
     
     ![image](https://user-images.githubusercontent.com/93365714/230719950-409a65b3-e38a-4ad8-9bbf-79e3bce4f4ea.png)
