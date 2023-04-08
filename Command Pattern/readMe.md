
  1. 목적 : 
     • 실행될 행위, 요청을 캡슐화하여 여러 기능을 실행할 수 있음.
     • 큐잉 및 콜백 같은 객체 기반 관계에서 처리할 수 있음.

   2. 사용해야 할 때 : 
     • 요청이 가변 시간 또는 불변 순서에 지정, 대기, 실행되어야 할 때.
     • 요청 내역을 큐에 저장하거나 로그로 기록할 필요가 있을 때.
     • 호출자는 호출을 처리하는 개체와 분리되어야 할 때.

   3. UML Class Diagram : 
   
   ![image](https://user-images.githubusercontent.com/93365714/230721467-c451b18a-bd68-499e-b915-894171f1f2cd.png)


4. 해당 패턴을 적용한 부분 : 
      • Button 클래스는 Command 인터페이스의 execute 메서드 호출.
      • LampOnCommand 클래스는 Command 인터페이스의 execute를
        구현하여 Lamp 클래스의 turnOn 메서드를 호출.
      • AlarmOnCommand 클래스는 Command 인터페이스의 execute를
        구현하여 Alarm 클래스의 start 메서드를 호출.
      
 5. 해당 패턴 적용 시의 이점 : 
     • 호출자와 수신자 클래스 사이의 의존성 제거함.
     • 재사용성을 높여줌.
     • 기능이 수정되거나 변경이 일어날 때 다른 클래스 수정없이
       기능 클래스를 새로 만들면 되므로 확장성 있고 유연함.

 6. 해당 패턴이 적용된 실행결과 내용 설명 :
     • 버튼1번에 lamp를 켜는 기능을 넣고 실행.
     • 버튼2번에 alarm 울리는 기능을 넣고 실행.
     • 버튼2번을 lamp를 켜는 기능으로 바꾸고 실행.
     
     ![image](https://user-images.githubusercontent.com/93365714/230721476-586c9338-4cff-4a73-a1ec-cc47fdfdef66.png)
