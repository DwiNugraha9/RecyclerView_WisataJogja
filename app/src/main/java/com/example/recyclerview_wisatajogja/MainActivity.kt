package com.example.recyclerview_wisatajogja

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.title= "OBJEK WISATA YOGYAKARTA"

        val wisataList = listOf<Wisata>(
            Wisata(
                R.drawable.hutanpinus,
                "Hutan Pinus Mangunan",
                "Hutan Pinus Mangunan merupakan salah satu wisata alam andalan Kabupaten Bantul. Wisata alam ini berlokasi di Dusun Sukorame, Desa Mangunan, Kec. Dlingo, Kabupaten Bantul, Daerah Istimewa Yogyakarta. Sebelum wisata ini dikenal banyak orang, hutan ini dulunya merupakan kawasan tandus."
            ),
            Wisata(
                R.drawable.wisataheha,
                "Heha Sky View",
                "Heha Sky View adalah tempat wisata yang punya tiga ciri khas. Berdasarkan akun Instagram milik mereka, tiga hal yang menjadi ciri utama Heha Sky View adalah selfie, resto, dan food stalls."
            ),
            Wisata(
                R.drawable.keratonboko,
                "Keraton Ratu Boko",
                " Keraton Ratu Bokoadalah situs purbakala yang merupakan kompleks sejumlah sisa bangunan yang berada kira-kira 3 km di sebelah selatan dari kompleks Candi Prambanan, 18 km sebelah timur Kota Yogyakarta atau 50 km barat daya Kota Surakarta, Jawa Tengah, lebih tepatnya di kalurahan Bokoharjo, kapanéwon Prambanan, kabupaten Sleman, Daerah Istimewa Yogyakarta. Situs Ratu Boko terletak di sebuah bukit pada ketinggian 196 meter dari permukaan laut. Luas keseluruhan kompleks adalah sekitar 25 ha"
            ),
            Wisata(
                R.drawable.umbulsigedang,
                "Umbul Sigedang",
                "Umbul Sigedang atau yang kerap disebut sebagai Umbul Kapilaler berada di  Umbulsari, Ponggok, Kecamatan Polanharjo, Kabupaten Klaten, Jawa Tengah. Umbul ini juga kerap disebut sebagai mata air mineral seribu galon lantaran lokasinya yang berdampingan dengan sumber air mineral dalam kemasan AQUA."
            ),
            Wisata(
                R.drawable.bukitpengilon,
                "Bukit Pengilon",
                "Bukit Pengilon adalah salah satu spot wisata alam Jogja yang memiliki keindahan yang luar biasa. Meskipun bukit, spot wisata ini berada di area Pantai di Jogja yang berada di pesisir selatan, yaitu daerah Gunung Kidul. Biasanya, spot wisata alam yang asri berada di area utara Jogja dekat Gunung Merapi atau berada di barat Jogja."
            ),
            Wisata(
                R.drawable.gumukpasir,
                "Gumuk Pasir",
                "Gumuk Pasir Parangkusumo adalah objek wisata alami di Kabupaten Bantul, DI Yogyakarta. Letaknya di sebelah barat Pantai Parangtritis, yaitu di Kalurahan Parangtritis, Kapanéwon Kretek, Kabupaten Bantul, Daerah Istimewa Yogyakarta."
            ),
            Wisata(
                R.drawable.studiogamplong,
                "Studio Gamplong",
                "Studio Alam Gamplong kini menjadi salah satu ikon wisata baru di Yogyakarta. Lokasi ini semakin banyak didatangi setelah sutradara kondang Hanung Bramantyo melakukan syuting Bumi Manusia dan Sultan Agung di sini. Tempat wisata ini terletak di Kabupaten Sleman, sekitar 16 kilo dari pusat kota Yogyakarta. Lokasi yang dijuluki Mini Hollywood Indonesia ini banyak mengedepankan spot-spot unik yang khas jaman dahulu. Kesempatan berfoto dan mengabadikan momen ala-ala nona Belanda. "
            ),
            Wisata(
                R.drawable.bukitparalayang,
                "Bukit Paralayang",
                "Bukit Paralayang Parangtritis merupakan sebuah tempat wisata di Yogyakarta. Tempat wisata ini menyajikan pemandangan Pantai Parangtritis dari atas bukit dengan ketinggian 900 mdpl dan pemandangan matahari terbenam. Selain itu, di Bukit Paralayang Parangtritis terdapat olahraga ekstrem paralayang."
            ),
            Wisata(
                R.drawable.malioboro,
                "Jalan Malioboro",
                "Jalan Malioboro adalah nama salah satu kawasan jalan dari tiga jalan di Kota Yogyakarta yang membentang dari Tugu Yogyakarta hingga ke perempatan Kantor Pos Yogyakarta. Secara keseluruhan terdiri atas Jalan Margo Utomo, Jalan Malioboro, dan Jalan Margo Mulyo. Jalan ini merupakan poros Garis Imajiner Kraton Yogyakarta.."
            ),
            Wisata(
                R.drawable.alunalunkidul,
                "Alun-Alun Kidul",
                "Alun-alun Kidul yang biasa disingkat Alkid atau dalam Bahasa Indonesia berarti Alun-alun Selatan, merupakan wilayah bagian selatan dari Kraton Yogyakarta. Saat ini Alkid menjadi sebuah ruang publik bagi masyarakat. Berbagai macam kegiatan dapat dijumpai di Alkid. Menjelang sore hingga malam hari, Alkid menjelma sebuah tempat rekreasi rakyat yang tentunya sayang untuk dilewatkan."
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_wisata)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = WisataAdapter(this, wisataList){

            val intent = Intent (this, DetailWisata::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }

    }
}