
package Generics;

import java.util.Vector;

class Person{
    String name; int age;

    public Person(String n, int a) {
        name = n; age = a;
    }
    
    void print(){
        System.out.println(name + " - " + age);
    }
}

public class GeneriDemo {
    public static void main(String[] args) {
        Vector<Person> v = new Vector();
        v.add( new Person("Hung", 20));
        v.add( new Person("Nhan", 20));
        v.add( new Person("Quan", 20));
        
        for (int i = 0; i < v.size(); i++) {
            v.get(i).print();
        }
    }
}
