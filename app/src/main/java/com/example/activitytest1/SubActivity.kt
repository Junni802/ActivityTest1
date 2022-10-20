package com.example.activitytest1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.activitytest1.databinding.ActivityMainBinding
import com.example.activitytest1.databinding.ActivitySubBinding

class SubActivity : AppCompatActivity() {
	val binding by lazy { ActivitySubBinding.inflate(layoutInflater) }
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(binding.root)
		
		// 전달받은 데이터를 텍스트뷰(to1, to2)에 출력
		// intent.getXXXExtra() 이용

		binding.to1.text = intent.getStringExtra("form1")
		binding.to2.text = intent.getStringExtra("form2")
	}
}