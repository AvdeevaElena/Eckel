package Chapter16.Task6;

/*Exercise 6
/* Write a method that takes two int arguments, indicating the two sizes of
* a 2-D array. The method should create and fill a 2-D array of BerylliumSphere
* according to the size arguments.*/

public class TestArr {

  static void printArr(int size, int size2){

      BerylliumSphere [][] arr = new BerylliumSphere[size][size2];
      for (int i = 0; i<arr.length;i++) {
          for (int y = 0; y<arr[i].length;y++){

              arr[i][y] = new BerylliumSphere();
          }
      }
      for (int i = 0; i<arr.length;i++) {
          for (int y = 0; y<arr[i].length;y++) {
              System.out.println(arr[i][y].toString());
          }
      }
  }

    public static void main(String[] args) {

        printArr(2,3);
    }

}
