public class Main {
    public static void main(String[] args) {
        int currentYear = 2022;
        Human maksim = new Human(35,"Максим","Mинск","бренд менеджер");
        Human anya = new Human(29, "Аня","Mocква", " методист образовательных программ"  );
        Human katya = new Human(28,"Катя", "Калининград", "продакт-менеджер");
        Human artem = new Human(27,"Артём","Москва","директор по развитию бизнеса" );
        System.out.println("Привет! Меня зовут "+ maksim.name+ ". Я из города "+maksim.city+ ". Я родился в " +(currentYear- maksim.age)+ " году. Я работаю в должности "+ maksim.speciality+ ". Будем знакомы!");
        System.out.println("Привет! Меня зовут "+ anya.name+ " . Я из города "+anya.city+ ". Я родился в " +(currentYear- anya.age)+ " году. Я работаю в должности "+ anya.speciality+ ". Будем знакомы!");
        System.out.println("Привет! Меня зовут "+ katya.name+ " . Я из города "+katya.city+ ". Я родился в " +(currentYear- katya.age)+ " году. Я работаю в должности "+ katya.speciality+ ". Будем знакомы!");
        System.out.println("Привет! Меня зовут "+ artem.name+ " . Я из города "+artem.city+ ". Я родился в " +(currentYear- artem.age)+ " году. Я работаю в должности "+ artem.speciality+ ". Будем знакомы!");

    }
}