class Test5 {
public static void main(String[] args)
    {
        // mendeklarasikan arr dengan type data int yang memiliki nilai awal berupa array dengan elemen - elemen 1,2,3
        int arr[] = { 1, 2, 3 };

        // dengan menggunakan for-each, setiap elemen array disimpan pada varibael i 
        // dengan type data int dan kata kunci final sehingga nilai i pada block for tidak dapat dirubah.
        for (final int i : arr)
            // menampilkan nilai i 
            // 1 2 3
            System.out.print(i + " ");
    }
}

/*
 * Output:
 * 1 2 3
 */
