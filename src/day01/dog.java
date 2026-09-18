package day01;

public class dog {
    String name;
    int age;
    public void fun(){
        System.out.println("汪汪");
    }

    public dog() {
    }//空参构造函数

    public dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
