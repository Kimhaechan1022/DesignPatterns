package src.builder;

public class Car {

    private String name;
    private int speed;
    private CAR_TYPE type;

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", type=" + type +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setType(CAR_TYPE type) {
        this.type = type;
    }
    public Builder builder(){
        return new Builder();
    }
}
