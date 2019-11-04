public class Rectangle
{
    //DECLARAR AS VARIAVEIS
    private float length = 1.0f;
    private float width = 3.0f;

    //METODOS
    //CONSTRUTOR
    public Rectangle(float length)
    {
        this.length = length;
    }

    public Rectangle(float length, float width)
    {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea(){
        return length * width;
    }

    public double getPerimeter(){
        return 2*length+2*width;
}

    @Override
    public String toString(){
        return String.format ("Rectangle: Area: %.2f, Perimeter: %.2f",
                getArea(), getPerimeter());
    }
}
