package com.kusitms.presentation.ui.signIn

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.kusitms.presentation.common.ui.theme.KusitmsColorPalette
import com.kusitms.presentation.common.ui.theme.KusitmsTypo

@Composable
fun KusitmsInputField(
    label: String,
    @StringRes text:Int,
    value:String,
    onValueChange: (String) -> Unit
) {
    OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = value,
            onValueChange = onValueChange,
            label = {
                Text(
                    text= label,
                    color= KusitmsColorPalette.current.Grey400,
                    style = KusitmsTypo.current.Text_Medium
                )
            },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                textColor = KusitmsColorPalette.current.Grey400,
                focusedBorderColor = KusitmsColorPalette.current.Main500,
                unfocusedBorderColor = KusitmsColorPalette.current.Grey700,
                unfocusedLabelColor = KusitmsColorPalette.current.Grey400,
                focusedLabelColor = KusitmsColorPalette.current.White,
                backgroundColor = KusitmsColorPalette.current.Grey700
            )
        )
    }