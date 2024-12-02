class TestNow{
    int x= 96;
    static int y=90;

}
public class WowStaticWay{
    public static void main(String args[]){
        TestNow t1=new TestNow();
        TestNow t2=new TestNow();
        t1.x=77;
        TestNow.y=40;
        System.out.println(t1.x);
        System.out.println(TestNow.y);
        System.out.println(t2.x);
        System.out.println(TestNow.y);
    }
}