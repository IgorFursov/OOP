import myfirstpackage.MyFirstPackage;

class MyFirstClass {
    public static void main(String[] s) {
        MyFirstPackage o = new MyFirstPackage(5, 3);
        System.out.println(o.add());
        
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 8; j++) {
                o.setA(i);
                o.setB(j);
                System.out.print(o.add());
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}