package incaps;

public class Animal {
    public int age;
    public String name;

    public Animal(int age, String name){
        this.age = age;
        this.name = name;

    }



    public int getAge(){
    return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}