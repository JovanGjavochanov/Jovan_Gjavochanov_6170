import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int score = random.nextInt(101);

        String grade, message;

        if (score >= 90){
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        }else if (score >= 70){
            grade = "C";
        }else if (score >= 60){
            grade = "D";
        }else {
            grade = "F";
        }

        switch (grade){
            case "A":
                message = "Excelent work";
                break;
            case "B":
                message = "";
                break;
            case "C":
                message = "";
                break;
            case "D":
                message = "";
                break;
            case "F":
                message = "";
                break;
            default:
                message = "no grade";
        }
    }
}