package abstract_class;

abstract class person {
    String name;
    void set_name(String name){
        this.name = name;
        // System.out.println(name);
    }

    abstract void display();

}

public class main extends person {
    public static void main(String[] args) {
       // person p = new person();
        main m = new main(); 
        m.set_name("John");
     
       m.display();
        
    }

  
    void display() {
        System.out.println(name);
    }
}
