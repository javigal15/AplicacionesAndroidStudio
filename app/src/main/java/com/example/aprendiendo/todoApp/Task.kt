package com.example.aprendiendo.todoApp

data class Task(val name: String, val category: TaskCategory, var isSelected: Boolean = false)