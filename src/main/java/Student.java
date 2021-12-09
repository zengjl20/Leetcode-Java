public class Student extends Person{
    private Integer id;

    Student(){
        super();
    }
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getInformation(String name, int age){
        return "name：" + name + " age: " + age + " id：" + id;
    }
    public void setId(int id){
        this.id = id;
    }
}
