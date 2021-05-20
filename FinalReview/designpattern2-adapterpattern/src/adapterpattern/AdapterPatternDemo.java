package adapterpattern;

import java.util.Scanner;

import adapter.DocumentReader;
import adapter.IDocumentReader;

public class AdapterPatternDemo {
   private static Scanner scanner;

   public AdapterPatternDemo() {
      scanner = new Scanner(System.in);
   }

   public static void main(String[] args) {
      AdapterPatternDemo demo = new AdapterPatternDemo();
      IDocumentReader docReader = new DocumentReader();

      while (true) {
         showMenuOptions();

         switch (demo.getOption()) {
         case 1:
            System.out.println("[DBG] Executing ...");
            docReader.read("mypdf.pdf");
            break;
         case 2:
            System.out.println("[DBG] Executing ...");
            docReader.read("mymsword.docx");
            break;
         case 3:
            System.out.println("[DBG] Executing ...");
            docReader.read("mypowerpointslides.pptx");
            break;
         default:
            break;
         }
      }
   }

   int getOption() {
      int input = scanner.nextInt();
      if (input < 0 || input > 4) {
         System.out.println("You have entered an invalid selection, please try again\n");
      } else if (input == 4) {
         System.out.println("You have quit the program\n");
         System.exit(1);
      } else {
         System.out.println("You have entered " + input + "\n");
         return input;
      }
      return 0;
   }

   static void showMenuOptions() {
      System.out.println("=============================================");
      System.out.println("Simple Adapter Pattern Example Program");
      System.out.println("=============================================");
      System.out.println("\tMenu Options:");
      System.out.println("\t1. Read PDF");
      System.out.println("\t2. Read MS Word");
      System.out.println("\t3. Read MS PPT");
      System.out.println("\t4. Exit the program");
      System.out.println("=============================================");
      System.out.print("Please select an option:");
   }
}