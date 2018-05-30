package com.example.asus.mahasiswa;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.asus.mahasiswa.adapter.MahasiswaAdapter;
import com.example.asus.mahasiswa.model.Mahasiswa;
import com.squareup.picasso.Picasso;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.Policy;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //coba gambar source dinamis
        ImageView ivCobaGambar= (ImageView) findViewById(R.id.iv_coba_gambar);

//        int SDK_INT = Build.VERSION.SDK_INT;
//        if (SDK_INT > 8){
//            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
//                    .permitAll().build();
//            StrictMode.setThreadPolicy(policy);
//        try{
//            URL url = new URL("https://yt3.ggpht.com/a-/AJLlDp3AbERJcd8e4P3DBy0dCMzKfjLkDaZ53EgoXA=s900-mo-c-c0xffffffff-rj-k-no");
//            Bitmap bmp = BitmapFactory.decodeStream(url.openConnection().getInputStream());
//            ivCobaGambar.setImageBitmap(bmp);
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }}
        Picasso.with(this).load("https://yt3.ggpht.com/a-/AJLlDp3AbERJcd8e4P3DBy0dCMzKfjLkDaZ53EgoXA=s900-mo-c-c0xffffffff-rj-k-no").into(ivCobaGambar);


        //1. data
        String [] nama = new String[]{"prayitno","jono","jono","jomblo"}; /*Menampilkan data statis*/

        Mahasiswa Mahasiswa1 = new Mahasiswa();
        Mahasiswa1.setNama("Prayitno");
        Mahasiswa1.setNim("3.34.15.1.04");
        Mahasiswa1.setEmail("Prayitno@gmail.com");
        Mahasiswa1.setFoto("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRcf22mR0ajZdHUgfx95HsYNdXVFOLaIIeVpZK-CO19w-zwEwBo");

        Mahasiswa Mahasiswa2 = new Mahasiswa(
                "Jono",
                "3.34.15.1.05",
                "jono@gmail.com",
                "https://cdns.klimg.com/kapanlagi.com/p/headline/476x238/jalan-terus-bukti-totalitas-afgan-untuk-57ec35.jpg"
        );

        Mahasiswa Mahasiswa3 = new Mahasiswa(
                "April",
                "3.34.15.1.06",
                "april@gmail.com",
                "https://yt3.ggpht.com/a-/AJLlDp3AbERJcd8e4P3DBy0dCMzKfjLkDaZ53EgoXA=s900-mo-c-c0xffffffff-rj-k-no"
        );

        Mahasiswa Mahasiswa4 = new Mahasiswa(
                "Dinar",
                "3.34.15.1.07",
                "dinar@gmail.com",
                "https://lh4.googleusercontent.com/-pLWmBAl_D_s/AAAAAAAAAAI/AAAAAAAAAow/wLbKEKkjhL4/photo.jpg"
        );

        ArrayList<Mahasiswa> mahasiswas = new ArrayList<>();
        mahasiswas.add(Mahasiswa1);
        mahasiswas.add(Mahasiswa2);
        mahasiswas.add(Mahasiswa3);
        mahasiswas.add(Mahasiswa4);

        //Load data API JSON (Retrofit Library)


        //2. adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,
                nama); //Membuat array adapter

        MahasiswaAdapter mahasiswaAdapter = new MahasiswaAdapter(this,
                R.layout.item_mahasiswa,
                mahasiswas);

        //3. activity (menampilkan data)
        ListView lvDaftarNama = (ListView) findViewById(R.id.Lv_daftar_nama);
                lvDaftarNama.setAdapter(mahasiswaAdapter);
    }
}
