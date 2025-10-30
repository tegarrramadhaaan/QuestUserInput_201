package com.example.pertemuan4

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.Button
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@Composable
fun FormDataDiri(modifier: Modifier) {

    // variabel-variabel untuk mengingat nilai masukan dari keyboard
    var textNama by remember { mutableStateOf("") }
    var textAlamat by remember { mutableStateOf("") }
    var textJK by remember { mutableStateOf("") }

    // variabel-variabel untuk menyimpan data diperoleh dari komponen
    var nama by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }
    var jenis by remember { mutableStateOf("") }

    val gender: List<String> = listOf("Laki-laki", "Perempuan")

    Column(
        modifier = Modifier.padding(top = 50.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedTextField(
            value = textNama,
            singleLine = true,
            shape = MaterialTheme.shapes.large,
            modifier = Modifier.width(250.dp),
            label = { Text(text = "Nama Lengkap") },
            onValueChange = {
                textNama = it
            }
        )
        Row {
            gender.forEach { item ->
                Row(
                    modifier = Modifier.selectable(
                        selected = textJK == item,
                        onClick = {
                            textJK = item
                        }
                    )
                ) {
                    Text(item)
                }
            }
        }
    }

    OutlinedTextField(
        value = textAlamat,
        singleLine = true,
        modifier = Modifier.width(250.dp),
        label = {Text(text = "Alamat Lengkap")},
        onValueChange = {
            textAlamat = it
        }
    )

    HorizontalDivider(
        modifier = Modifier.padding(
            bottom = dimensionResource(R.dimen.padding_medium),
            top = dimensionResource(R.dimen.padding_medium
            )),
        thickness = dimensionResource(R.dimen.divider_tipis),
        color = Color.DarkGray
    )
    Button(
        modifier = Modifier.fillMaxWidth(1f),
        // the button is enabled when the user makes a selection
        enabled = textAlamat.isNotEmpty(),
        onClick = {
            nama=textNama
            jenis=textJK
            alamat=textAlamat
        }
    ){
        Text(text = stringResource(R.string.submit))
    }

    HorizontalDivider(
        modifier = Modifier.padding(
            bottom = dimensionResource(R.dimen.padding_medium),
            top = dimensionResource(
                id = R.dimen.padding_medium
            )),
        thickness = dimensionResource(R.dimen.divider_tipis),
        color = Color.DarkGray
    )

    ElevatedCard(
        elevation = CardDefaults.cardElevation(10.dp),
        colors = CardDefaults.cardColors(containerColor = Color.Black),
        modifier = Modifier
            .height(100.dp)
            .width(300.dp)
    ){
        Column(modifier = Modifier.padding(horizontal = 5.dp, vertical = 15.dp),){

        }
    }
}