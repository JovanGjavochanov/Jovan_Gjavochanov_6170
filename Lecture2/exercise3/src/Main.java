void main(){
    Random random = new Random();

    int score;
    score = random.nextInt(101);
    System.out.println("The score that was generated is: " + score);

    if (score >= 60){
        System.out.println("You have passed the exam!");
    }
    else {
        System.out.println("You have failed!");
    }
}