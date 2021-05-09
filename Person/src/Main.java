public class Main {
    public static void main(String[] argv) {
        Person p = new Person("Фролов");
        System.out.println(p.getFullName());
        p.setName("Игорь");
        System.out.println(p.getFullName());
        p.setPatronymic("Игоревич");
        System.out.println(p.getFullName());
        p = new Person("Фролов");
        System.out.println(p.getFullName());
        p.setPatronymic("Игоревич");
        System.out.println(p.getFullName());
    }
}
