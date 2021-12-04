package com.NBA.JAVA;

public class TestDoubleFor {
    public static void main(String[] args) {

//        // 九九乘法表
//        for (int i= 1;i<10;i++){
//            for (int j =1;j <=i;j++){
//                System.out.print(i+"*"+j+"="+i*j+"\t");
//            }
//            System.out.println();
//        }
//        System.out.println();

/*
*	#	*	#	*
#	*	#	*	#
*	#	*	#	*
#	*	#	*	#
*	#	*	#	*
 */
        for (int i =1; i<=5;i++){
            for (int j =1;j<=5;j++){
                if ((i+j)%2==0){
                    System.out.print("*"+"\t");
                }else {
                    System.out.print("#"+"\t");
                }
            }
            System.out.println();
        }
    }
}
