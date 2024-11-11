package StepikJava.ZaurJava.Course1.Lesson32.Homework;

public class Tiger {

    private String name;

    public Tiger(String name) {
        this.name = name;
    }

    public void eat(String food) {
        if (!food.equals("meat")) {
            throw new NotMeatException("Tiger " + name + " don't eat " + food);
        } else {
            System.out.println("Tiger " + name + " is eating meat.");
        }
    }

    public void drink(String someDrink) throws Exception {
        if (!someDrink.equals("water")) {
            throw new NotWaterException("Tiger " + name + " don't drink " + someDrink);
        } else {
            System.out.println("Tiger " + name + " is drinking water.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
