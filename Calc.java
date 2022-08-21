import java.util.Scanner;

public class Calc {
  public static void main (String [] args)
  {
    System.out.println("Calculator (1-10 , +-*/ , 0 for exit)");
    Scanner in = new Scanner(System.in);
    String data = "";
    int a, b, op;
    int i;

    do
    {
      System.out.println("\nCalculate:");
      data = in.nextLine();
      data = data.replaceAll("\\s", "");

      a = 0;
      b = 0;
      op = 0;  // 1 - plus, 2 - minus, 3 - multiply, 4 - division

      i = 0;

      if (data.compareTo("0") == 0)
      {
        System.out.println("Bye!");
        continue;
      }

      if ((data.length() > 5) | (data.length() < 3))
      {
        System.out.println("Input error!");
        continue;
      }

      switch (data.charAt(i))
      {
        case '1':
          a = 1;
          break;

        case '2':
          a = 2;
          break;

        case '3':
          a = 3;
          break;

        case '4':
          a = 4;
          break;

        case '5':
          a = 5;
          break;

        case '6':
          a = 6;
          break;

        case '7':
          a = 7;
          break;

        case '8':
          a = 8;
          break;

        case '9':
          a = 9;
          break;

        default:
          System.out.println("Input error!");
          continue;
      }

      i++;

      if (data.charAt(i) == '0')
        if (data.charAt(i-1) == '1')
        {
          a = 10;
          i++;
        }
        else
        {
          System.out.println("Input error!");
          continue;
        }

      switch (data.charAt(i))
      {
        case '+':
          op = 1;
          break;

        case '-':
          op = 2;
          break;

        case '*':
          op = 3;
          break;

        case '/':
          op = 4;
          break;

        default:
          System.out.println("Input error!");
          continue;
      }

      i++;

      switch (data.charAt(i))
      {
        case '1':
          b = 1;
          break;

        case '2':
          b = 2;
          break;

        case '3':
          b = 3;
          break;

        case '4':
          b = 4;
          break;

        case '5':
          b = 5;
          break;

        case '6':
          b = 6;
          break;

        case '7':
          b = 7;
          break;

        case '8':
          b = 8;
          break;

        case '9':
          b = 9;
          break;

        default:
          System.out.println("Input error!");
          continue;
      }

      i++;

      if ((a == 10) & (data.length() == 5))
        if (data.charAt(i) == '0')
          if (data.charAt(i-1) == '1')
            b = 10;
          else
          {
            System.out.println("Input error!");
            continue;
          }
        else
        {
          System.out.println("Input error!");
          continue;
        }

      if ((a != 10) & (data.length() == 4))
        if (data.charAt(i) == '0')
          if (data.charAt(i-1) == '1')
            b = 10;
          else
          {
            System.out.println("Input error!");
            continue;
          }
        else
        {
          System.out.println("Input error!");
          continue;
        }

      switch (op)
      {
        case 1:
          System.out.println("Answer: " + (a+b));
          break;

        case 2:
          System.out.println("Answer: " + (a-b));
          break;

        case 3:
          System.out.println("Answer: " + (a*b));
          break;

        case 4:
          System.out.println("Answer: " + (a/b));
          break;

        default:
          System.out.println("Input error!");
          break;
      }
    } while (data.compareTo("0") != 0);
  }
}
