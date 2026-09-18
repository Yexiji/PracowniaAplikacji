//TIP To Run code, press or

void main() {
    int calkowita = 5;
    double rzeczywista = 1.5;

    System.out.println("\tWartosc zmiennej \"calkowita\" to " + calkowita);
    System.out.println("\nWartosc zmiennej rzeczywista to " + rzeczywista);



    char litera = 97;
    String napis = "napis";

    System.out.println(litera);
    System.out.println(napis);

    boolean czyPrawda= true; //false
    System.out.println(czyPrawda);

    System.out.println("wartosc 1 + 2 + 3 = " + (1 + 2 + 3));

    System.out.println(1 + 2 + 3 + " to wartosc 1 + 2 + 3");

    System.out.println("Podaj wiek: ");

    Scanner sc = new Scanner(System.in);

    int wiek = sc.nextInt();
}