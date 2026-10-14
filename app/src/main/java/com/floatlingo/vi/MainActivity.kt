package com.floatlingo.vi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    FloatLingoViHome()
                }
            }
        }
    }
}

@Composable
private fun FloatLingoViHome() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text("FloatLingo VI", style = MaterialTheme.typography.headlineMedium)
        Text("Dịch video thời gian thực", style = MaterialTheme.typography.titleLarge)
        Text("Thu âm thanh nội bộ, hiển thị phụ đề nổi tiếng Việt và chuẩn bị phát giọng dịch.")
        Text("Trạng thái: Sẵn sàng")
        Text("Ngôn ngữ đích: Tiếng Việt")
        Button(onClick = { }) {
            Text("Bắt đầu dịch")
        }
        Button(onClick = { }) {
            Text("Cài đặt")
        }
    }
}
