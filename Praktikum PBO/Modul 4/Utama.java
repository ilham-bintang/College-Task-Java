import java.util.Scanner;

public class Utama {

    public static void main(String[] args) {
        
        // System.out.println("======PILIH TITIK/LINGKARAN==============");   
        // System.out.println("1. TITIK");   
        // System.out.println("2. LINGKARAN");   
        
        // Scanner s = new Scanner(System.in);
        // int pilih = s.nextInt();

        // switch (pilih) {
        //     case 1:
        //         System.out.println("masukkan nilai x");   
        //         int x = s.nextInt();
        //         System.out.println("masukkan nilai y");   
        //         int y = s.nextInt();
        //         System.out.println("masukkan nilai jari-jari");   
        //         int r = s.nextInt();

        //         MovableCircle lingkaran = new MovableCircle(x, y, r);
        //         System.out.println(lingkaran.toString());   
        //         System.out.println("1. Up");   
        //         System.out.println("2. Down");
        //         System.out.println("3. Left");
        //         System.out.println("4. Right");
        //         int p = s.nextInt();
        //         System.out.println("Jumlah pergerakan : ");
        //         int jml = s.nextInt();
        //         switch (p) {
        //             case 1:
        //                 lingkaran.moveUp(jml);
        //                 break;
        //             case 2:
        //                 lingkaran.moveDown(jml);
        //                 break;
        //             case 3:
        //                 lingkaran.moveLeft(jml);
        //                 break;
        //             case 4:
        //                 lingkaran.moveRight(jml);
        //             default:
        //             System.out.println("Jumlah pergerakan : ");
        //                 break;
        //         }
        //         break;
        
        //     default:
        //         break;
        // }

        
        

        MovableCircle lingkaran = new MovableCircle(0, -5, 3);           
            System.out.println("Awal : " + lingkaran.toString() );   
            lingkaran.moveUp(2);
            System.out.println("Akhir : " + lingkaran.toString() );   
            lingkaran.moveLeft(2);
            System.out.println("AKHIR : " + lingkaran.toString() );
    }    
    
}