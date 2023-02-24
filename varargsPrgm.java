class varargsPrgm
{
          public static void main(String args[])	
          {
              addition (23,12,11,15,78,33,56,90);

          }
          
          public static void addition (int...a)
          {
              int sum=0;
              for (int i:a)
              {
                       sum+=i;
              }
              System.out.println(sum);
          }

}
             