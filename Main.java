class Main {
  public static void main(String[] args) {
    

    3일차 연습문제

    //문제 #1 자동차 객체 마다 다른 최고속력.


    car car1 = new car();
    car car2 = new car();

    car1.fs = 2;
    car2.fs = 3;
    
    System.out.printf("a's fs is : %d\n", car1.fs);
    System.out.printf("b's fs is : %d\n", car2.fs);


    //문제 2 1개의 자동차가 3번 달리게
    
    
    for ( int i = 1 ; i <= 3 ; i++){
      car1.달리다();
    }


  }
}


class car {
  int fs;
  void 달리다() {
    System.out.println("달리다.");
  }
}