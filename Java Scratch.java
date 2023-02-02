class Java_Scratch {
  
    public static void main(String[] args) {
    System.out.println("Hello world!");
    System.out.println("Hello");
    
      int age = 25;
      System.out.println("I am " + age + " years old");      

      char percentSymbol = '%';
      System.out.println("This is percent symbol " + percentSymbol);

      String lul = "kek";
      System.out.println(lul + " bur");
      
      double number1 = 20;
      double number2 = 40;
      System.out.println(number1 * number2);
      System.out.println(number1 + number2);
      System.out.println(number1 - number2);
      System.out.println(number1 / number2);

      int number3 = 93;
      double number4 = number3;
      System.out.println(number4);   
      
      number3 = number3 + 20;
      System.out.println(number3);
      
      number3 += 20;
      System.out.println(number3);
      
      int number5 = 10;
      int number6 = 20; 
      int number7 = 50;
      int number8 = 50;
      
      // is equal
      System.out.println(number5==number6); 
      System.out.println(number7==number8);
      // is not equal
      System.out.println(number7!=number5);
      // is greater than
      System.out.println(number7>number6);
      // is less than
      System.out.println(number6<number5);
      // is greater than or equal to
      System.out.println(number8>=number7);
      // is less than or equal to
      System.out.println(number5<=number6);

      System.out.println(("####"));
      age = 25;
      // age >=18
      // age <=40
      System.out.println(age >= 18 && age <=40);
      age = 45;
      System.out.println(age >= 18 && age <=40);
     
      System.out.println(("###"));

      boolean isStudent = false;
      boolean isLibraryMember = true;
      System.out.println(isStudent || isLibraryMember);
      System.out.println(!isStudent);

      System.out.println(("###"));

      int score = 0;
      int turns = 10;

      score++;
      turns--;

      System.out.println("pontuação " + score);
      System.out.println("turnos " + turns);

      int number = 55;
      System.out.println(--number);

      System.out.println(("###"));

      String name = "Rafael Saibro ";
      System.out.println(name);








      






      // # interger types
      // byte aSyngleByte = 100; | -128 to 127
      // short aSmallNumber = 20000; | -32,768 to 32,767
      // int anInteger = 2147483647; | -2147483648 to 2147483647
      // long aLargeNumber = 9223372036854775807L; | -9223372036854775808 to 922337203685477580
      
      // # decimal types
      // double aDouble = 1.79769313; | 99.9E-342 to 1.7976931348623157E308
      // float aFloat = 3.4028F;| 1.4E-55 to 3.4028235E38

      // # booleans
      // boolean isWeekend = false;
      // boolean isWorkday = true;

      // # characters
      // char copyryghtSymbol = '\u00A9'


    }
}

