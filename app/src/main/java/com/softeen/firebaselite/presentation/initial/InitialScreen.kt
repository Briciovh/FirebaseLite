package com.softeen.firebaselite.presentation.initial

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.softeen.firebaselite.R
import com.softeen.firebaselite.ui.theme.BackgroundButton
import com.softeen.firebaselite.ui.theme.Black
import com.softeen.firebaselite.ui.theme.Gray
import com.softeen.firebaselite.ui.theme.Green
import com.softeen.firebaselite.ui.theme.ShapeButton

@Composable
fun InitialScreen() {
    Column(
        Modifier
            .fillMaxSize()
            .background(Brush.verticalGradient(listOf(Gray, Black), startY = 0f, endY = 600f)),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(Modifier.weight(1f))
        Image(
            painter = painterResource(R.drawable.spotify),
            contentDescription = "Spotify logo",
            modifier = Modifier.clip(
                CircleShape
            )
        )
        Spacer(Modifier.weight(1f))
        Text("Millions of songs.", color = Color.White, fontSize = 38.sp, fontWeight = Bold)
        Text("Free on Spotify", color = Color.White, fontSize = 38.sp, fontWeight = Bold)
        Spacer(Modifier.weight(1f))
        Button(
            onClick = {}, modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 32.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Green)
        ) {
            Text("Sign Up free.", color = Black, fontWeight = Bold)
        }
        Spacer(Modifier.height(8.dp))
        CustomButton(
            text = "Continue with Google",
            icon = R.drawable.google,
            Modifier.clickable {})
        Spacer(Modifier.height(8.dp))
        CustomButton(
            text = "Continue with Facebook",
            icon = R.drawable.facebook,
            Modifier.clickable {})
        Text(
            "Log In", color = Color.White,
            modifier = Modifier.padding(24.dp),
            fontWeight = Bold
        )
        Spacer(Modifier.weight(1f))
    }
}

@Composable
fun CustomButton(text: String, icon: Int, modifier: Modifier) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(48.dp)
            .background(BackgroundButton)
            .padding(horizontal = 32.dp)
            .border(2.dp, ShapeButton, CircleShape),
        contentAlignment = Alignment.CenterStart
    ) {
        Image(
            painter = painterResource(icon),
            contentDescription = "Button's icon",
            modifier = Modifier
                .padding(start = 16.dp)
                .size(16.dp)
        )
        Text(
            text,
            color = Color.White,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontWeight = Bold
        )
    }
}

@Preview(showBackground = true)
@Composable
fun InitialScreenPreview() {
    InitialScreen()
}