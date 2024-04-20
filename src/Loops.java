import java.util.Arrays;

public class Loops {
    public static void main(String[] args) throws InterruptedException {
        int[] pages = {1, 2, 3};
        System.out.println(Arrays.toString(pages));

        int[] moreNumbers = new int[6];
        System.out.println(Arrays.toString(moreNumbers));

       String[] days = { "Monday", "tUESDAay", "wEDNESDAY"};

        String[] names = new String[5];
        names[0] = "Salva";
        names[0] = "Lisa";
        names[1] = "Secondo";
        names[2] = "Terzo";

        names[3] = "Matteo";
        names[4] = "Quinto";

        System.out.println(Arrays.toString(names));
        System.out.println("The arrays is of length: "+ names.length);
        System.out.println("The first value of an array is " + names[0]);
        System.out.println("=============");

        System.out.println("For i loop");
        for (int i = 0; i<3; i++){
            System.out.println("hello");
            System.out.println("i value is: " + i);
        }

        for (int i = 0; i<3; i++){
            System.out.println(names[i]);
        }

        for (int i = 0; i< names.length; i++){
            if (names[i].equals("Secondo")){
                System.out.println(names[i].toUpperCase());
            } else if (names[i].equals("Terzo")) {
                continue;
            }else {
                System.out.println(names[i]);
            }
        }

        for (int counter = 10; counter >= 0; counter--){
            System.out.println(counter);
//            Thread.sleep(1000);
        }
        System.out.println("Time to start working on the lab!");

        System.out.println("For each loop");
        for (String name : names){
            if (name.equals("Secondo")){
                System.out.println(name.toUpperCase());
            } else if (name.equals("Terzo")) {
                continue;
            }else {
                System.out.println(name);
            }
        }

        for (String day : days){
//            BEWARE: There is a bug, the first value is not being capitalized as intended
//    TODO: fix this bug
            System.out.println("Old value: " + day);
            System.out.println("New value: " + day.toLowerCase()
                    .replace(day.charAt(0),
                            String.valueOf(day.charAt(0))
                                    .toUpperCase().toCharArray()[0]));
        }
        for (int page : pages) {
            System.out.println(page);
        }

        System.out.println("While loop");
        int index = 1;
        while (index < 3) {
            System.out.println(index);
            index++; // index = index+1; // index +=1;
        }


        System.out.println("Do While loop");
        int index2 = 1;
        do {
            System.out.println(index2);
            index2 += 1;
        } while (index2 < 3);










    }
}
