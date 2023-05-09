package lesson6.Cats;

import java.util.Objects;

public class Cat {
    private int id;
    int age;
    String firstName;
    String species;
    String sex;
    String lastVisit;
    String colour;

    public Cat(int id, int age, String firstName, String species, String sex, String lastVisit, String colour) {  // вместо этого блока работает @AllArgsConstructor
        this.id = id;
        this.age = age;
        this.firstName = firstName;
        this.species = species;
        this.sex = sex;
        this.lastVisit = lastVisit;
        this.colour = colour;
    }

    public Cat(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return id == cat.id
                && age == cat.age
                && Objects.equals(firstName, cat.firstName)
                && Objects.equals(species, cat.species)
                && Objects.equals(sex, cat.sex)
                && Objects.equals(lastVisit, cat.lastVisit)
                && Objects.equals(colour, cat.colour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, age, firstName, species, sex, lastVisit, colour);
    }

    @Override
    public String toString() {
        return String.format("%d %s %s %d %s %s", id, firstName, sex, age, species, colour);
    }

    public int getId() {
        return id;
    }
}
