package com.antonshilov.mobiuslivecoding20

import Icons
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollableColumn
import androidx.compose.foundation.ScrollableRow
import androidx.compose.foundation.Text
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSizeConstraints
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Tab
import androidx.compose.material.TabConstants
import androidx.compose.material.TabConstants.defaultTabIndicatorOffset
import androidx.compose.material.TabRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawShadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.ui.tooling.preview.Preview
import com.antonshilov.mobiuslivecoding20.data.Lexems
import com.antonshilov.mobiuslivecoding20.data.MockDataSource
import com.antonshilov.mobiuslivecoding20.data.Operation
import com.antonshilov.mobiuslivecoding20.data.OperationType.PRIME
import com.antonshilov.mobiuslivecoding20.data.OperationType.TRANSACTION
import com.antonshilov.mobiuslivecoding20.ui.MobiusLivecoding20Theme
import com.antonshilov.mobiuslivecoding20.ui.icons.Close
import com.antonshilov.mobiuslivecoding20.ui.icons.Disclosure
import com.antonshilov.mobiuslivecoding20.ui.icons.Exit
import com.antonshilov.mobiuslivecoding20.ui.icons.Info
import com.antonshilov.mobiuslivecoding20.ui.icons.Limit
import com.antonshilov.mobiuslivecoding20.ui.icons.OperationPrime
import com.antonshilov.mobiuslivecoding20.ui.icons.OperationTransaction
import com.antonshilov.mobiuslivecoding20.ui.icons.Transfer

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MobiusLivecoding20Theme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    SettingsScreen()
                }
            }
        }
    }
}

private val sberColor = Color(0xFF08A652)


@Composable
fun SettingsScreen() {
    Scaffold {
        ScrollableColumn {
            Header()
            Column(modifier = Modifier.padding(horizontal = 16.dp)) {
                Section(Lexems.profileTitle, Lexems.profileDescription) {
                    ScrollableRow {
                        MockDataSource.operations.forEach {
                            OperationCard(it)
                            Spacer(modifier = Modifier.size(8.dp))
                        }
                    }
                }
                Section(Lexems.profileTitle, Lexems.profileDescription) {
                    Column {
                        TariffRow(Icons.Limit, Lexems.limitTitle, Lexems.limitDescription)
                        TariffRow(Icons.Transfer, Lexems.transferTitle, Lexems.transferDescription)
                        TariffRow(Icons.Info, Lexems.infoTitle, Lexems.infoTitle)
                    }
                }
                Section(Lexems.interestsTitle, Lexems.interestsDescription) {
                    FlowRow {
                        MockDataSource.chips.forEach {

                            Surface(
                                shape = RoundedCornerShape(16.dp),
                                color = Color.Black.copy(alpha = 0.08f),
                                modifier = Modifier.padding(horizontal = 4.dp, vertical = 2.dp)
                            ) {
                                Text(
                                    text = it,
                                    modifier = Modifier.padding(horizontal = 12.dp, vertical = 7.dp)
                                )
                            }
                        }
                    }
                }

            }

        }

    }
}

@Composable
private fun TariffRow(icon: VectorAsset, title: String, description: String) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Image(
            asset = icon,
            modifier = Modifier.size(36.dp)
        )
        Spacer(modifier = Modifier.size(8.dp))
        Column {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Column {
                    Text(
                        text = title,
                        fontSize = 16.sp,
                        lineHeight = 20.sp,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                    Text(
                        text = description,
                        fontSize = 14.sp,
                        lineHeight = 18.sp,
                        color = Color.Black.copy(alpha = 0.45f),
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                }
                Spacer(modifier = Modifier.fillMaxWidth())
                Image(
                    asset = Icons.Disclosure,
                    modifier = Modifier.size(24.dp)
                )
                Spacer(modifier = Modifier.size(8.dp))

            }
            Spacer(modifier = Modifier.size(12.dp))

            Box(
                modifier = Modifier
                    .height(height = 1.dp)
                    .fillMaxWidth()
                    .background(Color.LightGray)

            )

        }
    }
}

@Composable
private fun OperationCard(operation: Operation) {
    Card(
        modifier = Modifier.defaultMinSizeConstraints(minWidth = 216.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    asset = when (operation.type) {
                        TRANSACTION -> Icons.OperationTransaction
                        PRIME -> Icons.OperationPrime
                    },
                    modifier = Modifier.size(36.dp)
                )
                Spacer(modifier = Modifier.size(12.dp))
                Text(text = operation.title)
            }
            Text(text = operation.subtitle)
            Text(text = operation.description)
        }
    }
}

@Composable
private fun Section(
    title: String,
    subtitle: String,
    content: @Composable () -> Unit

) {
    Column {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            lineHeight = 24.sp
        )
        Spacer(modifier = Modifier.size(8.dp))
        Text(
            text = subtitle,
            fontSize = 14.sp,
            lineHeight = 18.sp,
            color = Color.Black.copy(alpha = 0.45f)
        )
        Spacer(modifier = Modifier.size(20.dp))
        content()
        Spacer(modifier = Modifier.size(40.dp))

    }
}

@Composable
private fun Header() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Toolbar()
        UserName()
        Spacer(modifier = Modifier.height(14.dp))
        Tabs()
    }
}

@Composable
private fun Tabs() {
    TabRow(
        selectedTabIndex = 0,
        contentColor = Color.Black,
        backgroundColor = Color.White,
        indicator = { tabPositions ->
            TabConstants.DefaultIndicator(
                Modifier.defaultTabIndicatorOffset(tabPositions[0]),
                color = sberColor
            )
        },
        modifier = Modifier.drawShadow(elevation = 2.dp)
    ) {
        Tab(selected = true, onClick = {}) {
            Text(
                text = "Профиль",
                fontSize = 16.sp,
                lineHeight = 20.sp,
                modifier = Modifier
                    .padding(
                        top = 17.dp,
                        bottom = 19.dp
                    )
            )
        }
        Tab(selected = false, onClick = {}) {
            Text(
                text = "Настройки",
                fontSize = 16.sp,
                lineHeight = 20.sp,
                modifier = Modifier
                    .padding(
                        top = 17.dp,
                        bottom = 19.dp
                    )
            )
        }
    }
}

@Composable
private fun UserName() {
    Spacer(modifier = Modifier.height(36.dp))
    Text(
        text = Lexems.profileNameMe,
        style = TextStyle(
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            lineHeight = 32.sp,
            fontSize = 24.sp
        )
    )
}

@Composable
private fun Toolbar() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        ToolbarIcon(Icons.Close)
        Avatar()
        ToolbarIcon(Icons.Exit)
    }
}

@Composable
private fun Avatar() {
    val avatarShape = RoundedCornerShape(38.dp)
    Image(
        asset = imageResource(id = R.drawable.my_photo),
        modifier = Modifier
            .padding(top = 12.dp)
            .drawShadow(elevation = 4.dp, shape = avatarShape)
            .clip(avatarShape)
            .size(110.dp)
    )
}

@Composable
private fun ToolbarIcon(icon: VectorAsset) {
    IconButton(onClick = {}) {
        Icon(
            asset = icon,
            modifier = Modifier.size(24.dp),
            tint = sberColor
        )
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showDecoration = true)
@Composable
fun DefaultPreview() {
    MobiusLivecoding20Theme {
        SettingsScreen()
    }
}
