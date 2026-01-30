class Car{
    String name,col;
    Car(String name){
        this.name=name;
        col=name;
    }
}
class pg9{
    public static void main(String[] args) {
        Car rr =new Car("model");
        System.out.println(rr);
    }
}