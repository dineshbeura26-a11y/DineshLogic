public class outside{
    static int w=23;
    void main(){
        System.out.print(w);
    }
    public static void main(String args[]){
        outside.obj=new outside();
        obj.w();
    }
}