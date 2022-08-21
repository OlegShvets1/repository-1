package Task_1;

public class RelaxTest {
    public  static  void main(String[] arg){
        Tv tv= new Tv("ICTV");
        Radio radio = new Radio("Song", "New York Times;");
        Relax relax= new Relax(tv, radio);
        relax.relax();
    }
}
