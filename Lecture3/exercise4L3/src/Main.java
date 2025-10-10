void main(){

    for (int i = 0; i <10; i++) {
        if (i%2==0){
            continue;
        }
        else {
            System.out.println(i);
        }
        if (i==7){
            break;
        }
    }
}