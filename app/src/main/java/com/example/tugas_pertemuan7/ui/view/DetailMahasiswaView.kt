package com.example.tugas_pertemuan7.ui.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.tugas_pertemuan7.model.Mahasiswa

@Composable
fun DetailMahasiswaView(
    dataMhs: Mahasiswa,
    modifier: Modifier = Modifier,
    onBackButton: () -> Boolean
){
    val ListDataMhs = listOf(
        Pair("Nama", dataMhs.nama),
        Pair("Alamat", dataMhs.alamat),
        Pair("Gender", dataMhs.gender),
        Pair("Email", dataMhs.email),
        Pair("NoTelpon", dataMhs.noTelpon)
    )

    Column (
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ){
        ListDataMhs.forEach { data ->
            DetailMhs(
                judul = data.first,
                isinya = data.second
            )
        }
        Button(onClick = { onBackButton() }) {
            Text(text = "Kembali")
        }
    }
}

@Composable
fun DetailMhs(
    judul: String, isinya: String
){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
    ) {
        Text(text = judul,
            modifier = Modifier.weight(0.8f)
        )
        Text(text = ":",
            Modifier.weight(0.2f)
        )
        Text(text = isinya,
            Modifier.weight(2f)
        )
    }

}