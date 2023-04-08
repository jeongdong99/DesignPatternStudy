
□ Composite Pattern
   1. 목적 : 
     • 개체를 트리 구조로 구성하고 개별 개체인 것처럼 작업할 수 있게 함.
     • 단일 객체와 복합 객체 구분하지 않고 동일한 인터페이스 사용.

   2. 사용해야 할 때 : 
     • 전체-부분의 관계를 갖는 객체들 사이의 관계 정의가 필요할 때.
     • 사용자가 단일 객체와 복합 객체, 모두 균일하게 처리하고 싶을 경우.

   3. UML Class Diagram : 

![image](https://user-images.githubusercontent.com/93365714/230721878-c2869e03-385c-4f61-807e-f049f87c754f.png)


4. 해당 패턴을 적용한 부분 : 
      • MenuComponent는 Leaf 클래스와 Composite 클래스의 
        공통적인 부분.
      • MenuItem은 Leaf에 해당하는 부분 클래스.
      • Menu는 Composite에 해당하는 전체 클래스.    
      • MenuItem과 Menu는 자신이 쓰는 메소드만 오버라이드해서 재정의.
 
   5. 해당 패턴 적용 시의 이점 : 
     • 객체들이 모두 같은 타입으로 취급되어 새로운 클래스 추가가 용이.
     • 단일객체, 집합객체 구분하지 않고 코드 작성하여 사용자 코드 단순.

   6. 해당 패턴이 적용된 실행결과 내용 설명 :
     • MenuComponent로 3종류 생성. (pancakeHouse,diner,cafe) Menu
     • MenuComponent allMenus에 위에서 만든 Menu들을 add함.
     • dessertMenu는 dinerMenu에 add함.
     • 각자 Menu들에 .add(MenuItem)를 하여 메뉴들을 넣어줌.
     • waitress에 allMenus를 넘겨 VegetarianMenu 출력하는 함수 실행.
     
![image](https://user-images.githubusercontent.com/93365714/230721905-5fc3f916-93b2-4853-9371-5e27dd2e1040.png)
