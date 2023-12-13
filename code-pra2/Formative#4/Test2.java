public class Test2 {
    // deklarasi a dengan nilai awal 1 tipe data integer
	int a = 1;
    // deklarasi b dengan nilai awal 2 tipe data integer
	int b = 2;

    // methode dengan nama func mempunyai parameter object Test2
	// nantinya menerima argumen berupa dirinya sendiri
	public Test2 func(Test2 obj)
	{
        // membuat object dari class Test2 dengan nama obj3
		Test2 obj3 = new Test2();
        // memasukkan nilai parameter ke dalam obj3
		// memasukkan dirinya sendiri kedalam object obj3
		obj3 = obj;
        // mengisi nilai a pada obj3 dengan obj.a++ + ++obj.b
		// obj.a++ ==> akses atribut a dari object obj lalu di +1 maka nilainya 2
		// ++obj.b ==> akses atribut b dari object obj lalu di +1 maka hasilnya 3
		// obj3.a = 5
		obj3.a = obj.a++ + ++obj.b;
		// obj.b = 1
		obj.b = obj.b;
		return obj3;
	}

	public static void main(String[] args)
	{
	// membuat object dari class Test2() dengan nama obj1
	// jadi nanti a dan b dan juga metode pada object obj1 ini bisa diakses 
	Test2 obj1 = new Test2();
	// memanggil methode func() dengan parameter obj1 dan disimpan dalam var obj2
	// method ini memanggil objectnya sendiri
	Test2 obj2 = obj1.func(obj1);

	// print pertama ini akan memanggil obj1.a 
	System.out.println("obj1.a = " + obj1.a + " obj1.b = " + obj1.b);
	System.out.println("obj2.a = " + obj2.a + " obj1.b = " + obj2.b);
    System.out.println("obj2 = " + obj2);
    System.out.println("obj1 = " + obj1);

	}
}
