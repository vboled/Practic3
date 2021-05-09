public class Person {
    private String name;
    private String surname;
    private String patronymic;

    public Person(String surname, String name, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public Person(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getFullName() {
        String res = surname;
        String outName = "_", patr = "";
        if (name != null && !name.equals(""))
            outName = name.substring(0, 1) + ".";
        if (patronymic != null && !patronymic.equals(""))
            patr = patronymic.substring(0, 1) + ".";
        if (patr.equals("") && outName.equals("_"))
            return res;
        return res + " " + outName + patr;
    }
}
