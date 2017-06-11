package com.google.colorblindtest;

public class Soal {
    public int mSoal[] = {
            R.drawable.img1,
            R.drawable.img2,
            R.drawable.img3,
            R.drawable.img4,
            R.drawable.img5,
            R.drawable.img6,
            R.drawable.img7,
            R.drawable.img8,
            R.drawable.img9,
            R.drawable.img10,
            R.drawable.img11,
            R.drawable.img12,
            R.drawable.img13,
            R.drawable.img14,
            R.drawable.img15,
            R.drawable.img16,
            R.drawable.img17,
            R.drawable.img18,
            R.drawable.img19,
            R.drawable.img20
    };

    private String mPilihan[][] = {
            {"13", "15", "12", "19"},
            {"8", "9", "2", "4"},
            {"5", "8", "9", "6"},
            {"48", "29", "28", "19"},
            {"89", "57", "34", "29"},
            {"8", "0", "5", "9"},
            {"8", "2", "5", "3"},
            {"15", "29", "19", "18"},
            {"44", "92", "74", "20"},
            {"5", "8", "2", "10"},
            {"8", "6", "18", "0"},
            {"89", "91", "97", "14"},
            {"44", "24", "19", "45"},
            {"15", "8", "4", "5"},
            {"4", "7", "1", "9"},
            {"Kelinci", "Rusa", "Macan", "Tikus"},
            {"Kura-Kura", "Sapi", "Unta", "Paus"},
            {"Unta", "Gajah", "Ikan", "Singa"},
            {"Burung", "Kupu-Kupu", "Kelelawar", "Laba-Laba"},
            {"Kambing", "Rusa", "Banteng", "Jerapah"}
    };

    private String mJawaban[] = {
            "12",
            "8",
            "6",
            "29",
            "57",
            "5",
            "3",
            "15",
            "74",
            "2",
            "6",
            "97",
            "45",
            "5",
            "7",
            "Kelinci",
            "Kura-Kura",
            "Ikan",
            "Kelelawar",
            "Rusa"
    };

    public int getSoal(int a){
        int soal = mSoal[a];
        return soal;
    }

    public String getPilihan1(int a){
        String pilihan = mPilihan[a][0];
        return pilihan;
    }

    public String getPilihan2(int a){
        String pilihan = mPilihan[a][1];
        return pilihan;
    }

    public String getPilihan3(int a){
        String pilihan = mPilihan[a][2];
        return pilihan;
    }

    public String getPilihan4(int a){
        String pilihan = mPilihan[a][3];
        return pilihan;
    }

    public String getJawaban(int a){
        String jawaban = mJawaban[a];
        return jawaban;
    }
}
