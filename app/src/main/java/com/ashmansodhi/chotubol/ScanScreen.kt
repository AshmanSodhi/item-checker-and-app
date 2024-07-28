package com.ashmansodhi.chotubol

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ScanScreen(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(
            painter = painterResource(id = R.drawable.screenshot_2024_07_28_103333_modified),
            contentDescription = "A call icon for calling"
        )
        Spacer(modifier = Modifier.height(100.dp))

        Button(onClick = {},
            colors = ButtonDefaults.buttonColors(containerColor = Color.Red),
            modifier = Modifier.height(100.dp).width(200.dp)
            ){
            Text("Scan",fontSize = 30.sp)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ScanTest(){
    ScanScreen()
}