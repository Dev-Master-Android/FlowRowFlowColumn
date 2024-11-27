package com.example.flowrowflowcolumn

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MainScreen() {
    val personnelList = listOf(
        Personnel("Алекс", "Иванов", "ENGINEER", 77000),
        Personnel("Мария", "Петрова", "DOCTOR", 88000),
        Personnel("Сергей", "Сидоров", "PROGRAMMER", 95000),
        Personnel("Анна", "Кузнецова", "TEACHER", 60000),
        Personnel("Светлана", "Смирнова", "DOCTOR", 88000),
        Personnel("Анна", "Кузнецова", "ENGINEER", 60000),
        Personnel("Владимир", "Васильев", "TEACHER", 120000),
        Personnel("Светлана", "Смирнова", "DOCTOR", 88000),
        Personnel("Анна", "Кузнецова", "ENGINEER", 60000),
        Personnel("Владимир", "Васильев", "TEACHER", 120000),
        Personnel("Светлана", "Смирнова", "PROGRAMMER", 88000),
        Personnel("Светлана", "Смирнова", "PROGRAMMER", 88000),
    ).sortedWith(compareBy({ it.firstName }, { it.position }))

    PersonnelList(personnelList = personnelList)
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainScreen()
}
