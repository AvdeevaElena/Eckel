package Chapter10.Task21;

public class B {
    U [] arr = new U [7];

    public void setRefU(U u, int place) {
        arr [place] = u;
    }
    public void deleteRefU(int place) {
        arr [place] = null;
    }

    public void running() {
        for (int i = 0; i< arr.length; i ++) {
            arr[i].method1();
            arr[i].method2();
            arr[i].method3();
        }
    }


}
