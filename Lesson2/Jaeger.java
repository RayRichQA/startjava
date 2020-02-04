public class Jaeger {

    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int speed;
    private int strength;
    private int armor;

    public Jaeger(){}

    public Jaeger(String modelName, String mark, String origin, float height, float weight, int speed, int strength, int armor) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.speed = speed;
        this.strength = strength;
        this.armor = armor;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        if(modelName.equals("")) {
            System.out.println("Пустая строка.");
        } else {
            this.modelName = modelName;
        }
    }

    public void setMark(String mark) {
        if(mark.equals("")) {
            System.out.println("Пустая строка.");
        } else {
            this.mark = mark;
        }
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        if(origin.equals("")) {
            System.out.println("Пустая строка.");
        } else {
            this.origin = origin;
        }
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public boolean isDestroyed() {
        System.out.println("Robot " + this.modelName + " was destroyed.");
        return true;
    }
    int step = 0;
    public String move() {
        return ++step + " step.";
    }

    public String toString() {
        return "modelName = " + modelName + ", mark = " + mark + ", origin = " + origin + ", height = " + height + ", weight = " + weight + ", speed = " + speed + ", strength = " + strength + ", armor = " + armor;
    }
}