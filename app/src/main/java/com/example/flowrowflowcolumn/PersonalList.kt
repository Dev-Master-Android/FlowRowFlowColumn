package com.example.flowrowflowcolumn

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowColumn
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun PersonnelList(personnelList: List<Personnel>) {
    FlowColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .horizontalScroll(rememberScrollState())
    ) {
        personnelList.forEach { personnel ->
            PersonnelItem(personnel = personnel)
        }
    }
}