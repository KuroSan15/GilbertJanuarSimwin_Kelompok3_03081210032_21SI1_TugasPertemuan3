import java.util.Scanner;
public class Gabungan {
    public static void main(String[]args) throws Exception{
        int pil;
        float p,l,t,a,b;
        Scanner temp = new Scanner (System.in);
        do
        {
            System.out.println("Silahkan pilih salah satu fungsi di bawah ini ");
            System.out.println("1. Hitung volume kubus ");
            System.out.println("2. Hitung volume tabung ");
            System.out.println("3. Hitung volume balok ");
            System.out.println("4. Hitung volume prisma segitiga ");
            System.out.println("5. Hitung volume limas segitiga ");
            System.out.println("6. Keluar ");
            System.out.println("Masukkan pilihan anda : ");
            pil = temp.nextInt();
            switch (pil)
            {
                case 1 :
                int  s = 0;
                System.out.println("Masukkan panjang sisi = ");
                s = temp.nextInt();
                double volume = s*s*s;
                System.out.println("Volume Kubus = " +volume+ "cm");
                    break;

                case 2 :
                int r=0;
                double PI = 22.0/7;
                System.out.println("Masukkan Panjang jari-jari (r) : ");
                r=temp.nextInt();
                System.out.println("Masukkan Tinggi(t) : ");
                t=temp.nextInt();
                double V = PI*r*r*t;
                System.out.println("Luas Tabung = "+ V);
                    break;

                 case 3 :
                    System.out.println("Masukkan Panjang  : ");
                    p=temp.nextInt();
                    System.out.print("Masukkan Lebar : ");
                    l=temp.nextInt();
                    System.out.print("Masukkan Tinggi : ");
                    t=temp.nextInt();
                    double Vl = p*l*t;
                    System.out.println("Luas Tabung = "+ Vl);
                        break;
                case 4 :
                    System.out.println("Masukkan alas pertama  : ");
                    a=temp.nextInt();
                    System.out.print("Masukkan alas kedua : ");
                    b=temp.nextInt();
                    System.out.print("Masukkan Tinggi : ");
                    t=temp.nextInt();
                    float vol = a*b*t*1/2;
                    System.out.println("Luas Tabung = "+ vol);
                        break;
                case 5 :
                System.out.print("Masukkan panjang limas : ");
                p = temp.nextInt();
                System.out.print("\nMasukkan lebar limas : ");
                l = temp.nextInt();
                System.out.print("\nMasukkan tinggi limas : ");
                t = temp.nextInt();
                float volu =p*l*t*1/3;
                System.out.print("\nPanjang limas segi empat adalah : "+p);
                System.out.print("\nLebar limas segi empat adalah : "+l);
                System.out.print("\nTinggi limas segi empat adalah : "+t);
                System.out.print("\nVolume limas segi empat adalah : "+volu);
                temp.close();
                break;
                
            case 6:
            break;
            }
            System.out.print("\n");
        }while (pil!=6);
        
    }
}