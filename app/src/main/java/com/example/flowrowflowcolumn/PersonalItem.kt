package com.example.flowrowflowcolumn

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun PersonnelItem(personnel: Personnel) {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .background(Color.Gray, shape = MaterialTheme.shapes.medium),
        elevation = CardDefaults.cardElevation(8.dp),
        shape = MaterialTheme.shapes.medium,
        border = BorderStroke(1.dp, Color.Black)
    ) {
        Column(
            modifier = Modifier
                .padding(8.dp),
        ) {
            Text(
                text = "Имя: ${personnel.firstName}",
                fontSize = 30.sp
            )
            Text(
                text = "Фамилия: ${personnel.lastName}",
                fontSize = 30.sp
            )
            Text(
                text = "Должность: ${personnel.position}",
                fontSize = 30.sp
            )
            Text(
                text = "Зарплата: ${personnel.salary}",
                fontSize = 30.sp
            )
        }
    }
}