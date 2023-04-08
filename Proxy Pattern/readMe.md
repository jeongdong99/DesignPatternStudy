
 1. 목적 : 
     • 다른 객체에 대한 접근을 제어하기 위한 용도로
       대리인 또는 대변인 역할을 하는 객체를 두는 패턴.

 2. 사용해야 할 때 : 
     • 주체 객체가 시스템 외부에 있을 때 == 원격 객체.
     • 꼭 필요로 하는 시점까지 객체의 생성을 연기하고 싶을 때.
     • 원래 객체에 대한 접근 제어가 필요할 때.
     • 객체에 접근 권한을 제어하거나 객체마다 접근 권한을 달리하고 플 때.

  
 3. UML Class Diagram : 
   
   3-1. Virtual Proxy
    
    ![image](https://user-images.githubusercontent.com/93365714/230722035-99d99369-8a39-4665-a318-a9ed7f09f015.png)

   3-2. Protection Proxy
   
   ![image](https://user-images.githubusercontent.com/93365714/230722044-ec2aabcc-68b8-4c21-aecf-8a64fdee3bc8.png)


  4. 해당 패턴을 적용한 부분 : 
    
    4-1. Virtual Proxy
      • 사용자 인터페이스에 이미지를 표시해주는 Swing의 Icon 인터페이스.
      • 이미지를 화면에 표시해주는 ImageIcon 클래스.
      • ImageProxy는 처음에 화면에 간단하게 메시지 표시하고 객체 로딩.
      • 로딩이 끝나면 ImageIcon에 위임해서 이미지 표시하는 프록시.

     4-2. Protection Proxy
      • Proxy 객체에 대한 모든 메소드 호출 전달받는 InvocationHandler.
      • Main문에서 Proxy 클래스 생성하고 Proxy 객체 인스턴스 만듬.
      • Proxy 클래스는 자바에 의해 생성되고 Subject 인터페이스 구현.
      • InvocationHandler에서 프록시의 행동을 구현.
      • InvocationHandler에서 RealSubject 객체에 있는 함수에 대한 접근 제어.
        
           
  5. 해당 패턴 적용 시의 이점 : 
     5-1. Virtual Proxy
      • 실제로 객체가 사용될 때, 해당 객체가 생성되므로 메모리적 효율.
      • 실제 객체를 캐싱하여 최초 이후에는 cached에서 return하므로
        수행시간 절약.
      • 생성하기 힘든 자원에 대한 접근을 제어.

     5-2. Protection Proxy
      • 실제 객체에 대한 접근을 제어.
      • 객체에 대한 추가적인 관리를 수행 가능.
      • 사용자의 접근 권한에 따라 다른 수준의 권한을 부여 가능.
      
  6. 해당 패턴이 적용된 실행결과 내용 설명 :
    
   6-1 Virtual Proxy
      • 사용자 인터페이스 죽지 않도록 별도의 thread에서 이미지를 가져옴.
      • thread에서 Icon 객체의 인스턴스 생성.
      • 로딩되는동안 로딩되고 있다는 메시지 출력.
      • 이미지 완전히 로딩되면 생성자에서 객체 리턴.
      • 이미지 확보되면, repaint() 메소드 호출하여 화면 출력.
      • (기존 사진 출력이 안되므로 백종원 유튜브 사진 URL)
      
      ![image](https://user-images.githubusercontent.com/93365714/230722075-b182591d-2b60-405f-86a5-a25d7a3fd463.png)


   6-2 Protection Proxy
      • 자기 자신의 정보에 접근할 때에는 OwnerInvocationHandler
        타인의 정보일 때는 NonOwnerInvocationHandler 사용.
      • 자기 자신 권한으로 setInterest 호출하면 예외없이 가능.
      • setHotOrNotRating은 자기 자신 권한으로 호출하면 예외 처리. 
      • 타인 권한으로 타인 정보 접근할 때 setInterest 호출하면 예외 처리.
      • 타인 권한으로 setHotOrNotRating 호출하면 예외없이 가능.
      
      ![image](https://user-images.githubusercontent.com/93365714/230722082-10ddcad1-3cf5-44eb-a807-8dac467279f9.png)
