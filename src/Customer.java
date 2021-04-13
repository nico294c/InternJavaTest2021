public class Customer implements Comparable{
    String name;
    int age;
    int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Customer(String name, int age, int price){
        setName(name);
        setAge(age);
        setPrice(price);
    }


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
