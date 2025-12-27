class Calci {
    int n1;
    int n2;
    int res;

    int add(){
        n1=10;
        n2=20;
        res= n1+n2;
        return res;
    }


}
class LaunchOOP {
    public static void main(String[] args) {
        Calci cl = new Calci();
        int r =cl.add();
        System.out.println(r);
    }
}
