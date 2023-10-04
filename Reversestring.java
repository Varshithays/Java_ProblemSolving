class Reversestring{
    public static void main(String[] args) {
        String in="malayalam";
        StringBuilder inp=new StringBuilder();
        inp.append(in);
        inp.reverse();
         System.out.println(inp);
        if(in.equals(inp.toString())){
            System.out.println("Palindrom");
        }else{
            System.out.println("NOT Palindrom");
        }
       
    }
}