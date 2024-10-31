package ch10_8;

public class Truck extends Car {
    
    // 부모에 생성자가 있을 때, 부모의 생성자를 호출할 수 있는 생성자가 필요
//    public Truck() {
//        super("");
//    }

    private double payload;

    public Truck(String name, double payload) {
        super(name);
        this.payload = payload;
        System.out.printf("적재량 : %.1f톤\n", payload);
    }

    public void load() {
        System.out.printf("[%s]가 물건을 적재합니다. (최대 %.1f톤)\n", getName(), payload);
    }

    public double getPayload() {
        return payload;
    }

    public void setPayload(double payload) {
        this.payload = payload;
    }
}
