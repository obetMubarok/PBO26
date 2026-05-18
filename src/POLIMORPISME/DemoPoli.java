package POLIMORPISME;
class Hewan{
    public void speak(){
        System.out.println("Suara Hewan");
    }
    
}

class Kucing extends Hewan{
    public void speak(){
        System.out.println("Meong");
    }
}

class Bebek extends Hewan{
    public void speak(){
        System.out.println("Kwek");
    }
}

class Anjing extends Hewan{
    public void speak(){
        System.out.println("Hug");
    }
}
public class DemoPoli {
    public static void main(String[] args) {
        Hewan h;
        h = new Kucing();
        h.speak();
        
        h = new Anjing();
        h.speak();
        
        h = new Bebek();
        h.speak();
        
        
    }
}
