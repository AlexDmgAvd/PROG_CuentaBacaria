public class AreaRectangulo {

    // Atributos ......................................................................................

    private double base;
    private double height;

    // Getter, Setter ......................................................................................

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    // Contructor ......................................................................................

    public AreaRectangulo(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Funciones ......................................................................................

    public double calculateArea(){
        return this.base * this.height;

    }

    public double calculatePerimetro(){
        return  (this.base + this.height) * 2;


    }



}
