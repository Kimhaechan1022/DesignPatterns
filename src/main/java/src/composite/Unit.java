package src.composite;

public abstract class Unit {
    private String name;

    public Unit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + "(" + getSize() + ")";
    }
    // 추상 메서드로 선언한 이유는 파일과 폴더의 사이즈를 구하는 방법이 각각 다르기 떄문
    public abstract int getSize();

}
