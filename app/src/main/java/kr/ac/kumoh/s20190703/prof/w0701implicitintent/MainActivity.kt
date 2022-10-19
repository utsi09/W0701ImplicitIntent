package kr.ac.kumoh.s20190703.prof.w0701implicitintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.ac.kumoh.s20190703.prof.w0701implicitintent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnHomepage.setOnClickListener{
            val uri = Uri.parse("https://naver.com")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }

        binding.btnMap.setOnClickListener{
            val uri = Uri.parse("geo:0.0?z=17&q= 경기도 용인시 영덕동 경남아너스빌 11단지")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }

        binding.btnTelephone.setOnClickListener{
            val uri = Uri.parse("sms : 010-2854-2293")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }


    }
}