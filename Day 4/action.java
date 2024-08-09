public class action {
    int age = 16;
    public static void main(String[] args) {
        person pranav = new person();
        pranav.printAge();
        pranav.makeOlder();
        pranav.makeYounger();
        pranav.changeAge(20);
        pranav.newName("Vignesh");
    }
}
