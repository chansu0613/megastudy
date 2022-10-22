package class_test._example;

public class game {
    public static void main(String[] args) {

        CGV sinchon = new CGV();
        sinchon.makeSchedule();
        sinchon.makeReservation(1,5,5);
        sinchon.showAllSchedule();
    }
}
