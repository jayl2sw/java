class Dog{
    String name = "이름모름";
    int age = 0;

    Dog(){}
    Dog(String n){
        name = n;
    }
    Dog(int a){
        age = a;
    }
    Dog(String n, int a){
        name = n;
        age = a;
    }

    void info(){
        System.out.printf("강아지의 이름은 %s이고 나이는 %d입니다.\n", this.name, this.age);
    }
}

public class DogMain {
    public static void main(String[] args) {
        Dog d = new Dog();
        Dog d2 = new Dog("쫑");
        Dog d3 = new Dog(3);
        Dog d4 = new Dog("메리", 2);

        d.info();
        d2.info();
        d3.info();
        d4.info();
    }
}
