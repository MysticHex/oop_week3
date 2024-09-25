package Java.Semester_3;

import java.util.*;
public class Week_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukan Nama Anda: ");
        String name = scan.nextLine();

        System.out.print("Masukan NIM Anda: ");
        String NIM = scan.nextLine();

        System.out.print("Masukan Nilai Tubes: ");
        float nTubes = scan.nextFloat();

        System.out.print("Masukan Nilai Quiz: ");
        float nQuiz = scan.nextFloat();

        System.out.print("Masukan Nilai Tugas: ");
        float nTugas = scan.nextFloat();

        System.out.print("Masukan Nilai UTS: ");
        float nUTS = scan.nextFloat();

        System.out.print("Masukan Nilai UAS: ");
        float nUAS = scan.nextFloat();

        float finalGrade=nilaiAkhir(nTubes,nQuiz,nTugas,nUTS,nUAS);


        System.out.println("====================");
        System.out.println("Nama: "+ name);
        System.out.println("NIM: "+ NIM);
        System.out.println("Nilai  Matakuliah Pemograman Berorientasi Objek :" + finalGrade);
    }

    private static float nilaiAkhir(float nTubes,float nQuiz, float nTugas, float nUTS,float nUas){

        float nilaiAkhir=  (float) (nTubes*30/100)+( 10 /100*nQuiz)+(10 /100*nTugas)+( 25 /100*nUTS)+( 25 /100*nUas);


        return  nilaiAkhir;
    }
}
