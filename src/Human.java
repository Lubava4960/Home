public class Human {
    public int age;
    public String name;
    public String city;
    public String speciality;

    public Human(int age, String name, String city, String speciality) {
        if (age < 0) {
            this.age = 0;
        } else
            this.age = age;

        if (name == null) {

            this.name = ". Информация не указана";
        } else {
            this.name = name;
        }
        if (city == null) {
            this.city = ". Информация не указана";
        } else {
            this.city = city;
        }
        if (speciality == null) {
            this.speciality =". Информация не указана";
        } else {
            this.speciality = speciality;
        }
    }
}