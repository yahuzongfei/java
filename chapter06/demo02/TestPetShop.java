package demo02;

public class TestPetShop {
    public static void main(String[] args) {
        PetShop shop = new PetShop();
        Pet dog = shop.sale("Dog");

        dog.setNickname("小白");
        dog.eat();

        Pet cat = shop.sale("Cat");
        cat.setNickname("花花");
        cat.eat();

    }
}
