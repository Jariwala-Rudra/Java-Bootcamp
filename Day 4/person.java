public class person {
    int age = 16;
    public void printAge () {
        System.out.println("Age: "+ age);
    } 
    public void makeOlder () {
        age += 1;
    }
    String name = "Name";
    public changeAge (int newAge, String newName) {
        age = newAge;
        name = newAge;
    }
    public int getAge() {
        return age;
    }
}  