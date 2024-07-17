import java.time.LocalDate;

public class Main {
    public static void checkYear(int data) {
        if (data >= 1584 && ((data % 100 != 0 && data % 4 == 0) || (data % 400 == 0))) {
            System.out.println(data + " год — високосный год");
        } else {
            System.out.println(data + " год — невисокосный год");
        }
        System.out.println("\n");
    }

    public static void printInfoAboutDevice(int infoClientOS, int infoDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        String msg = infoDeviceYear < currentYear ? "облегченную " : "";

        if (infoClientOS == 0 || infoClientOS == 1) {
            String os = infoClientOS == 0 ? "iOS" : "Android";
            System.out.println("Установите " + msg + "версию приложения для " + os + " по ссылке");
        } else {
            System.out.println("Неподдерживаемая операционная система");
        }
        System.out.println("\n");
    }

    public static int totalDeliveryDistance(int distance) {
        if (distance <= 20) {
            return 1;
        } else if (distance <= 60) {
            return 2;
        } else if (distance <= 100) {
            return 3;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("Задание 1");
        int year = 1700;
        checkYear(year);

        System.out.println("Задание 2");
        int clientOS = 1;
        int clientDeviceYear = 2015;
        printInfoAboutDevice(clientOS, clientDeviceYear);

        System.out.println("Задание 3");
        int deliveryDistance = 55;
        int deliveryDays = totalDeliveryDistance(deliveryDistance);
        if (deliveryDays > 0) {
            System.out.println("Потребуется дней: " + deliveryDays + "\n");
        } else {
            System.out.println("Доставки нет \n");
        }


    }
}