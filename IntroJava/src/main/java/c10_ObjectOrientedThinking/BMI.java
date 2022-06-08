package c10_ObjectOrientedThinking;

class BMI {
    //data fields
    private final String name;
    private final int age;
    private final double weight;
    private final double feet;
    private final double inches;
    public static final double METERS_PER_INCH = 0.0254;
    public static final double INCHES_PER_FEET = 12;

    //Constructor
    public BMI(String name, int age, double weight, double feet, double inches) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.feet = feet;
        this.inches = inches;
    }

    //Methods
    public double getBMI() {
        double height = METERS_PER_INCH * (inches + feet * INCHES_PER_FEET);
        double bmi = weight / height / height;
        return Math.round(bmi * 100) / 100.0;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getStatus() {
        double bmi = this.getBMI();
        if (bmi < 18.5)
            return "Underweight";
        else if (bmi < 25)
            return "Normal";
        else if (bmi < 30)
            return "Overweight";
        else
            return "Obese";
    }
}