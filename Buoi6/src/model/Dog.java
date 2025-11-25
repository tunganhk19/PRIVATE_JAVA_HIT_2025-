public class Dog extends Animal{
    @Override
    public void move() {
        super.move();
        System.out.println("chay bang 4 chan");
    }

    @Override
    public boolean fly() {
        return false;
    }

    @Override
    public boolean swim() {
        return true;
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("");
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Gau gau!");
    }
}
