public class Test {
    public static void main(String[] args) {
        // membuat object dari kelas Test, kemudian disimpan dengan nama obj
        Test obj = new Test();
        // memanggil object start()
        obj.start();
    }
    public void start() {
        // mendeklarasikan dan menginisiasi variabel stra dengan nilai awal do yang bertipe data string
        String stra = "do";
        // memanggil object method dengan parameter stra sehingga nantinya object method memiliki argumen do
        // object method disimpan dalam variabel strb
        String strb = method(stra);
        // menampilkan "dogood" lebih dulu karena telah memanggil object method 
        // dilanjutkan dengan string ": " concat nilai variabel stra "do" concat nilai variabel strb " good"
        // dogood: do good
        System.out.print(": "+stra + strb);
    }
    public String method(String stra) {
        // menerima parameter do, do concat good 
        // variabel stra berisi dogood
        stra = stra + "good";
        // menampilkan dogood
        System.out.print(stra);
        // method mengembalikan " good"
        return " good";
    }
}

/*
 * Output:
 * dogood: do good
 */