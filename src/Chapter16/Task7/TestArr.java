package Chapter16.Task7;

/*Exercise 7, page 759
// Repeat the previous exercise for a 3-D array.*/

public class TestArr {

  static void printArr(int size, int size2, int size3){

      BerylliumSphere[][][] arr = new BerylliumSphere[size][size2][size3];
      for (int i = 0; i<arr.length;i++) {
          for (int y = 0; y < arr[i].length; y++) {
              for (int j = 0; j < arr[i][y].length; j++) {
                  {
                      arr[i][y][j] = new BerylliumSphere();
                  }
              }
          }
      }
      for (int i = 0; i<arr.length;i++) {
          for (int y = 0; y<arr[i].length;y++) {
              for (int j = 0; j<arr[i][y].length;j++) {

                  System.out.println(arr[i][y].toString());
              }
          }
      }
  }

    public static void main(String[] args) {

        printArr(2,3,2);
    }

}
