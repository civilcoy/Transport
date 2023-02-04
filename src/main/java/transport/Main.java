package transport;

public class Main {
    public static void main(String[] args) {
        Bus bus1 = new Bus();
        Bus bus2 = new Bus();

        // Bus 생성
        System.out.println(bus1.busNum + "번 버스객체 만들어짐!");
        System.out.println(bus2.busNum + "번 버스객체 만들어짐!");

        // 승객 +2
        bus1.getOn(2);
        bus1.printInfo();
        bus1.getOff(2);

        // 주유량 -50
        bus1.useFuel(50);
        bus1.getFuel();

        // 상태변경, 주유량 +10
        bus1.setStatus();
        bus1.plusFuel(10);
        bus1.getFuelAndStatus();

        // 승객 + 45
        bus1.setStatus();
        bus1.getOn(45);

        // 승객 + 5
        bus1.getOn(5);
        bus1.printInfo();
        bus1.getOff(5);

        // 주유량 -55
        bus1.useFuel(55);
        bus1.getFuelAndStatus();

        System.out.println("상태: 운행");
    }
}

// 시나리오와 제일 하단 run된 이미지가 좀 상이한 거 같습나다.
// 예를 들어 탑승 승객수 =5, 잔여 승객 수 =25 인데 하단에는 잔여 승객 수가 23으로 표기되어 있습니다.
// 아무리 맞춰보려고 해도 안되는 거 같아서 조금 늦었습니다.