
public class Circle
{
    //DECLLARAÇÃO DE VARIAVEIS
    private double radius =  1.0f;

    //DECLARA SE E PUBLICO OU PRIVADO, O TIPO DA VARIAVEL STRING/INT/DOUBLE... E O VALOR QUE ASSUME
    private String color = "red";

    //METODOS
    //CONSTRUTOR POIS TEM O MESMO NOME DA CLASSE COM QUE ESTOU A TRABALHAR
        public Circle(double radius)
        {
            this.radius = radius;
        }

        public Circle (double radius, String color)
        {
            this.radius = radius;
            this.color = color;
        }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public double getArea()
    {
        return Math.PI * radius * radius;
    }

    @Override

    public String toString()
    {
        return String.format ("Circle: raio: %.2f, cor: %s, area: %.2f",
                radius, color, getArea());
    }
}
