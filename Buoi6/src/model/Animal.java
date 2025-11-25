public class Animal implements Swimmable,Flyable{
    private String name;
    private String age;
    public void makeSound(){
        System.out.print("\nKeu ");
    }
    public void eat(){
        System.out.print("\nAn ");
    }
    public void move(){
        System.out.print("\nDi chuyen bang cach ");
    }

    public Animal() {
        super();
    }

    @Override
    public boolean fly() {
        return false;
    }

    @Override
    public boolean swim() {
        return false;
    }
}
