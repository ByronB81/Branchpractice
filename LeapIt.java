import java.io.Console;

public class LeapIt {
  public static void main(String[] args) {
    Console console = System.console();
    System.out.println("What year were you born?");
    String yearStr = console.readLine();
    Integer yearBorn = Integer.parseInt(yearStr);
    Integer age = (2017 - yearBorn);
    Float ageFloat = (float)age;
    Float percentage =  ageFloat / 241 * 100;

    System.out.println();
    System.out.println("you are " + age + " years old and have lived through all of these Presidential elections");

    for (Integer year = yearBorn; year < 2017; year++){
      if (year % 4 == 0) {
        System.out.println();
        System.out.print(year + " ");
        if (year == 2016) {
          System.out.println("Trump");
        } else if (year == 2012 || year == 2008) {
          System.out.println("Obama");
        } else if (year == 2004 || year == 2000) {
          System.out.println("W. Bush");
        } else if (year == 1996 || year == 1992) {
          System.out.println("Clinton");
        } else if (year == 1988) {
          System.out.println("H. Bush");
        } else if (year == 1984 || year == 1980) {
          System.out.println("Reagan");
        } else if (year == 1976) {
          System.out.println("Carter");
        } else if (year == 1972 || year == 1968) {
          System.out.println("Nixon");
        } else if (year == 1964) {
          System.out.println("Johnson");
        } else if (year == 1960) {
          System.out.println("Kennedy");
        } else if (year == 1956 || year == 1952) {
          System.out.println("Eisenhower");
        } else if ( year == 1948) {
          System.out.println("Truman");
        } else if (year == 1944 || year == 1940 || year == 1936 || year == 1932) {
          System.out.println("F.D. Roosevelt");
        } else if (year == 1928) {
          System.out.println("Hoover");
        } else if (year == 1924) {
          System.out.println("Coolidge");
        } else if (year == 1920) {
          System.out.println("Harding");
        } else if (year == 1916 || year == 1912) {
          System.out.println("Wilson");
        } else if (year == 1908) {
          System.out.println("Taft");
        } else if (year == 1904) {
          System.out.println("T. Roosevelt");
        } else if (year == 1900 || year == 1896) {
          System.out.println("McKinley");
        } else if (year == 1892|| year == 1884) {
          System.out.println("Cleveland");
        } else if (year == 1888) {
          System.out.println("Harrison");
        } else if (year == 1880) {
          System.out.println("Garfield");
        } else if (year == 1876) {
          System.out.println("Hayes");
        } else if (year == 1872 || year == 1868) {
          System.out.println("Grant");
        } else if (year == 1864|| year == 1860) {
          System.out.println("Lincoln");
        } else if (year == 1856) {
          System.out.println("Buchanan");
        }else if (year == 1852) {
          System.out.println("Pierce");
        }else if (year == 1848) {
          System.out.println("Taylor");
        }else if (year == 1844) {
          System.out.println("Polk");
        }else if (year == 1840) {
          System.out.println("Harrison");
        }else if (year == 1836) {
          System.out.println("Van Buren");
        }else if (year == 1832 || year == 1828) {
          System.out.println("Jackson");
        }else if (year == 1824) {
          System.out.println("J.Q. Adams");
        }else if (year == 1820 || year == 1816) {
          System.out.println("Monroe");
        }else if (year == 1812 || year == 1808) {
          System.out.println("Madison");
        }else if (year == 1804 || year == 1800) {
          System.out.println("Jefferson");
        }else if (year == 1796) {
          System.out.println("Adams");
        }else if (year == 1792) {
          System.out.println("Washinton");
        }else {
          System.out.println("Not an election year but a leap year");
        }
      }
      if (year == 1789) {
        System.out.println();
        System.out.println( year + " Washington started on an odd year");
      }
    }
    System.out.println();
    System.out.println("You have lived for " + percentage + "% of US history");
  }
}
