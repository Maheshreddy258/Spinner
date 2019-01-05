package com.example.mahesh.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Spinner District,Mandal,Village;
    TextView dis,man,vil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        District = (Spinner)findViewById(R.id.districtsp);
        dis=(TextView)findViewById(R.id.districttv);

        Mandal =(Spinner)findViewById(R.id.mandalsp);
        man =(TextView)findViewById(R.id.mtv);

        Village=(Spinner)findViewById(R.id.villagesp);
        vil =(TextView)findViewById(R.id.vtv);

        final String district[] = {"East Godavari", "West Godavari", "Krishna", "Guntur"};
        final String EastGodavari[] ={"Biccavolu", "Kajuluru","Kakinada(rural)" ,"Kakinada(urban)","Peddapuram",
                "RajahmundryRural ", "RajahmundryUrban", "Seethanagaram"};
        final String Biccavolumandal[] = {"Arikarevula", "Biccavolu", "Balabhadrapuram", "Biccavolu", "Illapalle", "Kapavaram", "Komaripalem", "Konkuduru", "Melluru","Pandalapaka", "Rangapuram", "Thummalapalle", "Tossipudi", "Voolapalle"};


         final  String WestGodavari[] ={"Achanta","Akividu","Attili","Penumantra","Tallapudi","Tanuku"};
         final String Penumantra[] = {"Alamuru", "Koyyetipadu", "Mallipudi", "Mamuduru" , "Marteru", "Neggipudi", "Nelamuru", "Oduru", "Penumantra" , "Polamuru", "Satyavaram","Velagaleru"};

        final String Krishna[]={};
        final String Guntur[] ={};


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,district);
        District.setAdapter(arrayAdapter);

        District.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                String Itemselect = district[i];

                if (i == 0 ){
                    ArrayAdapter<String> arrayAdapter2 = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_dropdown_item,EastGodavari);
                    Mandal.setAdapter(arrayAdapter2);

                    Mandal.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                            String mandalselect = EastGodavari[i];

                            if (i == 0 ) {
                                ArrayAdapter<String> arrayAdapter22 = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item,Biccavolumandal);
                                Village.setAdapter(arrayAdapter22);
                            }
                            if (i == 1 ) {
                                ArrayAdapter<String> arrayAdapter22 = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item,Biccavolumandal);
                                Village.setAdapter(arrayAdapter22);
                            }

                            if (i == 2 ) {
                                ArrayAdapter<String> arrayAdapter22 = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item,Biccavolumandal);
                                Village.setAdapter(arrayAdapter22);
                            }

                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });

                }
                if (i == 1 ){
                    ArrayAdapter<String> arrayAdapter3 = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_dropdown_item,WestGodavari);
                    Mandal.setAdapter(arrayAdapter3);


                    Mandal.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                            String mandalselect = WestGodavari[i];

                            if (i == 0 ) {
                                ArrayAdapter<String> arrayAdapter32 = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item,Penumantra);
                                Village.setAdapter(arrayAdapter32);
                            }
                            if (i == 1 ) {
                                ArrayAdapter<String> arrayAdapter22 = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item,Penumantra);
                                Village.setAdapter(arrayAdapter22);
                            }

                            if (i == 2 ) {
                                ArrayAdapter<String> arrayAdapter22 = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item,Penumantra);
                                Village.setAdapter(arrayAdapter22);
                            }

                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });


                }
                if (i == 2 ){
                    ArrayAdapter<String> arrayAdapter4 = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_dropdown_item,Krishna);
                    Mandal.setAdapter(arrayAdapter4);


                }
                if (i == 3 ){
                    ArrayAdapter<String> arrayAdapter4 = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_spinner_dropdown_item,Guntur);
                    Mandal.setAdapter(arrayAdapter4);


                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}
