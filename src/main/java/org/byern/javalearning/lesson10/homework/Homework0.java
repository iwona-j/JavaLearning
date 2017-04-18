package org.byern.javalearning.lesson10.homework;

/**
 * Created by ByerN on 11.04.2017.
 */
public class Homework0 {


    String firstName;
    String lastName;
    Integer age;


    public static void main(String[] args) {
        Homework0 hm = new Homework0();
        hm.setFirstName("Jan");
        hm.setLastName("Pan");
        System.out.println(hm.hashCode());


    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }


        if (this==obj) return true;
        if (!this.getClass().equals(obj.getClass())) return false;
        Homework0 hm = (Homework0) obj;

        return (((null==getFirstName() ? null==hm.getFirstName() : getFirstName().equals(hm.getFirstName()))
                &&  (null==getLastName() ? null==hm.getLastName() : getLastName().equals(hm.getLastName())))
                &&  (null==getAge() ? null==hm.getAge() : getAge().equals(hm.getAge())) );


    }

    public int hashCode(){
        int somePrime =37;
        int result =0;
        result = somePrime*result;
        result = somePrime*result + sum(this.getLastName());
        result = somePrime*result + (this.getAge()==null ? 1: this.getAge());
        result = result + + sum(this.getFirstName());


        return result;
    }

    private int sum(String string) {
        int sum = 0;
        int somePrime2 = 31;
        if (string.equals(null)) {
            sum = somePrime2;
        }
        else {
            for (int i = 0; i < string.length(); i++) {
                sum += string.charAt(i);
            }
        }
        return sum;
    }
    /*
     * Create class with 3 properties:
     * -firstName
     * -lastName
     * -age
     *
     * Implement equals and hashcode methods without autogenerating feature.
     * All of fields are nullable
     */

}
