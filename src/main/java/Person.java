public class Person {
    public String name;
    public Integer age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getInformation(String name, int age){
        return "name：" + name + " age:" + age;
    }

    @Override
    public boolean equals(Object anObject){
        if(this == anObject){
            return true;
        }
        if(anObject instanceof Person){
            Person anPerson = (Person) anObject;
            if(this.name.equals(anPerson.name) && this.age.equals(anPerson.age)){
                return true;
            }
        }
        return false;
    }
}
