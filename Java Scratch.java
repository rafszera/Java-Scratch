import java.util.Scanner;

import javax.sound.midi.MidiChannel;

import java.util.ArrayList;

import java.util.Comparator;

import java.util.Arrays;
class Java_Scratch {
  
    public static void main(String[] args) {
    //System.out.println("Hello world!");
    //System.out.println("Hello");
    
      //int age = 25;
      //System.out.println("I am " + age + " years old");      

      //char percentSymbol = '%';
      //System.out.println("This is percent symbol " + percentSymbol);

      //String lul = "kek";
      //System.out.println(lul + " bur");
      
      //double number1 = 20;
      //double number2 = 40;
      //System.out.println(number1 * number2);
      //System.out.println(number1 + number2);
      //System.out.println(number1 - number2);
      //System.out.println(number1 / number2);

      //int number3 = 93;
      //double number4 = number3;
      //System.out.println(number4);   
      
      //number3 = number3 + 20;
      //System.out.println(number3);
      
      //number3 += 20;
      //System.out.println(number3);
      
      //int number5 = 10;
      //int number6 = 20; 
      //int number7 = 50;
      //int number8 = 50;
      
      // is equal
      //System.out.println(number5==number6); 
      //System.out.println(number7==number8);
      // is not equal
      //System.out.println(number7!=number5);
      // is greater than
      //System.out.println(number7>number6);
      // is less than
      //System.out.println(number6<number5);
      // is greater than or equal to
      //System.out.println(number8>=number7);
      // is less than or equal to
      //System.out.println(number5<=number6);

      //System.out.println(("####"));
      //age = 25;
      // age >=18
      // age <=40
      //System.out.println(age >= 18 && age <=40);
      //age = 45;
      //System.out.println(age >= 18 && age <=40);
     
      //System.out.println(("###"));

      //boolean isStudent = false;
      //boolean isLibraryMember = true;
      //System.out.println(isStudent || isLibraryMember);
      //System.out.println(!isStudent);

      //System.out.println(("###"));

      // int score = 0;
      // int turns = 10;

      // score++;
      // turns--;

      // System.out.println("pontuação " + score);
      // System.out.println("turnos " + turns);

      //int number = 55;
      //System.out.println(--number);

      //System.out.println(("###"));

      //String FullName = "Rafael Saibro ";
      //System.out.println(FullName);


      //String literalString1 = "ABC";
      //String literalString2 = "ABC";

      // String objectString1 = new String("xyz");
      // String objectString2 = new String("xyz");

      // System.out.println(literalString1 == literalString2);
      // System.out.println(objectString1 == objectString2);

      // System.out.println(("###"));

      // System.out.println("HELLO! I am Rafael. I am from Brazil and I am 25 years old.");

      //String name = "Rafael"; 
      //String country = "Brazil";
      //age = 25;
      
      //System.out.println("Hello! I am " + name + ". I am from " + country + " and I am " + age + " years old. ");

      //String formattedString = String.format("hello! I am %s. I am from %s and I am %d years old.", name, country, age);
      //System.out.println(formattedString);
      //System.out.println("Tem " + name.length() + " letras no meu nome");
      //name = "";
      //System.out.println(name.isEmpty());
      //name = "Rafa";
      //System.out.println(name.toUpperCase());
      //System.out.println(name.toLowerCase());
      
      // String string1 = new String("qwerty");
      // String string2 = new String("QWERTY");
      // System.out.println(string1 == string2);
      // System.out.println(string1.equals(string2));
      // System.out.println(string1.equalsIgnoreCase(string2));
      
      // String ceu = "The sky is blue.";
      // System.out.println(ceu.replace("blue", "red"));
      // System.out.println(ceu);
      // String updatedCeu = ceu.replace("blue", "red");
      // System.out.println(updatedCeu);

      // System.out.println(ceu.contains("sky"));


      // Scanner scanner = new Scanner(System.in);
      
      // System.out.print("Enter the first number: ");
      // double number1 = scanner.nextDouble();
      // scanner.nextLine();

      // System.out.print("Enter the second number: ");
      // double number2 = scanner.nextDouble();
      // scanner.nextLine();

      // System.out.print("What operation do you want to perform? ");
      // String operation = scanner.nextLine();

      // switch (operation) {
      //   case "div":
      //   if(number2 == 0) {
      //     System.out.println("Can not divide by zero.");  
      //     } else {
      //       System.out.printf("%f / %f = %f", number1,number2, number1 / number2);       
      //     }
      //    break;
      //   case "sum":
      //    System.out.printf("%f + %f = %f", number1,number2, number1 + number2);
      //    break;
      //   case "sub": 
      //    System.out.printf("%f - %f = %f", number1,number2, number1 - number2);
      //    break;
      //   case "mult": 
      //    System.out.printf("%f * %f = %f", number1,number2, number1 * number2);
      //    break;
      //   default:
      //    System.out.printf("%s is not a supported operation.", operation);  
      // }





      // if (operation.equals("sum")) {
      //   System.out.printf("%f + %f = %f", number1,number2, number1 + number2);
      // } else if (operation.equals("sub")) { 
      //   System.out.printf("%f - %f = %f", number1,number2, number1 - number2);
      // } else if (operation.equals("mult")) {
      //   System.out.printf("%f * %f = %f", number1,number2, number1 * number2);
      // } else if (operation.equals("div")) {
      //   if (number2 == 0) {
      //   System.out.println("Can not divide by zero.");  
      //   } else {
      //     System.out.printf("%f / %f = %f", number1,number2, number1 / number2);       
      //   }
      // } else {
      //   System.out.printf("%s is not a supported operation.", operation);
      // }

      

      // System.out.printf("Whats is your name? ");
      // String name = scanner.nextLine();
      // System.out.printf("Hello %s, How old are you? ", name);
      // int age = Integer.parseInt(scanner.nextLine());      
      // //cleans up the input buf
      // //scanner.nextLine()                   
      // System.out.printf("%d is an excellent age to start programming. What language do you prefer? ", age);
      // String language = scanner.nextLine();      
      // System.out.printf("%s is a very nice popular programming language.", language);
      // scanner.close();



      // char vowels[] = new char [5];
      // int numbers[] = {1, 2, 3, 4, 5};

      // int startingIndex = 0;
      // int endingIndex = 10;

      // int copy0fNumbers[] = Arrays.copyOfRange(numbers, startingIndex, endingIndex);


 
      // int copy0fNumbers[] = Arrays.copyOf(numbers, numbers.length);
 
      // Arrays.fill(numbers, 0);
      
      // vowels [0] = 'a';
      // vowels [1] = 'e';
      // vowels [2] = 'i';
      // vowels [3] = 'o';
      // vowels [4] = 'u';
      // System.out.println(Arrays.toString(vowels));
      //  char vowels[] = {'e', 'u', 'a', 'o', 'i'}; 
      //  int startingIndex = 1;
      //  int endingIndex = 4;
      //  Arrays.fill(vowels, startingIndex, endingIndex, 'x');
      // Arrays.sort(vowels);
      // Arrays.sort(vowels, startingIndex, endingIndex);
      // int startingIndex = 1;
      // int endingIndex = 4;
      // char key = 'a';
      // int foundItemIndex = Arrays.binarySearch(vowels, startingIndex, endingIndex, key);
      // Arrays.binarySearch(vowels, key);
      // vowels[2] = 'x';
      // System.out.println("The Array length is " + vowels.length);
      // System.out.println(Arrays.toString(vowels));
      // System.out.println("This array is " + foundItemIndex);  
      // System.out.println(Arrays.toString(numbers));    // System.out.println(numbers == copy0fNumbers);
      // System.out.println(Arrays.equals(numbers, copy0fNumbers));

      // System.out.println(Arrays.toString(copy0fNumbers));
      
      



      // int numbers[] = {1, 2, 3, 4, 5};

      // int sum = 0;

      // for(int number : numbers ) {
      //   sum += number;
      // }
      // System.out.println(sum);


      // System.out.println("Numeros Impar");
      // for (int number = 1; number <= 50; number++) {
      //   if (number % 2 == 1) {
      //     System.out.println(number);
      //   }
      // }

      // for(int number = 1; number <= 10; number++) {
      //   for (int multiplier = 1; multiplier <= 10; multiplier++) {
      //     System.out.printf("%d X %d = %d \n", number, multiplier, number * multiplier);
      //   }
      // }

      // int number = 5;

      // for (int multiplier = 1; multiplier < 11; multiplier++ ) {
      //   System.out.printf("%d X %d = %d \n", number, multiplier, number * multiplier);
      // }
      

      // int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

      // int sum = 0; 

      // for (int index = 0; index < numbers.length; index++) {
      //   sum += numbers[index];
      // }
      // System.out.println(sum);

      // for (int index = 0; index < numbers.length; index++) {
      //   System.out.println(numbers[index]);
      // }

      // for (int number = 1; number <=10; number++) {
      //   System.out.println(number);
      // }
  

      // ### WHILE DO LOOPS ###

      // int number = 10;
      // int multiplier = 0;

      // do {
      //   System.out.printf("%d X %d = %d \n", number, multiplier, number * multiplier);

      //   multiplier++;
      // } while(multiplier <= 10);

      // while(multiplier <=10) {
      //   System.out.printf("%d X %d = %d \n", number, multiplier, number * multiplier);

      //   multiplier++;
      // }

      ArrayList<Integer> numbers = new ArrayList<Integer>();

      numbers.add(5); // 0
      numbers.add(3); // 1
      numbers.add(1); // 2
      numbers.add(4); // 3
      numbers.add(2); // 4

      // numbers.sort(Comparator.naturalOrder());

      System.out.println("before " + numbers.toString());

      numbers.forEach(number ->{
        numbers.set(numbers.indexOf(number), number * 2);
        // System.out.println(number * 2);
      });

      System.out.println("after " + numbers.toString());

      
      
      // numbers.sort(Comparator.reverseOrder());  
      // numbers.sort(Comparator.naturalOrder());


      // numbers.set(2, Integer.valueOf(30));
      // numbers.clear();
      // numbers.remove(Integer.valueOf(4));

      // System.out.println(numbers.toString());
      // System.out.println(numbers.get(2));
      // System.out.println(numbers.size());
      // System.out.println(numbers.contains(Integer.valueOf(10)));
      // System.out.println(numbers.isEmpty());



  





      
  
  
  

















      

      




      

    


  














      






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

      // Format Specifiers
      // %c - Character.
      // %d - Decimal number (base 10)
      // %e - Exponential floating-point number.
      // %f - Floating-point number.
      // %i - Integer (base 10)
      // %o - Octal number (base 8)
      // %s - String.
      // %u - Unsigned decimal (integer) number.

      // GitHub to go
      // git init
      // git status
      // git add .
      // git status
      // git commit -m " ""

  


    }
}

