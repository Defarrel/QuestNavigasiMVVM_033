package com.example.tugas_pertemuan7.ui.view

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun FormMahasiswaView(
    modifier: Modifier = Modifier,
    ListGender: List<String>,
    onSubmitClick: (MutableList<String>) -> Unit
) {
    var nama by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var noTelpon by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }
    var memilihJk by remember { mutableStateOf("") }

    val listData: MutableList<String> = mutableListOf(nama, alamat, memilihJk, email, noTelpon)
}