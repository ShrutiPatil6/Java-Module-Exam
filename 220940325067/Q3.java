class shape{
    void draw(){
        System.out.println("Shape drawn");
    }
    void erase(){
        System.out.println("Shape erased");
    }
}

class circle extends shape{
    @Override
    void draw(){
        System.out.println("Circle shape drawn");
    }

    @Override
    void erase(){
        System.out.println("Circle shape erased");
    }
}

class triangle extends shape{
    @Override
    void draw(){
        System.out.println("Traingle shape drawn");
    }

    @Override
    void erase(){
        System.out.println("Triangle shape erased");
    }
}

class square extends shape{
    @Override
    void draw(){
        System.out.println("Sqaure shape drawn");
    }

    @Override
    void erase(){
        System.out.println("Square shape erased");
    }
}

public class Q3 {
    public static void main(String[] args) {
        circle c = new circle();
        triangle t = new triangle();
        square s = new square();

        System.out.println("******Circle methods:");
        c.draw();
        c.erase();

        System.out.println("******Triangle methods:");
        t.draw();
        t.erase();

        System.out.println("******Square methods:");
        s.draw();
        s.erase();

    }
}
