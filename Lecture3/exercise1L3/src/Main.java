void main (){

    Random random = new Random();
//    int count = 0;
//    while (count<10){
//        random.nextInt();
//        int num = random.nextInt(500);
//        System.out.println("Number: " + num);
//        count++;
//
//    }
    int num;
            do{
                 num = random.nextInt(501);
                System.out.println("Number: " + num);
            }
            while (num<300);
int count = 0;
            for (int i=0; i<20; i++){
                num = random.nextInt(501);
                System.out.println("Num:" + num);
                if(num % 2 == 0){
                    count++;
                }
                if (num % 7 == 0);
                break;
            }

}
