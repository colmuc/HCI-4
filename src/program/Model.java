package program;

import java.util.HashMap;

public class Model {
    private String info="This is a desktop application that will empirically validate Fitts' Law. Click on the icon...";
    private Double xPos, yPos, width, index;
    private HashMap<String, Double> list = new HashMap<>();
    private Boolean isCircle, isRectangle =true, isElipse;
    private Integer count=0;
    private String message = "You've clicked 10 times. Close and Start Over";

    public String getMessage(){
        return message;
    }

    public Integer getCount(){
        return count;
    }

    public void incrementCount(){
        count++;
    }

    public Boolean isShape(){
        return true;
    }

    public String getInfo(){
        return info;
    }

    public void setX(Double position){

        this.xPos=position;
    }

    public void setY(Double position){
        this.yPos=position;
    }

    public void setWidth(Double newWidth){
        this.width=newWidth;
    }

     public double calcIndexOfDifficulty(){

        return index;
     }

}
