
□ Singleton Pattern
   1. 목적 : 
     • 객체의 인스턴스가 오직 1개만 생성되는 패턴.
  
   2. 사용해야 할 때 : 
     • 클래스의 인스턴스가 프로그램 내부에서 단 1개만 생성되어야 할 때.
     • 이 객체를 공유하며 사용하기 때문에 동시 접근에 제어가 필요할 때.
     
   3. UML Class Diagram :  
   
   ![image](https://user-images.githubusercontent.com/93365714/230721429-5585537c-c9d9-4cab-a392-f4e1e7476c49.png)

  4. 해당 패턴을 적용한 부분 : 
      • 1개만 존재하는 객체의 인스턴스 ChocolateBoiler를 static 선언.
      • private 생성자로 외부에서 객체 생성 막음.
      • 외부에서 getInstance로 instance에 접근 가능.
      • synchronized 스레드 동기화를 사용하여
        멀티 스레드 동시성 문제 해결.

   5. 해당 패턴 적용 시의 이점 : 
     • 고정된 메모리 영역을 사용하여 메모리 낭비 방지.
     • 이미 생성된 인스턴스를 활용하기 때문에 속도 측면에서 좋음.
     • 다른 클래스 간에 데이터 공유가 쉬움.

   6. 해당 패턴이 적용된 실행결과 내용 설명 :
     • Chocolate Boiler가 한번만 생성됨.
     • getInstance는 2번 실행되면서 외부에서 접근.
     • boiler의 상태가 변해도 같은 객체를 쓰고 있어서
       boiler2의 상태도 변함. 즉 같은 것을 쓰는중임.
       
       ![image](https://user-images.githubusercontent.com/93365714/230721442-a85799dd-e69d-487a-beb2-1eb16a5a5994.png)
