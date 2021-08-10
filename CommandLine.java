class CommmandLine{
    public static void main(String[] args){
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        if(args[2].equals("ADD")){
            System.out.println("ADDITION GIVES:"+(a+b));
        }
        else if(args[2].equals("SUBTRACTION")){
            System.out.println("SUBTRACTION GIVES:"+Math.abs(a-b));
        }
        else if(args[2].equals("MULTIPLY")){
            System.out.println("MULTIPLICATION GIVES:"+(a*b));
        }
        else if(args[2].equals("DIVIDE")){
            System.out.println("DIVISION GIVES:"+(a>b?a/b:b/a));
        }
        else{
            System.out.println("NOT VALID INPUT");
        }
    }
}