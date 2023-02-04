package transport;

public class Bus extends PublicTransport{
    // 초기 번호
    static int serialNum = 1;

    // 고유 번호
    int busNum;

    public Bus() {
        this(30, true, 1000);
        busNum = serialNum++;
    }

    public Bus(int maxPassenger, boolean status, int fare) {
        super(maxPassenger, status, fare);
    }

    @Override
    public void printInfo() {
        System.out.println("탑승 승객 수 = " + curPassenger);
        System.out.println("잔여 승객 수 = " + (maxPassenger - curPassenger));
        System.out.println("요금 확인 = " + this.fare * curPassenger);
    }

    @Override
    public String getStatus() {
        if (this.status) {
            return "운행";
        }
        return "차고지행";
    }

    @Override
    public void getFuelAndStatus() {
        System.out.println("상태 = " + getStatus());
        System.out.println("주유량 = " + this.fuelAmount);

        if (this.fuelAmount < 10) {
            System.out.println("주유가 필요합니다.");
        }
    }

    @Override
    public void useFuel(int fuel) {
        this.fuelAmount -= fuel;

        if (this.fuelAmount < 10) {
            this.status = false;
        }
    }
}
