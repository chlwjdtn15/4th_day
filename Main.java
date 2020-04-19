class Main {
  public static void main(String[] args) {
    
    /*
    //3일차 연습문제

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

    int[] arr = new int[3];
    arr[0] = 1;
    arr[1] = 2;
    arr[2] = 3;


    for (int x = 0 ; x <= 2; x++){
      System.out.printf("%d\n", arr[x]);
    }*/








        // 구현시작
        car car1 = new car();

        car1.달리다1(); //1 번 자동차는 210 로 달림
        car1.달리다2(); //2번 자동차는 230 로 달림
    

  }
}


class car {
  int fs = 230;
  void 달리다1() {
    int speed = 210;
    System.out.printf("1번 자동차는 %d 로 달립니다.\n", speed);
  }
  void 달리다2(){
    System.out.printf("2번 자동차는 %d 로 달립니다.\n", this.fs );
  }
}