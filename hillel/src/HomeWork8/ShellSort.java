package HomeWork8;

/**
 * Created by igor on 20.10.15.
 */
public class ShellSort extends InsertSort {

    public ShellSort() {
    }

    public ShellSort(int[] arr) {
        super(arr);
    }

    public void putArrayToSort(int[] arr) {
        super.putArrayToSort(arr);
    }

    public void shellSort() {
        int h = 1;
        while (h <= getArr().length / 3) {
            h = h * 3 + 1;
        }
        while (h > 0) {
            sort(h);        // решил занаследовать метод инсерта, ибо инсерт вообще используется в шелле,
                            // но я не уверен, что это хорошее решение, ибо усложняется чтение кода
            h = (h - 1) / 3;
        }
    }
}
