public class Cat {
    private String name; /*Исправила модификатор доступа на private*/
    private int age; /*Исправила модификатор доступа на private*/
    private int weight; /*Исправила модификатор доступа на private*/

    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {   /*Добавила getter и setter для переменной weight*/
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
