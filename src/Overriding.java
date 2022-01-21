public class Overriding {

    public static void main(String[] args) {

		/*SuperClass superCls= new SuperClass();
		superCls.method1(1);

		SubClass1 sub1= new SubClass1();
		sub1.method1(1);

		SubClass2 sub2= new SubClass2();
		sub2.method1(1);*/

		SuperClass sub2_1 =new SubClass2();
		sub2_1.method2(23);

		SubClass1 trial =new SubClass3();
		trial.method1(8);

		/*SubClass1 sub2_2=new SubClass2();
		sub2_2.method1(1);

       SuperClass sub2_3 =new SubClass1();
        System.out.println(sub2_3.toString());
        //sub2_3.

        SubClass1 sub =new SubClass1();
        sub.method2(2);

		SuperClass sup=new SuperClass();
		sup.method2(12);*/


    }

}
