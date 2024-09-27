// 12S24001-Fredrick Laurensius Aritonang
// 12S24019-Winda N.V Sitorus

import java.util.*;
import java.lang.Math;

public class T02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String isbn, judul, penulis, penerbit, format, tahun, kategori;
        int stok;
        double harga, margin, rating1;

        isbn = input.nextLine();
        judul = input.nextLine();
        penulis = input.nextLine();
        tahun = input.nextLine();
        penerbit = input.nextLine();
        format = input.nextLine();
        harga = Double.parseDouble(input.nextLine());
        margin = Double.parseDouble(input.nextLine());
        stok = Integer.parseInt(input.nextLine());
        rating1 = Double.parseDouble(input.nextLine());
        if (rating1 >= 4.7) {
            kategori = "Best Pick";
        } else {
            if (rating1 >= 4.5) {
                kategori = "Must Read";
            } else {
                if (rating1 >= 4.0) {
                    kategori = "Recommended";
                } else {
                    if (rating1 >= 3.0) {
                        kategori = "Average";
                    } else {
                        if (rating1 < 3.0) {
                            kategori = "Low";
                        } else {
                            kategori = "";
                        }
                    }
                }
            }
        }
        System.out.println(isbn + "|" + judul + "|" + penulis + "|" + tahun + "|" + penerbit + "|" + format + "|" + toFixed(harga,2) + "|" + toFixed(margin,2) + "|" + stok + "|" + toFixed(rating1,1) + "|" + kategori);
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
