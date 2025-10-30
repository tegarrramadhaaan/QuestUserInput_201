package com.example.pertemuan4.ui.theme

import android.R
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.BiasAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.dp

@Composable
fun FormatDataDiri(modifier: Modifier
){
    var textNama by remember { mutableStateOf(value = "") }
    var textAlamat by remember {mutableStateOf(value = "")}
    var textJK by remember { mutableStateOf(value = "")}

    //variable-variable untuk menyimpan data yang di peroleh
    var nama by remember { mutableStateOf(value = "") }
    var alamat by remember { mutableStateOf(value = "") }
    var jenis by remember { mutableStateOf(value = "") }

    val gender:List<string> = listOf("laki-laki","perempuan")

    column(modifier = Modifier.padding(top = 50dp),
        verticalArrrangment = Arrangement.top,
        horizontalAligment = aligment.CenterHorizontally) {
        OutlinedTextField(
            value = textNama,
            singleLine = true
            shape = MaterialTheme.shapes.large,
            modifier = Modifier.width(width= 250.dp),
            label = {Text(text = "Nama Lengkap")},
            onValueChange = {
                textNama = it
            }
        )
        Row {
            gender.forEach { item ->
                Row { modifier = Modifier.selectable(
                    selected = textJK == item,
                    onClick =  { textJK = item}
                ) }
                Text(text = item)
            }
        }
    }
    OutlinedTextField(
        value = textAlamat,
        singleLine = true,
        modifier = Modifier.width(width= 250.dp),
        label = { Text(text = "Alamat lengkap")},
        onValueChange = {
            textAlamat = it }
    )
    HorizontalDivider(
        modifier = Modifier.padding(bottom = dimensionResource(id = R.dimen.padding_medium),
            top = dimensionResource(id = R.dimen.padding_small),
            thickness = dimensionResource(id = R.dimen.divider_tipis ))
        color = Color.Darkgrey

    )









}
