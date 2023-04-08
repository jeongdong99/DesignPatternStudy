
 1. 목적 : 
     • 컬렉션 구현 방법을 노출시키지 않으면서도 그 집합체 안에 들어있는          모든 항목에 접근할 수 있는 방법을 제공.
  
   2. 사용해야 할 때 : 
     • 전체에 접근하지 않고 요소들에 접근해야 할 때.
     • 항목들을 여러 번 또는 동시에 통과해야 할 때.
     • 여러 종류의 항목들을 살펴보기 위해 균일한 인터페이스가 필요할 때.
     • 프로그램 전체에서 순회 코드의 중복을 줄이고자 할 때.
     
   3. UML Class Diagram : 
   
   ![image](https://user-images.githubusercontent.com/93365714/230721778-2d4fa857-4bd8-4bd9-a11c-7760c00bfd7b.png)
   
 4. 해당 패턴을 적용한 부분 : 
      • Menu라는 컬렉션 인터페이스를 만들어 두 가지 타입 통일.
      • Iterator 인터페이스를 import하여 타입별로 다른 부분 캡슐화.
      • PancakeHouseMenu와 DinerMenu에 createIterator을 만듬.
      • 단, PancakeHouseMenuIterator는 ArrayList라서 이터레이터
        직접 구현할 필요없음.
      • waitress class에서 printMenu 메소드에 createIterator 전달.

   5. 해당 패턴 적용 시의 이점 : 
     • 새로운 유형의 컬렉션 및 반복자를 구현하여
       기존의 코드는 수정하지 않음으로써 개방/폐쇄 원칙을 만족.
     • 동일한 컬렉션을 병렬로 반복할 수 있음.
     • 반복을 지연시킬 수 있고 필요할 때 계속할 수 있음.
     • 일일이 접근하는 기능을 집합체가 아닌 반복자 객체에서 책임.

   6. 해당 패턴이 적용된 실행결과 내용 설명 :
     • pancakeHouseMenu, dinerMenu 객체를 생성하여 waitress에 전달.
     • waitress의 printMenu 메소드에서 각각 Menu createIterator 만듬.
     • printMenu에서 interator을 전달 받아 반복 출력 실행.
     • 모든 메뉴 한번 출력하고, 채식 메뉴 한번 출력
     
  ![image](https://user-images.githubusercontent.com/93365714/230721787-7f0af514-f2de-45f5-8722-17ff79560857.png)
