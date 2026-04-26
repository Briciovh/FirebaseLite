package com.softeen.firebaselite.presentation.initial

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.tooling.preview.Preview
import com.softeen.firebaselite.ui.theme.Black
import com.softeen.firebaselite.ui.theme.Gray

@Composable
fun InitialScreen() {
    Column(
        Modifier
            .fillMaxSize()
            .background(Brush.verticalGradient(listOf(Gray, Black), startY = 0f, endY = 600f))
    ) {
        
    }
}

@Preview(showBackground = true)
@Composable
fun InitialScreenPreview() {
    InitialScreen()
}