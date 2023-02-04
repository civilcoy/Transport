package transport;

public abstract class PublicTransport {
    int carNumber; // 번호
    int fuelAmount = 100; // 주유량=100
    int speed = 0; // 속도=0

    int maxPassenger; // 최대 승객
    int curPassenger; // 현재 승객
    int fare; // 요금
    boolean status = true; // 상태

    public PublicTransport(int maxPassenger, boolean status, int fare) {
        this.maxPassenger = maxPassenger;
        this.status = status;
        this.fare = fare;
    }

    public void getOn(int passenger) {
        if (this.curPassenger + passenger > this.maxPassenger) {
            System.out.println("최대 승객 수를 초과했습니다.");
            return;
        }
        this.curPassenger += passenger;
    }

    public void getOff(int passenger) {
        if (this.curPassenger <= 0) {
            System.out.println("탑승 승객이 없습니다.");
            return;
        }
        this.curPassenger -= passenger;
    }

    public void changeSpeed(int speed) {
        this.speed += speed;
    }

    public void setStatus() {
        this.status = !this.status;
    }

    public void getFuel() {
        System.out.println("주유량 : " + this.fuelAmount);
    }

    public void useFuel(int fuel) {
        if (this.fuelAmount < 10) {
            System.out.println("주유가 필요합니다.");
        }
        this.fuelAmount -= fuel;
    }

    public void plusFuel(int fuel) {
        this.fuelAmount += fuel;
    }

    abstract public void printInfo();
    abstract public String getStatus();
    abstract public void getFuelAndStatus();


}
