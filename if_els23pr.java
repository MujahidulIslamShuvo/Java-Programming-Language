 public class if_els23pr {
    public static void main(String[] args) {
        int age = 16;
        if (age >= 18) {
            System.out.println("adult:vot,drive");
        }


        else if (age > 13 && age <18){
            System.out.println("Teenager");
        }

        else{
            System.out.println("not adult");
        } 
    }
}
