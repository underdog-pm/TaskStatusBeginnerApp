package com.example.taskmanagerbeginnerapp

import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskmanagerbeginnerapp.ui.theme.TaskManagerBeginnerAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskManagerBeginnerAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TaskStatus(
                        message = stringResource(R.string.status_message),
                        comment = stringResource(R.string.comment)
                    )
                }
            }
        }
    }
}

@Composable
fun TaskStatus(message: String,comment: String, modifier: Modifier = Modifier) {
val image = painterResource(id = R.drawable.ic_task_completed)
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = CenterHorizontally
        ) {
            Image(
                painter = image,
                contentDescription = null,
            )
            Text(
                text = message,
                fontWeight = Bold,
                modifier = Modifier
                    .padding(top = 24.dp)
                    .padding(bottom = 8.dp)
            )
            Text(
                text = comment,
                fontSize = 16.sp
            )

        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TaskManagerBeginnerAppTheme {
       TaskStatus(
           message = stringResource(R.string.status_message),
           comment = stringResource(R.string.comment)
       )
    }
}