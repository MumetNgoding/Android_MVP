package founder.nugroho.android_mvp.MAIN

import founder.nugroho.android_mvp.INTERFACES.Views
import founder.nugroho.android_mvp.MODEL.Data

interface MainView : Views {
    fun onShowFragment(data : Data)
}