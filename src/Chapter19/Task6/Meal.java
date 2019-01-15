package Chapter19.Task6;

import Chapter21.Task36.Enums;


//Exercise 6, page 1028
/* Is there any special benefit in nexting Appetizer, MainCourse, Dessert, and
* Coffee inside Food rather than making them standalone enums that just happen
* to implement Food?*/

public enum Meal {
    APPETIZER(Appetizer.class),
    MAINCOURSE(MainCourse.class),
    DESSERT(Dessert.class),
    COFFEE(Coffee.class);
    private Food[] values;


    private Meal(Class<? extends Food> kind) {
        values = kind.getEnumConstants();
    }
    public Food randomSelection() {
        return Enums.random(values);
    }
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            for(Meal meal: Meal.values()) {
                Food food = meal.randomSelection();
                System.out.println(food);
            }
            System.out.println("---");
        }
    }
}
