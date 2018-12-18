package ua.org.oa.kraspu;

public class Main {

/*
    Создать java класс, содержащий несколько методов демонстрирующих возникновение следующих исключений/ошибок:
  a. ArrayIndexOutOfBoundsException
  b. IllegalArgumentException
  c. ClassCastException
  d. StringIndexOutOfBoundException
  e. NullPointerException (3 различных способа)
  f. StackOverflowError
  g. NumberFormatException
  e. OutOfMemoryError
          1. На этапе составления программы должны быть использованы соглашения из java code convention.
          2. Протестировать предложенное решение, продемонстрировать корректность решения задачи каждым способом.
          3. Имя пакета в котором создается класс/классы должно иметь формат ua.org.oa.<Jira Login>.
*/

  public static void main(String[] args) {

//     a();             //ArrayIndexOutOfBoundsException
//     b();             //IllegalArgumentException
//     c();             //ClassCastException
//     d("StringIndexOutOfBoundException");     //StringIndexOutOfBoundException
//     e1();            //NullPointerException
//     e2();            //NullPointerException
//     e3();            //NullPointerException
//     f();             //StackOverflowError
//     g();             //NumberFormatException
    h();             //OutOfMemoryError
  }

  public static void a() {
    int[] array = new int[10];
    try {
      System.out.println(array[10]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("ArrayIndexOutOfBoundsException");
    }
  }

  public static void b() {
    User user = new User(null);
    try {
      user.getUserName();
    } catch (IllegalArgumentException e) {
      System.out.println("IllegalArgumentException");
    }
  }

  public static void c() {
    try {
      Object i = Integer.valueOf(42);
      String s = (String) i;
    } catch (ClassCastException e) {
      System.out.println("ClassCastException");
    }
  }

  public static void d(String s) {
    try {
      System.out.println(s.charAt(s.length()));
    } catch (StringIndexOutOfBoundsException e) {
      System.out.println("StringIndexOutOfBoundsException");
    }
  }

  public static void e1() {
    String str = null;
    try {
      System.out.println(str.length());
    } catch (NullPointerException e) {
      System.out.println("NullPointerException");
    }
  }

  public static void e2() {
    String[] arr = new String[2];
    try {
      arr[0].length();
    } catch (NullPointerException e) {
      System.out.println("NullPointerException");
    }
  }

  public static void e3() {
    User user = null;
    try {
      user.getUserName();
    } catch (NullPointerException e) {
      System.out.println("NullPointerException");
    }
  }

  public static void f() {
    try {
      f();
    } catch (StackOverflowError e) {
      System.out.println("StackOverflowError");
    }
  }

  public static void g() {
    String str = "hello";
    try {
      System.out.println(Integer.valueOf(str));
    } catch (NumberFormatException e) {
      System.out.println("NumberFormatException");
    }
  }

  public static void h() {       // wait for 10 seconds
    try {
      Integer inter[] = new Integer[999999999];

      while (true)
        for (int i = 0; i < inter.length; i++) {
          inter[i] = 999999999;
        }
    } catch (OutOfMemoryError e) {
      System.out.println("OutOfMemoryError");
    }
  }


}
