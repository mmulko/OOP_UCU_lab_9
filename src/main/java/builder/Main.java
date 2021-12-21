package builder;

public class Main {
    public static void main(String[] args) {
        User user = User.builder().firstName("Mykhailo").lastName("Mulko").age(18).weight(80).gender("Male").job("Student").job("Analyst").build();
        System.out.println(user);
    }
}
