
package maincal;

public class Calculadora {
    private int num1;

    
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

   
    int fibonacci(){
        int fibo1=1;
        int fibo2=1; 

        System.out.print(fibo1 + " ");
        for(int i=2;i<=num1;i++){
             System.out.print(fibo2 + " ");
             fibo2 = fibo1 + fibo2;
             fibo1 = fibo2 - fibo1;
        }
        return fibo1;
    }
    int factorial()
    {
        int x=1;
        int factorialRes=0;
        for(int e=1; e<=num1; e++)
        {
            x *= e;
        }
        factorialRes=x;    
        return factorialRes;
    }
}
