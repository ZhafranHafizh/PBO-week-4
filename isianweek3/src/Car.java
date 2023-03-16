public class Car extends Kendaraan{
    public String methodChild(){
        return "Ini adalah child";
    }

    public String methodParent(){
        return "Ini adalah parent";
    }


    public String methodParent2() {
        return super.methodParent();
    }
    
}
