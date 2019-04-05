package program;

public class Model {
    private String info="This is a desktop application that will empirically validate Fitts' Law. Click on the icon...";
    private Double xPos, yPos, widtth;

    public String getInfo(){
        return info;
    }

    public void setX(Double xPos){
        this.xPos=xPos;
    }

    public void setY(Double yPos){
        this.yPos=yPos;
    }

    public void setWidtth(Double width){
        this.widtth=width;
    }

}
