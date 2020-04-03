class ArrayEx1{
  public static void main(String[]args){
    int[] score =new int[5];
    int k=1;

    score[0]=50;
    score[1]=60;
    score[k+1]=70;
    score[3]=80;
    score[4]=90;

    int tmp = score[k+2]+score[4];

    for(int i=0;i<5;i++){
      System.out.printf("score[%d]:%d%n",i,score[i]);

    }
    System.out.printf("tmp:%d%n",tmp);
    System.out.printf("score[%d]:%d%n",7,score[7]);
  }
}

import java.util.*;

class ArrayEx2{
  public static void main(String[]args){
    int[] iArr1 = new int[10];
    int[] iArr2 = new int[10];
    int[] iArr3 = {100,95,80,70,60};
    char[] chArr={'a','b','c','d'}

    for(int i=0;i< iArr1.length;i++){
      iArr1[i] = i+1;
    }
    for(int i=o;i<iArr2.length;i++){
      iArr2[i]=(int)(Math.random()*10)+1;
    }
    for(inti=0;i<iArr1.length;i++){
      System.out.print(iArr1[i]+",");
    }
    System.out.println();
    System.out.println(Arrays.toSring(iArr2));
    System.out.println(Arrays.toSring(iArr3));
    System.out.println(Arrays.toSring(chArr));
    System.out.println(iArr3);
    System.out.println(chArr);
  }
}

class ArrayEx3{
  public static void main(String[]args){
    int[] arr=new int[5];

    for(int i=0;i<arr.length;i++){
      arr[i]=i+1;
    }
    System.out.println("[before]");
    System.out.println("arr.length:",arr.lenght);
    for(int i=0;i<arr.lenght;i++){
      System.out.println("arr["+i+"]:",arr[i]);
    }
    int[] tmp = new int[arr.length*2];

    for (int i=0;i<arr.length;i++){
      tmp[i]=arr[i];
    }
    arr=tmp;

    System.out.println("[after]");
    System.out.println("arr.length:",arr.length);
    for(int i=0;i<arr.length;i++){
      System.out.println("arr["+i+"];",arr[i]);
    }
  }
}

class ArrayEx4{
  public static void main(String[]args){
    char[] abc={'A','B','C','D'};
    char[] num={'0','1','2','3','4','5','6','7','8','9'};
    System.out.println(abc);
    System.out.println(num);

    char[] result=new char[abc.length+num.length];
    System.arraycopy(abc,0,result,0,abc.length);
    System.arraycopy(num,0,result,abc.length,num.length);
    System.out.println(result);

    System.arraycopy(abc,0,num,0,abc.length);
    System.out.println(num);

    System.arraycopy(abc,0,num,6,3);
    System.out.println(num);
  }
}

class ArrayEx5{
  public static void main(String[]args){
    int sum =0;
    float average =of;

    int[] score={100,88,100,100,90};

    for (int i=0;i<score.length;i++){
      sum+=score[i];
    }
    average=sum/(float)score.length;

    System.out.println("total:",sum);
    System.out.println("avg:",average);
  }
}

class ArrayEx6{
  public static void main(String[]args){
    int[] score={79,88,91,33,100,55,95};

    int max = score[0];
    int min = score[0];

    for(int i=1;i<score.length;i++){
      if(score[i]>max){
        max=score[i];
      }else if(score[i]<min){
        min=score[i];
      }
    }
    System.out.println("max:",max);
    System.out.println("min:",min);
  }
}

class ArrayEx7{
  public static void main(String[]args){
    int[] numArr = new int[10];

    for(int i=0;i<numArr.length;i++){
      numArr[i]=i;
      System.out.print(numArr[i]);
    }
    System.out.println();

    for(int i=0;i<100;i++){
      int n = (int)(Math.random()*10);
      int tmp=numArr[0];
      numArr[0]=numArr[n];
      numArr[n]=tmp;
    }
    for(int i=o;i<numArr.length;i++){
      System.out.print(numArr[i]);
    }
  }
}

class ArrayEx8{
  public static void main(String[] args) {
    int[] ball=new int[45];

    for(int i=0;i<ball.length;i++){
      ball[i]=i+1;
    }
    int temp = 0;
    int j=0;

    for(int i=0;i<6;i++){
      j=(int)(Math.random()*45);
      temp=ball[i];
      ball[i]=ball[j];
      ball[j]=temp;
    }
    for(int i=0;i<6;i++){
      System.out.printf("ball[%d]=%d%n",i,ball[i]);
    }
  }
}

import java.util.*;

class ArrayEx9{
  public static void main(String[]args){
    int[] code={-4,-1,3,6,11};
    int[] arr=new int[10];

    for (int i=0;i<arr.length;i++){
      int tmp=(int)(Math.random()*code.length);
      arr[i] = code[tmp;]
    }
    System.out.println(Arrays.toString(arr));
  }
}

class ArrayEx10{
  public static void main(String[] args) {
    int[] numArr=new int[10];

    for(int i=0;i<numArr.length;i++){
      System.out.print(numArr[i]=(int)(Math.random()*10));
    }
    System.out.println();

    for(int i=0;i<numArr.length-1;i++){
      boolean changed = false;

      for (int j=0;j<numArr.length-1-i;j++){
        if (numArr[j]>numArr[j+1]){
          int temp = numArr[j];
          numArr[j] = numArr[j+1];
          numArr[j+1] = temp;
          changed = true;
        }
      }
      if (!changed) break;

      for(int k=0;k<numArr.length;k++){
        System.out.print(numArr[k]);
      }
      System.out.println();
    }
  }
}

class ArrayEx11{
  public static void main(String[]args){
    int[] numArr=new int[10];
    int[] counter = new int[10];

    for(int i=0; i<numArr.length;i++){
      numArr[i]=(int)(Math.random()*10);
      System.out.print(numArr[i]);
    }
    System.out.println();

    for (int i=0; i<numArr.length;i++){
      counter[numArr[i]]++;
    }
    for (int i=0; i<numArr.length;i++){
      System.out.println("number of",i,":",counter[i]);
    }
  }
}
