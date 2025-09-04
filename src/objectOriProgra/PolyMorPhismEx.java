package objectOriProgra;

import javax.lang.model.element.AnnotationMirror;

class Animal{
    void sound(){
        System.out.println("An animal make sounds");
    }
    void sound(String type){
        System.out.println("animal sounds " + type);
    }
}

class Dog extends Animal {
    @Override
    void sound(String type) {
        System.out.println("Dong sounds " + type);
    }
}


public class PolyMorPhismEx {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();
        d.sound();
        d.sound("loud");
        a.sound();
        a.sound("generic");
    }

}
