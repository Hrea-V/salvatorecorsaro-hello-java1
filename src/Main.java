public class Main {
    public static void main(String[] args) {
        String myFavoriteTea = "Oolong tea";
        int amountOfTeaSpoonsToUse = 2;
        System.out.println("My favorite tea is " + myFavoriteTea);
        System.out.println("I use " + amountOfTeaSpoonsToUse + " teaspoons of " + myFavoriteTea);
        boolean isTeaBrewed = true;
        if (!isTeaBrewed == true) {
            System.out.println("Let brew some tea");
        } else {
            System.out.println("Great, time to sip a bit of it");
        }

        double teaPrice = 4;

        if (teaPrice < 7.5) {
            System.out.println("It s on discount let s buy it");
        } else if (teaPrice <= 10.99) {
            System.out.println("It a good price, we can buy it if we need it");
        } else if ((teaPrice > 10.00) && teaPrice < 13.50) {
            System.out.println("mmm it a bit overpriced");
        } else {
            System.out.println("Waaay to overpriced, stay away! Unless it s mothers day and u havent bought a gift");
        }

        String teaOrigins = "JaPan    ";
        if (teaOrigins.trim().equalsIgnoreCase("JAPAn")) {
            System.out.println("Wow I love green team from Jpan");
        }
    }
}