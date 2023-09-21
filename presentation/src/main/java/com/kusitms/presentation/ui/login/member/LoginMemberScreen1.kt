package com.kusitms.presentation.ui.login.member


import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.key.Key.Companion.D
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.kusitms.presentation.R
import com.kusitms.presentation.common.ui.theme.KusitmsColorPalette
import com.kusitms.presentation.common.ui.theme.KusitmsTypo
import com.kusitms.presentation.ui.ImageVector.StudyIcon


@Composable
fun LoginMember1(
    navController: NavHostController,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(KusitmsColorPalette.current.Black),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(4.dp, Alignment.Top)
    )
    {

        TitleColumn()
        
        Spacer(modifier = Modifier.height(56.dp))

        Text(text = stringResource(id = R.string.login_member_title1), style = KusitmsTypo.current.SubTitle2_Semibold, color = KusitmsColorPalette.current.Grey300)


        ButtonRow()

    }

}

@Composable
fun TitleColumn() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(24.dp)
            .background(KusitmsColorPalette.current.Black)
            .height(109.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start

    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp, Alignment.Start),
            verticalAlignment = Alignment.Top,
        ) {
            StudyIcon.drawStudyIcon(
                modifier = Modifier
                    .height(24.dp)
                    .width(24.dp)
            )
            TextColumn()
        }
        
    }
}

@Composable
fun TextColumn() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(KusitmsColorPalette.current.Black)
            .height(109.dp),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Top

    ) {
        Text(text = stringResource(id = R.string.text_column_1), style = KusitmsTypo.current.SubTitle2_Semibold, color = KusitmsColorPalette.current.Grey300 )
        Text(text = stringResource(id = R.string.text_column_2), style = KusitmsTypo.current.Caption1, color = KusitmsColorPalette.current.Sub2)

    }
}

@Composable
fun inputField(hint : String, maxlength: Int? = null) {
    Column {
        var textState by remember { mutableStateOf("")}
        val maxLength = maxlength
        val originColor = KusitmsColorPalette.current.Grey700
        val changeColor = KusitmsColorPalette.current.Main500

        Text(
            text = stringResource(id = R.string.login_member_caption1_2),
            style = KusitmsTypo.current.Caption1,
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 4.dp),
            textAlign = TextAlign.Start,
            color = KusitmsColorPalette.current.Grey400
        )

        TextField(
            modifier = Modifier.fillMaxWidth(),
            value = textState,
            colors = androidx.compose.material.TextFieldDefaults.textFieldColors(
                backgroundColor = originColor,
            ),
            hint = stringResource(id = R.string.login_member_hint1_2),

        )

    }
}

@Composable
fun ButtonRow() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(72.dp)
            .background(color = KusitmsColorPalette.current.Black),
        horizontalArrangement = Arrangement.spacedBy(7.dp, Alignment.CenterHorizontally),
        verticalAlignment = Alignment.Top
    ) {
        exBtn()
        nextBtn()
    }
}

@Composable
fun exBtn() {
    Button(
        colors = ButtonDefaults.outlinedButtonColors(KusitmsColorPalette.current.Grey600),
        border = BorderStroke(1.dp, KusitmsColorPalette.current.Grey600),
        onClick = {

        }
    ) {
        Text(stringResource(id = R.string.login_memeber1_btn_1))
    }
}

@Composable
fun nextBtn() {
    Button(
        colors = ButtonDefaults.outlinedButtonColors(KusitmsColorPalette.current.Grey600),
        border = BorderStroke(1.dp, KusitmsColorPalette.current.Grey600),
        onClick = {

        }
    ) {
        Text(stringResource(id = R.string.login_memeber1_btn_2))
    }
}





@Preview
@Composable
fun LoginPreview() {
    LoginMember1(navController = rememberNavController())
}