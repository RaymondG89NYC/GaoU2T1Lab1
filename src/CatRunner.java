public class CatRunner {
    public static void main(String[] args){
        Cat cat1 = new Cat("Fluffy",8,25);
        cat1.introduce();
        cat1.printCatInfo();

        Cat cat2 = new Cat("Happy",2, 25);
        cat2.printCatInfo();
        cat2.introduce();
    }
}
