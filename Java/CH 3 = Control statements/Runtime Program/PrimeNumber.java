class PrimeNumber
 {

 public static void main(String[] args)
 {

  int primeCheckNumber;
  int n = 1;
  int divisibleCount;

  do
  {
   divisibleCount = 0;
   primeCheckNumber = 2;
   do
     {
    if (n % primeCheckNumber == 0) 
     {
     divisibleCount++;
     break;
     }
    primeCheckNumber++;
     }while (primeCheckNumber <= n / 2);

   if (divisibleCount == 0 && n != 1) 
   {
    System.out.print(n + " ");
   }
   n++;
  }while (n <= 50); 

 }
}
