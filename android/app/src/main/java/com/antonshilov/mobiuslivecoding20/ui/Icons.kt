import androidx.compose.ui.graphics.vector.VectorAsset
import com.antonshilov.mobiuslivecoding20.ui.icons.Close
import com.antonshilov.mobiuslivecoding20.ui.icons.Disclosure
import com.antonshilov.mobiuslivecoding20.ui.icons.Exit
import com.antonshilov.mobiuslivecoding20.ui.icons.Info
import com.antonshilov.mobiuslivecoding20.ui.icons.Limit
import com.antonshilov.mobiuslivecoding20.ui.icons.OperationPrime
import com.antonshilov.mobiuslivecoding20.ui.icons.OperationTransaction
import com.antonshilov.mobiuslivecoding20.ui.icons.Transfer
import kotlin.collections.List as ____KtList

public object Icons

private var __AllAssets: ____KtList<VectorAsset>? = null

public val Icons.AllAssets: ____KtList<VectorAsset>
    get() {
        if (__AllAssets != null) {
            return __AllAssets!!
        }
        __AllAssets = listOf(
          Transfer, Limit, Disclosure, Info, Close, OperationTransaction,
          OperationPrime, Exit
        )
        return __AllAssets!!
    }
