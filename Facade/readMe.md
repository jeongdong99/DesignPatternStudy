
□ Facade Pattern
   1. 목적 : 
     • 일련의 저수준 인터페이스들을 하나의 고수준 인터페이스로 묶어 제공.
     • 서브 시스템들을 묶어 클라이언트가 요청할 수 있는 간단한 함수 제공.

   2. 사용해야 할 때 : 
     • 복잡한 서브 시스템에 대한 간단한 접근방법을 제공해 줄 때.
     • 구현 클래스들과 클라이언트 간에 너무 많은 의존성이 있을 때.
     • 시스템들과 서브 시스템들이 계층화되어야 할 때.

   3. UML Class Diagram : 
   
   ![image](https://user-images.githubusercontent.com/93365714/230721626-25dc02af-1e46-4f41-a25b-8fdaa700bc02.png)


   4. 해당 패턴을 적용한 부분 : 
     • HomeTheaterFacade 클래스에 Amplifier, Tuner, DvdPlayer
       CdPlayer, Projector, TheaterLights, Screen, PopcornPopper 등
       HomeTheater를 동작시키기위한 클래스들을 한 곳에 몰아 넣었다.
   5. 해당 패턴 적용 시의 이점 : 
     • 서브 시스템의 구현을 클라이언트로부터 숨김.
       - 서브 시스템을 더 쉽게 사용할 수 있게 해줌.
     • 서브 시스템과 클라이언트 간의 의존성이 느슨해짐.
       - 클라이언트에 영향을 미치지 않고 서브 시스템을 구성하는 클래스를 변경 가능.

   6. 해당 패턴이 적용된 실행결과 내용 설명 :
     • main문에서 HomeTheaterFacade에 필요한 객체들을 생성.
     • HomeTheaterFacade에 객체들을 넣어 생성.
     • watchMovie, endMovie 등 간단한 메서드만 사용해도
       일련의 과정들이 실행됨.
       
       ![image](https://user-images.githubusercontent.com/93365714/230721640-07f5fef4-100e-4566-a714-f4f56be230e1.png)

       
