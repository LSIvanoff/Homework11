import java.time.LocalDate;

public class Main {
    public static void checkYear(int data) {
        if (data >= 1584 && ((data % 100 != 0 && data % 4 == 0) || (data % 400 == 0))) {
            System.out.println(data + " год — високосный год");
        } else
            System.out.println(data + " год — невисокосный год");
    }

    public static void printInfoAboutDevice(int infoClientOS, int infoDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        String msg = infoDeviceYear < currentYear ? "облегченную " : "";
        System.out.println(currentYear);

        if (infoClientOS == 0 || infoClientOS == 1) {
            String os = infoClientOS == 0 ? "iOS" : "Android";
            System.out.println("Установите " + msg + "версию приложения для " + os + " по ссылке");
        } else {
            System.out.println("Неподдерживаемая операционная система");
        }
    }

    public static int totalDeliveryDistance(int distance) {
        int fastDelTime = 1;
        int averageDelTime = fastDelTime + 1;
        int longDelTime = averageDelTime + 1;
        int zero = 0;
        if (distance <= 20) {
            return fastDelTime;
            //System.out.println("Потребуется дней: " + fastDelTime);
        } else if (distance <= 60) {
            return averageDelTime;
            //System.out.println("Потребуется дней: " + averageDelTime);
        } else if (distance <= 100) {
            return longDelTime;
            //System.out.println("Потребуется дней: " + longDelTime);
        } else {
            return zero;
            //System.out.println("Доставки нет");
        }
    }

    public static void main(String[] args) {
        System.out.println("Задание 1");
        int year = 1700;
        checkYear(year);

        System.out.println("Задание 2");
        int clientOS = 1;
        int clientDeviceYear = 2024;
        printInfoAboutDevice(clientOS, clientDeviceYear);

        System.out.println("Задание 3");
        int deliveryDistance = 55;
        int deliveryDays = totalDeliveryDistance(deliveryDistance);
        if (deliveryDays > 0) {
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            System.out.println("Доставки нет");
        }


    }
}