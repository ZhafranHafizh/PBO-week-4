
public class Main {
    public static void main(String[] args){
        Car c = new Car();
        Motorcycle m = new Motorcycle(90, 128,17689,200);
        Plane p = new Plane(89,78,300);
        Bicycle b = new Bicycle(88,30,25);

        System.out.println("Mobil Civic dengan plat nomor "+ c.getPlateNum()+ " ada di posisi "+ c.getxLoc()+ ", "+c.getyLoc()+
                ". Melaju dengan kecepatan "+ c.getSpeed()+" Km/h");
        System.out.println("Motor UDIN dengan plat nomor "+ m.getPlateNum()+ " ada di posisi "+ m.getxLoc()+ ", "+m.getyLoc()+
                ". Melaju dengan kecepatan "+ m.getSpeed()+" Km/h");
        System.out.println("Sepeda Ontel ada di posisi "+ c.getxLoc()+ ", "+c.getyLoc()+ ". Melaju dengan kecepatan "+ c.getSpeed()+" Km/h");
        System.out.println("Pesawat Boeing ada di posisi "+ p.getxLoc()+ ", "+p.getyLoc()+ ". Melaju dengan kecepatan "+ p.getSpeed()+" Km/h");

        System.out.println("--------------------------------------------------------");
        Kendaraan parent = new Kendaraan();
        Car child = new Car();

        System.out.println(parent.methodParent());
        System.out.println(child.methodChild());
        System.out.println(child.methodParent());
        System.out.println(parent.methodParent());
        System.out.println(child.methodParent2());


    }
}