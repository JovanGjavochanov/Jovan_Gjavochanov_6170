void main() {
    int temp;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the current temperature ");
   try {
       temp = scanner.nextInt();

       switch (temp) {
           case 30:
               System.out.println("It's very hot ");
               break;
           case 20:
               System.out.println("It's warm");
               break;
           case 10:
               System.out.println("It's okay");
               break;
           case 0:
               System.out.println("It's cold");
               break;
           default:
               if (temp < 0) {
                   System.out.println("It's freezing");
               } else {
                   System.out.println("It's " + temp + "degrees!");
               }
       }
   } catch (Exception e) {
       System.out.println("Invalid input");
   }
}
