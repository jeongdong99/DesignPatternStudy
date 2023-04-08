
 1. 목적 : 
     • 어떤 객체를 생성할지를 서브 클래스에서 결정.
     • 객체 생성 처리를 서브 클래스로 분리해 처리하도록 캡슐화하는 패턴.

   2. 적용해야 할 때 : 
     • 생성 해야 하는 객체가 무엇인지 알 수 없을 때.
     • 부모 클래스가 생성 책임을 자신의 서브클래스에게 위임하기 원할 때.

   3. UML Class Diagram : 

![image](https://user-images.githubusercontent.com/93365714/230721309-9674541a-c08d-4365-8511-fab9050f3d11.png)


4. 해당 패턴을 적용한 부분 :

![image](https://user-images.githubusercontent.com/93365714/230721321-a886a00b-b65b-4b74-81a8-733198997b92.png)

- ConcreteCreator인 NYPizzaStore랑 ChicagoPizzaStore.
- type에 따라 만드는 피자가 다름.
- ConcreteProduct인 cheese or veggie pizza를 만듬.

  5. 해당 패턴 적용 시의 이점 :
     • 기존 코드를 수정하지 않고 새로운 객체를 생성 할 수 있음.
     • 구체적인 클래스에 의존하지 않아도 됌.
     • 코드가 간결해짐.
     • 서브클래스에 대한 정보를 은닉할 수 있음.

   6. 해당 패턴이 적용된 실행결과 내용 설명
     • NYPizzaStore랑 ChicagoPizzaStore가 있음.
     • Store에 따라, Store가 전달 받은 type이 cheese냐 veggie냐에 따라
       만들어지는 피자 스타일과 종류가 달라짐.
       
       ![image](https://user-images.githubusercontent.com/93365714/230721332-ca4c2407-d697-42be-aee5-aedc0ea69c5d.png)
