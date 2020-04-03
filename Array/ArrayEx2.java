class ArrayEx12{
  public static void main(String[]args){
    String[] names={"Kim","Park","Yi"};

    for(int i=0;i<names.length;i++){
      System.out.println("names["+i+"]:"+names[i]);
    }
    String tmp = names[2];
    System.out.println("tmp:",tmp);
    names[0]="Yu";

    for(String str:names){
      System.out.println(str);
    }
  } //main
}

class ArrayEx13{
  public static void main(String[]args){
    char[] hex={'C','A','F','E'};

    String[] binary={"0000","0001","0010","0011"
                    ,"0100","0101","0110","0111"
                    ,"1000","1001","1010","1011"
                    ,"1100","1101","1110","1111"};
    String result="";

    for (int i=0; i<hex.length;i++){
      if(hex[i] >='0' && hex[i] <='9'){
        result +=binary[hex[i]-'0'];
      }else{
        result +=binary[hex[i]-'A'+10];
      }
    }
    System.out.println("hex:",new String(hex));
    System.out.println("binary:",result);
  }
}

class ArrayEx14{
  public static void main(String[]args){
    String src="ABCDE";

    for(int i=0;i<src.length();i++){
      char ch=src.charAt(i);
      System.out.println("src.charAt("+i+"):",ch);

      char[] chArr = src.toCharArray();

      System.out.println(chArr);
    }
  } //main
}

class ArrayEx17{
  public static void main(String[]args){
    if(args.length !=3){
      System.out.println("usage: java ArrayEx17 NUM1 OP NUM2");
      System.exit(0);
    }

    int num1 = Integer.parseInt(args[0]);
    char op = args[1].charAt(0);
    int num2 = Integer.parseInt(args[2]);
    int result = 0;

    switch(op){
      case '+':
      result = num1+num2;
      break;

      case '-':
      result = num1-num2;
      break;

      case '*':
      result = num1*num2;
      break;

      case '/';
      result = num1/num2;
      break;

      default:
        System.out.println("can not execute");
    }
    System.out.println("recult : ",result);
  }
}
