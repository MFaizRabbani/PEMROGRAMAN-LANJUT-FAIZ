package com.faiz.javaGUI;

public class Mahasiswa {

    private String nama;
    private String nim;
    

    public Mahasiswa() {
    }

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;

    }
         public String getJenjangPendidikan() {
             char kodeJp = nim.charAt(0);
             if (kodeJp == '1') {
                 return "S1 (Sarjana)";
             } else if (kodeJp == '2') {
                 return "S2 (Magister)";
             } else if (kodeJp == '3') {
                 return "S3 (Doktor)";
             }
             return "Tidak Terdeteksi";
         }

         public String getTahunMasuk(){
             char kodeTm1 = nim.charAt(1);
             char kodeTm2 = nim.charAt(2);
             if (kodeTm1 =='1'&&kodeTm2 == '8') {
                 return"2018";
             } else if(kodeTm1 == '1'&& kodeTm2 == '9') {
                 return "2019";
             } else if (kodeTm1 =='2'&& kodeTm2 == '0') {
                 return "2020";
             }
            return "Tidak Terdeteksi";

    }

    public String getFakultas() {
        char kodeF = nim.charAt(3);
        if (kodeF == '1') {
            return "Fakultas Tarbiyah dan Keguruan";
        } else if (kodeF == '2') {
            return "Fakultas Syari'ah dan Hukum";
        } else if (kodeF == '3') {
            return "Fakultas Ushuluddin";
        } else if (kodeF == '4') {
            return "Fakultas Dakwah dan Komunikasi";
        } else if (kodeF == '5') {
            return "Fakultas Sains dan Teknologi";
        } else if (kodeF == '6') {
            return "Psikologi";
        } else if (kodeF == '7') {
            return "Fakultas Ekonomi dan Ilmu Sosial";
        } else if (kodeF == '8') {
            return "Fakultas Pertanian dan Peternakan";
        }
        return "Tidak Terdeteksi";
    }
    public String getJurusan() {
        char kodeJ1 = nim.charAt(4);
        char kodeJ2 = nim.charAt(5);
        if (kodeJ1 == '0' && kodeJ2 == '1') {
            return "Teknik Informatika";
        } else if (kodeJ1 == '0' && kodeJ2 == '2') {
            return "Teknik Industri";
        } else if (kodeJ1 == '0' && kodeJ2 == '3') {
            return "Sistem Informasi";
        } else if (kodeJ1 == '0' && kodeJ2 == '4') {
            return "Matematika";
        } else if (kodeJ1 == '0' && kodeJ2 == '5') {
            return "Teknik Elektro";
        }
        return "Tidak Terdeteksi";
    }

    public String getJenisKelamin() {
        char kodeJK = nim.charAt(6);
        if (kodeJK == '1') {
            return "Laki-Laki";
        } else if (kodeJK == '2') {
            return "Perempuan";
        }
        return "Tidak Terdeteksi";
    }
    public String getnourut() {
        char KodeNu1 = nim.charAt(7);
        char KodeNu2 = nim.charAt(8);
        char KodeNu3 = nim.charAt(9);
        char KodeNu4 = nim.charAt(10);
        return " "+KodeNu1+KodeNu2+KodeNu3+KodeNu4;
    }
}
