public class squarecube extends calculator{
     
    int num1,num2;
    void square(int num3){

        int sq= num3*num3;
        System.out.println("The square of two numbers:"+sq);
        }

    void cube(int num4){

         int cub=num4*num4*num4;
        System.out.println("The cube of the numbers is"+cub);
    }
      public  static void main(String []args){
         squarecube s= new squarecube();

         s.add();
         s.sub();
         s.mul();
         s.div();
         s.square(3);
         s.cube(5);
      }
}



