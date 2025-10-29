 class Static {
    static int k=88;
    static class js{
        void show(){
            System.out.print("the number is"+k);
        }
    }
    public static void main(String args[]){
        Static.js obj =new Static.js();
        obj.show();
    }
}
