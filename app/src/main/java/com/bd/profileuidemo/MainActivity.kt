package com.bd.profileuidemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.bd.profileuidemo.ui.theme.ProfileUIDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProfileUIDemoTheme {
                profile()
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Greeting(
//                        name = "Android",
//                        modifier = Modifier.padding(innerPadding)
//                    )
//                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ProfileUIDemoTheme {
        Greeting("Android")
    }
}

@Preview
@Composable
private fun profile(){
    Column(modifier = Modifier.fillMaxWidth().fillMaxHeight().background(color = Color(android.graphics.Color.parseColor("#f2f1f6"))),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ConstraintLayout(
            modifier = Modifier.height(250.dp).background(color = Color(android.graphics.Color.parseColor("#32357a")))
        ) {
            val (topImg, profile, title, back, pen) = createRefs()
            Image(
                painterResource(id = R.drawable.arc_3),
                contentDescription = null,
                Modifier.fillMaxWidth().constrainAs(topImg) {
                    bottom.linkTo(parent.bottom)
                })

            Image(
                painterResource(id = R.drawable.user_2),
                contentDescription = null,
                Modifier.fillMaxWidth().constrainAs(profile) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    bottom.linkTo(parent.bottom)
                })

            Text(text = "Profile", style = TextStyle(color = Color.White, fontSize = 30.sp),
                modifier = Modifier.constrainAs(title) {
                    top.linkTo(parent.top, margin = 10.dp)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                })

            Image(
                painterResource(R.drawable.back),
                contentDescription = null,
                Modifier.constrainAs(back) {
                    top.linkTo(parent.top, margin = 24.dp)
                    start.linkTo(parent.start, margin = 24.dp)
                })

            Image(
                painterResource(R.drawable.write),
                contentDescription = null,
                Modifier.constrainAs(pen) {
                    top.linkTo(parent.top, margin = 24.dp)
                    end.linkTo(parent.end, margin = 24.dp)
                })
        }
        Text(
            text = "Alex Flores",
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 16.dp),
            color = Color(android.graphics.Color.parseColor("#32357a"))
        )

        Text(
            text = "alexflores@gmail.com",
            fontSize = 18.sp,
            color = Color(android.graphics.Color.parseColor("#747679"))
        )

        Row(
            modifier = Modifier.fillMaxWidth().padding(start = 32.dp, end = 32.dp, top = 20.dp, bottom = 10.dp)
                .height(55.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(modifier = Modifier.fillMaxHeight(), verticalArrangement = Arrangement.Center) {
                Image(painter = painterResource(R.drawable.btn_1),contentDescription = null, modifier = Modifier.padding(end = 5.dp).clickable {  })
            }
            Column(modifier = Modifier.padding(start = 16.dp).weight(1f)) {
                Text(text = "Notification", color = Color.Black, fontSize = 18.sp, fontWeight = FontWeight.SemiBold)
            }
            Column(modifier = Modifier.fillMaxHeight(), verticalArrangement = Arrangement.Center) {
                Image(painter = painterResource(R.drawable.arrow), contentDescription = null, Modifier.padding(end = 5.dp).clickable {  })
            }
        }
        Row(
            modifier = Modifier.fillMaxWidth().padding(start = 32.dp, end = 32.dp, top = 20.dp, bottom = 10.dp)
                .height(55.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(modifier = Modifier.fillMaxHeight(), verticalArrangement = Arrangement.Center) {
                Image(painter = painterResource(R.drawable.btn_2),contentDescription = null, modifier = Modifier.padding(end = 5.dp).clickable {  })
            }
            Column(modifier = Modifier.padding(start = 16.dp).weight(1f)) {
                Text(text = "Calendar", color = Color.Black, fontSize = 18.sp, fontWeight = FontWeight.SemiBold)
            }
            Column(modifier = Modifier.fillMaxHeight(), verticalArrangement = Arrangement.Center) {
                Image(painter = painterResource(R.drawable.arrow), contentDescription = null, Modifier.padding(end = 5.dp).clickable {  })
            }
        }
        Row(
            modifier = Modifier.fillMaxWidth().padding(start = 32.dp, end = 32.dp, top = 20.dp, bottom = 10.dp)
                .height(55.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(modifier = Modifier.fillMaxHeight(), verticalArrangement = Arrangement.Center) {
                Image(painter = painterResource(R.drawable.btn_3),contentDescription = null, modifier = Modifier.padding(end = 5.dp).clickable {  })
            }
            Column(modifier = Modifier.padding(start = 16.dp).weight(1f)) {
                Text(text = "Gallery", color = Color.Black, fontSize = 18.sp, fontWeight = FontWeight.SemiBold)
            }
            Column(modifier = Modifier.fillMaxHeight(), verticalArrangement = Arrangement.Center) {
                Image(painter = painterResource(R.drawable.arrow), contentDescription = null, Modifier.padding(end = 5.dp).clickable {  })
            }
        }
        Row(
            modifier = Modifier.fillMaxWidth().padding(start = 32.dp, end = 32.dp, top = 20.dp, bottom = 10.dp)
                .height(55.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(modifier = Modifier.fillMaxHeight(), verticalArrangement = Arrangement.Center) {
                Image(painter = painterResource(R.drawable.btn_4),contentDescription = null, modifier = Modifier.padding(end = 5.dp).clickable {  })
            }
            Column(modifier = Modifier.padding(start = 16.dp).weight(1f)) {
                Text(text = "My Playlist", color = Color.Black, fontSize = 18.sp, fontWeight = FontWeight.SemiBold)
            }
            Column(modifier = Modifier.fillMaxHeight(), verticalArrangement = Arrangement.Center) {
                Image(painter = painterResource(R.drawable.arrow), contentDescription = null, Modifier.padding(end = 5.dp).clickable {  })
            }
        }

        Row(
            modifier = Modifier.fillMaxWidth().padding(start = 32.dp, end = 32.dp, top = 20.dp, bottom = 10.dp)
                .height(55.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(modifier = Modifier.fillMaxHeight(), verticalArrangement = Arrangement.Center) {
                Image(painter = painterResource(R.drawable.btn_5),contentDescription = null, modifier = Modifier.padding(end = 5.dp).clickable {  })
            }
            Column(modifier = Modifier.padding(start = 16.dp).weight(1f)) {
                Text(text = "Share", color = Color.Black, fontSize = 18.sp, fontWeight = FontWeight.SemiBold)
            }
            Column(modifier = Modifier.fillMaxHeight(), verticalArrangement = Arrangement.Center) {
                Image(painter = painterResource(R.drawable.arrow), contentDescription = null, Modifier.padding(end = 5.dp).clickable {  })
            }
        }

        Row(
            modifier = Modifier.fillMaxWidth().padding(start = 32.dp, end = 32.dp, top = 20.dp, bottom = 10.dp)
                .height(55.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(modifier = Modifier.fillMaxHeight(), verticalArrangement = Arrangement.Center) {
                Image(painter = painterResource(R.drawable.btn_6),contentDescription = null, modifier = Modifier.padding(end = 5.dp).clickable {  })
            }
            Column(modifier = Modifier.padding(start = 16.dp).weight(1f)) {
                Text(text = "Logout", color = Color.Black, fontSize = 18.sp, fontWeight = FontWeight.SemiBold)
            }
            Column(modifier = Modifier.fillMaxHeight(), verticalArrangement = Arrangement.Center) {
                Image(painter = painterResource(R.drawable.arrow), contentDescription = null, Modifier.padding(end = 5.dp).clickable {  })
            }
        }
    }
}