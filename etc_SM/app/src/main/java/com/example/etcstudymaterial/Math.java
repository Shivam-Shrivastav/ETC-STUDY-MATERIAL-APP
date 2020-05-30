package com.example.etcstudymaterial;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class Math extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.math);
        Intent intent = getIntent();
        String sub = intent.getStringExtra("Rsub");
        pdfView = findViewById(R.id.pdf_viewer);


        if (sub.equals("Bcem")){
            pdfView.fromAsset("bcem.pdf").load();

        }
        if (sub.equals("Math")){
            pdfView.fromAsset("maths_.pdf").load();

        }

        if (sub.equals("Chemistry")){
            pdfView.fromAsset("chemistry.pdf").load();
        }
        if (sub.equals("PPS")){
            pdfView.fromAsset("pps.pdf").load();
        }
        if (sub.equals("English")){
            pdfView.fromAsset("english.pdf").load();
        }
    }
}

