package src.builder;

public class Builder {

    private String name;
    private int speed;
    private CAR_TYPE type;

    public Builder name(String name){
        this.name = name;
        return this;
    }
    public Builder speed(int speed){
        this.speed = speed;
        return this;
    }
    public Builder type(CAR_TYPE type){
        this.type = type;
        return this;
    }
    public Car build(){
        Car car = new Car();
        car.setName(this.name);
        car.setSpeed(this.speed);
        car.setType(this.type);
        return car;
    }

}

