public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            int age = generateRandomAge();
            int temperature = generateRandomTemperature();
            String result = permission(age, temperature);
            System.out.println("Возраст: " + age + ", Температура: " + temperature + ", Результат: " + result);
        }
    }

    public static String permission(int age, int temperature) {
        if ((age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) ||
                (age < 20 && temperature >= 0 && temperature <= 28) ||
                (age > 45 && temperature >= -10 && temperature <= 25)) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }

    public static int generateRandomAge() {
        return (int) (Math.random() * 101); // Генерация случайного возраста от 0 до 100
    }

    public static int generateRandomTemperature() {
        return (int) (Math.random() * 51) - 20; // Генерация случайной температуры от -20 до 30 градусов
    }
}
