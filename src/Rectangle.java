public class Rectangle {
     float length = 1.0f;
     float width = 1.0f;
    public Rectangle(){}
    public Rectangle(float length,float width){
        this.length = length;
        this.width = width;
    }
    float getLength(){
        return this.length;
    }
    void setLength(float length){
        this.length = length;
    }
    float getWidth(){
        return this.width;
    }
    void setWidth(float width){
        this.width = width;
    }
    double getArea(){
        return this.length * this.width;
    }
    double getPerimeter(){
        return (this.length + this.width) * 2;
    }
    public String toString(){
        return "Retangle["+"length = " + this.length +" ," + " width = " + this.width+"]";
    }

}
