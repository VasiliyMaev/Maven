public class Main {


    public static void main(String[] args) {
        MyService myService = new MyService();
        System.out.println(myService.getMyEntity());
        System.out.println(myService.setMyEntity(new MyEntity("Second")));
        System.out.println(myService.getMyEntity());
    }

}
