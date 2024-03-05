package programacion;

public class Rectangle {
    private float length;
    private float width;
    public Rectangle(){
        this.length=1.0f;
        this.width=1.0f;
    }
    public Rectangle(float l, float w){
        length=l;
        width=w;
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
        return width*length;
    }
    public double getPerimeter(){
        return 2*width+2*length;
    }

    public String toString(){
        return "programacion.Rectangle[length="+length+",width="+width+"]";
    }
}

