□ Observer Pattern
   1. 목적 : 어떤 객체의 상태가 변할 때 옵저버를 통해 시스템 내의 
     다른 연관된 객체들에게 상태 변화를 알 수 있도록 함

   2. 사용해야 할 때 : 
     - 느슨한 결합이 필요할 때
     - 하나 이상의 객체가 변경되면 다른 객체의 동작도 바뀌어야 할 때
     - 하나의 객체가 변경되었을 때 연관된 모든 객체가 변경을 감지하고
       데이터를 받거나 동작이 바뀌어야 할 때

   3. UML Class Diagram :
   
     ![image](https://user-images.githubusercontent.com/93365714/230718966-1749b03e-4344-430a-bb03-5d95e87ab838.png)

  
   4. 해당 패턴을 적용한 부분과 해당 패턴 적용 시의 이점 기술 : 
      - Subject에 해당하는 Class WeatherData가
        Observer에 해당하는 3개의 Display들과
        composition관계를 가짐으로써 Observer 패턴을 적용하였음
     
      - weatherData의 정보만 바꿔도 notifyObservers가 동작하여
        Observer들이 update를 해서 관련 동작들이 알아서 바뀌어 동작함.

   5. 해당 패턴이 적용된 실행결과 내용 설명 :
   각 Display마다 Interface Observer를 받아 notifyObservers가 동작하면,
   연쇄적으로 관련 클래스들도 update하여 void display()가 바뀌는
   Observer 패턴 적용.
   weatherData의 정보를 set으로 교체 할 때 마다 연관된 행동들이 알아서
   연쇄적으로 바뀌어 동작함.
   
   ![image](https://user-images.githubusercontent.com/93365714/230718984-ef4c15c6-081a-468c-9a4b-927f089b5333.png)


   6. 추가 실습코드 – Class Diagram
   
![image](https://user-images.githubusercontent.com/93365714/230718994-122ae9c6-a4e2-42b5-8d7a-866693388f5c.png)


    7. 추가 실습코드 – 패턴 적용부분 및 이점
      - Subject에 해당하는 Class RandomNumberGenerator가
        Observer에 해당하는 Class GraphObserver와
        Class DigitObserver와 dependency관계를 가짐으로써
        Observer 패턴을 적용하였음
     
      - generator.addObserver에 Observer를 등록만 해도
        excute과정에서 notifyObservers를 실행하기 때문에
        실행할 때의 number을 그대로 가져가면서 addObserver된 순서로 
        Observer들이 실행됨. 실행 순서를 바꾸고 싶을 때,
        addObserver에 순서를 바꿔 등록해주면 끝이므로 간편함.
 8. 추가 실습코드 – 해당 패턴이 적용된 실행결과 내용 설명
    generator에 DigitObserver, GraphObserver 순서로 등록,
    generator가 실행되면 notifyObservers가 동작하여
    등록된 observer들을 순서대로 update시키는 observer패턴을 적용.
    DigitObserver가 먼저 실행되고 그다음 GraphObserver가 실행되어
    먼저 숫자를 출력하고 그 후 숫자만큼 별이 출력됨.
    
    ![image](https://user-images.githubusercontent.com/93365714/230719013-f5527909-8bdd-45c7-9d17-4baae85029da.png)

