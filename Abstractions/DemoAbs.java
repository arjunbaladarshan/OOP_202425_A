abstract class GambhavaSir{
    abstract public void setPaper();
    abstract public void bookResource();
    public int evaluate(){
        return 1;
    }
}
abstract class ArjunSir extends GambhavaSir{
    public void setPaper(){
        //code
    }
}

class XyzSir extends ArjunSir{
    public void bookResource(){

    }
}
public class DemoAbs{
    public static void main(String[] args){
        ArjunSir obj = new XyzSir();
    }

}