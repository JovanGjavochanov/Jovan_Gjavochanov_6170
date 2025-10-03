void main (){

    Scanner scanner = new Scanner(System.in);
    String name;

    System.out.println("Enter your name: ");
    name = scanner.nextLine();
    int lenght = name.length();
    System.out.println("Lenght of name: " + lenght);

    char middleChar;
    if (lenght % 2 == 0){
        middleChar = name.charAt(lenght/2-1);
    } else {
        middleChar = name.charAt(lenght/2);
    }
    System.out.println("Middle character is: " + middleChar);
}
