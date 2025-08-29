package com.example.instagram

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val notificacion = findViewById<ImageButton>(R.id.notificacion)
        val chat = findViewById<ImageButton>(R.id.chat)
        val mihistoria = findViewById<ImageButton>(R.id.mihistoria)
        val historia1 = findViewById<ImageButton>(R.id.historia1)
        val historia2 = findViewById<ImageButton>(R.id.historia2)
        val historia3 = findViewById<ImageButton>(R.id.historia3)
        val casa = findViewById<ImageButton>(R.id.casa)
        val lupa = findViewById<ImageButton>(R.id.lupa)
        val mas = findViewById<ImageButton>(R.id.mas)
        val videos = findViewById<ImageButton>(R.id.videos)
        val perfil = findViewById<ImageButton>(R.id.perfil)

        val webView = findViewById<WebView>(R.id.webView)
        webView.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                url?.let { view?.loadUrl(it) }
                return true }
        }
        webView.settings.javaScriptEnabled = true

        // Eventos para botones
        mihistoria.setOnClickListener {
            webView.loadUrl("https://google.com/")
        }

        chat.setOnClickListener {
            webView.loadUrl("https://chat.openai.com/")
        }

        notificacion.setOnClickListener {
            webView.loadUrl("https://gmail.com/")
        }

        historia1.setOnClickListener {
            webView.loadUrl("https://docs.google.com/")
        }

        historia2.setOnClickListener {
            webView.loadUrl("https://service.uan.edu.co/")
        }

        historia3.setOnClickListener {
            webView.loadUrl("https://www.instagram.com/")
        }

        casa.setOnClickListener {
            webView.loadUrl("https://www.bing.com/search?pglt=931&q=universidad+antonio+nari%C3%B1o&cvid=a13d4aad52744640bf9a3aec19a0d1e9&gs_lcrp=EgRlZGdlKgYIABBFGDkyBggAEEUYOdIBCDUzNTlqMGoxqAIAsAIA&FORM=ANNTA1&adppc=EDGEESS&PC=EDGEDSE")
        }

        lupa.setOnClickListener {
            webView.loadUrl("https://google.com/")
        }

        mas.setOnClickListener {
            webView.loadUrl("https://google.com/")
        }

        videos.setOnClickListener {
            webView.loadUrl("https://youtube.com/")
        }

        perfil.setOnClickListener {
            webView.loadUrl("https://google.com/")
        }
    }
}